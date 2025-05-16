package com.coderscampus.Assignment10.DTO;

import java.util.List;

public class Day {
	List<Meals> meals;
	Nutrients nutrients;

	public List<Meals> getMeals() {
		return meals;
	}

	public void setMeal(List<Meals> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

}
