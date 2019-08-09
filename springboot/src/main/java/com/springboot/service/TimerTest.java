package com.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerTest {

	@Scheduled(fixedRate=100)
	public  void showtime() {
		
	}
}
