package com.starhealth.spring.repo;


import java.util.List;

import com.starhealth.spring.beans.Books;

public interface IBooksDAO {

    public int addBooks(Books books);
    public int updateBooks(Books books);

    public int deleteBooksById(int bid);
    public Books selectBooksById(int bid);

    public List<Books> selectAllBooks();
}
