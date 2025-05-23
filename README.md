# Event Planner JavaFX App
A simple JavaFX application that allows users to manage events such as meetings, study sessions, and meetings. It provides a list view to display scheduled events and an interface to add new events. The application uses JavaFX features such as FXML, properties, effects, and basic animation.

<How to Run>

Requirements

- Java Development Kit (JDK) 11 or higher (e.g., JDK 17 or 22)
- JavaFX SDK (e.g., version 24.0.1)
- IntelliJ IDEA (Community Edition is sufficient)


<Steps to Run in IntelliJ IDEA>

1. Clone the project from GitHub or open it directly in IntelliJ.
2. Make sure the `src` folder is marked as **Sources Root** and `resources` as **Resources Root**.
3. Go to **File > Project Structure > Libraries**, and add the `lib` folder from your downloaded JavaFX SDK.
4. Then go to **Run > Edit Configurations**, create a new **Application** configuration:
    - Set the **Main class** to `eventplanner.Main`
    - In **VM options**, add the following (update the path based on your machine):

      Example)

      --module-path "C:/path/to/javafx-sdk-24.0.1/lib" --add-modules javafx.controls,javafx.fxml
      

      > Replace `C:/path/to/...` with the actual path where you extracted your JavaFX SDK.

5. Click **Run** to start the application.

You should see a window titled "Event Planner" with an empty event list and a button to add events. The event-adding functionality and list view are styled using basic JavaFX effects and structure.

 Screenshots of running program


 
![image](https://github.com/user-attachments/assets/5092e035-ed5b-46cc-adee-478d933f8ec9)


