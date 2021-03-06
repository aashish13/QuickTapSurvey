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
 * Charts generated by hbm2java
 */
@Entity
@Table(name = "charts")
public class Charts implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<ChartsQuestions> chartsQuestionses = new HashSet<ChartsQuestions>(0);

	public Charts() {
	}

	public Charts(String name) {
		this.name = name;
	}

	public Charts(String name, Set<ChartsQuestions> chartsQuestionses) {
		this.name = name;
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

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "charts")
	public Set<ChartsQuestions> getChartsQuestionses() {
		return this.chartsQuestionses;
	}

	public void setChartsQuestionses(Set<ChartsQuestions> chartsQuestionses) {
		this.chartsQuestionses = chartsQuestionses;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getId().equals(((Charts)obj).getId());
	}*/
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
/*	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getId();
	}*/
}
