package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateChracter {
//	public static void main(String[] args) {
//		String s = "madam";
//		HashSet<Character> hs = new HashSet<>();
//		char[] a = s.toCharArray();
//		for (char c : a) {
//			if (hs.contains(c)) {
//				System.out.println(c + " ");
//			} else {
//				hs.add(c);
//			}
//
//		}
//	}

	public static void main(String[] args) {
		String s = "madam";
		findAndPrintDuplicateCharacters(s);
	}

	public static void findAndPrintDuplicateCharacters(String s) {
//		if (s == null || s.isEmpty()) {
//			System.out.println("The input string is null or empty.");
//			return;
//		}
//
//		Set<Character> seenCharacters = new HashSet<>(); //keep track of characters that have been encountered
//		Set<Character> duplicateCharacters = new HashSet<>(); //store characters that are found to be duplicates
//		char[] charArray = s.toCharArray();
//
//		for (char c : charArray) {
//			if (!seenCharacters.add(c)) {
//				duplicateCharacters.add(c);
//			}
//		}
//
//		if (duplicateCharacters.isEmpty()) {
//			System.out.println("No duplicate characters found.");
//		} else {
//			System.out.print("Duplicate characters: ");
//			for (char c : duplicateCharacters) {
//				System.out.print(c + " ");
//			}
//			System.out.println();
//		}

		Map<Character, Integer> charCountMap = new HashMap<>();

		// Count the frequency of each character
		for (char c : s.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		// Print characters with frequency greater than 1
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}

	}

}