package com.amarnath.note.rest.api.notewebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amarnath.note.rest.api.notewebapi.repository.NoteHardCoadedService;
import com.amarnath.note.rest.api.notewebapi.resource.Notes;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class NoteController {
	
	@Autowired
	private NoteHardCoadedService repo;
	
	
	public NoteController(NoteHardCoadedService repo) {
		super();
		this.repo = repo;
	}


	@GetMapping("/users/{username}/notes")
	private List<Notes> GetAllNotesForUser(@PathVariable String username){
		
		return repo.findAll(username);
		
	}
	
	@DeleteMapping("/users/{username}/notes/{id}")
	private void DeleteNoteForUser(@PathVariable String username, @PathVariable int id) {
		
		repo.deleteById(id);
		
		
	}
	
	@GetMapping("/users/{username}/notes/{id}")
	private Notes GetNoteByIdByUser(@PathVariable String username, @PathVariable int id) {
		
		return repo.findById(id);
		
	}
	
	@PutMapping("/users/{username}/notes/{id}")
	private void UpdateNote(@PathVariable String username, @PathVariable int id, @RequestBody Notes body) {
		
		repo.updateNote(body);
		
	}
	
	@PostMapping("/users/{username}/notes")
	private void CreateNote(@PathVariable String username, @RequestBody Notes body) {
		
		repo.createNote(body);
		
	}

}
