package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Act";

		if (areAnagrams(s1, s2)) {
			System.out.println("Both Strings are Anagrams");
		} else {
			System.out.println("Both Strings are not Anagrams");
		}

		// using streams
		boolean isAnagram = Arrays.equals(s1.toLowerCase().chars().sorted().toArray(),
				s2.toLowerCase().chars().sorted().toArray());
		if (isAnagram) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() != s2.length())
			System.out.println(false);
		int[] count = new int[256]; // Assuming ASCII
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		boolean isAnagram1 = true;
		for (int c : count) {
			if (c != 0) {
				isAnagram1 = false;
				break;
			}
		}
		if (isAnagram1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	private static boolean areAnagrams(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length())
			return false;

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}
}

//Time Complexity: O(n log n) due to sorting.
//Space Complexity: O(n) due to additional space for character arrays.

//	public static void main(String[] args) {
//		String s1 = "Cat";
//		String s2 = "Act";
//
//		System.out.println(checkAnagrams(s1, s2));
//	}
//
//	private static boolean checkAnagrams(String s1, String s2) {
//		if (s1 == null || s2 == null || s1.length() != s2.length())
//            return false;
//
//		s1 = sortString(s1);
//		s2 = sortString(s2);
//
////		for (int i = 0; i < s1.length(); i++) {
////			if (s1.charAt(i) != s2.charAt(i))
////				return false;
////		}
////
//		return s1.equals(s2);
//	}
//
//	private static String sortString(String s) {
//		char[] c = s.toLowerCase().toCharArray();
//		Arrays.sort(c);
//		return new String(c);
//	}