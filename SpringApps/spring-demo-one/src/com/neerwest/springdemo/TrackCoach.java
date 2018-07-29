package com.neerwest.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach(){
		
	}
	
	// define a private field for the dependency
	private FortuneService fortuneService;
		
	// define a constructor for dependency injection	
	private TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrakCoach: inside method doMyStartupStuff");
	}
	
	// add an destroy method
	public void doMyCleanStuffYoYo() {
		System.out.println("TrakCoach: inside method doMyCleanStuffYoYo");
	}
	
}
