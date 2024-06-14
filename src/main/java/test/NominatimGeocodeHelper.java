/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Avaneesh Koushik
 */
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.jxmapviewer.viewer.GeoPosition;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.Scanner;
//
//public class NominatimGeocodeHelper {
//
//    private static final String NOMINATIM_URL = "https://nominatim.openstreetmap.org/search?format=json&q=";
//
//    public static GeoPosition getCoordinates(String address) throws IOException {
//        String urlString = NOMINATIM_URL + address.replace(" ", "%20");
//        URL url = new URL(urlString);
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
//
//        StringBuilder response;
//        try (Scanner scanner = new Scanner(url.openStream())) {
//            response = new StringBuilder();
//            while (scanner.hasNext()) {
//                response.append(scanner.nextLine());
//            }
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode root = mapper.readTree(response.toString());
//        if (root.isArray() && root.size() > 0) {
//            JsonNode firstResult = root.get(0);
//            double lat = firstResult.get("lat").asDouble();
//            double lon = firstResult.get("lon").asDouble();
//            return new GeoPosition(lat, lon);
//        } else {
//            throw new IOException("No results found for the given address");
//        }
//    }
//}


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jxmapviewer.viewer.GeoPosition;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class NominatimGeocodeHelper {

    private static final String NOMINATIM_URL = "https://nominatim.openstreetmap.org/search?format=json&q=";

    public static GeoPosition getCoordinates(String address) throws IOException {
        String urlString = NOMINATIM_URL + address.replace(" ", "%20");
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");

        StringBuilder response;
        try (Scanner scanner = new Scanner(url.openStream())) {
            response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.toString());
        if (root.isArray() && root.size() > 0) {
            JsonNode firstResult = root.get(0);
            double lat = firstResult.get("lat").asDouble();
            double lon = firstResult.get("lon").asDouble();
            return new GeoPosition(lat, lon);
        } else {
            throw new IOException("No results found for the given address");
        }
    }
}
