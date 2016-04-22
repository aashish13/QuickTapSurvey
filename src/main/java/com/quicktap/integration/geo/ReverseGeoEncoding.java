/**
 * 
 */
package com.quicktap.integration.geo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

/**
 * @author Aashish
 *
 */
public class ReverseGeoEncoding {
	private Set<String> provinces = new HashSet<>(Arrays.asList(new String[] { "Alberta", "British Columbia", "Quebec",
			"Ontario", "Manitoba", "Saskatchewan", "Nova Scoitia", "New Brunswick", "Newfoundland and Labrador",
			"Prince Edward Island", "Northwest Territories", "Yukon", "Nunavut" }));

	public String getProvince(Float lat, Float lon, String region) {

		try {
			URLConnection urlConn = new URL(
					"http://maps.google.com/maps/api/geocode/json?latlng=" + lat + "," + lon + "&sensor=false")
							.openConnection();
			urlConn.connect();
			JsonReader reader = new JsonReader(new InputStreamReader(urlConn.getInputStream()));
			JsonParser parser = new JsonParser();
			System.out.println(urlConn.getURL());
			JsonArray array = (JsonArray) parser.parse(reader).getAsJsonObject().get("results");
			if (array.size() > 0) {
				for (JsonElement jsonElement : array.get(0).getAsJsonObject().get("address_components")
						.getAsJsonArray()) {
					String province = jsonElement.getAsJsonObject().get("long_name").getAsString();
					if (provinces.contains(province)) {
						return province;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}