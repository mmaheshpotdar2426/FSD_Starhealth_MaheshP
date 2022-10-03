package com.starhealth.spring.service;

import com.starhealth.spring.beans.*;
import java.util.List;

public interface IBooksService {


    public int addBooks(Books books);

    public int updateBooks(Books books);

    public int deleteBooksById(int bid);

    public Books selectBooksById(int bid);

    public List<Books> selectAllBooks();


}