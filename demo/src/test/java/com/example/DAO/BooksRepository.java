package com.example.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Books;  
 
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  