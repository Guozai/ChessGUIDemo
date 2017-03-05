/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessdemo;

import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author Gogogo
 */
public class ChessDemo extends Application {
    
    private SequentialTransition sequentialTransition;
    
    @Override public void start(Stage primaryStage) {
        Group root = new Group();
        final Scene scene = new Scene(root, 640, 640, Color.WHITE);
        
        // Drawing the chess board
        // x position is 76 + 20; y position is 20 
        // whereas 20 is the width of border
        Rectangle rB8 = new Rectangle(96, 20, 75, 75);
        rB8.setFill(Color.BLACK);
        root.getChildren().add(rB8);
        Rectangle rD8 = new Rectangle(246, 20, 75, 75);
        rD8.setFill(Color.BLACK);
        root.getChildren().add(rD8);
        Rectangle rF8 = new Rectangle(396, 20, 75, 75);
        rF8.setFill(Color.BLACK);
        root.getChildren().add(rF8);
        Rectangle rH8 = new Rectangle(546, 20, 75, 75);
        rH8.setFill(Color.BLACK);
        root.getChildren().add(rH8);
        Rectangle rA7 = new Rectangle(20, 96, 75, 75);
        rA7.setFill(Color.BLACK);
        root.getChildren().add(rA7);
        Rectangle rC7 = new Rectangle(171, 96, 75, 75);
        rC7.setFill(Color.BLACK);
        root.getChildren().add(rC7);
        Rectangle rE7 = new Rectangle(321, 96, 75, 75);
        rE7.setFill(Color.BLACK);
        root.getChildren().add(rE7);
        Rectangle rG7 = new Rectangle(471, 96, 75, 75);
        rG7.setFill(Color.BLACK);
        root.getChildren().add(rG7);
        Rectangle rB6 = new Rectangle(96, 171, 75, 75);
        rB6.setFill(Color.BLACK);
        root.getChildren().add(rB6);
        Rectangle rD6 = new Rectangle(246, 171, 75, 75);
        rD6.setFill(Color.BLACK);
        root.getChildren().add(rD6);
        Rectangle rF6 = new Rectangle(396, 171, 75, 75);
        rF6.setFill(Color.BLACK);
        root.getChildren().add(rF6);
        Rectangle rH6 = new Rectangle(546, 171, 75, 75);
        rH6.setFill(Color.BLACK);
        root.getChildren().add(rH6);
        Rectangle rA5 = new Rectangle(20, 246, 75, 75);
        rA5.setFill(Color.BLACK);
        root.getChildren().add(rA5);
        Rectangle rC5 = new Rectangle(171, 246, 75, 75);
        rC5.setFill(Color.BLACK);
        root.getChildren().add(rC5);
        Rectangle rE5 = new Rectangle(321, 246, 75, 75);
        rE5.setFill(Color.BLACK);
        root.getChildren().add(rE5);
        Rectangle rG5 = new Rectangle(471, 246, 75, 75);
        rG5.setFill(Color.BLACK);
        root.getChildren().add(rG5);
        Rectangle rB4 = new Rectangle(96, 321, 75, 75);
        rB4.setFill(Color.BLACK);
        root.getChildren().add(rB4);
        Rectangle rD4 = new Rectangle(246, 321, 75, 75);
        rD4.setFill(Color.BLACK);
        root.getChildren().add(rD4);
        Rectangle rF4 = new Rectangle(396, 321, 75, 75);
        rF4.setFill(Color.BLACK);
        root.getChildren().add(rF4);
        Rectangle rH4 = new Rectangle(546, 321, 75, 75);
        rH4.setFill(Color.BLACK);
        root.getChildren().add(rH4);
        Rectangle rA3 = new Rectangle(20, 396, 75, 75);
        rA3.setFill(Color.BLACK);
        root.getChildren().add(rA3);
        Rectangle rC3 = new Rectangle(171, 396, 75, 75);
        rC3.setFill(Color.BLACK);
        root.getChildren().add(rC3);
        Rectangle rE3 = new Rectangle(321, 396, 75, 75);
        rE3.setFill(Color.BLACK);
        root.getChildren().add(rE3);
        Rectangle rG3 = new Rectangle(471, 396, 75, 75);
        rG3.setFill(Color.BLACK);
        root.getChildren().add(rG3);
        Rectangle rB2 = new Rectangle(96, 471, 75, 75);
        rB2.setFill(Color.BLACK);
        root.getChildren().add(rB2);
        Rectangle rD2 = new Rectangle(246, 471, 75, 75);
        rD2.setFill(Color.BLACK);
        root.getChildren().add(rD2);
        Rectangle rF2 = new Rectangle(396, 471, 75, 75);
        rF2.setFill(Color.BLACK);
        root.getChildren().add(rF2);
        Rectangle rH2 = new Rectangle(546, 471, 75, 75);
        rH2.setFill(Color.BLACK);
        root.getChildren().add(rH2);
        Rectangle rA1 = new Rectangle(20, 546, 75, 75);
        rA1.setFill(Color.BLACK);
        root.getChildren().add(rA1);
        Rectangle rC1 = new Rectangle(171, 546, 75, 75);
        rC1.setFill(Color.BLACK);
        root.getChildren().add(rC1);
        Rectangle rE1 = new Rectangle(321, 546, 75, 75);
        rE1.setFill(Color.BLACK);
        root.getChildren().add(rE1);
        Rectangle rG1 = new Rectangle(471, 546, 75, 75);
        rG1.setFill(Color.BLACK);
        root.getChildren().add(rG1);
        
        // Create the chess pieces as circles
        // kingW stands for kingWhite
        Circle pieceKingWhite = new Circle(283.5, 583.5, 30, Color.YELLOW);
        pieceKingWhite.setStroke(Color.BLACK);
        pieceKingWhite.setStrokeWidth(2.0);
        //pieceKingWhite.setTranslateX(50);
        //pieceKingWhite.setTranslateY(50);
	root.getChildren().add(pieceKingWhite);
        
        primaryStage.setTitle("Chess-like Game GUI Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Move the piece
        TranslateTransition translateTransition =
            new TranslateTransition(Duration.millis(2000), pieceKingWhite);
        translateTransition.setFromX(50);
        translateTransition.setToX(375);
        translateTransition.setCycleCount(1);
        translateTransition.setAutoReverse(true);
        
        // create a sequential transition to do four transitions one after another
        sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().add(translateTransition);
        sequentialTransition.setCycleCount(Timeline.INDEFINITE);
        sequentialTransition.setAutoReverse(true);
        sequentialTransition.play(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
