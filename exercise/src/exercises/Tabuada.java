package exercises;

import util.Exercise;
import util.Input;

public class Tabuada implements Exercise{
  private String assertion = "Tabuada";

  public String getAssertion() {
      return assertion;
  }

  public void execute() {
    System.out.println(getAssertion()+"\n");
    
    try{
      System.out.println("Digite o um numero");
      int num = Input.in.nextInt();
      Input.in.nextLine();
      
      System.out.println("Tabuada de " + num);
      for (int i = 1; i <= 10; i++) {
        System.out.printf("%d x %d = %d\n", num, i, num * i);
      }
      
    } catch (Exception e) {
      System.out.println("Digite apenas numeros inteiros");
    }

  }
}
