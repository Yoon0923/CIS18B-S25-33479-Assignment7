package eventplanner.model;

import javafx.beans.property.*;
import java.time.LocalDate;

public class Event {
    private final StringProperty title = new SimpleStringProperty();
    private final ObjectProperty<LocalDate> date = new SimpleObjectProperty<>();
    private final StringProperty description = new SimpleStringProperty();

    public StringProperty titleProperty() { return title; }
    public ObjectProperty<LocalDate> dateProperty() { return date; }
    public StringProperty descriptionProperty() { return description; }

    public String getTitle() { return title.get(); }
    public void setTitle(String title) { this.title.set(title); }

    public LocalDate getDate() { return date.get(); }
    public void setDate(LocalDate date) { this.date.set(date); }

    public String getDescription() { return description.get(); }
    public void setDescription(String description) { this.description.set(description); }
}

