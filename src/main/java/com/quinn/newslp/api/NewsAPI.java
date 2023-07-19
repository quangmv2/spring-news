package com.quinn.newslp.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinn.newslp.dto.NewsDTO;

@RestController
@RequestMapping("/news")
public class NewsAPI {
	
	@PostMapping
	public NewsDTO createNews(@RequestBody NewsDTO body) {
		return body;
	}
	
	@GetMapping
	private List<NewsDTO> getListNews() {
		// TODO Auto-generated method stub
		List<NewsDTO> news = new ArrayList<NewsDTO>();
		NewsDTO newItem = new NewsDTO("New", "2", "Content"); 
		news.add(newItem);
		news.add(newItem);
		return news;
	}

}
