package com.movies.dominio;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResultSearch {

    @JsonProperty("Search")
    private List<MovieMinimal> resultList;
    private Integer total;
    private Boolean response;

    @JsonProperty("Response")
    public void setResponse(String response) {
        this.response = Boolean.valueOf(response);
    }

    @JsonProperty("totalResults")
    public void setTotal(String total) {
        this.total = Integer.parseInt(total);
    }

	public ResultSearch() {
		super();
	}

	public ResultSearch(List<MovieMinimal> resultList, Integer total, Boolean response) {
		super();
		this.resultList = resultList;
		this.total = total;
		this.response = response;
	}

	public List<MovieMinimal> getResultList() {
		return resultList;
	}

	public void setResultList(List<MovieMinimal> resultList) {
		this.resultList = resultList;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Boolean getResponse() {
		return response;
	}

	public void setResponse(Boolean response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ResultSearch [resultList=" + resultList + ", total=" + total + ", response=" + response + "]";
	}
    
    
    
}