package org.howard.edu.lsp.assignment5.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.howard.edu.lsp.assignment5.integerset.IntegerSet;
import org.howard.edu.lsp.assignment5.integerset.IntegerSetException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	   
	IntegerSet set1 = new IntegerSet(list1);
	
	
	public IntegerSetTest() {};
	
	@BeforeEach
	protected void setUp() {
		set1 = new IntegerSet(list1);
   }


	@Test
	@DisplayName("Test Case for clear function")
	void testClear() {
		ArrayList<Integer> set2 = new ArrayList<>();
		set1.add(1);
		set1.add(11);
		set1.add(2);
		set1.add(22);
		set1.add(3);
		set1.add(33);
		set1.clear(); //run clear function
		assertEquals(set2, set1.toList(), "both sets should be clear");
	}

	@Test
	@DisplayName("Test Case for length function")
	void testLength() {
		assertEquals(set1.length(), 0);
		set1.add(1);
		set1.add(11);
		set1.add(2);
		assertEquals(set1.length(), 3);
		set1.add(22);
		set1.add(3);
		set1.add(33);
		assertEquals(set1.length(), 6);
		
	}

	@Test
	@DisplayName("Test Case for equals function")
	void testEqualsIntegerSet() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set2 = new IntegerSet(list1);
		assertTrue(set1.equals(set2));
		set1.add(1);
		set1.add(11);
		set1.add(2);
		assertFalse(set1.equals(set2));
		set2.add(1);
		set2.add(11);
		set2.add(2);
		assertTrue(set1.equals(set2));
	}

	@Test
	@DisplayName("Test cases for largest function")
	void testLargest() throws IntegerSetException {
		set1.add(9);
		set1.add(11);
		set1.add(22);
		assertEquals(set1.largest(), 22);
		set1.add(22);
		set1.add(3);
		set1.add(33);
		assertEquals(set1.largest(), 33);
	}
	
	
	@Test
	@DisplayName("Test cases for smallest function")
	void testSmallest() throws IntegerSetException {
		set1.add(9);
		set1.add(11);
		set1.add(22);
		assertEquals(set1.smallest(), 9);
		set1.add(22);
		set1.add(3);
		set1.add(33);
		assertEquals(set1.smallest(), 3);
	}

	@Test
	@DisplayName("Test cases for add function")
	void testAdd() {
		assertEquals(set1.ToString().toString(), "[]");
		set1.add(1);
		set1.add(11);
		set1.add(2);
		assertEquals(set1.ToString().toString(), "[1, 11, 2]");
		set1.add(8);
		assertEquals(set1.ToString().toString(), "[1, 11, 2, 8]");
	}

	@Test
	@DisplayName("Test cases for remove")
	void testRemove() {
		assertEquals(set1.ToString().toString(), "[]");
		set1.add(1);
		set1.add(11);
		set1.add(2);
		assertEquals(set1.ToString().toString(), "[1, 11, 2]");
		set1.add(8);
		assertEquals(set1.ToString().toString(), "[1, 11, 2, 8]");
	}

	@Test
	@DisplayName("Test cases for union")
	void testUnion() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set2 = new IntegerSet(list1);
		assertEquals(set1.union(set2).toList().toString(), "[]");
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(4);
		set2.add(5);
		assertEquals(set1.union(set2).toList().toString(), "[1, 2, 3, 4, 5]");
	}

	@Test
	@DisplayName("Test cases for intersect")
	void testIntersect() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set2 = new IntegerSet(list1);
		assertEquals(set1.intersect(set2).toList().toString(), "[]");
		set1.add(1);
		set1.add(2);
		set1.add(4);
		set2.add(1);
		set2.add(2);
		set2.add(8);
		assertEquals(set1.intersect(set2).toList().toString(), "[1, 2]");
	}

	@Test
	void testDiff() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set2 = new IntegerSet(list1);
		assertEquals(set1.diff(set2).toList().toString(), "[]");
	
	}
	
	@DisplayName("Test cases for ToString")
	@Test
	void testToString() {
		assertEquals(set1.ToString(), "[]");
		set1.add(1);
		set1.add(2);
		set1.add(4);
		assertEquals(set1.ToString(), "[1, 2, 4]");
	}
	
	@DisplayName("Test cases for isEmpty")
	@Test
	void testIsEmpty() {
		assertTrue(set1.isEmpty());
		set1.add(1);
		set1.add(11);
		set1.add(2);
		assertFalse(set1.isEmpty());
		set1.clear();
		assertTrue(set1.isEmpty());
	}

}
