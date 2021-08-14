package com.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.dominio.ResultSearch;
import com.movies.feign.MovieMinimalRestRepository;

@RestController
@RequestMapping(value = "/movies")
public class movieController {

	@Autowired
    private MovieMinimalRestRepository restRepository;
	
	ResultSearch resultSearch = this.restRepository.search("lord of the rings");
}
