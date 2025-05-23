package eventplanner.controller;

import eventplanner.model.Event;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class EventListController {
    @FXML
    private ListView<Event> eventListView;

    private final ObservableList<Event> events = FXCollections.observableArrayList();

    public void initialize() {
        eventListView.setItems(events);
        eventListView.setCellFactory(lv -> new EventCell());
    }
 @FXML
    private void handleAddEvent() {
        System.out.println("Add Event button clicked!");}
    private static class EventCell extends javafx.scene.control.ListCell<Event> {
        @Override
        protected void updateItem(Event event, boolean empty) {
            super.updateItem(event, empty);
            if (empty || event == null) {
                setText(null);
                setGraphic(null);
            } else {
                setText(event.getTitle() + " - " + event.getDate());
                setEffect(new DropShadow(5, Color.GRAY));
            }
        }
    }
}

