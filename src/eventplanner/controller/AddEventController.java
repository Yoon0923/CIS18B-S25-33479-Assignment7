package eventplanner.controller;

import eventplanner.model.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.collections.ObservableList;
import java.time.LocalDate;

public class AddEventController {
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextArea descriptionArea;
    @FXML private Button addButton;

    private ObservableList<Event> events;

    public void setEventList(ObservableList<Event> events) {
        this.events = events;
    }

    @FXML
    private void handleAddEvent() {
        String title = titleField.getText();
        LocalDate date = datePicker.getValue();
        String description = descriptionArea.getText();

        if (title.isEmpty() || date == null) return;

        Event event = new Event();
        event.setTitle(title);
        event.setDate(date);
        event.setDescription(description);

        events.add(event);
        animate(addButton);

        Stage stage = (Stage) addButton.getScene().getWindow();
        stage.close();
    }

    private void animate(Node node) {
        FadeTransition ft = new FadeTransition(Duration.millis(500), node);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();
    }
}
