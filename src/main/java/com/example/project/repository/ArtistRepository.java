package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.project.Model.Artist;

public interface ArtistRepository extends CrudRepository< Artist, Integer>{
	
	
}
