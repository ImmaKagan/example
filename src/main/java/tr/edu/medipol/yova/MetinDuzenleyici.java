package tr.edu.medipol.yova;
import org.apache.commons.lang3.StringUtils;

public final class MetinDuzenleyici {

	public static String bosluklariTemizle(String orjinal) {
		return StringUtils.deleteWhitespace(orjinal);
	}
	
	 
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}
