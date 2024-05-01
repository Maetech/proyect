package com.aluraproyecto.modelos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {
    @SerializedName("base_code")
    private String codigoBase;
    @SerializedName("target_code")
    private String targetCode;
    private double monto;
    private double resultado;


    public Conversion(String baseCode, String targetCode, double monto) {
        this.codigoBase = baseCode.toUpperCase();
        this.targetCode = targetCode.toUpperCase();
        this.monto = monto;
    }

    public double convert() throws IOException, InterruptedException {
        String apiKey = "222045142643a362994bf2ed";
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + codigoBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);
            JsonObject tasaConversion = jsonObject.getAsJsonObject("conversion_rates");
            double conversionRate = tasaConversion.get(targetCode).getAsDouble();
            resultado = monto * conversionRate;
            return resultado;
        } else {
            throw new IOException("Error al realizar la solicitud sel Servidor: " + response.statusCode());
        }
    }
}