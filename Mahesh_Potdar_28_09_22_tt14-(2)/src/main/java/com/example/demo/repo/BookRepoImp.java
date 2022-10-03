package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Books;

@Repository
public class BookRepoImp implements IBookRepo {

	@Autowired
	Books book;
	
	@Override
	public void getBook() {
		// TODO Auto-generated method stub
		book.setBid(1001);
		book.setBname("The Secret.");
		book.setBprice(500);
		System.out.println("Product in Repository "+book);
		System.out.println("Product Repository Logic....");
		
	}
	

}
