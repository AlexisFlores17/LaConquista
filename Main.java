import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
  /*
  Main:
  Debe haber un menu para crear un personaje mapaPrincipal
  Despues, debera aparecer en el mapa principal.
  Debera recorrerlo para llegar al primer Nivel y superarlo
  Seguira asi hasta completar la historia y llegar al jefe.
  */

  private static Mapa mapaPrincipal;
  private static PersonajePrincipal heroe;

  public static void main(String[] args) {

    //mapaPrincipal = new Mapa(12, 5, diego);
    //mapaPrincipal.imprimirPlano();
    launch(args);
  }

  public void start(Stage primaryStage){
    CharacterSelection menu = new CharacterSelection(heroe);
    primaryStage.setScene(menu.createCharacterSelection());
    primaryStage.show();
  }
}
