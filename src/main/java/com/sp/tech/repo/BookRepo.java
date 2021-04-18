package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
