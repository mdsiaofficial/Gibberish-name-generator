
import java.util.Random;

/**
 * Gibberish name generator. Generates some random gibberish name of wished size.
 * Takes integer parameter.
 */
 
public class Program
{

    private static final String vowels = "aeiouy";
    private static final String consonants = "qwrtzpsdfghjklxcvbnmy";
    private static final String allUppercase = (vowels + consonants).toUpperCase();

    private static String generateGibberishName(int nameLength){
        Random rand = new Random();
        StringBuilder name = new StringBuilder();

        name.append((allUppercase.charAt(rand.nextInt(allUppercase.length()))));
        for(int i = 0; i < nameLength-1; i++) {
            if (i % 3 == 0) {
                name.append(vowels.charAt(rand.nextInt(vowels.length())));
            } else {
                name.append(consonants.charAt(rand.nextInt(consonants.length())));
            }
        }
        return name.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(generateGibberishName(5));
    }
}
