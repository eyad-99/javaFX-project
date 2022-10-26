package GUI;
import code.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI_javafx_pl2project extends Application{
	Stage window;
	BorderPane adminlayout;
	Scene scene1,scene2,stdscene,prfscene,addstdscene,searchscene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//scene 1
		window = primaryStage;
		window.setTitle("log in form window");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new Insets(10));
		
		
		
		Text welcometxt = new Text("welcome");
		welcometxt.setFont(Font.font("Tahoma", FontWeight.LIGHT,25));
		grid.add(welcometxt, 0, 0);
		
		
		Label lbluser = new Label("username");
		grid.add(lbluser, 0, 1);
		
		TextField txtuser = new TextField();
		txtuser.setPromptText("username");
		grid.add(txtuser, 1, 1);
		
		Label lblpassword = new Label("password");
		grid.add(lblpassword, 0, 2);
		
		
		PasswordField pass = new PasswordField();
		pass.setPromptText("password");
		grid.add(pass, 1, 2);
		
		Button loginbtn = new Button("LogIn");
		loginbtn.setOnAction(e -> {
			window.setScene(scene2);
		});
		grid.add(loginbtn, 1, 3);
		
		
		
		
		
		//scene2
		
		
		
		
		
		
		GridPane admingrid = new GridPane();
		admingrid.setAlignment(Pos.CENTER);
		admingrid.setVgap(40);
		admingrid.setHgap(10);
		admingrid.setPadding(new Insets(10));
		
		window.setOnCloseRequest(e->{
			e.consume(); //it makes me the boss of my window and close request
			boolean answer = ConfirmBox.display("Confirmation","close the program ?");
			if(answer) {
				window.close();
			}
			});
		Label admintxt = new Label("Welcome Admin");
		admintxt.setFont(Font.font("Tahoma", FontWeight.LIGHT,40));
		admingrid.add(admintxt, 0, 0);
		//file
		Menu filemenu = new Menu("_File");
		MenuItem report = new MenuItem("Report");
		MenuItem exit = new MenuItem("Exit");
		exit.setOnAction(e-> {
			boolean answer = ConfirmBox.display("confirmation","close the program ?");
			if(answer) {
				window.close();
			}
		});
		filemenu.getItems().addAll(report,exit);
		
		
		//users
		Menu usersmenu = new Menu("_Users");
		MenuItem students = new MenuItem("Students");
		students.setOnAction(e->{
			window.setScene(stdscene);
		});
		MenuItem professor = new MenuItem("Professors");
		professor.setOnAction(e->{
			window.setScene(prfscene);
		});
		usersmenu.getItems().addAll(students,new SeparatorMenuItem(),professor);
		//course
		Menu coursesmenu = new Menu("_Courses");
		coursesmenu.getItems().add(new MenuItem("New Course"));
		coursesmenu.getItems().add(new SeparatorMenuItem());
		coursesmenu.getItems().add(new MenuItem("Course Managment"));
		
		
		MenuBar adminmenubar = new MenuBar();
		adminmenubar.getMenus().addAll(filemenu,usersmenu,coursesmenu);
		//Back Button
		
				Button backbtn = new Button("SIGN OUT");
				backbtn.setOnAction(e->{
					window.setScene(scene1);
				});
		admingrid.add(backbtn,0,4);
		adminlayout = new BorderPane();
		adminlayout.setTop(adminmenubar);
		adminlayout.setCenter(admingrid);
		
		scene1=new Scene(grid,600,600);
		scene2 = new Scene(adminlayout,600 ,600 );
		
		
		
		
		
		
		
		
		

		//scene3
		
		
		
		
		
		
		
		
		
		
		
		GridPane studentgrid = new GridPane();
		studentgrid.setAlignment(Pos.CENTER);
		studentgrid.setVgap(40);
		studentgrid.setHgap(10);
		studentgrid.setPadding(new Insets(10));
		
		
		Button btn1 = new Button("Add Student");
		btn1.setOnAction(e->{
			window.setScene(addstdscene);
		});
		studentgrid.add(btn1, 0, 0);
		Button btn2 = new Button("View Student");
		btn2.setOnAction(e->{
			window.setScene(searchscene);
		});
		studentgrid.add(btn2, 0, 1);
		Button btn3 = new Button("Update Student");
		studentgrid.add(btn3, 0, 2);
		//Back Button
		Button backbtn1 = new Button("<BACK");
		backbtn1.setOnAction(e->{
			window.setScene(scene2);
		});
		studentgrid.add(backbtn1, 0, 4);
		
		
		stdscene = new Scene(studentgrid,600,600);
		
		
		
		
		
		
		
		
		//scene4
		
		
		GridPane Professorgrid = new GridPane();
		Professorgrid.setAlignment(Pos.CENTER);
		Professorgrid.setVgap(40);
		Professorgrid.setHgap(10);
		Professorgrid.setPadding(new Insets(10));
		
		
		
		Button profbtn1 = new Button("Add Professor");
		Professorgrid.add(profbtn1, 0, 0);
		Button profbtn2 = new Button("View Professor");
		Professorgrid.add(profbtn2, 0, 1);
		Button profbtn3 = new Button("Update Professor");
		Professorgrid.add(profbtn3, 0, 2);
		
		prfscene = new Scene(Professorgrid,600,600);
		
		
		
		
		
		
		
		
		
		
		
		//scene5
		
		
		
		
		
		
		
		
		/*GridPane addstdgrid = new GridPane();
		addstdgrid.setAlignment(Pos.CENTER);
		addstdgrid.setVgap(40);
		addstdgrid.setHgap(10);
		addstdgrid.setPadding(new Insets(10));
		//1
		Label lblid = new Label("ID");
		addstdgrid.add(lblid, 0, 0);
		
		TextField txtid = new TextField();
		txtid.setPromptText("Student ID");
		addstdgrid.add(txtid, 1, 0);
		//2
		Label lblfname = new Label("FName");
		addstdgrid.add(lblfname, 0, 1);
		
		TextField txtfname = new TextField();
		txtfname.setPromptText("First Name");
		addstdgrid.add(txtfname, 1, 1);
		//3
		Label lbllname = new Label("LName");
		addstdgrid.add(lbllname, 0, 2);
	
		TextField txtlname = new TextField();
		txtlname.setPromptText("Last name");
		addstdgrid.add(txtlname, 1, 2);
		//4
		Label lblage = new Label("Age");
		addstdgrid.add(lblage, 0, 3);
		
		TextField txtage = new TextField();
		txtage.setPromptText("Age");
		addstdgrid.add(txtage, 1, 3);
		//5
		Label lblusername = new Label("UserName");
		addstdgrid.add(lblusername, 0, 4);
		
		TextField txtusername = new TextField();
		txtusername.setPromptText("UserName");
		addstdgrid.add(txtusername, 1, 4);
		
		Button addbtn = new Button("Save");
		addstdgrid.add(addbtn, 0, 5);
		
		addstdscene = new Scene(addstdgrid,600,600);
		*/
		
		
		
		
		
		//scene6
		
		
		
		
		
		GridPane searchgrid = new GridPane();
		searchgrid.setAlignment(Pos.CENTER);
		searchgrid.setVgap(40);
		searchgrid.setHgap(10);
		searchgrid.setPadding(new Insets(10));
		
		TextField txtid = new TextField();
		txtid.setPromptText("Student ID");
		searchgrid.add(txtid, 0, 0);
	
		Button searchbtn = new Button("Search");
		searchgrid.add(searchbtn, 1, 0);
			
		

		//1
		Label lblusername = new Label("UserName");
		searchgrid.add(lblusername, 0, 1);
		
		TextField txtusername = new TextField();
		txtusername.setPromptText("UserName");
		searchgrid.add(txtusername, 1, 1);
		//2
		Label lblfname = new Label("FName");
		searchgrid.add(lblfname, 0, 2);
		
		TextField txtfname = new TextField();
		txtfname.setPromptText("First Name");
		searchgrid.add(txtfname, 1, 2);
		//3
		Label lbllname = new Label("LName");
		searchgrid.add(lbllname, 0, 3);
	
		TextField txtlname = new TextField();
		txtlname.setPromptText("Last name");
		searchgrid.add(txtlname, 1, 3);
		//4
		Label lblage = new Label("Age");
		searchgrid.add(lblage, 0, 4);
		
		TextField txtage = new TextField();
		txtage.setPromptText("Age");
		searchgrid.add(txtage, 1, 4);
		
		
		searchscene = new Scene(searchgrid,600,600);
		window.setScene(scene1);
		window.show();
	}
        public static void main(String[] args) {
        launch(args);
    }
}
