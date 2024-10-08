package com.in28minutes.rest.webservices.restfulwebservices.ToDoRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
@Repository
public interface ToDoRepository extends JpaRepository<Todo, Integer>
{
	List<Todo> findByUsername(String username);
}
