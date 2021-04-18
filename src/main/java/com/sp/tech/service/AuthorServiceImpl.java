package com.sp.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.tech.model.Author;
import com.sp.tech.repo.AuthorRepo;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorRepo authorRepo;

	@Override
	public void saveAuthor(Author author) {
		authorRepo.save(author);
	}

	@Override
	public Author findAuthor(int id) {
		return authorRepo.findById(id).orElse(null);
	}

	@Override
	public List<Author> findAllAuthor() {
		return authorRepo.findAll();
	}

}
