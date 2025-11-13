import java.util.Scanner;
//bucle while (bucle con una opcion de salida )
public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double medidaDeEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la pelicula Avatar 1");
            nota = teclado.nextDouble();

            if (nota != -1){
                medidaDeEvaluaciones += nota;//medidadeevaluaciones es igual a medidadeevaluaciones mas nota
                totalEvaluaciones++; //va a sumar el valor que este recibe mas uno
            }
        }
        System.out.println("La media de evaluaciones para Avatar 1 es : " + medidaDeEvaluaciones /totalEvaluaciones);
        }
    }

