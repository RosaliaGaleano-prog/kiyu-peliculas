//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido(a) a Sweet Math!");
        System.out.println("Pelicula : Avatar");

        int fechaDeLanzamiento = 2009;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0)/3;
        System.out.println(media);

        String sipnosi = """
                el exmarine parapléjico Jake Sully es enviado a Pandora para unirse al programa de avatares;
                donde su conciencia se proyecta en un cuerpo híbrido Na'vi para infiltrarse en la población
                nativa.
                """+ fechaDeLanzamiento;
        System.out.println(sipnosi);

        int clasificacion = (int) (media /2);
        System.out.println(clasificacion);
    }
}