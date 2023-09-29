package exercises;

import util.Exercise;
import util.Input;

public class ImparPar implements Exercise{
    private String assertion = "Verificar se um numero é impar ou par";

    public String getAssertion() {
        return assertion;
    }

    public void execute(){
        System.out.println(getAssertion());
        
        try{
            System.out.println("Digite um numero");
            int num = Input.in.nextInt();
            Input.in.nextLine();

            System.out.printf("Numero %d 3 %s", num, num % 2 == 0 ? "PAR": "IMPAR");

        } catch (Exception e) {
            System.out.println("Digite apenas numeros inteiros");
        }
        
    }
    public ImparPar() { } 
}
