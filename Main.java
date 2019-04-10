import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
  /*
  Main:
  Debe haber un menu para crear un personaje mapaPrincipal
  Despues, debera aparecer en el mapa principal.
  Debera recorrerlo para llegar al primer Nivel y superarlo
  Seguira asi hasta completar la historia y llegar al jefe.
  */

  private static int[][] arregloMapa;
  private static Mapa mapaPrincipal;
  public static void main(String[] args) {
    PersonajePrincipal diego = new PersonajePrincipal("Dieguapo");
    Villano pedrito = new Villano("Pedriro", 10, 5, "sandwich");
    diego.adquirirExperiencia(20);
    //comenzarPelea(diego, pedrito);
    mapaPrincipal = new Mapa(12, 5, diego);
    mapaPrincipal.imprimirPlano();
    arregloMapa = mapaPrincipal.getPlano();
    launch(args);
  }

  public void start(Stage primaryStage){
    mapaPrincipal.start(primaryStage);
  }
}
