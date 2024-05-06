import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a JAVA..!!!");

        int fechaDeLanzamiento = 1999;
        double evaluacionPorCriticos = 8.5;
        double evaluacionPorUsuario = 0;
        boolean incluidoEnPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
               La mejor pelicula de fin del milenio.
                Nominada para muchos premios.
               """;

        System.out.println("Pelicula: "+nombre);
        System.out.println("Sinopsis: "+sinopsis);
        System.out.println("Incluida en Plan Basico: "+incluidoEnPlanBasico);
        System.out.println("Evaluacion segun criticos cineastas: "+evaluacionPorCriticos);
        //for (int i = 1; i <= 3; i++) {
        //    Scanner teclado = new Scanner(System.in);
        //    System.out.println("Que puntaje darias a Matrix? Por favor ingresa la nota: ");
        //    double puntajeMatrix = teclado.nextDouble();
        //    evaluacionPorUsuario = evaluacionPorUsuario + puntajeMatrix;
        //}

        int indice = 0;
        while(indice < 3){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Que puntaje darias a Matrix? Por favor ingresa la nota: ");
            double puntajeMatrix = teclado.nextDouble();
            evaluacionPorUsuario = evaluacionPorUsuario + puntajeMatrix;
            indice = indice+1;
        }

        System.out.println("Evaluacion (media) de la película segun los puntajes de los usuarios: " + evaluacionPorUsuario / 3);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuando cree que fue su estreno? Por favor ingrese un año: ");
        int fechaUsuario = teclado.nextInt();

        if (fechaDeLanzamiento == fechaUsuario){
            System.out.println("Correctooo..!!! Fecha de lanzamiento: "+fechaDeLanzamiento);
        } else {
            System.out.println("Incorrecto, su fecha de lanzamiento fue en: "+fechaDeLanzamiento);
        }
    }
}