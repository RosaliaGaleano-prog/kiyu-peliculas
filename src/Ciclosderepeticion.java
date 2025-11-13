import java.util.Scanner;

public class Ciclosderepeticion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double medidaDeEvaluaciones = 0;

        //crea esa interacción del bucle.
        for (int i = 0; i < 3 ; i++) {//i significa indice
            System.out.println("Escribe la nota que le darias a la pelicula Avatar 1");
            nota = teclado.nextDouble();
            medidaDeEvaluaciones = medidaDeEvaluaciones + nota;
        }
        System.out.println("La media de evaluaciones para Avatar 1 es : " + medidaDeEvaluaciones /3);
    }
}
