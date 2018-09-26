package map;

import java.io.File;

import blocks.Block;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class labyrint extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Map map = MapInterpreter.interpretMap(new File("src/map.txt"));

		
		Scene scene = new Scene(map, map.getWidth(), map.getHeight());
	
		primaryStage.setScene(scene);
		primaryStage.show();
		
		new mapSolver(map);
		
		
	}

	public static void main(String[] args) {
		launch();
	}

}
