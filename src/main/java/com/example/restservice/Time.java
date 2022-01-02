package com.example.restservice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	String timeStamp;
	
	public Time() {
		this.timeStamp = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss").format(new Date());
	}
	
	public String getTime() {
		return "The time now is " + this.timeStamp;
	}
	
}
