package com.xebia.JavaTraining.repository;

import com.xebia.JavaTraining.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
