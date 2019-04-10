import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class CharacterSelection{

  private PersonajePrincipal heroe;
  private Button warriorButton = new Button();
  private Button tlatoaniButton = new Button();
  private Button priestButton = new Button();

  public CharacterSelection(PersonajePrincipal personaje){
    heroe = personaje;
  }

  public  Scene createCharacterSelection(){
    GridPane gp = new GridPane();

    Button[] botones = new Button[3];
    botones[0] = warriorButton;
    botones[1] = tlatoaniButton;
    botones[2] = priestButton;

    for (Button btnPersonaje: botones) {
      btnPersonaje.setMinHeight(500);
      btnPersonaje.setMinWidth(200);
    }

		warriorButton.setStyle("-fx-background-image:url('C:/Users/hp/Documents/Tec/Computing/Images/warrior.png');");
		warriorButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				definirHeroe("guerrero");
			}
		});

		tlatoaniButton.setStyle("-fx-background-image:url('C:/Users/hp/Documents/Tec/Computing/Images/Tlatoani.png');");
		tlatoaniButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
        definirHeroe("tlatoani");
      }
		});

		priestButton.setStyle("-fx-background-image:url(´C:/Users/hp/Documents/Tec/Computing/Images/Priest.png);");
		priestButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		public void handle(MouseEvent e){
			definirHeroe("sacerdote");
		}
		});

		gp.add(warriorButton,0,0);
		gp.add(tlatoaniButton,1,0);
		gp.add(priestButton,2,0);
    Scene scene = new Scene(gp);
    return scene;
	}

  public Button getWarriorButton(){
    return warriorButton;
  }

  public Button getTlatoaniButton(){
    return tlatoaniButton;
  }

  public Button getPriestButton(){
    return priestButton;
  }

  private void definirHeroe(String tipoHeroe){
    switch (tipoHeroe) {
      case "guerrero": heroe = new Guerrero("warrior",10,10,10,10); break;
      case "tlatoani": heroe = new Tlatoani("Tlatoani",10,10,10,10); break;
      case "sacerdote": heroe= new Sacerdote("Sacerdote",10,10,10,10); break;
    }
  }
}
