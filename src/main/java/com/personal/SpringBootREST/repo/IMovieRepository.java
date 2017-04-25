package com.personal.SpringBootREST.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.personal.SpringBootREST.models.Movie;

public interface IMovieRepository extends CrudRepository<Movie, Long>{
	List<Movie> findByYearLessThan(int year);
}
