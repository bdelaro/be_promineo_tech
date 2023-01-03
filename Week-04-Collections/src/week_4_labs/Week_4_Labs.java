package week_4_labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week_4_Labs {

	public static void main(String[] args) {

		// why would we use a StringBuilder instead of a String?
		// Strings are immutable and can't be changed after they are created and don't
		// allow for much flexibility if adjustments need to be made. StringBuilder
		// provides more flexibility if adjustments need to be made and are mutable.
		// if something is added to a string it's treated as a new string/object in
		// memory,
		// if the same is done to a StringBuilder it doesn't commit anything new to
		// memory,
		// in this case having to deal with the creations of multiple new objects that
		// could
		// have many similarities taking up space in memory

		// instantiate a new StringBuilder and append the characters 0 through 9 to it
		// separated by dashes
		// make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i);
			if (i < 9) {
				sb.append("-");
			}
		}
		System.out.println(sb.toString());

		// create a list of Strings and add 5 Strings to it, each with a different
		// length
		List<String> strings = new ArrayList<String>();
		strings.add("Tim");
		strings.add("Blue");
		strings.add("Black");
		strings.add("Chocolate");
		strings.add("Stronger");
		// Array.asList could also be used to do this more efficiently

		// write and test a method that takes a list of strings and returns the shortest
		// string
		System.out.println(findShortestStingInList(strings));

		// write and test a method that takes a list of strings and returns the list
		// with the first and last element switched
		System.out.println(strings.toString());
		System.out.println(swapFirstAndLastInList(strings));

		// write and test a method that takes a list of strings and returns a string
		// with all the list elements concatenated to each other,
		// separated by a comma
		System.out.println(combineStringsInList(strings));

		// write and test a method that takes a list of strings and a string and returns
		// a new list with all strings from the original list
		// containing the second string parameter (i.e. like a search method)
		List<String> searchResults = search(strings, "c");
		for (String result : searchResults) {
			System.out.println(result);
		}

		// write and test a method that takes a list of integers and returns a
		// List<List<Integer>> where the first list in the returned value
		// contains any number from the input list that is divisible by 2, the second
		// list contains values from the input list that are divisible
		// by 3, the third divisible by 5, and the fourth all numbers from the input
		// list not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
		List<List<Integer>> sortedNumbers = divisibilityListOfList(numbers);

		for (List<Integer> i : sortedNumbers) {
			for (Integer j : i) {
				System.out.println(j);
			}
			System.out.println("----------");
		}

		// write and test a method that takes a list of strings and returns a list of
		// integers that contains the length of each string
		List<Integer> stringLengths = lengthOfStrings(strings);
		for (Integer number : stringLengths) {
			System.out.println(number);
		}
		System.out.println("----------");

		// create a set of strings and add 5 values
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Goodbye");
		set.add("Hi");
		set.add("Hello again");

		// write and test a method that takes a set of strings and a character and
		// returns a set of strings consisting of all the strings in the
		// input set that start with the character parameter.
		Set<String> startsWithH = searchSetForStartingWith(set, 'H'); // case-sensitive
		for (String string : startsWithH) {
			System.out.println(string);
		}
		System.out.println("----------");

		// write and test a method that takes a set of strings and returns a list of the
		// same strings
		List<String> stl = setToList(set);
		for (String string : set) {
			System.out.println(string);
		}
		for (String string : stl) {
			System.out.println(string);
		}

		// write and test a method that takes a set of integers and returns a new set of
		// integers containing only even numbers from the original set
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(6);
		integerSet.add(13);
		integerSet.add(19);
		integerSet.add(22);
		integerSet.add(34);

		Set<Integer> evens = EvenNumbersOfSet(integerSet);
		for (Integer num : evens) {
			System.out.println(num);
		}

		// create a map of string and string and add 3 items to it where the key of each
		// is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Apple", "A cruchy fruit. Usually red, green, or yellow");
		dictionary.put("Banana", "A yellow fruit which you peel before eating");
		dictionary.put("Java", "A programming language created in 1995 and still heavily used today");

		// write and test a method that takes a Map<String, String> and a string and
		// returns the value for a key in the map that matches the
		// string parameter (i.e. like a language dictionary lookup)
		String value = findValueInMapWithKey(dictionary, "Java");
		System.out.println(value);

		// write and test a method that takes a List<String> and returns a
		// Map<Character, Integer> containing a count of all the strings that start
		// with a given character
		Map<Character, Integer> countsOfStarts = countStartsOfStrings(stl);
		for (Character c : countsOfStarts.keySet()) {
			System.out.println(c + ": " + countsOfStarts.get(c));
		}

	}

	public static String findShortestStingInList(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}
		return shortest;
	}

	public static List<String> swapFirstAndLastInList(List<String> list) {
		String first = list.get(0);

		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, first);

		return list;
	}

	public static String combineStringsInList(List<String> list) {
		StringBuilder fullstring = new StringBuilder();
		for (String string : list) {
			fullstring.append(string + ", ");
		}
		// two characters at end of stringbuilder a space and comma,remove both
		fullstring.deleteCharAt(fullstring.length() - 1);
		fullstring.deleteCharAt(fullstring.length() - 1);
		return fullstring.toString();
	}

	public static List<String> search(List<String> list, String query) {
		List<String> result = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(query)) {
				result.add(string);
			}
		}
		return result;
	}

	public static List<List<Integer>> divisibilityListOfList(List<Integer> list) {
		List<List<Integer>> divisibility = new ArrayList<List<Integer>>();
		// loop it maybe
		divisibility.add(new ArrayList<Integer>());
		divisibility.add(new ArrayList<Integer>());
		divisibility.add(new ArrayList<Integer>());
		divisibility.add(new ArrayList<Integer>());

		for (Integer number : list) {
			if (number % 2 == 0) {
				divisibility.get(0).add(number);
			}
			if (number % 3 == 0) {
				divisibility.get(1).add(number);
			}
			if (number % 5 == 0) {
				divisibility.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				divisibility.get(3).add(number);
			}
		}
		return divisibility;
	}

	public static List<Integer> lengthOfStrings(List<String> list) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : list) {
			lengths.add(string.length());
		}
		return lengths;
	}

	public static Set<String> searchSetForStartingWith(Set<String> set, char query) {
		Set<String> result = new HashSet<String>();
		for (String string : set) {
			if (string.charAt(0) == query) {
				result.add(string);
			}
		}
		return result;
	}

	public static List<String> setToList(Set<String> set) {
		List<String> result = new ArrayList<String>();
		for (String string : set) {
			result.add(string);
		}
		return result;
	}

	public static Set<Integer> EvenNumbersOfSet(Set<Integer> set) {
		Set<Integer> result = new HashSet<Integer>();
		for (Integer number : set) {
			if (number % 2 == 0) {
				result.add(number);
			}
		}
		return result;
	}

	public static String findValueInMapWithKey(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}

	public static Map<Character, Integer> countStartsOfStrings(List<String> list) {
		Map<Character, Integer> counts = new HashMap<Character, Integer>();
		for (String string : list) {
			char c = string.charAt(0);
			if (!counts.containsKey(c)) {
				counts.put(c, 1);
			} else {
				counts.put(c, counts.get(c) + 1);
			}
		}
		return counts;
	}

}
