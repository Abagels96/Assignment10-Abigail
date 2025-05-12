package com.coderscampus.Assignment10.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	private String id;
	private String image;
	private String imageType;
	private String title;
	private Integer readyInMinutes;
	private Integer servings;
	private String sourceUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	
	
	

}
