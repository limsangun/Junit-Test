package com.godcoder.junitproject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50, nullable=false)
	private String title;
	@Column(length = 20, nullable=false)
	private String author;
	
	@Builder
	public Book(Long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	
}
