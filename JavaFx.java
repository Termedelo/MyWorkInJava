import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javax.swing.JOptionPane;
// you need to memorize the import lines.
public class JavaFX extends Application {
// we extends the Application to get its methods.    
    // this is the main window in the program.
    public static void main(String[] args) {
    Application.launch(args);
    // to launch the start method.
    // we need to know that we override the start method from Application class.
    }
    @Override
    public void start(Stage prime){
      Button b1 = new Button("Button title");
      // declear a button. 
      Scene s1 = new Scene(b1,200,100);
      // declear the scene.
      // it has three parameters (Button obj,width,hight)
      // it can has one parameter (Button obj):
      // it will has the size of the Button title.
      prime.setTitle("the stage title");
      // to give the Stage its title.
      prime.setScene(s1);
      // to set our scene inside the Stage.
      prime.show();
      // to show the stage.
      boolean bool = true;
      prime.setResizable(bool);
      // true if we want the window to has resize ability.
      // false if we want the window to hasn't resize ability.
      System.out.println(s1.getWidth());
      System.out.println(s1.getHeight());
      // getHeight() and getWidth()
      // we can use it with Scene or Stage 
      // it don't receives any thing
      // it will return double
      prime.setX(100);
      prime.setY(10);
      /*----------------------------------------------------------*/
      VBox box1 = new VBox(20);
      VBox box2 = new VBox(100);
      // to add multiple buttons in a Vertical format.
      // the number 100 is a gap between the buttons in box2.
      Button ba = new Button();
      Button bb = new Button("Button B");
      Button bc = new Button("Button C");
      //box1.getChildren().add(ba);
      //box1.getChildren().add(bb);
      //box1.getChildren().add(bc);
      box1.getChildren().addAll(ba,bb,bc);
      // to add the buttons to the stage. 
      Stage stage1 = new Stage();
      Scene s2 = new Scene(box1,300,300);
      // we add the box into Scene.
      stage1.setTitle("the stage title");
      stage1.setScene(s2);
      stage1.show();
      stage1.setX(300);
      stage1.setY(300);
      /*----------------------------------------------------------*/
      HBox box3 = new HBox(100);
      HBox box4 = new HBox(100);
      // to add multiple buttons in a horizontal format.
      // the number 100 is a gap between the buttons in box4.
      Button bd = new Button("Button D");
      Button be = new Button("Button E");
      Button bf = new Button("Button F");
      //box3.getChildren().add(bd);
      //box3.getChildren().add(be);
      //box3.getChildren().add(bf);
      // to add the buttons to the stage.
      box3.getChildren().addAll(bd,be,bf);
      // this method is equivelant to the the three lines up there. 
      Stage stage2 = new Stage();
      Scene s3 = new Scene(box3,500,150);
      // we add the box into Scene.
      stage2.setTitle("the stage title");
      stage2.setScene(s3);
      stage2.show();
      stage2.setX(900);
      stage2.setY(500);
      //////////////////////////////////////////////////////////////
      // controls methods:
      // 1. setText("")
      // it takes one String as a parameter.
      // it override the text of the button.
      ba.setText("setText()");
      String str = JOptionPane.showInputDialog("enter your name:");
      bb.setText(str);
      //////////////////////////////////////////////////////////////
      // 2. setVisible()
      // it takes one boolean as a parameter.
      // if it was false the button will be invisible.
      // if it was true the button will be visible.
      // the default of it is true.
      bd.setVisible(true);
      // it will show the button.
      be.setVisible(false);
      // it won't show the button.
      //////////////////////////////////////////////////////////////
      // 3. setDisable()
      // it takes one boolean as a parameter.
      // if it was false the button will be active.
      // if it was true the button will be disable.
      // if we don't code it the default of it is true.
      bf.setDisable(true);
      // it will disable the button.
      bf.setDisable(false);
      // it won't disable the button.
      ///////////////////////////////////////////////////////////
      // 4. getText()
      // it won't take any thing
      // it will return a String with the name of the control
      System.out.println(ba.getText()+"\n"+bb.getText()+"\n"+bc.getText());
      ///////////////////////////////////////////////////////////
      // 5.setWrapText()
      // it takes one boolean as a parameter.
      // if it was false the button will not do its thing.
      // if it was true the button will do its thing.
      // if we don't code it the default of it is false.
      ba.setWrapText(false);
      bb.setWrapText(true);
      ///////////////////////////////////////////////////////////
      // 6. setPrefHeight()
      // it takes double as a parameter of a control Height.
      // 7. setPrefWidth()
      // it takes double as a parameter of a control Width.
      // 8. setPrefSize(Width,Height)
      // it takes two doubles as parameters of a control size.
      ba.setPrefWidth(102);
      ba.setPrefHeight(100);
      ba.setPrefSize(102, 100);
      ///////////////////////////////////////////////////////
      // 9. setTranslateX()
      // it move the control at x-axis with the int value that we send.
      // 10. setTranslateY()
      // it move the control at y-axis with the int value that we send.
      ba.setTranslateX(0);
      ba.setTranslateY(0);
      ///////////////////////////////////////////////////////
      // 11. setScaleX()
      // it take double value and represents the  percent of change on x-axis
      // 1 : no change
      // 2 : it will double the original scale etc...
      // 12. setScaleY()
      // it take double value and represents the  percent of change on y-axis
      // 1 : no change
      // 2 : it will double the original scale etc...
      bb.setScaleX(0);
      bb.setScaleY(2);
      ///////////////////////////////////////////////////////
      // 13. setRotate()
      // it take double as a parameter.
      // this double represents the angle that we need to rotate the control.
      bd.setRotate(90);
      ///////////////////////////////////////////////////////
      // Color Class:
      // method one:constructor 
      Color c1 = new Color(0.2, 0.2, 1, 1);
      //RGBA are double value.
      // 0<= R,G,B,A <=1
      // declaration with new and RGBA
      // method two: color method 
      Color c2 = Color.color(0.1,0.3,0.2);
      Color c3 = Color.color(1,0, 0, 0.3);
      //RGBA are double value.
      // 0<= R,G,B,A <=1
      // declaration with color method and RGBA.
      // method three: rgb method
      Color c4 = Color.rgb(0, 255, 0);
      Color c5 = Color.rgb(0, 255, 0, 0.4);
      //RGBA are int value.
      // 0<=A<=1 , 0<=R,G,B<=255
      // declaration with color method and RGBA. 
      // method four:
      Color c6 = Color.HOTPINK;
      // declaration by the className(Color).colorPreMadeColors.
      // 14. setTextFill()
      // it take Color Object.
      // it dose'nt return any thing. 
      // it will change the color of the control.
      ba.setTextFill(c6);
      ///////////////////////////////////////////////////////
      // Font Class:
      System.out.println(Font.getFamilies());
      // we use this method to print all Fonts names in the terminal Screen.
      // there is 8 methods to declare a font object:
      Font f1 = new Font(30);
      // 1. by giving only the font size in double datatype.
      Font f2 = new Font("Arabic Typesetting", 50);
      // 2. by giving the font size in double datatype and font type in string datatype.
      Font f3 = Font.font("Akhbar MT");
      // 3. using the font method with the font type. 
      Font f4 = Font.font(40);
      // 4. by giving only the font size in double datatype. 
      // **(within font method).
      Font f5 = Font.font("Arabic Typesetting", 30);
      // 5. by giving the font size in double datatype and font type in string datatype.
      // **(within font method).
      Font f6 = Font.font("Ink free",FontPosture.ITALIC, 30);
      // 6. we can use this FontPosture.REGULAR or FontPosture.ITALIC.
      // it will get three parameters and it will throw an error if you try it another way. 
      Font f7 = Font.font("", FontWeight.EXTRA_BOLD, 25);
      // 7. we can also use this layout FontWeight.... . 
      Font f8 = Font.font("Comic Sans MS", FontWeight.LIGHT, FontPosture.ITALIC, 40);
      // 8. this is a bloodymary mix.
      // all of this we can use it by the method control.setFont().
      b1.setFont(f8);
      b1.setTextFill(Color.RED);
      ///////////////////////////////////////////////////////
      // Image Class:
      Image m1 = new Image("file:///C:\\Users\\2021\\Desktop\\grades\\Se.jpg");
      // the is the image object it self.
      ImageView V1 = new ImageView(m1);
      ImageView V2 = new ImageView(new Image("file:///C:\\Users\\2021\\Desktop\\grades\\Se.jpg"));    
      ImageView V3 = new ImageView("file:///C:\\Users\\2021\\Desktop\\grades\\Se.jpg");
      // the is the image container it has three ways of declaration as you can see. 
      // we need to write file:/// before image path i don't know why.
      ///////////////////////////////////////////////////////////////////
      // image methods:
      // 1. setFitWidth():
      // it changes the photo width e.g(V1.setFitWidth(double)). 
      // 2. setFitHeight():
      // it changes the photo Height e.g(V1.setFitHeight(double)).
      // setPreserveRatio(Boolean):
      // it will match the image Height if you change the width of the image.
      // if you sent true it will fit the height and vice versa.
      // if you sent false it won't fit the height and vice versa.
      HBox box5 = new HBox(100);
      box5.getChildren().add(V1);
      Scene s4 = new Scene(box5,805,569);
      Stage stage3 = new Stage();
      stage3.setScene(s4);
      stage3.setTitle("image");
      stage3.show();
      /////////////////////////////////////////////////////////
      // drawing shapes into the GUI
      // drawing a Line:
      Pane box6 = new Pane();    
      // when drawing shapes we need to use Pane container for some reason.  
      Line line = new Line(100, 30, 500, 30);
      // Line line1 = new Line(x1, y1, x2, y2);
      line.setStroke(Color.YELLOW);
      // it color the line.
      line.setStrokeWidth(12);
      // it gives the line its width. 
      box6.getChildren().add(line);
      /*----------------------------------------------------------*/
      Circle circle = new Circle(600, 350, 80);
      //Circle circle = new Circle(x of the center,y of the center,radius)
      circle.setStroke(Color.GOLD);
      // it color the outside of the circle.
      circle.setStrokeWidth(8);
      // it gives the circle its width.
      circle.setFill(Color.DARKSLATEBLUE);
      // it fill the circle with a color.
      box6.getChildren().add(circle);
      /*----------------------------------------------------------*/
      Rectangle rectangle1 = new Rectangle(150, 200, 200, 100);
      // Rectangle rectangle1 = new Rectangle(x, y,width,height);
      rectangle1.setStroke(Color.BLUEVIOLET);
      // it color the outside of the rectangle.
      rectangle1.setStrokeWidth(10);
      // it gives the rectangle its width.
      rectangle1.setFill(Color.YELLOWGREEN);
      // it fill the rectangle with a color.
      box6.getChildren().add(rectangle1);
      
      Rectangle rectangle2 = new Rectangle(30, 350, 150, 100);
      rectangle2.setStroke(Color.AQUA);
      rectangle2.setStrokeWidth(5);
      rectangle2.setFill(Color.GOLD);
      
      rectangle2.setArcWidth(10);
      rectangle2.setArcHeight(40);
      // it makes a Rounded rectangle.   
      box6.getChildren().add(rectangle2);
      Stage stage4 = new Stage();
      Scene s5 = new Scene(box6); 
      stage4.setScene(s5);
      stage4.setTitle("Aaa");
      stage4.show();
      //////////////////////////////////////////////////
      //////////////////// controls ////////////////////
      //////////////////////////////////////////////////
      // Label Class: 
      Label lbl1 = new Label("I am a label");
      // we can use this class to write any thing into the GUI
      // we can use any method(color,font,...) on it.
      // TextField Calss:
      TextField txt1 = new TextField();
      // it will show a textfield that is empty. 
      TextField txt2 = new TextField("Type here");
      // it will show a textfield that has the string parameter inside it. 
      // RadioButton Class:
      RadioButton radiobutton1 = new RadioButton("text1");
      RadioButton radiobutton2 = new RadioButton("text2");
      RadioButton radiobutton3 = new RadioButton("text3");
      RadioButton radiobutton4 = new RadioButton("text4");
      // the declaration of radiobuttons with the String text.  
      radiobutton1.setSelected(true);
      // it will start the radiobutton with that button felid.
      // ToggleGroup Class:
      ToggleGroup togglegroup = new ToggleGroup();
      radiobutton1.setToggleGroup(togglegroup);
      radiobutton2.setToggleGroup(togglegroup);
      radiobutton3.setToggleGroup(togglegroup);
      radiobutton4.setToggleGroup(togglegroup);
      // we use this class to force the user to select just one radiobutton.
      // CheckBox Class:
      CheckBox checkbox1 = new CheckBox("text1");
      CheckBox checkbox2 = new CheckBox("text2");
      CheckBox checkbox3 = new CheckBox("text3");
      // we use this class to create a CheckBox.
      ////////////////////////////////////////////////////////////////////////
      // EventHandling :
      // their is three steps:
      // 1- create inner class with these features:
      class InnerEventHandeling implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent e) {
            // it will reserve ActionEvent object.    
            }
      // we must override the method handle that do the action that we want.
      // 2- declare an object form the inner class into the Start method.
      // 3- call a method (control.setOnAction(innerObject)) we call it by the control.    
      // if we want to do different actions we need to declare more inner classes
      // note : to get a text from a textfield to do actions with it do the following:
      // 1- declare the textfield as a global variable (TextFelid txtName;)
      // 2- declare the textfield into start method with new operator (txtName = new TextFelid;).
      // 3- use the method (txtName.getText();) then do whatever you want.
      // 4- we can use this way with all controls that we need to use in handle.
      // note: setText() -> take a String , getText() -> get a String.
      /////////////////////////////////////////////////////////////////////////////////
      // isSelected() it is a method that return boolean value
      // it return true if the control is selected.
      // it return false if the control isn't selected.
      // we usually use it with (radioButtons) etc.       
     }
      /////////////////////////////////////////////////
      // Anonymous Class in handle:
      /* 
        simply we use this way by sending the whole innerClass 
        inside the setAction method parameter list. 
      */
      b1.setOnAction( new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
      // it will reserve ActionEvent object.    
      }});
      /////////////////////////////////////////////////
      // Lambda expression :
      // it is the fastest way to handle Actions:
      b1.setOnAction( e -> {
      // it will reserve ActionEvent object. 
      });
    }
}