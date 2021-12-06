package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PolynomialTest {
	   
	polynomial poly = new polynomial();
	
	
	public PolynomialTest() {};
	
	@BeforeEach
	protected void setUp() {
		poly = new polynomial();
   }

	@Test
	@DisplayName("Test Case for insert function")
	void testInsert() {
		String test = "3x^8 + 1x^6 + 4x^4 + 3x^3 + 3x^2 + 2x^1";
		poly.insert(3,2);
		poly.insert(4,4);
		poly.insert(1,6);
	    poly.insert(3,8);
	    poly.insert(2,1);
	    poly.insert(3,3);
		assertEquals(test, poly.toString(), "polynomials should be identical");
	}
	@Test
	@DisplayName("Test Case for delete function")
	void testDelete() {
		String test = "1x^6 + 4x^4 + 3x^3 + 3x^2 + 2x^1";
		poly.insert(3,2);
		poly.insert(4,4);
		poly.insert(1,6);
	    poly.insert(3,8);
	    poly.insert(2,1);
	    poly.insert(3,3);
	    //delete
	    poly.delete(3,8);
	    System.out.println(poly.toString());
		assertEquals(test, poly.toString(), "selected terms should be deleted");
	}
	@Test
	@DisplayName("Test Case for reverse function")
	void testReverse() {
		//String poly_example = "1x^6 + 4x^4 + 3x^3 + 3x^2 + 2x^1";
		String reversedPoly = "2x^1 + 3x^2 + 3x^3 + 4x^4 + 1x^6";
		poly.insert(3,2);
		poly.insert(4,4);
		poly.insert(1,6);
	    poly.insert(2,1);
	    poly.insert(3,3);
	    //reverse
	    poly.reverse();
		assertEquals(reversedPoly, poly.toString(), "polynomial should be reversed");
	}
	@Test
	@DisplayName("Test Case for product function")
	void testProduct() {
		//String poly_example = "1x^6 + 4x^4 + 3x^3 + 3x^2";
		String polyProduct = "36x^15";
		poly.insert(3,2);
		poly.insert(4,4);
		poly.insert(1,6);
	    poly.insert(3,3);
	    //multiply ;
		assertEquals(polyProduct, poly.product().toString(), "polynomial should be one product term");
	}





}

