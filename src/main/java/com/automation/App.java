package com.automation;

public class App {
	public static void main(String[] args) {
		System.out.println("Jenkins, docket automation");
		AutomationDocker docker=new AutomationDocker();
		System.out.println("Current Status: "+docker.getAutomationStatusInfo()); 
	}
}
