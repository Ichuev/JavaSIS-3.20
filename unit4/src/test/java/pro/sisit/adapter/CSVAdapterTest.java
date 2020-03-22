package pro.sisit.adapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pro.sisit.adapter.impl.CSVAdapter;
import pro.sisit.adapter.impl.CSVAdapterAuthor;
import pro.sisit.adapter.impl.CSVAdapterBook;
import pro.sisit.model.Author;
import pro.sisit.model.Book;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;



public class CSVAdapterTest {
    private File getFile(String s) {
        return new File(s);
    }
    @Before
    public void createFile() throws IOException {

        File newFileBook = getFile("test-book-file.csv");
        newFileBook.createNewFile();

        Files.write(Paths.get("test-book-file.csv"), Arrays.asList("BookOne;AuthorOne;GenreOne;1111111\n"
                +"BookTwo;AuthorTwo;GenreTwo;2222222\n"+"BookThree;AuthorThree;GenreThree;3333333\n"+"BookFour;AuthorFour;GenreFour;4444444\n"));
        File newFileAuthor = getFile("test-author-file.csv");
        newFileAuthor.createNewFile();

        Files.write(Paths.get("test-author-file.csv"),Arrays.asList("AuthorOne;BirthPlaceOne\n"+"AuthorTwo;BirthPlaceTwo\n"+
                "AuthorThree;BirthPlaceThree\n"+"AuthorFour;BirthPlaceFour\n"+"AuthorFive;BirthPlaceFive\n"));
    }

    @After
    public void deleteFile() {
        File newFileBook = getFile("test-book-file.csv");
        File newFileAuthor = getFile("test-author-file.csv");
        newFileBook.delete();
        newFileAuthor.delete();
    }

    @Test
    public void testRead() throws IOException {

        Path bookFilePath = Paths.get("test-book-file.csv");

        BufferedReader bookReader = new BufferedReader(
            new FileReader(bookFilePath.toFile()),200);

        BufferedWriter bookWriter = new BufferedWriter(
            new FileWriter(bookFilePath.toFile(), true),200);

        CSVAdapter<Book> bookCsvAdapter =
            new CSVAdapterBook(Book.class, bookReader, bookWriter);

        Book book1 = bookCsvAdapter.read(1);
        assertEquals("AuthorTwo", book1.getAuthor());
        assertEquals("BookTwo", book1.getName());
        assertEquals("GenreTwo", book1.getGenre());
        assertEquals("2222222", book1.getIsbn());

        Book expectedBook0 = new Book(
            "BookOne",
            "AuthorOne",
            "GenreOne",
            "1111111");
        Book actualBook0 = bookCsvAdapter.read(0);
        assertEquals(expectedBook0, actualBook0);

        Path authorFilePath = Paths.get("test-author-file.csv");

        BufferedReader  authorReader = new BufferedReader(
                new FileReader(authorFilePath.toFile()),500);

        BufferedWriter authorWriter = new BufferedWriter(
                new FileWriter(authorFilePath.toFile(), true),500);
        CSVAdapter<Author> authorCsvAdapter =
                new CSVAdapterAuthor(Author.class, authorReader, authorWriter);


        Author author1 = authorCsvAdapter.read(1);
        assertEquals("BirthPlaceTwo", author1.getBirthPlace());
        assertEquals("AuthorTwo", author1.getName());

        Author expectedAuthor = new Author (
                "AuthorOne",
                "BirthPlaceOne"
        );
        Author actualAuthor0 = authorCsvAdapter.read(0);
        assertEquals(expectedAuthor, actualAuthor0);

        authorWriter.close();
        authorReader.close();
        bookReader.close();
        bookWriter.close();
    }

    @Test
    public void testAppend() throws IOException {

        Path bookFilePath = Paths.get("test-book-file.csv");

        BufferedReader bookReader = new BufferedReader(
            new FileReader(bookFilePath.toFile()));

        BufferedWriter bookWriter = new BufferedWriter(
            new FileWriter(bookFilePath.toFile(), true));

        CSVAdapter<Book> bookCsvAdapter =
            new CSVAdapterBook(Book.class, bookReader, bookWriter);

        Book newBook = new Book(
            "Чертоги разума. Убей в себе идиота!",
            "Андрей Курпатов",
            "Психология",
            "978-5-906902-91-7");
        bookReader.mark(500);
        int bookIndex = bookCsvAdapter.append(newBook);
        bookReader.reset();
        Book bookAtIndex = bookCsvAdapter.read(bookIndex);
        assertEquals(newBook, bookAtIndex);
        bookReader.close();
        bookWriter.close();

    }
}
