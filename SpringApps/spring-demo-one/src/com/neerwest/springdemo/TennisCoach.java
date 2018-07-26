package com.neerwest.springdemo;

public class TennisCoach implements Coach{
	
	// define a private field for the dependency
		private FortuneService fortuneService;
	
		// define a constructor for dependency injection	
		private TennisCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
	
	@Override
	public String getDailyWorkout() {
		
		return "Play 2 sets";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
