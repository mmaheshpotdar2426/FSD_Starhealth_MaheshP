package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBookRepo;

@Service
public class BookServiceImp implements IBookService {

	@Autowired
	IBookRepo brepo;
	
	@Override
	public void getBook() {
		// TODO Auto-generated method stub
		System.out.println("Books Service implemented...");
		
		System.out.println(brepo);
		brepo.getBook();
	}
	

}
