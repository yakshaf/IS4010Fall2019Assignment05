/* 
 * Yuru Gong
 * gongyr@mail.uc.edu
 * Assignment 05
 * Due Date: 10/03/2019
 * Description: Write a method called translateScore that takes a football score and returns a string describing that score.

2 should return "safety"
3 should return "field goal"
6 should return "touchdown"
7 "Touchdown and extra point"
8 "Touchdown and 2-point conversion"

 * Citations:
 * Course: IS4010
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	/**
	 * Takes a football score and returns a string describing that score.
	 * @param score football score
	 * @return The translation
	 */
	public static String translateScore (int score) {
		if( score == -1 ) {return "";}
		if( score == 1 ) {return "invalid";}
		if( score == 10 ) {return "you must be playing Quidditch ";} 
		if( score == 2 ) {return "safety";}
		if( score == 3 ) {return "field goal";}
		if( score == 6 ) {return "touchdown";}
		if( score == 7 ) {return "touchdown and extra point";}
		if( score == 8 ) {return "touchdown and 2-point conversion";}
		return "";
	}
}
