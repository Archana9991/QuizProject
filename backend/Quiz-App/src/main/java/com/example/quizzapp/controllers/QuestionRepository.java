package com.example.quizzapp.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quizzapp.entities.Question;


public interface QuestionRepository extends JpaRepository<Question, Integer>{
	Question findById(int id);

}
