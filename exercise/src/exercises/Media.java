package exercises;

import java.util.ArrayList;
import java.util.List;

import util.Exercise;
import util.Input;

public class Media implements Exercise {
  private String assertion = "Media de numeros";

  public String getAssertion() {
      return assertion;
  }

  public void execute() {
    System.out.println(getAssertion()+"\n");
    List<Integer> numbersArray = new ArrayList<>();
    String control = "s";
    do {
      
      System.out.println("Digite o um numero");
      numbersArray.add(Input.in.nextInt());
      Input.in.nextLine();

      System.out.printf("Deseja continuar? s - Sim n - Nao\n >> ");
      control = Input.in.nextLine();

    } while(control.equals("s"));
 
    int result = numbersArray
    .stream()
    .reduce(0, (total, number) -> total + number) 
    / numbersArray.size();

    System.out.println("A Media foi de: " + result);
  }
}