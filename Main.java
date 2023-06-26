import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
        String word = scanner.next();
        
        int length = word.length();
        System.out.println("The length of the word is: " + length);
        
        scanner.close();
    
    //Your code will return the length of the entered String
  }
}
