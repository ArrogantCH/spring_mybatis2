package com.boom.spring_mybatis2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boom.spring_mybatis2.entity.Animal;
import com.boom.spring_mybatis2.mapper.AnimalMapper;

@Repository
public class AnimalRepository {

	@Autowired
	private AnimalMapper animalMapper;

	public int save(Animal animal){
		animalMapper.save(animal);
		return animal.getId();
	}
}
