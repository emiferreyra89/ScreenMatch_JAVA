import models.Pelicula;
import models.Serie;

import java.util.Scanner;

public class Principal {
    private Pelicula nuevaPeliculaUsuario = new Pelicula();
    private Serie nuevaSerieUsuario = new Serie();
    public void muestraElMenu(){
        String opcion = "";
        Scanner teclado = new Scanner(System.in);
        String seriesRecomendadas = """
                    * * * * * * Series Recomendadas * * * * * * 
                    
                --- Titulo --- Temporadas --- Capitulos --- Tiempo en min..
                    Friends        10             5               30
                    Vikingos       5              8               40
                     Lost          12             10              50
                """;
        System.out.println(seriesRecomendadas);

        while(!opcion.equals("salir")){
            String menu = """
                
                Bienvenido(a) a Screenmatch..!!!
                Por favor, ingresa la palabra indicada segun la accion que quieras realizar:
                * Registrar nueva pelicula ---> ingresa Pelicula
                * Registrar nueva serie ---> ingresa Serie
                * Calcular tiempo de Serie ---> ingresa el nombre de una serie de la lista de Recomendadas
                * Salir ---> ingresa Salir
                """;
            System.out.println(menu);

            opcion = teclado.next().toLowerCase();

            switch (opcion){
                case "pelicula":
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    nuevaPeliculaUsuario.setNombre(nombre);
                    nuevaPeliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    nuevaPeliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    nuevaPeliculaUsuario.muestraFichaTecnica();
                    break;
                case "serie":
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.next();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el numero de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    nuevaSerieUsuario.setNombre(nombreSerie);
                    nuevaSerieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    nuevaSerieUsuario.setTemporadas(temporadas);
                    nuevaSerieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    nuevaSerieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    nuevaSerieUsuario.muestraFichaTecnica();
                    break;
                case "friends":
                    nuevaSerieUsuario.setNombre("Friends");
                    nuevaSerieUsuario.setFechaDeLanzamiento(1998);
                    nuevaSerieUsuario.setTemporadas(10);
                    nuevaSerieUsuario.setEpisodiosPorTemporada(5);
                    nuevaSerieUsuario.setDuracionEnMinutosPorEpisodio(30);
                    nuevaSerieUsuario.muestraFichaTecnica();
                    break;
                case "vikingos":
                    nuevaSerieUsuario.setNombre("Vikingos");
                    nuevaSerieUsuario.setFechaDeLanzamiento(2015);
                    nuevaSerieUsuario.setTemporadas(5);
                    nuevaSerieUsuario.setEpisodiosPorTemporada(8);
                    nuevaSerieUsuario.setDuracionEnMinutosPorEpisodio(40);
                    nuevaSerieUsuario.muestraFichaTecnica();
                    break;
                case "lost":
                    nuevaSerieUsuario.setNombre("Lost");
                    nuevaSerieUsuario.setFechaDeLanzamiento(2010);
                    nuevaSerieUsuario.setTemporadas(12);
                    nuevaSerieUsuario.setEpisodiosPorTemporada(10);
                    nuevaSerieUsuario.setDuracionEnMinutosPorEpisodio(50);
                    nuevaSerieUsuario.muestraFichaTecnica();
                    break;
                case "salir":
                    System.out.println("Saliendo del programa, gracias por elegirnos...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente...");
            }
        }
    }
    }
