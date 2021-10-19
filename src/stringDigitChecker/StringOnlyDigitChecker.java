/**
 * 
 */
package stringDigitChecker;

/**
 * @author NathanClarke
 *
 */

import java.util.*;

public class StringOnlyDigitChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a sentence");
		Scanner a = new Scanner(System.in);
		
		String rgx = "^[0-9]*$";
		if(a.hasNextLine()) {
			String beta = a.nextLine();
			if(beta.matches(rgx)) {
				System.out.println("This sentence contains only numbers");
			}
			else {
				System.out.println("The sentence does not consist only of numbers");
			}
		}
		
		a.close();

	}

}
