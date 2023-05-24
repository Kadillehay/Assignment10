package com.coderscampus.assignement10.web;

import java.util.List;
import java.util.Map;

import com.coderscampus.assignement10.DTO.Meals;
import com.coderscampus.assignement10.DTO.Nutrients;

public class DayResponse {
	private List<Meals> meals;
	private Nutrients nutrients;

	public List<Meals> getMeals() {
		return meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
}