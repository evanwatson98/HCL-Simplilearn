package com.example.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	private String comments;
	private int rating;
	private String user;
}