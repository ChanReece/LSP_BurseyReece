package org.howard.edu.lsp.assignment7;
import java.util.ArrayList;
import java.util.*;

/**
 * Class that implements polynomial as a list of terms 
 * where each term has an integer, coefficient, and exponent
 * @author cburseyreece
 *
 */

class polynomial
{
   private ArrayList<Integer> exponent;
   private ArrayList<Integer> coefficient;
  

   /**
    * Creates an empty Polynomial
    */
   public polynomial()
   {
       exponent = new ArrayList<Integer>();
       coefficient = new ArrayList<Integer>();
   }

   /**
    * Inserts new term in proper place of the polynomial
    * @param coeff the coefficient of the new term
    * @param expo the exponent of the new term
    */
   public void insert(int coeff, int expo)
   {
      System.out.println("insert method called for " + coeff + " " + expo) ;
      boolean check = false;
      int index = exponent.size();
      for(int i = 0; i < index; i++) {
          if(expo < exponent.get(i)) {
              exponent.add(i, expo);
              coefficient.add(i, coeff);
              check = true;
              break;
          }
      }
      if(!check) {
          exponent.add(expo);
          coefficient.add(coeff);
      }
   }

   /**
    * Deletes a specified term from the given polynomial
    * prints an appropriate message if the term is not found
    * @param coeff the coefficient of the term to be deleted
    * @param expo the exponent of the term to be deleted
    */
   public void delete (int coeff, int expo)
   {
      System.out.println("delete method called for " + coeff + " " + expo) ;
      boolean check = false;
      int index = exponent.size();
      for(int i = 0; i < index; i++) {
          if(exponent.get(i) == expo) {
              exponent.remove(i);
              coefficient.remove(i);
              check = true;
          }
      }
      if(check == false){
    	  System.out.println("term not found") ;
      }
   }

   /**
    * Returns the product of all the terms of a Polynomial, as a String
    * @return product of all terms in polynomial
    */
   public String product()
   {
      System.out.println("product method called") ;
      int index = exponent.size();
      int expos = 0; //exponents
      int coefs = 1; //coefficients
      for(int i = 0; i < index; i++) {
    	  expos += exponent.get(i);
    	  coefs *= coefficient.get(i);
      }
      return coefs + "x^" + expos ;
   }

   /**
    * Returns a polynomial as a String in this form: 3x^6 + 4x^4 + x^2
    * @return polynomial as a string
    */
   public String toString()
   {
      System.out.println("toString method called") ;
      String polynomial = "";
      int index = exponent.size();
      for(int i = 0; i < index; i++) {
           if (i  ==  0) {
        	   polynomial = (coefficient.get(i)+"x^"+exponent.get(i)) + polynomial;
           }
           else {
        	   polynomial = (coefficient.get(i)+"x^"+exponent.get(i))+" + " + polynomial;   
           }
           
      }
      return polynomial;
   }

   /**
    * Reverses the order of the terms in the polynomial
    */
   public void reverse()
   {
      System.out.println("reverse method called") ;
      Collections.reverse(exponent);
      Collections.reverse(coefficient);
   }
   }
