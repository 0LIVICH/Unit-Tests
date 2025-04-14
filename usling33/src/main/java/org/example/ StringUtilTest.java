import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testConcat_validArgument_success() {

        String str1 = "Hello";
        String str2 = "World";

        String result = StringUtil.concatStrings(str1, str2);

        Assertions.assertEquals("HelloWorld", result);
    }

    @Test
    public void testConcat_nullArgument_throwException() {
        // given:
        String str1 = null;
        String str2 = "World";

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtil.concatStrings(str1, str2));
    }

    @Test
    public void testConcat_emptyStrings_success() {

        String str1 = "";
        String str2 = "World";

        String result = StringUtil.concatStrings(str1, str2);

        Assertions.assertEquals("World", result);
    }
}
