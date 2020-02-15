package com.ip.multipleinheritance;

public class MutipleInheritance {
	
	public static void main(String args[]) {
		
		Madhi m = new Kalai();
		m.calm();
		
		System.out.println(m.hashCode());
		
		
		Sankari s = new Kalai();
		s.angry();
		//s.equals(obj)
		System.out.println(s.hashCode());
		
		Kalai k = new Kalai();
		
		k.character();
		
	}

}
