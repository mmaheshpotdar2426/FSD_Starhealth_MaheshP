package com.jdbc.cruds;

public class BookService {

	public boolean validateBookInput(Books emp) {

			boolean isValid = false;
		
		if (emp.getBid() > 99 && emp.getBname().length() > 3 && emp.getBprice() > 1000) {

			isValid = true;
		}
		
		return isValid;

	}

}
