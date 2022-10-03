package com.example.demo.beans;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Component
public class Books {
	
	private int bid;
	private String bname;
	private double bprice;

}
