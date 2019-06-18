package com.comparator.api.entities;

/**
 * 
 * This object stores both JSON strings with a determined id as an index
 *
 */
public class JsonPOJO {

	//left and right represent the JSON stored from the respective endpoint calls
	private String left,right;
	
	public JsonPOJO() {
	}
	/**
	 * 
	 * Setters and Getters 
	 */
	public String getLeft() {
		return left;
	}
	public void setLeft(String left) {
		this.left = left;
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	
}
