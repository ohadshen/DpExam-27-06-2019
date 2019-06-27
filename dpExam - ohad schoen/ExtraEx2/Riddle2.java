package ExtraEx2;

import java.util.ArrayList;
import java.util.List;

public class Riddle2 {

    public static void printWordsOccurence(List<String> words, List<String> wordsToFind) {
        List<Integer> occurrencesCounter = new ArrayList<>();
        for (String word : words) {
            occurrencesCounter.add(0);
        }

        for (String word : words) {
            doesLettersExists(word, wordsToFind, occurrencesCounter);
        }

        for (int wordIndex = 0; wordIndex < wordsToFind.size(); wordIndex++) {
            System.out.println("The word: " + wordsToFind.get(wordIndex) + " occurred:" + occurrencesCounter.get(wordIndex) + " times");
        }
    }

    public static void doesLettersExists(String currentScrammbledWord, List<String> wordsToFind, List<Integer> occurrencesCounter) {
        int wordIndex = 0;


        for (String currentWordToFind : wordsToFind) {
            String scrammbledWordCopy = currentScrammbledWord;
            int foundedLettersCount = 0;

            for (int letterIndex = 0;
                     letterIndex < currentWordToFind.length();
                     letterIndex++) {
                if(scrammbledWordCopy.contains(Character.toString(currentWordToFind.charAt(letterIndex)))) {
                    scrammbledWordCopy = removeOneChar(scrammbledWordCopy, currentWordToFind.charAt(letterIndex));
                    foundedLettersCount++;
                }
            }

            if(foundedLettersCount == currentWordToFind.length() ) {
                occurrencesCounter.set(wordIndex ,occurrencesCounter.get(wordIndex) + 1);
            }

            wordIndex++;
        }
    }

    public static String removeOneChar(String str, char charToRemove) {
        String result = str;

        for (int index = 0; index < str.length(); index++) {
            if(str.charAt(index) == charToRemove) {
                result = str.substring(0, index) + str.substring(index+1);
                break;
            }
        }

        return result;
    }
}
