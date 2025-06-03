package com.coderscampus.Assignment10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;
import com.coderscampus.Assignment10.service.MealPlannerService;

@RestController
public class MealPlannerController {
	private final MealPlannerService service;

	public MealPlannerController(MealPlannerService service) {
		this.service = service;
	}

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(
			@RequestParam(name = "targetCalories", required = false) String numCalories,
			@RequestParam(required = false) String diet,
			@RequestParam(name = "exclude", required = false) String exclusions) {

		ResponseEntity<WeekResponse> week = service.callSpoonacularWeekApi(diet, exclusions, numCalories);
		return week;
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(
			@RequestParam(name = "targetCalories", required = false) String numCalories,
			@RequestParam(required = false) String diet,
			@RequestParam(name = "exclude", required = false) String exclusions) {

		ResponseEntity<DayResponse> day = service.callSpoonacularDayApi(diet, exclusions, numCalories);

		return day;
	}

}
