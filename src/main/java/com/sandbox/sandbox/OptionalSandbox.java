package com.sandbox.sandbox;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OptionalSandbox {
	
	public int getListSize(final List<String> list) {
		
		final int listSize = list.size();
		
		return listSize;	
	}
}
