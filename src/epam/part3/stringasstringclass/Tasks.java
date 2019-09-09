package epam.part3.stringasstringclass;

public class Tasks {
    public static void main(String[] args) {
        String string = "aaaa";
        System.out.println(countLetter(string,'a'));
        System.out.println(string);
    }

    public static String myReplace(String string, char old, char fresh) {
        return string.replace(String.valueOf(old), old + String.valueOf(fresh));
    }

    public static int maxSpaceInARow(String string) {

        String spaces = " ";
        int result = 0;
        while (string.contains(spaces)) {
            spaces += " ";
            result++;
        }
        return result;
    }

    public static boolean isPalindrom(String string) {
        StringBuilder halfString = new StringBuilder(string.substring(0, string.length() / 2));
        halfString.reverse();
        return string.endsWith(halfString.toString());

    }
    public static int countLetter(String string,char letter){
        return string.length() - string.replaceAll(String.valueOf(letter),"").length();
    }
}
