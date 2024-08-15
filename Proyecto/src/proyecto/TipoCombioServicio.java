/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
/**
 *
 * @author Franco Coward
 */
public class TipoCombioServicio {
        private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD"; // URL de la API

    public static double obtenerTipoCambioColones() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(API_URL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            JSONObject jsonObj = new JSONObject(json);
            double tipoCambio = jsonObj.getJSONObject("rates").getDouble("CRC");

            return tipoCambio;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}
