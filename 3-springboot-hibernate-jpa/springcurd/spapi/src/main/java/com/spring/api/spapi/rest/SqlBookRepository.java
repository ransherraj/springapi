package com.javaapi.api.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlBookRepository extends JpaRepository<SqlBook, Long> {
    @Query(nativeQuery = true, value = "SELECT *  FROM [BookData].[dbo].[SQLbook]")
    List<SqlBook> findAlls();
}
