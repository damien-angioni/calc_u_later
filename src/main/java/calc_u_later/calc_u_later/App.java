package calc_u_later.calc_u_later;

//Import libraries classes
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.stage.Stage;
//import program classes
import calc_u_later.calc_u_later.ZeroButton;

public class App extends Application{

    @Override
    public void start(Stage primaryStage)  {
        Font button_font = new Font(25);
        GridPane root = new GridPane();
        root.setPadding(new Insets(12, 12, 12, 12));
        Label label = new Label("♡ Bienvenue sur ma calculatrice ♡");
        label.setFont(button_font);
        label.setMinWidth(489);
        label.setMaxWidth(489);
        label.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        root.add(label, 0, 0,4,1);
        button_builder(root,button_font,"7",0,1,50,85,16,8,8,0,1,1);
        button_builder(root,button_font,"8",1,1,50,85,16,8,8,8,1,1);
        button_builder(root,button_font,"9",2,1,50,85,16,8,8,8,1,1);
        button_builder(root,button_font,"+",3,1,50,85,16,8,8,8,1,1);
        button_builder(root,button_font,"÷",4,1,50,85,16,0,8,8,1,1);
        button_builder(root,button_font,"4",0,2,50,85,8,8,8,0,1,1);
        button_builder(root,button_font,"5",1,2,50,85,8,8,8,8,1,1);
        button_builder(root,button_font,"6",2,2,50,85,8,8,8,8,1,1);
        button_builder(root,button_font,"-",3,2,50,85,8,8,8,8,1,1);
        button_builder(root,button_font,"%",4,2,50,85,8,0,8,8,1,1);
        button_builder(root,button_font,"1",0,3,50,85,8,8,8,0,1,1);
        button_builder(root,button_font,"2",1,3,50,85,8,8,8,8,1,1);
        button_builder(root,button_font,"3",2,3,50,85,8,8,8,8,1,1);
        button_builder(root,button_font,"×",3,3,50,85,8,8,8,8,1,1);
        button_builder(root,button_font,"CE",4,3,116,85,8,0,0,8,1,2);
        button_builder(root,button_font,"0",0,4,50,85,8,8,0,0,1,1);
        button_builder(root,button_font,",",1,4,50,85,8,8,0,8,1,1);
        button_builder(root,button_font,"=",2,4,50,186,8,8,0,8,2,1);
        Scene scene = new Scene(root, 525, 339);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/1011/1011863.png"));
        primaryStage.setTitle("Calculatrice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void button_builder(Label label,GridPane root,Font button_font,String button_name,int col,int rows,double height,double width,double instop,double insright,double insbottom,double insleft,int colspan, int rowspan){
        Button button = new Button(button_name);
        root.add(button, col, rows,colspan,rowspan);
        button.setFont(button_font);
        button.setPrefHeight(height);
        button.setPrefWidth(width);
        root.setMargin(button, new Insets(instop, insright, insbottom,insleft));
        button.setOnAction(e -> {

        });

    }
    public static void main(String[] args) {
        launch();
    }
}
