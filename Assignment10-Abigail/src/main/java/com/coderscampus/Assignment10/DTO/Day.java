package com.coderscampus.Assignment10.DTO;

import java.util.List;

public class Day {
	List<Meal> meals;
	Nutrients nutrients;
	private List<Meal> getMeals() {
		return meals;
	}
	private void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	private Nutrients getNutrients() {
		return nutrients;
	}
	private void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

}
