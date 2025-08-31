package com.oocl.traning.repository;

import com.oocl.traning.Controller.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPATodoRepository extends JpaRepository<Todo,Integer> {
}
