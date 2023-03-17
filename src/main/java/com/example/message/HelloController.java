package com.example.message;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private ScrollPane chatPane;

    @FXML
    private VBox chatBox;

    @FXML
    private TextField messageField;

    @FXML
    private Button sendButton;

    @FXML
    private void sendMessage() {
        String message = messageField.getText();
        if (!message.trim().isEmpty()) {
            TextArea messageArea = new TextArea();
            messageArea.setEditable(false);
            messageArea.setWrapText(true);
            messageArea.setText(message);
            chatBox.getChildren().add(messageArea);
            messageField.clear();
            chatPane.setVvalue(1.0);
        }
    }

    @FXML
    private void sendMessageOnEnter(javafx.scene.input.KeyEvent event) {
        if (event.getCode().toString().equals("ENTER")) {
            sendMessage();
        }
    }
}
