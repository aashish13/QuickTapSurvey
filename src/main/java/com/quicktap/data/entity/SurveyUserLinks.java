package com.quicktap.data.entity;
// Generated Feb 20, 2016 7:10:56 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SurveyUserLinks generated by hbm2java
 */
@Entity
@Table(name = "survey_user_links")
public class SurveyUserLinks implements java.io.Serializable {

	private Integer id;
	private Surveys surveys;
	private Users users;

	public SurveyUserLinks() {
	}

	public SurveyUserLinks(Surveys surveys, Users users) {
		this.surveys = surveys;
		this.users = users;
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

	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "surveys_id", nullable = false)
	public Surveys getSurveys() {
		return this.surveys;
	}

	public void setSurveys(Surveys surveys) {
		this.surveys = surveys;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "users_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
