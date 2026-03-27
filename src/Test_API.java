import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Test_API {
    public static void main(String[] args) {

        // 1. HttpClient erstellen (dein "Werkzeug" für die Anfrage)
        HttpClient client = HttpClient.newHttpClient();

        // 2. Den Request bauen (Ziel: Methode GET und die URL)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://api.open-meteo.com/v1/forecast?latitude=48.78&longitude=9.18&current_weather=true"))
                .header("Accept", "application/json") // Wir sagen dem Server: Wir wollen JSON!
                .build();

        try {
            // 3. Den Request senden und auf die Antwort (Response) warten
            IO.println("Sende GET-Request an Server...");
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4. Statuscode und JSON-Daten in der Konsole ausgeben
            IO.println("\n--- Server Antwort ---");
            IO.println("HTTP Statuscode: " + response.statusCode()); // 200 = Erfolg

            IO.println("Datenpaket (JSON, formatiert):");
            IO.println(prettyPrintJson(response.body()));

        } catch (Exception e) {
            IO.println("Fehler: " + e.getMessage());
        }
    }

    private static String prettyPrintJson(String json) {
        StringBuilder out = new StringBuilder();
        int indent = 0;
        boolean inQuotes = false;
        boolean escaped = false;

        for (char c : json.toCharArray()) {
            if (escaped) {
                out.append(c);
                escaped = false;
                continue;
            }

            if (c == '\\') {
                out.append(c);
                escaped = true;
                continue;
            }

            if (c == '"') {
                inQuotes = !inQuotes;
                out.append(c);
                continue;
            }

            if (!inQuotes) {
                switch (c) {
                    case '{':
                    case '[':
                        out.append(c).append('\n');
                        indent++;
                        appendIndent(out, indent);
                        break;
                    case '}':
                    case ']':
                        out.append('\n');
                        indent--;
                        appendIndent(out, indent);
                        out.append(c);
                        break;
                    case ',':
                        out.append(c).append('\n');
                        appendIndent(out, indent);
                        break;
                    case ':':
                        out.append(": ");
                        break;
                    default:
                        if (!Character.isWhitespace(c)) {
                            out.append(c);
                        }
                }
            } else {
                out.append(c);
            }
        }

        return out.toString();
    }

    private static void appendIndent(StringBuilder out, int indent) {
        for (int i = 0; i < indent; i++) {
            out.append("  ");
        }
    }
}