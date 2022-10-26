package GUI;
import code.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class View_professor extends Application{
	Stage window;
	
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		          Admin manager = new Admin();
		ProfessorsDashboard BK = new ProfessorsDashboard();
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new Insets(10));
		
                                     String allinstructor = manager.displayInstructors();
                                     Label view = new Label();
                                     view.setText(allinstructor);
                                      view.setFont(Font.font("Tahoma", FontWeight.LIGHT,20));
                
                
                
                
                                        Button backbtn = new Button("<BACK");
		backbtn.setOnAction(e->{
			try {
				BK.start(primaryStage);
			} catch (Exception e1) {
                            // TODO Auto-generated catch block

			}
		});
                ScrollPane b = new ScrollPane();
                      b.setContent(view);
                      b.setPrefSize(600, 600);
                      b.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
                      b.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
                      view.setAlignment(Pos.CENTER);
        grid.add(view, 0, 0);
        grid.add(backbtn, 0, 2);
         grid.getChildren().add(b);
        
        Scene scene = new Scene(grid, 600, 600);
        
        window.setTitle("List Instructors Table");
        window.setScene(scene);
        window.show();
		
	}
 public static void main(String[] args) {
        launch(args);
    }

}
