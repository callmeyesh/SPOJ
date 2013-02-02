import java.util.*;

/**
 * 
 * @author yeshwanthvenkatesh Problem code: ONP
 * 
 *         Transform the algebraic expression with brackets into RPN form
 *         (Reverse Polish Notation). Two-argument operators: +, -, *, /, ^
 *         (priority from the lowest to the highest), brackets ( ). Operands:
 *         only letters: a,b,...,z. Assume that there is only one RPN form (no
 *         expressions like a*b*c).
 * 
 *         Input
 * 
 *         t [the number of expressions <= 100] expression [length <= 400]
 *         [other expressions] Text grouped in [ ] does not appear in the input
 *         file.
 * 
 *         Output
 * 
 *         The expressions in RPN form, one per line. Example
 * 
 *         Input: 3 (a+(b*c)) ((a+b)*(z+x)) ((a+t)*((b+(a+c))^(c+d)))
 * 
 *         Output: abc*+ ab+zx+* at+bac++cd+^*
 * 
 * 
 */
public class ONP {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		while (count-- > 0) {
			String exp = in.next();
			int strLength = exp.length();
			int counter = -1;
			Stack<Character> st = new Stack<Character>();
			String output = "";
			while (counter++ < strLength - 1) {

				if (exp.charAt(counter) == '(')
					continue;

				char test = exp.charAt(counter);

				if (test == '+' || test == '-' || test == '*' || test == '/'
						|| test == '^') {
					st.add(test);
					continue;
				} else if (test == ')') {
					output += st.pop();
					continue;
				} else {
					output += String.valueOf(test);
					continue;
				}

			}
			System.out.println(output.trim());

		}

	}

}
