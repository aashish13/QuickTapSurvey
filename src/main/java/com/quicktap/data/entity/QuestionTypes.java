package com.quicktap.data.entity;
// Generated Feb 28, 2016 1:13:33 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * QuestionTypes generated by hbm2java
 */
@Entity
@Table(name = "question_types")
public class QuestionTypes implements java.io.Serializable {

	private Integer id;
	private String type;
	private Set<ChartsQuestions> chartsQuestionses = new HashSet<ChartsQuestions>(0);

	public QuestionTypes() {
	}

	public QuestionTypes(String type, Set<ChartsQuestions> chartsQuestionses) {
		this.type = type;
		this.chartsQuestionses = chartsQuestionses;
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

	@Column(name = "type", length = 100)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionTypes")
	public Set<ChartsQuestions> getChartsQuestionses() {
		return this.chartsQuestionses;
	}

	public void setChartsQuestionses(Set<ChartsQuestions> chartsQuestionses) {
		this.chartsQuestionses = chartsQuestionses;
	}

}
