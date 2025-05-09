
package com.coderscampus.Assignment10.DTO;


public class WeekResponse {
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
	public String getImage() {
		return image;
	}
	public String getImageType() {
		return imageType;
	}
	public String getTitle() {
		return title;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	
	

}
