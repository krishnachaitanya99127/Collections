package com.src;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList al = new ArrayList();//common
// ArrayList <Integer> al1 = new ArrayList<>();//generic coll
	//al1.add() ;
 
 al.add(789);
 
 al.add(899);
 al.add(567);
 al.add(123);
 al.add(456);
 al.add(789);
 
 System.out.println(al);
 Iterator it = al.iterator();
 
 while(it.hasNext())
 {
 System.out.println(it.next());
 
	 }
 //ArrayList al2 = new ArrayList(100);

 LinkedList l1 = new LinkedList();
 l1.add(899);
 l1.add(567);
 l1.add(123);
 l1.add(456);
 l1.add(789);
 

 
 System.out.println(l1);
 ListIterator li = l1.listIterator();
 
 while(li.hasNext())
 {
	 System.out.println(li.next());
 }
 
 Vector v = new Vector();
 v.add(899);
 v.add(567);
 v.add(123);
 v.add(456);
 v.add(789);
 
 System.out.println(v);
 
 Enumeration e = v.elements();
 
 while (e.hasMoreElements())
 {
	 System.out.println(e.nextElement());
 }
 
 Stack s = new Stack();
 s.push(44);
 s.push(54);
 s.push(34);
 s.push(64);

 System.out.println(s.peek());
 System.out.println(s);
 
 System.out.println(s.pop());
 System.out.println(s);
 
  }
}
	
