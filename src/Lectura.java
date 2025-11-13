import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        //operaciones para interactuar con el usuario
        //ESTA BARRA DE CODIGO SE UTILIZA PARA PODER QUE ELLOS PUEDAN ESCRIBIR SUS RESPUESTAS Y ES OBLIGATORIO
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula que deseas ver");
        String pelicula = teclado.nextLine();//PARA RESPONDER CON TEXTO
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechalanzada = teclado.nextInt();//PARA RESPONDER CON NUMEROS ENTEROS
        System.out.println("Por ultimo dinos que nota le das a esta pelicula");
        double nota = teclado.nextDouble();//PARA RESPONDER CON NUMERO DECIMAL

        System.out.println(pelicula);
        System.out.println(fechalanzada);
        System.out.println(nota);
    }
}
