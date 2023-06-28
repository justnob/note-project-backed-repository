package com.amarnath.note.rest.api.notewebapi.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.amarnath.note.rest.api.notewebapi.resource.Notes;

@Service
public class NoteHardCoadedService {
	
	private static List<Notes> notes = new ArrayList<>();
	private static int counter = 0;
	
	static {
		
		notes.add(new Notes(++counter, "amarnath.sah", "Angular", "Route to get the current logged in user detail.", new Date()));
		notes.add(new Notes(++counter, "amarnath.sah", "Spring Boot", "Add H2 in pom.xlm to access h2 database.", new Date()));
		notes.add(new Notes(++counter, "amarnath.sah", "Spring Boot", "You can use spring.io website to quickly create the spring project.", new Date()));
		notes.add(new Notes(++counter, "amarnath.sah", "Market", "need to buy vegitables for today.", new Date()));
		notes.add(new Notes(++counter, "amarnath.sah", "Home", "need to clean the cloths.", new Date()));
		notes.add(new Notes(++counter, "amarnath.sah", "Java", "Println prints with a new line.", new Date()));
		notes.add(new Notes(++counter, "amarnath.sah", "Spring Boot", "It is most popular framework for java.", new Date()));
		notes.add(new Notes(++counter, "amarnath.sah", "Spring Boot", "You have to enable cross origin to so that you can access the APi in other server url", new Date()));
		
	}

	public List<Notes> findAll(String username) {
		
		Predicate<? super Notes> predicate = u -> u.getUsername().equalsIgnoreCase(username);
		List<Notes> list = notes.stream().filter(predicate).toList();
		 
		 return list;
		
	}

	public void deleteById(long id) {
		
		
		Predicate<? super Notes> predicate = d -> d.getId() == id;
		notes.removeIf(predicate);
		
	}

	public Notes findById(int id) {

		Predicate<? super Notes> predicate = d -> d.getId() == id;
		Optional<Notes> filter = notes.stream().filter(predicate).findFirst();
		
		return filter.get();
		
	}

	public void updateNote(Notes body) {
			
			deleteById(body.getId());
			
			notes.add(body);
		
	}

	public void createNote(Notes body) {
		
		body.setId(++counter);
		body.setDate(new Date());
		notes.add(body);
		
	}
	
	

}
