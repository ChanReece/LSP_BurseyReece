package org.howard.edu.lsp.assignment7;

/**
 * 
 * @author cburseyreece
 *
 */

public class term
{
	private int coefficient;
    private int exponent;
  
    /**
     * Constructor method, sets values for coefficient and term
     * @param coefficient of term
     * @param exponent of term class
     */

    public term(int coefficient, int exponent)
    {
        this.coefficient = coefficient ;
        this.exponent = exponent ;
    }
  
    /**
     * Access method to retrieve the coefficient
     * @return The coefficient of the term
     */
    public int getCoefficient()
    	{return coefficient;}
  
    /**
     * Access method to retrieve the exponent
     * @return The exponent of the term
     */
    public int getExponent()
    	{return exponent;}
  
    /**
     * Method that returns the string in ax^b format.
     * @return formatted string
     */
    public String toString()
    {
        String s = " " + formatCo() + formatEx() ;
        return s ;
    }
  
    /**
     * Helper method to format the coefficient
     * @return formatted coefficient
     */
    private String formatCo()
    {
        String coefficient = String.valueOf(this.coefficient);
        if (this.coefficient == 0)
        {
        	coefficient = "" ; 
	        exponent = 0 ;
        }
        else if (this.coefficient == 1)
        	{coefficient = "" ;}
        else if (this.coefficient == -1)
        	{coefficient = "-" ;}
        return coefficient ;
    }
  
    /**
     * Helper method to format the exponent
     * @return the formated exponent
     */
    private String formatEx()
    {
        String exponent = "x^" + String.valueOf(this.exponent );
        if ( this.exponent == 0 )
        {exponent = "" ; }
        else if (this.exponent == 1)
        {exponent = "x";}
        return exponent;
    }
}