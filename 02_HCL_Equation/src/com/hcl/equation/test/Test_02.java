package com.hcl.equation.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test_02 {

	public static final String open_Parenthesis = "(";
	public static final String close_Parenthesis = ")";
	public static final String pattern = "[+]";

	public static final String replacement = "*";

	public static void main(String[] args) throws ScriptException {

		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		String input = "(((1+5)+6+(10+8))";

		/*
		 * // First , we have to ensure equal count of Open-( & Close-) Parenthesis from
		 * a // given string // Step 1 IntStream intStream = input.chars();
		 * 
		 * // Step 2 Stream<Character> charsStream = intStream.mapToObj(ch -> (char)
		 * ch);
		 * 
		 * // Step 3 Map<Character, Long> output =
		 * charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		 * 
		 * System.out.println(output);
		 */

		StringBuilder sb = new StringBuilder(input);
		Pattern pattern = Pattern.compile("[(0-9)]");
		Matcher matcher = pattern.matcher(sb);

		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(" - " + matcher.group());
		}
		// if (output.get(open_Parenthesis) == output.get(close_Parenthesis)) { // Here
		// if same number of Open ( == Close ) then proceed

		/*
		 * while (sb.indexOf(open_Parenthesis) != -1 && sb.indexOf(close_Parenthesis) !=
		 * -1) {
		 * 
		 * 
		 * int start = sb.indexOf(open_Parenthesis); int end =
		 * sb.indexOf(close_Parenthesis);
		 * 
		 * String sub = sb.substring(start, end + 1); int lastIndex =
		 * sub.lastIndexOf(open_Parenthesis);
		 * 
		 * start = lastIndex;
		 * 
		 * Integer i1 = Integer.parseInt(engine.eval(sb.substring(start, end +
		 * 1)).toString()); Integer i2 = Integer.parseInt(
		 * engine.eval(sb.substring(start, end + 1).replaceAll(pattern,
		 * replacement)).toString());
		 * 
		 * Integer ret = i1 >= i2 ? i1 : i2;
		 * 
		 * String foo = sb.replace(start, end + 1, ret.toString()).toString();
		 * 
		 * System.out.println(foo);
		 * 
		 * }
		 */
		// }

	}
}