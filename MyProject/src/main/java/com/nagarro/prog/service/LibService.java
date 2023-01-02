package com.nagarro.prog.service;

import org.hibernate.type.ListType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.nagarro.prog.entity.Library;
import com.nagarro.prog.repository.LibRepo;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class LibService {
	
	@Autowired
	private LibRepo repo;
	
	public void addLib(Library l) {
		
		repo.save(l);
	}

	public java.util.List<Library> getAllLib()
	{
		return repo.findAll();
	}
	public Library getLibById(int code) {
		java.util.Optional<Library> l=repo.findById(code);
		if(l.isPresent()) {
			return l.get();
		}
		return null;
	}
	
	public void deleteLib(int code) {
		repo.deleteById(code);
	}
}
