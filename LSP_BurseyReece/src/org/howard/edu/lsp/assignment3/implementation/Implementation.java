package org.howard.edu.lsp.assignment3.implementation;

import java.util.*;

import org.howard.edu.lsp.assignment3.test.IntegerSet;
import org.howard.edu.lsp.assignment3.test.IntegerSetException;

/**
 * 
 * @author cburseyreece
 *
 */
public class Implementation {
	
	/**
	 * 
	 * @param args
	 * @throws IntegerSetException
	 */
	 public static void main(String[] args) throws IntegerSetException {
	      
		 ArrayList<Integer> list1= new ArrayList<>();
		 ArrayList<Integer> list2= new ArrayList<>();
		   
		   
		 // make 2 instance of integerset class for implementation
		 IntegerSet set1= new IntegerSet(list1);
		 set1.add(1);
		 set1.add(10);
		 set1.add(2);
		 set1.add(88);
		 //set1.add(22);
		 //set1.add(3);
		 //set1.add(33);
		
		 
		 IntegerSet set2= new IntegerSet(list2);
//		 set2.add(2);
//		 set2.add(10);
//		 set2.add(2);
		 //set2.add(44);
		 set2.add(1);
		 //set2.add(55);
		   
		 System.out.println("Set 1 : " + set1.ToString());
		 System.out.println("Set 2 : " + set2.ToString());
		 boolean contains1 = set1.contains(1);
		 boolean contains2 = set2.contains(1);
		 
		 System.out.println();
		 
		 System.out.println("Set 1 contains 1? " + contains1);
		 System.out.println("Set 2 contains 1? " + contains2);
		 System.out.println("Set 1 empty? " + set1.isEmpty());
		 System.out.println("Set 2 empty? " + set2.isEmpty());
		 
		 set1.remove(11);
		 set1.remove(22);
		 set1.remove(33);
		 set2.remove(44);
		 set2.remove(55);
		 System.out.println();
		 System.out.println("Set 1 after removing 2 digit numbers: " + set1.ToString());
		 System.out.println("Set 2 after removing 2 digit numbers: " + set2.ToString());
		 
		 
		 System.out.println();
		 System.out.println("Set 1 Length: " + set1.length());
		 System.out.println("Set 2 Length: " + set2.length());
		 System.out.println();
		 System.out.println("Is Set 1 equal to Set 2?: " + set1.equals(set2));
		 
		 System.out.println();
		 
		 System.out.println("Smallest element in set1 : " + set1.smallest());
		 System.out.println("Largest element in set1 : " + set1.largest());
		 
		 System.out.println("Smallest element in set2 : " + set2.smallest());
		 System.out.println("Largest element in set2 : " + set2.largest());
		 
		 System.out.println();
		 
		 IntegerSet setUnion = set1.union(set2);
		 System.out.println("Union of set1 and set2 : " + setUnion.ToString() );
		   
		 IntegerSet setIntersection = set1.intersect(set2);
		 System.out.println("Intersection of set1 and set2 : "+setIntersection.ToString() );
		 
		 IntegerSet setDifference = set1.diff(set2);
		 System.out.println("Difference of set1 and set2 : "+setDifference.ToString() );
		 
		 System.out.println();
		 set1.clear();
		 set2.clear();
		 System.out.println("Set 1 after clear: " + set1.ToString());
		 System.out.println("Set 2 after clear: " + set1.ToString());
		 System.out.println("Set 1 empty? " + set1.isEmpty());
		 System.out.println("Set 2 empty? " + set2.isEmpty());
		 }
	 

	}


