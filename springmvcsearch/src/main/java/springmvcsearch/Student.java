package springmvcsearch;

import java.sql.Date;
import java.util.List;

public class Student {
	
	private String name;
	private Long id;
	
	// private Date dob;
	private String dob;
	private List<String> courses;
	private String gender;
	
    private String type;
    
    //important
	private Address address;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}