package epam.part3.stringaschararr;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteSpaces(new char[]{' ', ' ', 'a', ' ','h',' ', ' ', '6', ' ', ' '})));

        //System.out.println(countSpacesToCut(new char[]{' ',' ','a',' ',' ','6',' ',' '}));
    }

    public static int countUppercaseLetters(@NotNull char[] string) {
        int count = 0;
        for (char c : string) {
            if (isUpperLetter(c)) count++;
        }
        return count;
    }

    public static boolean isUpperLetter(char c) {
        return c >= 65 & c <= 90;
    }

    public static char[] toSnakeCase(@NotNull char[] string) {
        char[] result = new char[string.length + countUppercaseLetters(string)];
        int j = 0;
        for (int i = 0; i < string.length; i++, j++) {
            if (isUpperLetter(string[i])) {
                result[j++] = '_';
                result[j] = toLowerLetter(string[i]);
            } else result[j] = string[i];
        }
        return result;
    }

    public static char toLowerLetter(char c) {
        return (char) (c + 32);
    }

    public static boolean isDigit(char c) {
        return c >= 48 & c <= 57;
    }

    public static int countDigits(char[] string) {
        int result = 0;
        for (char c : string) {
            if (isDigit(c)) result++;
        }
        return result;
    }

    public static int findWord(char[] word, @NotNull char[] string, int pos) {
        int result;
        for (int i = pos; i < string.length; i++) {
            result = i;
            for (int j = 0; j < word.length & (string.length > j + i); j++) {
                if (j == word.length - 1 & string[j + i] == word[j]) return result;
                if (string[j + i] != word[j]) {
                    break;
                }
            }
        }
        return -1;
    }

    public static char[] replaceWordsInString(char[] word, @NotNull char[] letter, char[] string) {
        int numbersOfWords = countWords(word, string);
        char[] t = new char[string.length + Math.abs(word.length - letter.length) * numbersOfWords];
        int pos = findWord(word, string, 0);
        int j = 0;
        for (int k = 0; k < string.length; k++) {
            if (k < pos) {
                t[j++] = string[k];
                continue;
            }
            if (pos != -1) {
                for (int i = pos; i < pos + letter.length; i++, j++) {
                    t[j] = letter[i - pos];
                }
                pos += word.length;
                pos = findWord(word, string, pos);
                k += (word.length - 1);
            } else t[j++] = string[k];
        }
        return t;
    }

    public static int countWords(char[] word, char[] string) {
        int result = 0;
        int pos = findWord(word, string, 0);
        while (pos != -1) {
            result++;
            pos += word.length;
            pos = findWord(word, string, pos);
        }
        return result;
    }

    public static int countNumbers(char[] string) {
        int result = 0;
        for (int i = 0; i < string.length; i++) {
            if (isDigit(string[i])) {
                for (int j = i + 1; j < string.length; j++) {
                    i++;
                    if (!isDigit(string[j])) break;
                }
                result++;
            }
        }
        return result;
    }

    public static char[] deleteSpaces(char[] string) {
        ArrayList<Character> characters = new ArrayList<>();

        int i = 0;
        while (isSpace(string[i])) i++;

        while (i < string.length) {
            if (isSpace(string[i])) {
                characters.add(string[i++]);
                while (isSpace(string[i])) {
                    i++;
                    if (i == string.length) {
                        i--;
                        break;
                    }
                }
            }

            characters.add(string[i++]);
        }
        i = characters.size() - 1;
        while (isSpace(characters.get(i))) {
            characters.remove(i--);
        }

        char[] result = new char[characters.size()];
        for (i = 0; i < result.length; i++) {
            result[i] = characters.get(i);
        }
        return result;
    }

    public static int countSpaces(char[] string) {
        int result = 0;
        for (char c : string) {
            if (c == ' ') result++;
        }
        return result;
    }

    public static int countSpacesToCut(char[] string) {
        int result = 0;

        return result;
    }

    public static boolean isSpace(char c) {
        return c == ' ';
    }
}
