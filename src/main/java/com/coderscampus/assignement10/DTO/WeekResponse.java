package com.coderscampus.assignement10.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	@JsonProperty("week")
	private Week week;
	
	public WeekResponse () {
		
	}
	public WeekResponse (Week week) {
		super();
		this.week = week;
	}
	public Week getWeek() {
		return week;
	}
	public void setWeek(Week week) {
		this.week = week;
	}
	
}







