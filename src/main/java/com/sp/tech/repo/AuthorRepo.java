package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
