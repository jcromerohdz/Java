package com.neerwest.springdemo;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection	
	private BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Speend 30 min ob batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune 
		
		return fortuneService.getFortune();
	}
}
