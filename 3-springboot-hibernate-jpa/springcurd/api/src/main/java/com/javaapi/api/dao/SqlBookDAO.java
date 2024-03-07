package com.javaapi.api.dao;

import com.javaapi.api.model.SqlBook;

import java.util.List;

public interface SqlBookDAO {
    void save(SqlBook sqlBook);
    SqlBook findSqlBookById(Integer book_id);
    List<SqlBook> findAllBookDetails();

    List<SqlBook> findByAuthorName(String AuthorName);

    void updateBook(SqlBook sqlBook);

    void deleteBook(Integer id);

    int deleteAllBook();

}
