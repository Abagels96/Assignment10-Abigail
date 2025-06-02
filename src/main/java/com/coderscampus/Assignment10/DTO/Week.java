package com.coderscampus.Assignment10.DTO;

import java.util.Map;

public class Week {
	private Map<String,DayResponse> dayOfTheWeek;
	private DayResponse dayResponse;
	
	
	
	public Map<String, DayResponse> getDayOfTheWeek() {
		return dayOfTheWeek;
	}
	public void setDayOfTheWeek(Map<String, DayResponse> dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}
	public DayResponse getDayResponse() {
		return dayResponse;
	}
	public void setDayResponse(DayResponse dayResponse) {
		this.dayResponse = dayResponse;
	}
	
	
	
	
	
	
	
	
}
