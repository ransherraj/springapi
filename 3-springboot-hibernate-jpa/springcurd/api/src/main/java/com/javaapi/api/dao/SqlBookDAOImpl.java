package com.javaapi.api.dao;

import com.javaapi.api.model.SqlBook;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SqlBookDAOImpl implements SqlBookDAO {

    //Define fields for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor manager

    @Autowired
    public SqlBookDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement method
    @Override
    @Transactional
    public void save(SqlBook sqlBook){
        entityManager.persist(sqlBook);
    }

    @Override
    public SqlBook findSqlBookById(Integer book_id) {
        return entityManager.find(SqlBook.class, book_id);
    }

    @Override
    public List<SqlBook> findAllBookDetails() {

        // Create Query
        TypedQuery<SqlBook> query = entityManager.createQuery("FROM SqlBook", SqlBook.class);

        // return  query return
        List<SqlBook> temp = query.getResultList();
        return temp;
    }

    @Override
    public List<SqlBook> findByAuthorName(String AuthorName) {

        // create query
        TypedQuery<SqlBook> query = entityManager.createQuery("FROM SqlBook WHERE bookAuthor = : param ", SqlBook.class);

        // set parameter
        query.setParameter("param", AuthorName);

        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateBook(SqlBook sqlBook) {
        entityManager.merge(sqlBook);
    }

    @Override
    @Transactional
    public void deleteBook(Integer id) {
        //  retrive book

        SqlBook sqlbook = entityManager.find(SqlBook.class, id);

        //Delete
        entityManager.remove(sqlbook);
    }

    @Override
    @Transactional
    public int deleteAllBook() {
        int deletedRowsNums = entityManager.createQuery("DELETE FROM SqlBook").executeUpdate();
        return deletedRowsNums;
    }

}
