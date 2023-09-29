package exercises;

import util.Exercise;
import util.Input;

public class Fatorial implements Exercise{
  private String assertion = "Fatorial";

  public String getAssertion() {
      return assertion;
  }

  public void execute() {
    System.out.println(getAssertion()+"\n");
    try{
      System.out.println("Digite o um numero");
      int num = Input.in.nextInt();
      Input.in.nextLine();
      
      int result = 1;
      for (int i = num; i >= 1; i--) {
        result *= i;
      }

      System.out.printf("Fatorial de %d e: %d", num, result);
    } catch (Exception e) {
      System.out.println("Digite apenas numeros inteiros");
    }
  }
}
