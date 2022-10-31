package com.src;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		
		hs.add(67);
		hs.add(47);
		hs.add(77);
		hs.add(27);
		hs.add(97);
		hs.add(57);
		hs.add(67);
		
		System.out.println(hs);
		
		HashSet<Student> students = new HashSet();
		
		students.add(new Student(234,"krishna",909099));
		students.add(new Student(567,"krisna",909099));
		students.add(new Student(430,"krha",909099));
		students.add(new Student(241,"kria",909099));
		students.add(new Student(234,"hna",909099));
		
	}

}
