package util;
import java.util.ArrayList;
import java.util.List;

import exercises.Adivinhação;
import exercises.Calculadora;
import exercises.ContagemRegressiva;
import exercises.ConversorDeTemperatura;
import exercises.Fatorial;
import exercises.ImparPar;
import exercises.Media;
import exercises.Palindromo;
import exercises.Soma;
import exercises.Tabuada;

public class ExerciseCenter {
    public List<Exercise> exercises = new ArrayList<>();

    public ExerciseCenter(){
        this.exercises.add(new Soma());
        this.exercises.add(new ImparPar());
        this.exercises.add(new Calculadora());
        this.exercises.add(new Fatorial());
        this.exercises.add(new ContagemRegressiva());
        this.exercises.add(new Media());
        this.exercises.add(new Tabuada());
        this.exercises.add(new Palindromo());
        this.exercises.add(new ConversorDeTemperatura());
        this.exercises.add(new Adivinhação());
    }
}
