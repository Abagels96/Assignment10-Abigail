package com.coderscampus.Assignment10.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;
import com.coderscampus.Assignment10.service.MealPlannerService;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
public class MealPlannerController {
	@Autowired // no autowired use constructor injection
	MealPlannerService service;

	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam("targetCalories") String numCalories, @RequestParam String diet,
			@RequestParam("exclude") String exclusions) {
		System.out.println("Target calories "+  numCalories  + " , special diet  "+  diet  + "and things to avoid  "+ exclusions);

		ResponseEntity<WeekResponse> week = service.callSpoonacularWeekApi();

		return week;
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam ("targetCalories") String numCalories, @RequestParam String diet,
			@RequestParam ("exclude") String exclusions) {
		
		
System.out.println("Target calories "+ numCalories + " ,special diet "+ diet+ "and things to avoid "+ exclusions);
		ResponseEntity<DayResponse> day = service.callSpoonacularDayApi();
		return day;
	}

}
