package com.lookify.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lookify.models.Song;
import com.lookify.repositories.SongRepository;

@Service
public class SongService {
	@Autowired
	private SongRepository songRepo;
	
	public List<Song> findAll() {
		return songRepo.findAll();
	}
	public Song addOrUpdate(Song song) {
		return songRepo.save(song);
	}
	public Song findOne(Long id) {
		return songRepo.findById(id).orElse(null);
	}
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
	public List<Song> findTopTen() {
		List<Song> songs = songRepo.findByOrderByRatingDesc();
		List<Song> topTenOrLess = new ArrayList<>();
		int size = 0;
		if(songs.size() <10) {
			size = songs.size();
		}
		else {
			size =10;
		}
		for (int i =0; i<size; i++) {
			topTenOrLess.add(songs.get(i));
		}
		return topTenOrLess;
	}
	
}