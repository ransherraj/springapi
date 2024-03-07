package com.javaapi.api;

import com.javaapi.api.dao.SqlBookDAO;
import com.javaapi.api.model.SqlBook;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(SqlBookDAO sqlBookDAO){
		return runner->{       //lambda java expression
			createAndsaveSqlBook(sqlBookDAO);
			//readSqlBookById(sqlBookDAO);
			//getAllSqlBookList(sqlBookDAO);
			//getBookByAuthorName(sqlBookDAO);
			//updateBookData(sqlBookDAO);
			
			//deleteBook(sqlBookDAO);
			//deleteAllBooks(sqlBookDAO);
		};
	}

	private void deleteAllBooks(SqlBookDAO sqlBookDAO) {
		//Delete all
		//System.out.println(deleted values);
		int deletedBooksQty = sqlBookDAO.deleteAllBook();
		System.out.println("Number of deleted Books:" + deletedBooksQty);
	}

	private void deleteBook(SqlBookDAO sqlBookDAO) {
		int BookId = 2;
		System.out.println("Deleting Book ..."+BookId);
		sqlBookDAO.deleteBook(BookId);
	}

	private void updateBookData(SqlBookDAO sqlBookDAO) {

		// Get Book Data
		int BookId = 1;
		SqlBook book = findSqlBookById(BookId, sqlBookDAO);

		//Generate Query for Update
		book.setBookAuthor("Hiralal");

		// Update book
		sqlBookDAO.updateBook(book);

		// get updated Data
		System.out.println(book.getBookAuthor());

	}

	private SqlBook findSqlBookById(int BookId, SqlBookDAO sqlBookDAO) {
		SqlBook book = sqlBookDAO.findSqlBookById(BookId);
		return book;
	}

	private void getBookByAuthorName(SqlBookDAO sqlBookDAO) {
		List<SqlBook> books = sqlBookDAO.findByAuthorName("Alex");

		for(SqlBook b : books){
			System.out.println(b.getBookName());
		}
	}

	private void getAllSqlBookList(SqlBookDAO sqlBookDAO) {

		// get a list of book
		List<SqlBook> books = sqlBookDAO.findAllBookDetails();

		//display list of book
		for(SqlBook b : books){
			//SqlBook bo=new SqlBook();
			//string bo = b.getBookName();
			System.out.println(b.getBookName());
		}
		//System.out.println("Hello");
	}

	private void readSqlBookById(SqlBookDAO sqlBookDAO) {
		// create student
		SqlBook foundSqlBook = sqlBookDAO.findSqlBookById(1);
		System.out.println("The SqlBook name for id = 1: " + foundSqlBook);
	}

	private void createAndsaveSqlBook(SqlBookDAO sqlBookDAO) {
		// Create Book object
		System.out.println("Creating Student object....");
		Scanner inp = new Scanner(System.in);
		// Integer id;
		System.out.println("Enter Name....");
		String bookNametemp;
		bookNametemp = inp.nextLine();

		System.out.println("Enter Author....");
		String bookAuthortemp;
		bookAuthortemp = inp.nextLine();

		System.out.println("Enter detail....");
		String bookDetailtemp;
		bookDetailtemp = inp.nextLine();

		System.out.println("Enter Pages....");
		Integer bookPagestemp;
		bookPagestemp = inp.nextInt();

		System.out.println("Enter Price....");
		Integer bookPricetemp;
		bookPricetemp = inp.nextInt();

		SqlBook tempSqlBook = new SqlBook(bookNametemp,  bookPagestemp, bookAuthortemp, bookPricetemp, bookDetailtemp);

		sqlBookDAO.save(tempSqlBook);

		System.out.println("Id for the Added object is : " + tempSqlBook.getId());

	}

}
