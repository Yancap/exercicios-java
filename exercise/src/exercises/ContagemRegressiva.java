package exercises;

import util.Exercise;
import util.Input;

public class ContagemRegressiva implements Exercise {
  private String assertion = "Contagem regressiva";

  public String getAssertion() {
      return assertion;
  }

  public void execute() {
    System.out.println(getAssertion()+"\n");
    try{
      System.out.println("Digite o um numero");
      int num = Input.in.nextInt();
      Input.in.nextLine();
      
      
      for (int i = num; i >= 1; i--) {
        System.out.println("Contagem: " + i);
      }

      
    } catch (Exception e) {
      System.out.println("Digite apenas numeros inteiros");
    }
  }
}