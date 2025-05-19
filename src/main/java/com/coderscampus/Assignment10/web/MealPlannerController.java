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

	@JsonProperty("exclude")
	String exclusions = null;
	@JsonProperty("targetCalories")
	String numCalories = null;
	String diet = null;

	@GetMapping("mealplanner/week{numCalories}{diet}{exclusions}")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam String numCalories, @RequestParam String diet,
			@RequestParam String exclusions) {

		ResponseEntity<WeekResponse> week = service.callSpoonacularWeekApi();

		return week;
	}

	@GetMapping("mealplanner/day{numCalories}{diet}{exclusions}")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam String numCalories, @RequestParam String diet,
			@RequestParam String exclusions) {

		ResponseEntity<DayResponse> day = service.callSpoonacularDayApi();
		return day;
	}

}
