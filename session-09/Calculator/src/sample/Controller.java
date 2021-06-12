package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    private String num1 = "";
    private String num2 = "";
    private char operator;
    private boolean num1finished = false;

    @FXML
    private TextField textField;

    /**
     * appends a number to the strings number
     * @param str is number want to append
     */
    public void append(String str)
    {
        if(num1finished)
        {
            num2 += str;
            textField.setText(num2);
        }
        else
        {
            num1 += str;
            textField.setText(num1);
        }
    }


    /**
     * make operation as plus
     * @param event
     */
    @FXML
    void add(ActionEvent event) {
        num1finished = true;
        operator = '+';
        textField.setText("");
    }

    /**
     * appends number 0 to numbers
     * @param event
     */
    @FXML
    void button0pressed(ActionEvent event) {
        append("0");
    }

    /**
     * appends number 1 to numbers
     * @param event
     */
    @FXML
    void button1pressed(ActionEvent event) {
        append("1");
    }

    /**
     * appends number 2 to numbers
     * @param event
     */
    @FXML
    void button2pressed(ActionEvent event) {
        append("2");
    }

    /**
     * appends number 3 to numbers
     * @param event
     */
    @FXML
    void button3pressed(ActionEvent event) {
        append("3");
    }

    /**
     * appends number 4 to numbers
     * @param event
     */
    @FXML
    void button4pressed(ActionEvent event) {
        append("4");
    }

    /**
     * appends number 5 to numbers
     * @param event
     */
    @FXML
    void button5pressed(ActionEvent event) {
        append("5");
    }

    /**
     * appends number 6 to numbers
     * @param event
     */
    @FXML
    void button6pressed(ActionEvent event) {
        append("6");
    }

    /**
     * appends number 7 to numbers
     * @param event
     */
    @FXML
    void button7pressed(ActionEvent event) {
        append("7");
    }

    /**
     * appends number 8 to numbers
     * @param event
     */
    @FXML
    void button8pressed(ActionEvent event) {
        append("8");
    }

    /**
     * appends number 9 to numbers
     * @param event
     */
    @FXML
    void button9pressed(ActionEvent event) {
        append("9");
    }

    /**
     * appends dot sign to numbers
     * @param event
     */
    @FXML
    void buttonDotPressed(ActionEvent event) {
        append(".");
    }

    /**
     * clears the screen and starts from beginning
     * @param event
     */
    @FXML
    void clearButtonPressed(ActionEvent event) {
        textField.setText("");
        num1 = "";
        num2 = "";
        num1finished = false;
    }

    /**
     * deletes last digit
     * @param event
     */
    @FXML
    void delButtonPressed(ActionEvent event) {
        if(num1finished)
        {
            num2 = num2.substring(0,num2.length()-1);
            textField.setText(num2);
        }
        else
        {
            num1 = num1.substring(0,num1.length()-1);
            textField.setText(num1);
        }
    }

    /**
     * make operation as division
     * @param event
     */
    @FXML
    void division(ActionEvent event) {
        num1finished = true;
        operator = '/';
        textField.setText("");
    }

    /**
     * shows the result
     * @param event
     */
    @FXML
    void exeButtonPressed(ActionEvent event) {
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double result;

        switch (operator)
        {
            case '+':
                result = n1 + n2;
                textField.setText(String.valueOf(result));
                break;
            case '-':
                result = n1 - n2;
                textField.setText(String.valueOf(result));
                break;
            case '*':
                result = n1 * n2;
                textField.setText(String.valueOf(result));
                break;
            case '/':
                result = n1 / n2;
                textField.setText(String.valueOf(result));
                break;
        }
        num1 = "";
        num2 = "";
        num1finished = false;
    }

    /**
     * make operation as multiplication
     * @param event
     */
    @FXML
    void multiply(ActionEvent event) {
        num1finished = true;
        operator = '*';
        textField.setText("");
    }

    @FXML
    void offButtonPressed(ActionEvent event) {

    }

    /**
     * make operation as submission
     * @param event
     */
    @FXML
    void sub(ActionEvent event) {
        num1finished = true;
        operator = '-';
        textField.setText("");
    }

    /**
     * makes the text field zero and disables typing
     */
    @FXML
    public void initialize ()
    {
        textField.setText("0");
        textField.setDisable(true);
    }
}

