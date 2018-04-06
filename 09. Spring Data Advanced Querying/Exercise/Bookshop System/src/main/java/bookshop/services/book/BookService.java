package bookshop.services.book;

import bookshop.enums.AgeRestriction;
import bookshop.models.Book;

import java.time.LocalDate;
import java.util.List;

public interface BookService {

    void newBook(Book book);

    void newBooks(Iterable<Book> books);

    long getBooksCount();

    List<String> getBookTitleByAgeRestriction(AgeRestriction ageRestriction);

    List<String> getBookTitleOfGoldenEditionBookWithLessThen5000Copies();

    List<String> getBookTitleAndPriceForBooksWithPriceUnder5AndHigherThan40();

    List<String> getBookTitleOfBooksNotReleasedOnGivenYear(int year);

    List<String> getBookTitleEditionTypeAndPriceForBooksReleasedBeforeDate(LocalDate date);
}