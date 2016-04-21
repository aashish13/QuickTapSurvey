/**
 * 
 */
package com.quicktap.integration.geo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

/**
 * @author Aashish
 *
 */
public class ReverseGeoEncoding {

	public String getProvince(double lat, double lon, String region) {
		String province="";
		try{
			URLConnection urlConn = new URL(
					"http://maps.google.com/maps/api/geocode/json?latlng=" + lat + "," + lon + "&sensor=false")
							.openConnection();
			urlConn.connect();
			
			JsonReader reader=new JsonReader(new InputStreamReader(urlConn.getInputStream()));
			JsonParser parser= new JsonParser();
			JsonElement root=parser.parse(reader);
			JsonArray jsonArray=root.getAsJsonArray();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		return province;
	}

}
