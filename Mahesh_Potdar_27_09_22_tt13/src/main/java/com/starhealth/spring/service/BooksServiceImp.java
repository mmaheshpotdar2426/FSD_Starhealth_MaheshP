package com.starhealth.spring.service;

import com.starhealth.spring.repo.BooksDaoImp;
import com.starhealth.spring.repo.IBooksDAO;
import com.starhealth.spring.beans.*;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BooksServiceImp implements IBooksService {
	IBooksDAO dao = new BooksDaoImp();
    @Override
    public int addBooks(Books books) {
        return dao.addBooks(books);
    }

    @Override
    public int updateBooks(Books books) {
        return dao.updateBooks(books);
    }

    @Override
    public int deleteBooksById(int bid) {
        return dao.deleteBooksById(bid);
    }

    @Override
    public Books selectBooksById(int bid) {
        return dao.selectBooksById(bid);
    }

    @Override
    public List<Books> selectAllBooks() {
        return dao.selectAllBooks();
    }

    public static boolean validateInputs(Books books) {

        boolean isValid = false;

        if (books.getBid() > 99 && books.getBname().length() > 3 && books.getBprice() > 1000 ) {

            isValid = true;
        }

        return isValid;
    }
}
