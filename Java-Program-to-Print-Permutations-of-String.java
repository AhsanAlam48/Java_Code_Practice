// Java program to print all the permutations of a String
public class Main {
  
    // Function to print all the permutations of a string
    static void printPermutation(String str, String result)
    {
        // if string is empty
        if (str.length() == 0) {
            System.out.print(result + " ");
            return;
        }
  
        for (int i = 0; i < str.length(); i++) {
  
            // ith character of string
            char ch = str.charAt(i);
  
            // Rest of the string after excluding the ith character
            String remaining = str.substring(0, i) + 
                         str.substring(i + 1);
  
            // Recurvise call
            printPermutation(remaining, result + ch);
        }
    }
  
    public static void main(String[] args)
    {
        String testString = "github";
        printPermutation(testString, "");
    }
}
