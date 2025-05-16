package com.coderscampus.Assignment10.web;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;
import com.coderscampus.Assignment10.service.Assignment10Service;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
public class Assignment10Controller {
	@Autowired
	Assignment10Service service ;
	// Paste in the endpoints from the assignment 
	
	
	
	@JsonProperty("exclude")
	String exclusions= null;
	@JsonProperty("targetCalories")
	String numCalories=null;
	String diet=null;
	

	@GetMapping("mealplanner/week{numCalories}{diet}{exclusions}")

	public ResponseEntity<WeekResponse> getWeekMeals(@PathVariable String numCalories, @PathVariable String diet, @PathVariable String exclusions){
		
	 ResponseEntity<WeekResponse> week=service.callSpoonacularWeekApi();
	 // this works after  a long while now I need to filter them and just deal with the meals.


	 
	 return week;
	}

	@GetMapping("mealplanner/day{numCalories}{diet}{exclusions}")

	public ResponseEntity<DayResponse> getDayMeals(@PathVariable String numCalories,@PathVariable String diet,@PathVariable String exclusions){

	ResponseEntity<DayResponse> day= service.callSpoonacularDayApi();
	// day is being loaded on the browser and in Postman. We now need to figure out the filtering mechanism.
	return day;
	}

}
