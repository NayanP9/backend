package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Artist;
import com.example.project.repository.ArtistRepository;


@Service
public class ArtService {
	
	@Autowired
	private ArtistRepository artrepo;
	
	public ArtService() {}
	
	public ArtService(ArtistRepository artrepo) {
		super();
		this.artrepo = artrepo; 
	}
	
	public void saveMyArtist(Artist artist) {
		artrepo.save(artist);
		
	}

	
}
