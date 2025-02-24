package artifactid;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	int id;
	String name;
	int age;
	String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	public Student(int id, String name, int age, String course) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
