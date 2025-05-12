package com.coderscampus.Assignment10.web;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;
import com.coderscampus.Assignment10.service.Assignment10Service;

@RestController
public class Assignment10Controller {
	@Autowired
	Assignment10Service service ;
	// Paste in the endpoints from the assignment 
	// Do I need to make a post request to get information from the API?? How do I transfer that- do I need to build a 
	// partial repository or am I overthinking things?
	// get mapping is taking information from an API correct ? i don't think I need to use params annotation at all	
	
	@GetMapping("mapuri")
	public void mapUri() {
		service.callSpoonacularApi();
	}//postman gives me a 400 error but the test application outputs the correct stuff and the browser just gives
	// me a blank screen but no error
	
	
	
	@GetMapping("mealplanner/week")

	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		
		numCalories="14,000";
		diet="vegetarian";
		exclusions="olives";
		return null;
		
	}

	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
		return null;
		
	}

}
