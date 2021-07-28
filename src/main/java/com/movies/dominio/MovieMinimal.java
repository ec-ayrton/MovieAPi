package com.movies.dominio;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieMinimal {

    @JsonProperty("imdbID")
    private String imdbId;
    @JsonProperty("Title")
    private String title;
    private Integer year;

    @JsonProperty("Year")
    public void setYear(String year) {
        this.year = convertYear(year);
    }

    private int convertYear(final String year) {
        if (year.matches("\\d+")) {
            return Integer.parseInt(year);
        }
        return Arrays.stream(year.split("\\D"))
            .map(Integer::parseInt)
            .findFirst()
            .orElseThrow();
    }

	public MovieMinimal() {
		super();
	}

	public MovieMinimal(String imdbId, String title, Integer year) {
		super();
		this.imdbId = imdbId;
		this.title = title;
		this.year = year;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MovieMinimal [imdbId=" + imdbId + ", title=" + title + ", year=" + year + "]";
	}
    
	
    
}