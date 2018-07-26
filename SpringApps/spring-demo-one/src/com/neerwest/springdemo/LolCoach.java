package com.neerwest.springdemo;

public class LolCoach implements Coach{
	
	// define a private field for the dependency
    private FortuneService fortuneService;
    
 // define a constructor for dependency injection	
 	private LolCoach(FortuneService theFortuneService) {
 		fortuneService = theFortuneService;
 	}
	
	@Override
	public String getDailyWorkout(){
		
		return "Play 2 ARAM and 1 Summuner Rift";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
