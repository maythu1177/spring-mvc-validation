package com.sp.tech.service;

import java.util.List;
import com.sp.tech.model.Author;

public interface AuthorService {

	public void saveAuthor(Author author);

	public Author findAuthor(int id);

	public List<Author> findAllAuthor();
}
