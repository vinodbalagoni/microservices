package com.vinod.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinod.Model.Book;

@Repository

public interface bookRepository  extends JpaRepository<Book,Long>{

}
