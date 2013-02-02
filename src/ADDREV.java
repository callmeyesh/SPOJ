import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yeshwanthvenkatesh Problem code: ADDREV
 * 
 *         The Antique Comedians of Malidinesia prefer comedies to tragedies.
 *         Unfortunately, most of the ancient plays are tragedies. Therefore the
 *         dramatic advisor of ACM has decided to transfigure some tragedies
 *         into comedies. Obviously, this work is very hard because the basic
 *         sense of the play must be kept intact, although all the things change
 *         to their opposites. For example the numbers: if any number appears in
 *         the tragedy, it must be converted to its reversed form before being
 *         accepted into the comedy play.
 * 
 *         Reversed number is a number written in arabic numerals but the order
 *         of digits is reversed. The first digit becomes last and vice versa.
 *         For example, if the main hero had 1245 strawberries in the tragedy,
 *         he has 5421 of them now. Note that all the leading zeros are omitted.
 *         That means if the number ends with a zero, the zero is lost by
 *         reversing (e.g. 1200 gives 21). Also note that the reversed number
 *         never has any trailing zeros.
 * 
 *         ACM needs to calculate with reversed numbers. Your task is to add two
 *         reversed numbers and output their reversed sum. Of course, the result
 *         is not unique because any particular number is a reversed form of
 *         several numbers (e.g. 21 could be 12, 120 or 1200 before reversing).
 *         Thus we must assume that no zeros were lost by reversing (e.g. assume
 *         that the original number was 12).
 * 
 *         Input
 * 
 *         The input consists of N cases (equal to about 10000). The first line
 *         of the input contains only positive integer N. Then follow the cases.
 *         Each case consists of exactly one line with two positive integers
 *         separated by space. These are the reversed numbers you are to add.
 * 
 *         Output
 * 
 *         For each case, print exactly one line containing only one integer -
 *         the reversed sum of two reversed numbers. Omit any leading zeros in
 *         the output.
 * 
 *         Example
 * 
 *         Sample input:
 * 
 *         3 24 1 4358 754 305 794
 * 
 *         Sample output:
 * 
 *         34 1998 1
 * 
 * 
 */
public class ADDREV {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(
				System.in));
		String c = bufferRead.readLine();
		int count = Integer.parseInt(c);
		int value = 0;
		while (count-- > 0) {
			StringBuffer string = new StringBuffer(bufferRead.readLine());
			String[] array = string.toString().split(" ");
			for (int j = 0; j < array.length; j++) {
				StringBuffer newstring = new StringBuffer(array[j]);
				value += reverse(Integer.parseInt(newstring.toString()));
			}
			Integer v = new Integer(value);
			StringBuffer sb = new StringBuffer(v.toString());
			value = reverse(Integer.parseInt(sb.toString()));
			System.out.println(value);
			value = 0;
		}
	}

	public static int reverse(int x) {
		String reversedX = "";
		while (x > 0) {
			reversedX += (x % 10);
			x /= 10;
		}
		return Integer.parseInt(reversedX);
	}

}
