package com.jdbc.cruds;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class JdbcCrudTest {          // USER INTERFACE LAYER

	public static void main(String[] args) {

		CrudOperationDAO dao = new CrudOperationDAO();
		Scanner scanner = new Scanner(System.in);

		BookService service = new BookService();
		
		boolean flag = true;

		while (flag) {

			System.out.println("*******WELCOME TO BOOKS MANAGEMENT SYSTEM*******");
			System.out.println("1. Add Book");
			System.out.println("2. Update Book Details");
			System.out.println("3. Delete Book By Id");
			System.out.println("4. Select Book By Id");
			System.out.println("5. Select All Books");
			System.out.println("6. Logout/Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				//Add Book
				Books book = inputData();
				boolean isValid =	service.validateBookInput(book);
				if(isValid) {
					int count = dao.addBook(book);
					System.out.println(count + " record inserted successfully.....");
				}
				else {
					System.err.println("Please Enter valid Inputs....");
				}
				break;
				
			case 2:
				//update from DAO class
				Books book2 = inputData();
				int updateCount =	dao.updateBook(book2);
				System.out.println(updateCount+" record updated successfully....");
				break;
				
			case 3:
				//delete book
				System.out.println("Enter Id to Delete One Record : ");
				int deleteId =scanner.nextInt();
				int deleteCount =	dao.deleteBookById(deleteId);
				System.out.println(deleteCount+" record deleted successfully....");
				break;
				
			case 4:
				//fetch or search the book.
				System.out.println("Enter Id to Select One Record : ");
				int searchId =scanner.nextInt();
				
				Books  book1 =	dao.selectBookById(searchId);
				
				System.out.println(book1);
				break;
				
			case 5:
				// select all books.
				List<Books> list =		dao.selectAllEmployeees();
				Stream<Books> stream =	list.stream();
				//stream.forEach((Employee e1)-> {System.out.println(e1);});
				stream.forEach(System.out::println);
				break;
				
			case 6:
				//System.exit(0);// killing JVM
				System.out.println("Thank You , Logout Success.....");
				flag = false;
				break;

			default:
				break;
			}

		}
		scanner.close();
	}

	public static Books inputData() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Bid");
		int bid = scanner.nextInt();
		System.out.println("Enter Bname");
		String bname = scanner.next();
		System.out.println("Enter Bprice");
		double bprice = scanner.nextDouble();

		Books emp = new Books();
		emp.setBid(bid);
		emp.setBname(bname);
		emp.setBprice(bprice);

		scanner.close();
		return emp;

	}

}
