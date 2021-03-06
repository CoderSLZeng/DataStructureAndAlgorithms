package com.zeng;

/**
 * @author SL Zeng
 *
 */
public class Person implements Comparable<Person> {
	
	private int age;
	private String name;

	
	public Person(int age) {
		this.age = age;
	}
	
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}

	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Person o) {
		
		return age - o.age;
	}


	@Override
	public String toString() {
		return age + "_" + name;
	}

}
