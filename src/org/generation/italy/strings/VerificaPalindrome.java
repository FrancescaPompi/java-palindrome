package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insert a word: ");
		String word = scan.nextLine();
		System.out.println("The word length is: " + word.length());
		
		boolean palindrome = false;
		int j = word.length() - 1;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == word.charAt(j)) {
				palindrome = true;
			}
			j--;
		}
		
		if(palindrome == false) {
			System.out.println("The word is not palindrome.");
		} else {
			System.out.println("The word is palindrome.");
		}
		
		scan.close();
	}

}
