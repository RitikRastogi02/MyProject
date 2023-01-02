package com.nagarro.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.prog.entity.Library;

@Repository
public interface LibRepo extends JpaRepository<Library, Integer>{

}
