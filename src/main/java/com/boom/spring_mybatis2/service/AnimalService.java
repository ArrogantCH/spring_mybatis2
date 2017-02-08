package com.boom.spring_mybatis2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boom.spring_mybatis2.entity.Animal;
import com.boom.spring_mybatis2.repository.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	
	public int save(Animal animal){
		return animalRepository.save(animal);
	}
}
