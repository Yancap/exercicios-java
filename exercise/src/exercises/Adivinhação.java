package exercises;

import java.util.Random;

import util.Exercise;
import util.Input;

public class Adivinhação implements Exercise{
  private String assertion = "Adivinhador de Numeros";

  public String getAssertion() {
      return assertion;
  }

  public void execute() {
    int systemNumber = new Random().nextInt(100);
    int userNumber = 0;
    System.out.println("Tente acertar o numero " + systemNumber);
    do {  
      System.out.print("Chute um numero: ");
      userNumber = Input.in.nextInt();
      Input.in.nextLine();

      if (userNumber > systemNumber) {
        System.out.println("EROUU\nSeu chute foi maior que o número");
      } else if (userNumber < systemNumber) {
        System.out.println("EROUU\nSeu chute foi menor que o número");
      } else {
        System.out.println("Acertou Mizeravi");
      }
    } while(systemNumber != userNumber);

  }
}