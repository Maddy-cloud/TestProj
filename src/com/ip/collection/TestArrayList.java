package com.ip.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Student{
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private String name;
	
	@Override
	
	public String toString(){
		
		return name;
		
	}
}

public class TestArrayList {
	
	public static void main(String args[]) {
		
		List list = new ArrayList();
		list.add("Sankari");
		list.add(1);
		Student stud = new Student();
		stud.setAge(12);
		stud.setName("Kalai");
		list.add(stud);
		System.out.println(list);
		
		//Normal For loop 
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> listGenerics = new ArrayList<String>();
		
		listGenerics.add("Madhi");
		listGenerics.add("Snakari");
		listGenerics.add("Kalai");
		listGenerics.add("Deju");
		
		
		//Enhaunced For loop (Generics should be there)
		
		for (String str :listGenerics ) {
			System.out.println(str);
		}
		
		//Iterator 
		
		Iterator itr =  list.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
