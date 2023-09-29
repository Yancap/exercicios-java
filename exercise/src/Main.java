import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;

import util.Exercise;
import util.ExerciseCenter;
import util.Input;

public class Main {
    public static void main(String[] args) {
        ExerciseCenter exerciseCenter = new ExerciseCenter();
        String control = "s";
        int exerciseIndex = 0;
        while(control.equals("s")){
            
            System.out.println("Bem vindo a central de exercícios!");
            System.out.println("Digite o numero do exercício que você deseja\n");

            for (int i = 0; i < exerciseCenter.exercises.size(); i++) {
                System.out.printf("%d - %s\n", i+1, exerciseCenter.exercises.get(i).getAssertion());
            }
            
            System.out.printf("\n >> ");
            exerciseIndex = Input.in.nextInt();
            Input.in.nextLine();
            
            clean();
            exerciseCenter.exercises.get(exerciseIndex-1).execute();
            
            System.out.printf("\n\nDeseja continuar?\n s - Sim\n n - Nao\n >> ");
            control = Input.in.nextLine();
            clean();
        }
        Input.in.close();
        
    }

    private static void clean(){
        try {
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                String[] terminal = new String[] {"clean"};
                Runtime.getRuntime().exec(terminal);
            }
        }
        catch (final Exception e){
            System.out.println(e);
         }
    }
}