package org.howard.edu.lsp.assignment3.test;

import java.util.*;
import java.util.Arrays;

/**
 * 
 * @author cburseyreece
 *
 */
public class IntegerSet {
	/**
	 * Hint: probably best to use an array list.  You will need to do a little research
	 */
	private ArrayList<Integer> list = new ArrayList<Integer>();

	/**
	 * @param list that will be initialized
	 */
	public IntegerSet(ArrayList list) {
		this.list=list;
		}
	
	/**
	 * Clears the list
	**/
	public void clear() { list.clear();};

	/** 
	 * @return the length of the set
	 */
	public int length() {return list.size();};


	/**
	 * @param b is the comparison set
	 * @return true if the two sets are equal
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> list2=b.list;
    
		if(list.size()!=list2.size()) {
	      return false;
	      }
	    
		ArrayList<Integer> temp1=list;
	    
		ArrayList<Integer> temp2=list2;
		    
		Collections.sort(temp1);
		Collections.sort(temp2);
	    
		for(int i=0;i<temp1.size();i++) {
	      if(temp1.get(i)!=temp2.get(i)) {
	          return false;
	          }
	      }
		return true;
		};  

	/** 
	 * @return largest item in set
	 * @throws IntegerSetException if set is empty
	 */
	public int largest() throws IntegerSetException {
		if(list.size()==0) {
			IntegerSetException e= new IntegerSetException();
	        throw e;
	       }
	      
	    int max=0;
	      
	    for(int i=0;i<list.size();i++) {
	      if(list.get(i)>max) {
	         max=list.get(i);
	         }
	       }
	    return max;
	}; 

	/**
	 * @return the smallest item in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException{
		if(list.size()==0) {
			IntegerSetException e= new IntegerSetException();
	           throw e;
	       }
	      
	       int min=Integer.MAX_VALUE;
	      
	       for(int i=0;i<list.size();i++) {
	           if(list.get(i)<min) {
	               min=list.get(i);
	           }
	       }
	      
	       return min;
	}
	;

		/**
		 *  Adds an item to the set or does nothing it already there	
		 * @param item that will be added
		 */
	 	public void add(int item) {    
	 		
	 		boolean exist=false;
	      
	       for(int i=0;i<list.size();i++) {
	          
	           if(list.get(i)==item) {
	               exist=true;
	           }
	       }
	      
	       if(exist==false) {
	           list.add(item);
	       }}; // adds item to s or does nothing if it is in set

	/**
	 * @param item that will be removed
	 * @throws IntegerSetException ff the set is empty
	 */
	public void remove(int item) throws IntegerSetException { 
		if(list.size()==0) {
			IntegerSetException e= new IntegerSetException();
	           throw e;
	       }
	      
		for(int i=0;i<list.size();i++) {
        
        if(list.get(i)==item) {
            list.remove(i);
        }
       }
	};
        

	/**
	 * @param intSetb is set that will be unioned with setA
	 * @return the union of both sets
	 */
	public IntegerSet union(IntegerSet intSetb) {
		ArrayList<Integer> temp=intSetb.ToString();
	      
	    Set<Integer> set = new HashSet<>();
	    set.addAll(list);
	    set.addAll(temp);
	      
	    ArrayList<Integer> list3= new ArrayList<>(set);
	      
	    IntegerSet list4= new IntegerSet(list3);
	      
	    return list4;
	};

	/**
	 * Set intersection
	 * @param intSetb list to intersect with set a
	 * @return intersected list
	 */
	public IntegerSet intersect(IntegerSet intSetb) {
		 ArrayList<Integer> temp=intSetb.ToString();
	      
	       list.retainAll(temp);
	      
	       IntegerSet list4= new IntegerSet(list);
	      
	       return list4;
	}; 

	/**
	 *  Set difference, i.e., s1 –s2
	 * @param intSetb set to be differentiated with setA
	 * @return difference of both sets
	 */
	public IntegerSet diff(IntegerSet intSetb) {
		ArrayList<Integer> temp=intSetb.ToString();
	      
	       // Remove all elements in list2 from list
	       list.removeAll(temp);
	      
	       IntegerSet list4= new IntegerSet(list);
	      
	       return list4;	
	}
	
	/**
	 * @param value that will be checked for in set
	 * @return true if value is within set
	 */
	public boolean contains(int value) {
		boolean contain = false;
		for(int i=0;i<list.size();i++) {
	        
	        if(list.get(i)==value) {
	            contain = true;
	        }
	       }
		return contain;
	};   
	
	/** 
	 * @return String representation of your set
	 */
	 public ArrayList<Integer> ToString(){
	     return list;
	   }
	 

	/**
	 * @return true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		boolean empty = false;
		if(list.size()==0) {
			empty = true;
	       }
	     return empty;
		
	}
	 
	// Returns true if the set contains the value, otherwise false
	

	
	

}
