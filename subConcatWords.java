package String;

import java.util.ArrayList;
import java.util.Scanner;

/**************************************************************************************
You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

Example 1:

Input:
  s = "barfoothefoobarman",
  words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoor" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.

********************************************************************************************/
 /* 
 * @author Srishti Singh
 *
 */
public class subConcatWords {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter main string");
		String big = s.nextLine();
		System.out.println("Enter words(space separated");
		boolean inprogress = false;
		ArrayList<String> words = new ArrayList<>();
		String wordsarr[] = s.nextLine().split(" ");
		for (String s1 : wordsarr){
			words.add(s1);
		}
		int start  =-1;
		ArrayList<String> words_temp = new ArrayList<>();
		int size = words.get(0).length(); //all words equal length
		for(int i=0; i+size-1<big.length(); ) {
			String newword = big.substring(i, i+ size);
			if(words.contains(newword)){
				if(inprogress == false) {
					words_temp.addAll( words);
					start = i;
				}
				int x = words_temp.indexOf(newword);
				
				inprogress = true;
				words_temp.remove(x);
				if(words_temp.size() == 0){
					System.out.println("Start index :  " + start);
					System.out.println("Done");
					inprogress = false;
				}
				i+=size;
				
			}
			else { i++;
				  inprogress = false;
			}
		}
	}

}
