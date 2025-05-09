package com.coderscampus.Assignment10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;

@RestController
public class Assignment10Controller {
	
	// Paste in the endpoints from the assignment 
	
	@GetMapping("mealplanner/week")

	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		return null;
		
	}

	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
		return null;
		
	}

}
