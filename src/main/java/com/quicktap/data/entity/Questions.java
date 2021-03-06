package com.quicktap.data.entity;
// Generated Feb 20, 2016 7:10:56 PM by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Questions generated by hbm2java
 */
@Entity
@Table(name = "questions")
public class Questions implements java.io.Serializable {

	private Integer id;
	private Surveys surveys;
	private long questionNo;
	private String title;
	private Set<ResponseValues> responseValueses = new HashSet<ResponseValues>(0);

	public Questions() {
	}

	public Questions(Surveys surveys, long questionNo, String title) {
		this.surveys = surveys;
		this.questionNo = questionNo;
		this.title = title;
	}

	public Questions(Surveys surveys, long questionNo, String title, Set<ResponseValues> responseValueses) {
		this.surveys = surveys;
		this.questionNo = questionNo;
		this.title = title;
		this.responseValueses = responseValueses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "surveys_id", nullable = false)
	public Surveys getSurveys() {
		return this.surveys;
	}

	public void setSurveys(Surveys surveys) {
		this.surveys = surveys;
	}

	@Column(name = "question_no", nullable = false)
	public long getQuestionNo() {
		return this.questionNo;
	}

	public void setQuestionNo(long questionNo) {
		this.questionNo = questionNo;
	}

	@Column(name = "title", nullable = false, length = 500)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questions")
	public Set<ResponseValues> getResponseValueses() {
		return this.responseValueses;
	}

	public void setResponseValueses(Set<ResponseValues> responseValueses) {
		this.responseValueses = responseValueses;
	}
	
	// adding equals method so that we can use this method 
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		Questions q=(Questions)obj;
		return this.getQuestionNo()==q.getQuestionNo();
	}

}
