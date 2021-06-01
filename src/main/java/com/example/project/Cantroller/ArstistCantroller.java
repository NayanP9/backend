package com.example.project.Cantroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Artist;
import com.example.project.service.ArtService;

@RestController
public class ArstistCantroller {
	
	@Autowired
	private ArtService service;
	
	@PostMapping("/save-artist")
	@Transactional
	public String registerArtist(@RequestBody Artist artist) {
	service.saveMyArtist(artist);
	return "Hello, "+artist.getUsername()+"your Artist registration is done";
	
	}
	
}

