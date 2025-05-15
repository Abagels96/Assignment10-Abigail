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
	
	
	@GetMapping("mapuri")
	public void mapUri() {
		service.callSpoonacularWeekApi();
	}//postman gives me a 400 error but the test application outputs the correct stuff and the browser just gives
	// me a blank screen but no error
	
	
	
	@GetMapping("mealplanner/week")

	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		
	 ResponseEntity<WeekResponse> week=service.callSpoonacularWeekApi();
	 


	 
	 return week;
	}

	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){

	ResponseEntity<DayResponse> day= service.callSpoonacularDayApi();
	// day is being loaded on the browser and in Postman. We now need to figure out the filtering mechanism.
	return day;
	}

}
