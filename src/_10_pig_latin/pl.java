package _10_pig_latin;

public class pl {

    public static String translateEnglishToPigLatin(String s) {
        String latin = "";
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && !isLetter(s.charAt(i))) {
                latin = latin + s.charAt(i);
                i++;
            }
            
            
            if (i >= s.length())
                break;
            int begin = i;
            while (i < s.length() && isLetter(s.charAt(i))) {
                i++;
            }
            
            
            int end = i;
            latin = latin + pigWord(s.substring(begin, end));
        }
        return latin;
    }


    public static String translatePigLatinToEnglish(String s) {
        String english = "";

        String[] words = s.split(" ");

        for( String word : words ) {
            String[] hyphenSplit = word.split("-");
            String translatedWord = word;
            String punctuation = "";

            if( hyphenSplit.length == 2 ) {
                if( hyphenSplit[1].startsWith("ay")) {

                    translatedWord = hyphenSplit[0];
                } else {

                    translatedWord = hyphenSplit[1].substring(0, firstVowel(hyphenSplit[1])) + hyphenSplit[0];
                }

                int lastLetterIndex = hyphenSplit[1].length() - 1;

                while( !Character.isLetter(hyphenSplit[1].charAt(lastLetterIndex)) ){
                    lastLetterIndex -= 1;
                }

                punctuation = hyphenSplit[1].substring(lastLetterIndex + 1);
            }

            if( english.isEmpty() ) {
                english += translatedWord + punctuation;
            } else {
                english = english + " " + translatedWord + punctuation;
            }
        }

        return english;
    }

    private static boolean isLetter(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }


    private static String pigWord(String word) {
        int split = firstVowel(word);
        return word.substring(split) + "-" + word.substring(0, split) + "ay";
    }


    private static int firstVowel(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u')
                return i;
        return 0;
    }

}