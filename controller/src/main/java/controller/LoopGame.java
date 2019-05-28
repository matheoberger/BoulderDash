package controller;

public class LoopGame {
	static Boolean isRunning = true;
	public static void gameLoop() throws InterruptedException
	{
		while (isRunning) {
			doGameUpdates();
			render();
			Thread.sleep(1000); //the timing mechanism
		}
	}
	

	private static void doGameUpdates() {
		
	}
	
	private static void render() {
		
	}
}
