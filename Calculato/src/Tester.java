import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Tester extends Application {
    //GUI content
    @FXML
    private javafx.scene.control.TextField display;

    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button dot;
    @FXML
    private Button c;
    @FXML
    private Button addition;
    @FXML
    private Button subtraction;
    @FXML
    private Button division;
    @FXML
    private Button multiplication;
    @FXML
    private Button isEqualTo;

    @FXML
    public void Button1(ActionEvent e) {
        display.setText(display.getText() + "1");
    }

    @FXML
    public void Button2(ActionEvent e) {
        display.setText(display.getText() + "2");
    }

    @FXML
    public void Button3(ActionEvent e) {
        display.setText(display.getText() + "3");
    }

    @FXML
    public void Button4(ActionEvent e) {
        display.setText(display.getText() + "4");
    }

    @FXML
    public void Button5(ActionEvent e) {
        display.setText(display.getText() + "5");
    }

    @FXML
    public void Button6(ActionEvent e) {
        display.setText(display.getText() + "6");
    }

    @FXML
    public void Button7(ActionEvent e) {
        display.setText(display.getText() + "7");
    }

    @FXML
    public void Button8(ActionEvent e) {
        display.setText(display.getText() + "8");
    }

    @FXML
    public void Button9(ActionEvent e) {
        display.setText(display.getText() + "9");
    }

    @FXML
    public void Button0(ActionEvent e) {
        display.setText(display.getText() + "0");
    }

    @FXML
    public void ButtonAdd(ActionEvent e) {
        display.setText("+");

    }

    public void ButtonSub(ActionEvent e) {
        display.setText( "-");
    }

    public void ButtonMul(ActionEvent e) {
        display.setText("*");
    }

    public void ButtonDiv(ActionEvent e) {
        display.setText("/");
    }
    public void ButtonC(ActionEvent e) {
        display.setText("");
    }

    public void ButtonDot(ActionEvent e) {
        display.setText(display.getText() + ".");
    }


    //BYT
    @Override
    public void start(Stage primaryStage) throws Exception {

        // just load fxml file and display it in the stage:

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorScene.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        // write your code here
        launch(args);
//
        Scanner in = new Scanner(System.in);

        System.out.print("Provide first number: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Prvide an arithmetic operator (+ - / *): ");
        String operator = in.nextLine();
        System.out.print("Provide second number: ");
        int b = Integer.parseInt(in.nextLine());

//        Request r = new Request(1,5,"+");
        Request r = new Request(a, b, operator);
        IChain addH = new AddNum();
        IChain subH = new SubtractNum();
        IChain mulH = new MultiplyNum();
        IChain divH = new DivideNum();

        addH.setNext(subH);
        subH.setNext(mulH);
        mulH.setNext(divH);
        divH.setNext(addH);

        addH.process(r);

    }


}
