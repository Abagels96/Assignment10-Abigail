package com.coderscampus.Assignment10.service;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class Assignment10Service {
	@Test
	public void callSpoonacularApi() {
		
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy-host", 8080));
		factory.setProxy(proxy);

		
		
	URI uriDay =	UriComponentsBuilder.fromPath("https://api.spoonacular.com/mealplanner/generate")
			                        .queryParam("timeFrame", "day")
			                        .queryParam("targetCalories", "2000")
			                        .queryParam("diet", "paleo")
			                        .queryParam("exclude","shrimp,black olives,mushrooms")
			                        .queryParam("api-key", "26da184289a34f92b8c8562015a8d1d3")
			                        .build()
			                        .toUri();
//	URI uriWeek=	UriComponentsBuilder.fromPath("https://api.spoonacular.com/mealplanner/generate")
//			.queryParam("timeFrame", "week")
//			.queryParam("targetCalories", "14000")
//			.queryParam("diet", "paleo")
//			.queryParam("exclude","shrimp,black olives,mushrooms")
//			.queryParam("api-key", "28973a9416174847ad9a0037f389a379")
//			.build()
//			.toUri();
//		
		
		RestTemplate rt= new RestTemplate(factory);
		RestTemplate rt1= new RestTemplate();
		
//		ResponseEntity<String> responseWeek= rt1.getForEntity(uriWeek, String.class);
		
	ResponseEntity<String> responseDay=	rt.getForEntity(uriDay, String.class);
	
	System.setProperty("java.net.useSystemProxies", "false");
	System.out.println(responseDay.getBody());
//	System.out.println(responseWeek.getBody());
	}
	// Psuedo code the end goal is to make meal plans with the api
	//First I need to request the data from the API with a request // I don't know how the responseEntity or the URI is involved but I need to keep plugging a
	// then I need to map that data into an Java object then use those 
	//objects to plan out meals for days and evenings I think.

}
