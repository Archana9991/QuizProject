package com.example.quizzapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;




import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.quizzapp.controllers.QuestionRepository;
import com.example.quizzapp.entities.Question;

@SpringBootTest
class QuizzAppApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

//	@Test
//	 public void CreateQuestionTest() {
//		Question question1=new Question();
//		question1.setId(9);
//		question1.setQuestion("Vijayanagara has been created as the 31st district of which Indian state?");
//		question1.setChoice1("Andhra Pradesh");
//		question1.setChoice2("Karnataka");
//		question1.setChoice3("TamilNadu");
//		question1.setChoice4("Kerala");
//		question1.setCorrect("Karnataka");
//		questionRepository.save(question1);
//		assertNotNull(questionRepository.findById(9).get());
//	}
	
	@Test
	public void testFetchQuestions() {
	    List<Question> list =questionRepository.findAll();
	    System.out.println(list);
	    assertSame(9,questionRepository.findAll().size());
	}
	
	@Test
	
	public void testDeleteQuestion() {
	   Question question = questionRepository.findById(10);
	     
	   questionRepository.deleteById(question.getId());
	     
	    Question deletedquestion = questionRepository.findById(10);
	     
	    assertNull(deletedquestion);       
	     
	}
}

	
