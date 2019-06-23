package com.comparator.api.services;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.comparator.api.entities.JsonPOJO;

/**
 * 
 * Class Comparator: This class contains all methods and endpoints to store and compare the JSON data
 *
 */
@Path("/")
public class ComparatorService {
	
	//Map to index both JSONs, left and right.
	private static Map<Integer,JsonPOJO> jsons = new HashMap<Integer,JsonPOJO>();
	
	public ComparatorService() {}
	
	/**
	 * 
	 * @param id Integer to get index of the JSON pair to compare.
	 * @return JSON string of the comparator's result. 
	 */
	@SuppressWarnings("unchecked")
	@GET
	@Path("/v1/diff/{id}")
	@Produces("application/json")
	public String compare(@PathParam("id") int id) {
		try {	
			//Parse the string into actual JSONObjects
			JSONParser parser = new JSONParser();
			JSONObject jsonLeft = (JSONObject) parser.parse(jsons.get(id).getLeft());
			JSONObject jsonRight = (JSONObject) parser.parse(jsons.get(id).getRight());
			//First case: something is null cannot compare
			if(jsonLeft==null||jsonRight==null) {
				return "{\"result\":\"Incomplete pair. Cannot compare\"}";
			}
			//Second case: equals
			if(jsonLeft.equals(jsonRight)) {
				return "{\"result\":\"equals\"}";
			}else if(jsonLeft.size()==jsonRight.size()) {
				//Third case: equals in size but different in content. We evaluate diff on keys and values
				JSONObject diff = new JSONObject();
				for(Object obj:jsonLeft.keySet()) {
					String key = (String) obj;
					if(jsonRight.get(key)==null) {
						diff.put(key, "diffInKey");
					}else if(!jsonRight.get(key).equals(jsonLeft.get(key))){
						diff.put(key, "diffInValue");
					}
				}
				return diff.toJSONString();
			}else{
				//Forth case: not equal in sizeor content
				return "{\"result\":\"not equals\"}";
			}
		}catch(Exception e) {
			 return e.getMessage();
		} 
	}
	 /**
	  * 
	  * @param id Integer to index the JSON pair
	  * @param json String containing the left pair of the JSON data 
	  * @return String with Success or the error when storing the left JSON data
	  */
	@PUT
	@Path("/v1/diff/{id}/left")
	@Produces("text/plain")
	@Consumes(MediaType.APPLICATION_JSON)
	public String setLeft(@PathParam("id") int id,
			   			 String json) {
		//Evaluate null or empty json
		if(json==null) {
			return "Empty parameter!!!";
		}else if(json.isEmpty()){
			return "Empty parameter!!!";
		}
		JsonPOJO jsonLeft = new JsonPOJO();
		try {
			//If jsons map already have an id, add left on that id
		   if(jsons.containsKey(id)) {
			   jsonLeft = jsons.get(id);
			   jsonLeft.setLeft(json);
		   }else {
			//If jsons map does not have an id, just add the left and create the new id
			   jsonLeft.setLeft(json);
		   }
		   jsons.put(id, jsonLeft);
		}catch(Exception e) {
		   return e.getMessage();
		}
		return "Success!!!";  
	}
	/**
	 * 
	 * @param id Integer to index the JSON pair
	 * @param json String containing the right pair of the JSON data 
	 * @return String with Success or the error when storing the right JSON data
	 */
	@PUT
	@Path("/v1/diff/{id}/right")
	@Produces("text/plain")
	@Consumes(MediaType.APPLICATION_JSON)
	public String setRight(@PathParam("id") int id,
						   String json) {
		//Evaluate null or empty json
		if(json==null) {
			return "Empty parameter!!!";
		}else if(json.isEmpty()){
			return "Empty parameter!!!";
		}
		JsonPOJO jsonRight = new JsonPOJO();
		try {
			//If jsons map already have an id, add right on that id
		   if(jsons.containsKey(id)) {
			   jsonRight = jsons.get(id);
			   jsonRight.setRight(json);
		   }else {
			 //If jsons map does not have an id, just add the right and create the new id
			   jsonRight.setRight(json);
		   }
		   jsons.put(id, jsonRight);
		}catch(Exception e) {
			return e.getMessage();
		}
		return "Success!!!";  
	}

}
