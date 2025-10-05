package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "quiz_questions")
@Getter
@Setter
public class QuizQuestionEntity 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long quizQuestionId;
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    String correctAns;
}
