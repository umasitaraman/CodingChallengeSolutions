import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String args[]) {
        String inputString = "Alive*is*Awesome$";
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        //https://regexr.com/ a good website to execute the regex commands and patterns
        //It gives a detailed explanation of what each symbol means
        Matcher matcher = pattern.matcher(inputString);

        System.out.println("pattern : " + pattern);
        System.out.println("matcher : " + matcher.toString());

        boolean isStringContainsSpecialCharacter = matcher.find();
        if(isStringContainsSpecialCharacter)
            System.out.println(inputString+ " contains special character");
        else
            System.out.println(inputString+ " does NOT contain special character");
    }
}