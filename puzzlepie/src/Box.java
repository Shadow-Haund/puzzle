package puzzlepie;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.awt.*;

public class Box {
        static String textFor = new String("Это первый урок по переменным в языке Java. Приветствую);\n" +
                "Переменные представляют собой ячейки памяти в которые ты можешь закинуть разные значения в \n" +
                "зависимости от типа переменных. Основыных всего их 5: int - целое число, double -число с плавающей \n" +
                "точкой или дробь, void - это специальный тип данных, пустота, boolean - логический тип, значения true \n" +
                "или false, да или нет, char- символьный тип и String - строка\n");
    public static void display(String title, String message) {
        Stage window = new Stage();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        //Block events to other windows
        window.initModality(Modality.WINDOW_MODAL);
        window.setTitle(title);
        window.setMinWidth(width/2);
        window.setMaxHeight(height);
        window.setX(width/2);
        window.setY(0);


        TextArea textArea = new TextArea();
        textArea.setText(textFor);
        textArea.setPrefHeight(window.getMaxHeight() - 70);
        textArea.setPrefWidth(window.getMaxWidth());
        VBox layout = new VBox(10);
        ScrollPane scrollPane = new ScrollPane(layout);
        scrollPane.setFitToHeight(true);
        layout.getChildren().addAll(textArea);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}