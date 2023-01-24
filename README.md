
## Overview
The app is aimed at providing a simple and easy-to-use interface for counting and tracking numbers. The app is developed using Java programming language and Android framework. It uses two fragments, one for displaying the current counter value and another for controlling the counter value. The app also uses SQLite database to save the current counter value so that it can be retrieved the next time the app is opened.
This app was developed with the idea of providing an easy and convenient way to track resources in fantasy games with friends. The concept for the app came from the need for a device to keep track of money in a game, as it can be difficult to keep track of it manually or remember the value from one gaming session to the next. This app was created to address this problem by providing a simple and easy-to-use interface for counting and tracking money in a fantasy game. It allows users to increase or decrease the money count by tapping a plus or minus button and also allows users to type a number in a field and have it added to the counter. The app also includes a save button which allows the user to save the current money count to an SQLite database and retrieve it the next time the app is opened. This app is designed to make it easy and convenient for players to keep track of their money in the game, saving them the hassle of manually tracking it and the risk of forgetting it from one session to the next.

## Design
I started by researching and studying course materials and watching online tutorials on youtube to get inspiration about the possible way this project can be designed. The design of the app was kept simple with the main aim of achieving an old fantasy feeling with vintage and rustic colours and wood and old tavern-like background. The app starts with a splash screen that introduces the app and then moves on to the main activity. The splash screen was inspired by a video tutorial by Penguin Coders (Penguin Coders, 2020). The background music in the app is also aimed at setting a mysterious fantasy feel to the app. The main activity includes a counter display, a placeholder for typing your number, and 4 buttons on the screen. The add and minus buttons each remove and add 1 count to the counter. The big win button adds the number that you type in the counter as an easier way to add bigger numbers. And the save button saves the counter number and loads it the next time the app is open. The design of the app was intended to be simple, easy to use and also to give a fantasy feeling to the users. The app was designed to make it easy and convenient for players to keep track of their money in the game, saving them the hassle of manually tracking it and the risk of forgetting it from one session to the next.

## Implementation
In the development process of the app, a prototype of the app was designed on Canva to have a basic idea of what was aimed for. The prototype was used as a visual reference for the development process. The development process started with implementing the counter and the control fragments and adding them to the MainActivity class. This was the first step in creating the basic functionality of the app.
Once the basic functionality was in place, the app's layout files were updated and added with simple visuals. This included basic layout elements such as buttons and text fields. After that, the SQLite database was implemented, and the save button was added to the app. This was done to provide the user with the ability to save the current counter value and retrieve it the next time the app is opened. After testing and making sure the app was running smoothly, the UI design was worked on. Icons, backgrounds, and background music were added, and the theme colours were changed to align with the overall design concept of the app. The aim was to create a visually pleasing and easy-to-use interface for the user.
Overall the development process for the app was designed to be simple and efficient, and the prototype helped to guide the development process and ensure that the final product met the desired design and functionality goals.

## Functionality

### Fragments
In the app, there are two fragments used, one for displaying the current counter value and another for controlling the counter value. The first fragment, the CounterFragment, is responsible for displaying the current counter value to the user. It receives the counter value from the MainActivity class and updates the textview that displays the counter value. The CounterFragment also includes a method called "updateCounter" that updates the counter value displayed on the fragment.

The second fragment, the ControlsFragment, is responsible for controlling the counter value. It includes a plus button, a minus button, a big win button, and a save button. The plus button increments the counter value by 1, the minus button decrements the counter value by 1, the big win button adds the value typed in the textbox to the counter, and the save button saves the current counter value to the SQLite database. The ControlsFragment communicates with the MainActivity class to perform these actions by calling methods in the MainActivity class.
Both fragments work together to provide the user with an easy-to-use interface for counting and tracking numbers. The CounterFragment displays the current counter value while the ControlsFragment allows the user to control the counter value by incrementing, decrementing, adding, and saving it.

### SQLite Database 
the SQLite library is used to save and retrieve the counter value from a local database. The SQLite library is a lightweight, file-based database engine that is widely used in mobile and embedded systems. It is a good choice for small and simple applications like this one because it is easy to use, cross-platform, and requires minimal setup and configuration.
The DatabaseHelper class is used as an interface between the app and the SQLite database. It extends the SQLiteOpenHelper class which is a helper class to manage database creation and version management. The onCreate() method of the DatabaseHelper class is used to create the database and its table when the app is first launched. It uses the CREATE TABLE SQL statement to create the counter table with two columns, id and value, and the SQLiteDatabase.execSQL() method is used to execute the statement and create the table.
When the user presses the save button, the saveCounter() method is called in the DatabaseHelper. It uses the SQLiteDatabase.insert() method to insert a new row into the counter table with the current counter value. This method takes three arguments: the table name, a column name that should be used in case the insert operation fails and the values to be inserted.
When the app is launched, the getCounter() method is called in the DatabaseHelper. It uses the SQLiteDatabase.query() method to retrieve the counter value from the table. This method returns a Cursor object that can be used to iterate through the rows of the result set. The cursor.moveToFirst() method is used to move to the first row of the result set, and the `cursor

### Background Music 
The MediaPlayer object is used to play the background music. The create() method is used to create the MediaPlayer object and associate it with the audio file located in the res/raw directory. The setLooping() method is used to set whether the music should loop or not. The start() method is used to start playing the music.

## Conclusion
The app provides a simple and easy-to-use interface for counting and tracking numbers. It uses two fragments, one for displaying the current counter value and another for controlling the counter value. It also uses SQLite database to save the current counter value so that it can be retrieved the next time the app is opened. The app was tested for functionality and performance to ensure that it meets the requirements and it has been determined that the app is functional and performs well. For future improvements, I would like to add a mute option for the music in case the user was not interested in hearing it. Also, I will like to have the saved value Already displaying and loaded on the screen when the app launches.

