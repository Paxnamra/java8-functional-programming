package _2_3_too_many_arguments;

import org.junit.Assert;
import org.junit.Test;

public class Step1Test {

    private final Step1 s1 = new Step1();
    private final String sentence = "This lambda has too many arguments.";

    @Test
    public void should_combine_string_array_into_single_string_using_MultiFunctionString_interface() {
        String result = s1.sumsWords.singleWord(sentence);
        Assert.assertEquals("THIS LAMBDA HAS TOO MANY ARGUMENTS.", result);
    }

    @Test
    public void should_combine_string_array_into_single_uppercase_string_using_MultiFunctionString_interface() {
        String result = s1.sumsWordsToo.singleWord(sentence);
        Assert.assertEquals("THISLAMBDAHASTOOMANYARGUMENTS.", result);
    }

    @Test
    public void should_combine_string_array_into_single_uppercase_string_using_UglyFunctionString_interface() {
        String word1 = "This";
        String word2 = "lambda";
        String word3 = "has";
        String word4 = "too";
        String word5 = "many";
        String word6 = "arguments";
        String word7 = ".";

        String result = s1.stringConcat.manualConcat(word1, word2, word3, word4, word5, word6, word7);
        Assert.assertEquals("THISLAMBDAHASTOOMANYARGUMENTS.", result);
    }
}
