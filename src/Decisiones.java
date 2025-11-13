public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2022;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 9.5;
        String plan = "plus";
//  Codigo que prueba los operadores relacionales
        if (fechaDeLanzamiento >= 2022) {
           System.out.println("Peliculas mas recientes");
        } else {
            System.out.println("Peliculas retro good");
        }
//  Codigo que prueba los operadores logicos
        if (incluidoEnElPlan && plan.equals("plus")){
            System.out.println("¡Disfruta de tu pelicula!");
        } else {
            System.out.println("Lo sentimos esta pelicula no esta inluida en su plan actual");
        }

    }
}