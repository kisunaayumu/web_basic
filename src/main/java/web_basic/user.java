package web_basic;

public class user {

	private String name;
	private int age;

	public user() {
		this.name = "名無し";
 		this.age = 0;
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
 }