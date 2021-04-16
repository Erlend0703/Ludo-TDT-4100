package org.ludo.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.ludo.App;
import org.ludo.gameLogic.FXMLElements;
import org.ludo.gameLogic.Game;
import org.ludo.gameLogic.Game;

import java.io.IOException;

public class GameSceneController {
	@FXML
	private Pane gameContainer;

	@FXML
	private Button dieBtn;

	@FXML
	private Text dieTextOutput;

	@FXML
	private Label player1Label;

	@FXML
	private Label player2Label;

	@FXML
	private Label player3Label;

	@FXML
	private Label player4Label;


	private Game game;

	@FXML
	private void initialize() {
		FXMLElements.setGameContainer(gameContainer);
		FXMLElements.setPlayerLabels(new Label[]{player1Label, player2Label, player3Label, player4Label});
		FXMLElements.setDieTextOutput(dieTextOutput);
		FXMLElements.setDieBtn(dieBtn);
	}

	public void setGameState(Game game) {
		this.game = game;
	}

	@FXML
	private void openMenu() throws IOException {
		FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/menu.fxml"));

		var modal = new Stage();

		modal.setScene(new Scene(loader.load()));

		MenuSceneController controller = loader.getController();
		controller.setGameEngine(game);

		modal.setWidth(335);
		modal.setHeight(300);

		modal.setTitle("Meny");
		modal.initModality(Modality.WINDOW_MODAL);
		modal.show();

	}
}
