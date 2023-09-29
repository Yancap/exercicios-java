package exercises;

import util.Exercise;
import util.Input;

public class Soma implements Exercise{
    private String assertion = "Soma de dois numeros";

    public String getAssertion() {
        return assertion;
    }

    public void execute(){
        System.out.println(getAssertion());
        

        try{
            System.out.println("Digite o primeiro numero");
            int num1 = Input.in.nextInt();
            Input.in.nextLine();

            System.out.println("Digite o segundo numero");
            int num2 = Input.in.nextInt();
            Input.in.nextLine();

            System.out.println("Resultado da Soma: " + (num1 + num2));

        } catch (Exception e) {
            System.out.println("Digite apenas numeros inteiros");
        }
        
    }
    public Soma() { } 
}
