package exercises;

import util.Exercise;
import util.Input;

public class Palindromo implements Exercise{
  private String assertion = "Palavras Palindromas";

  public String getAssertion() {
      return assertion;
  }

  public void execute() {
    System.out.println(getAssertion()+"\n");
    
    System.out.println("Digite o um palavra");
    var text = Input.in.nextLine();
    char[] charArray = text.toCharArray(); 
    String isPalindromo = "";

    for(int character = charArray.length - 1; character >= 0; character--){
      isPalindromo += charArray[character];
    }
    if (isPalindromo.equals(text)) {
      System.out.printf("'%s' e palindrome", text);
    } else {
      System.out.printf("'%s' nao e palindrome", text);
    }
    
  }
}
