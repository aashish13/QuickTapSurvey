package com.quicktap.data.entity;
// Generated Feb 17, 2016 2:34:22 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Surveys generated by hbm2java
 */
@Entity
@Table(name = "surveys", catalog = "mydb")
public class Surveys implements java.io.Serializable {

	private Integer id;
	private long surveyId;
	private String name;
	private int totalResponses;
	private Date lastSynchTime;
	private Set<SurveyUserLinks> surveyUserLinkses = new HashSet<SurveyUserLinks>(0);
	private Set<Questions> questionses = new HashSet<Questions>(0);

	public Surveys() {
	}

	public Surveys(long surveyId, String name, int totalResponses, Date lastSynchTime) {
		this.surveyId = surveyId;
		this.name = name;
		this.totalResponses = totalResponses;
		this.lastSynchTime = lastSynchTime;
	}

	public Surveys(long surveyId, String name, int totalResponses, Date lastSynchTime,
			Set<SurveyUserLinks> surveyUserLinkses, Set<Questions> questionses) {
		this.surveyId = surveyId;
		this.name = name;
		this.totalResponses = totalResponses;
		this.lastSynchTime = lastSynchTime;
		this.surveyUserLinkses = surveyUserLinkses;
		this.questionses = questionses;
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

	@Column(name = "survey_id", nullable = false)
	public long getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(long surveyId) {
		this.surveyId = surveyId;
	}

	@Column(name = "name", nullable = false, length = 500)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "total_responses", nullable = false)
	public int getTotalResponses() {
		return this.totalResponses;
	}

	public void setTotalResponses(int totalResponses) {
		this.totalResponses = totalResponses;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_synch_time", nullable = false, length = 19)
	public Date getLastSynchTime() {
		return this.lastSynchTime;
	}

	public void setLastSynchTime(Date lastSynchTime) {
		this.lastSynchTime = lastSynchTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "surveys")
	public Set<SurveyUserLinks> getSurveyUserLinkses() {
		return this.surveyUserLinkses;
	}

	public void setSurveyUserLinkses(Set<SurveyUserLinks> surveyUserLinkses) {
		this.surveyUserLinkses = surveyUserLinkses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "surveys")
	public Set<Questions> getQuestionses() {
		return this.questionses;
	}

	public void setQuestionses(Set<Questions> questionses) {
		this.questionses = questionses;
	}

}
