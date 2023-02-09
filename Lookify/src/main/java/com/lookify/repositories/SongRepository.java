package com.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lookify.models.Song;


public interface SongRepository extends CrudRepository<Song,Long> {
	public List<Song> findAll();
	public List<Song> findByOrderByRatingDesc();
	public List<Song> findByArtistContaining(String artist);

}