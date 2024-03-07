package com.javaapi.api.repository;

import com.javaapi.api.model.SqlBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlBookRepository extends JpaRepository<SqlBook, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM [BookData].[dbo].[SQLbook]")
    List<SqlBook> findAllData();
}
