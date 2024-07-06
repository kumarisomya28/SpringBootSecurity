package com.movieflix.MovieAPI.repositories;

import com.movieflix.MovieAPI.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepositories extends JpaRepository<Movie, Integer> {

}
