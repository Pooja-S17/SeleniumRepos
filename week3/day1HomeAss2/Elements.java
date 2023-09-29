package week3.day1HomeAss2;

public class Elements extends Button{
	public static void main(String[] args) {
        Webelement webElement = new Webelement();
        webElement.click();
        webElement.setText("Sample Text");

        Button button = new Button();
        button.click();
        button.submit();

        Textfield textField = new Textfield();
        textField.click();
        String text = textField.getText();
        System.out.println("Retrieved Text: " + text);

        CheckBoxButton checkBox = new CheckBoxButton();
        checkBox.click();
        checkBox.submit();
        checkBox.clickCheckButton();

        RadioButton radioButton = new RadioButton();
        radioButton.click();
        radioButton.submit();
        radioButton.selectRadioButton();
    }


	
}
