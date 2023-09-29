package exercises;

import java.util.Scanner;

import util.Exercise;
import util.Input;

public class Calculadora implements Exercise{
  private String assertion = "Calculadora";

    public String getAssertion() {
        return assertion;
    }
  public void execute() {
    System.out.println(getAssertion()+"\n");


    try {
      System.out.println("Digite o primeiro numero");
      double num1 = Input.in.nextDouble();
      Input.in.nextLine();
      System.out.println("Digite o segundo numero");
      double num2 = Input.in.nextDouble();
      Input.in.nextLine();

      System.out.println("Escolha a operacao" +  
      "\n + : Soma" +
      "\n - : Subtracao" +
      "\n * : Multiplicacao" +
      "\n / : Divisão" +
      "\n % : Módulo");

      String operator = Input.in.nextLine();

      double result = operator.equals("+") ? (num1 + num2) :
      operator.equals("-") ? (num1 - num2) : 
      operator.equals("*") ? (num1 * num2) :
      operator.equals("/") ? (num1 / num2) :
      (num1 % num2);
      
      System.out.printf("O Resultado da operacao foi %.2f", result);
    } catch (Exception e) {
      System.out.println("Digite apenas numeros");
    }

  }
}
