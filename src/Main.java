import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //long start = System.currentTimeMillis();
        //long start = System.nanoTime();

        File file = new File("inputs//input_AoC_5a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while ((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        //long end1 = System.currentTimeMillis();
        //long end1 = System.nanoTime();
        int countOfNiceStrings = 0;


//        for(String g : listOfStrings) {
//            // Condition 1
//            int countVowels = 0;
//            for (int i = 0; i < g.length(); i++) {
//                if(g.charAt(i) == 'a' || g.charAt(i) == 'e' || g.charAt(i) == 'i' || g.charAt(i) == 'o' || g.charAt(i) == 'u')
//                    countVowels++;
//            }
//
//            //condition 2
//            boolean isAppearInRow = false;
//
//            for (int i = 0; i < g.length()-1; i++) {
//                if(g.charAt(i) == g.charAt(i+1)) {
//                    isAppearInRow = true;
//                    break;
//                }
//            }
//
//            //condition 3
//
//            boolean containsSubstring = false;
//            if(g.contains("ab") || g.contains("cd") || g.contains("pq") || g.contains("xy"))
//                containsSubstring = true;
//
//
//            if(countVowels > 2 && isAppearInRow == true && containsSubstring == false)
//                countOfNiceStrings++;
//
//        }

        for(String g : listOfStrings) {

            int countVowels = 0;
            boolean isAppearInRow = false;

            if (g.charAt(0) == 'a' || g.charAt(0) == 'e' || g.charAt(0) == 'i' || g.charAt(0) == 'o' || g.charAt(0) == 'u')
                countVowels++;

            for (int i = 1; i < g.length(); i++) {
                if (g.charAt(i) == 'a' || g.charAt(i) == 'e' || g.charAt(i) == 'i' || g.charAt(i) == 'o' || g.charAt(i) == 'u')
                    countVowels++;
                if (g.charAt(i) == g.charAt(i - 1))
                    isAppearInRow = true;
            }

            boolean containsSubstring = false;
            if (g.contains("ab") || g.contains("cd") || g.contains("pq") || g.contains("xy")) {
                containsSubstring = true;
            }

            if (countVowels > 2 && isAppearInRow == true && containsSubstring == false)
                countOfNiceStrings++;
        }

        System.out.println(countOfNiceStrings);

        //long end2 = System.currentTimeMillis();
        //long end2 = System.nanoTime();

//        System.out.println("Time for whole project: " + (end2 - start));
//        System.out.println("Time for reading txt file: " + (end1 - start));
//        System.out.println("Time for executing tests: " + (end2 - end1));
    }
}