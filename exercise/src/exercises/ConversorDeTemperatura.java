package exercises;

import util.Exercise;
import util.Input;

public class ConversorDeTemperatura implements Exercise{
  private String assertion = "Conversor de Temperatura";

  public String getAssertion() {
      return assertion;
  }

  public void execute() {
    System.out.println(getAssertion()+"\n");
    
    System.out.print("Digite um Temperatura em Graus Celsius: ");
    var temperature = Input.in.nextDouble();
    Input.in.nextLine();

    var fahrenheit = temperature * 1.8 + 32;
    System.out.printf("%.2f Graus Fahrenheit", fahrenheit);

    System.out.print("\n\nDigite um Temperatura em Graus Fahrenheit: ");
    temperature = Input.in.nextDouble();
    Input.in.nextLine();

    var celsius = (temperature - 32) * 5/9;
    System.out.printf("%.2f Graus Celsius", celsius);
  }
}