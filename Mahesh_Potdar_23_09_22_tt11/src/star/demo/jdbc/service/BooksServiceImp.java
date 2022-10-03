package star.demo.jdbc.service;

import star.demo.jdbc.dao.BooksDaoImp;
import star.demo.jdbc.dao.IBooksDAO;
import star.demo.jdbc.model.Books;

import java.util.List;

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
