package com.example.demo.data.vo.v1;

import java.io.Serializable;
import java.util.Objects;


//@JsonPropertyOrder({"id", "firstName", "lastName", "addres", "gender"}) //indica em que ordem vai aparecer no json
public class PersonVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5790025844477124970L;
	 
	private Long id;
	
	//@JsonProperty("firs_name")
	private String firstName;
	
	private String lastName;
	
	private String addres;
	
	//@JsonIgnore esta ignorando esse atributo no json
	private String gender;
	
	public PersonVO() {
		// TODO Auto-generated constructor stub
	}
		
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(addres, firstName, gender, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonVO other = (PersonVO) obj;
		return Objects.equals(addres, other.addres) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(gender, other.gender) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName);
	}
	
	
	
}
