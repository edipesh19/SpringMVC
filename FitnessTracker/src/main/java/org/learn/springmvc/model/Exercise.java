package org.learn.springmvc.model;

public class Exercise {
	
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		/*System.out.println("Data is set " + minutes);
		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
	        System.out.println(ste);
	    }*/
		this.minutes = minutes;
	}

}
