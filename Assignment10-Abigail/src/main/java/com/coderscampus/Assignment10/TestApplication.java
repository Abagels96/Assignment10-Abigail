package com.coderscampus.Assignment10;

import com.coderscampus.Assignment10.service.Assignment10Service;

public class TestApplication {
	
	public static void main(String[]args) {
		Assignment10Service service= new Assignment10Service();
		
		service.callSpoonacularApi();
	}

}
