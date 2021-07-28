package com.movies;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.movies.dominio.ResultSearch;
import com.movies.feign.MovieMinimalRestRepository;

@SpringBootTest
class MovieMinimalRestRepositoryTest {

    @Autowired
    private MovieMinimalRestRepository restRepository;

    @Test
    void search() {
        ResultSearch resultSearch = this.restRepository.search("lord of the rings");
        assertTrue(resultSearch.getResponse());
        resultSearch.getResultList().forEach(System.out::println);
    }
}
