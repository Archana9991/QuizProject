package com.example.quizzapp.controllers;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizzapp.entities.Question;


@RestController
@CrossOrigin
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepository;
	
	@GetMapping("/")
	public List<Question> fetchAllQuestions(){
		return questionRepository.findAll();
	}
	
	@PostMapping("/")
	public ResponseEntity<Void> addQuestion(@RequestBody Question question){
		System.out.println("add a workout method is invoked...");
		System.out.println(question);
		// db insert
		questionRepository.save(question);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
	}
	@GetMapping("/{questionid}")
	public ResponseEntity<Question> fetchQuestionById(@PathVariable("questionid") int questionId){
		ResponseEntity<Question> re = null;
		Question questionFound =  questionRepository.findById(questionId);
		return re = new ResponseEntity<Question>(questionFound, HttpStatus.OK);
	}
	
	@DeleteMapping("/{questionid}")
	public ResponseEntity<Void> deleteQuestion(@PathVariable("questionid") int questionId){
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.OK);
		try {
			questionRepository.deleteById(questionId);
		}
		catch(EmptyResultDataAccessException e) {
			re= new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		return re;
		
	}
}
