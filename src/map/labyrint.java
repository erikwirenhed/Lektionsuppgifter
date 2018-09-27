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
		
		mapSolver ms = new mapSolver(map);
		 AnimationTimer AT = new AnimationTimer(){
			 long before = 0;
			@Override
			public void handle(long now) {
				// TODO Auto-generated method stub
				if (now-before >= 1_00_000_000){
					ms.showNextPath();
					before=now;
				}
			}
			 
		 };
		AT.start();
	}

	public static void main(String[] args) {
		launch();
	}

}
