# Pseudo Trello Project README

This README document provides an overview of the **Pseudo Trello Project** implemented using Java, Object-Oriented Programming (OOP) principles, MySQL for database management, and the `javax.swing` library for the graphical user interface (GUI).

## Project Description

The Pseudo Trello Project is a simplified version of the popular Trello application, designed to manage tasks and organize projects using boards, lists, and cards. The project emphasizes the use of OOP concepts to achieve modularity, maintainability, and extensibility. MySQL is used to store and retrieve data related to boards, lists, and cards, while the `javax.swing` library is employed to create a user-friendly graphical interface.

## Features

1. **Boards, Lists, and Cards**: Users can create, view, edit, and delete boards, lists, and cards. Each board contains lists, and each list contains cards.

2. **Database Integration**: MySQL database is used to store user data, including boards, lists, and cards. JDBC (Java Database Connectivity) is utilized to manage the connection between the Java application and the MySQL database.

3. **User Authentication**: User authentication is implemented to ensure secure access to the application. Users need to log in with valid credentials to access their boards and tasks.

4. **GUI using `javax.swing`**: The application provides a user-friendly GUI using the `javax.swing` library. Various components like buttons, panels, and layout managers are utilized to create an intuitive interface for users.

## Prerequisites

1. Java Development Kit (JDK): Install JDK to compile and run Java code.
2. MySQL Database: Set up a MySQL database for data storage.
3. MySQL Connector/J: Download and include the JDBC driver for MySQL in your project.
4. `javax.swing` Library: This is usually included with the standard Java distribution.

## Installation and Usage

1. Clone or download the project repository.
2. Set up the MySQL database using the provided SQL scripts.
3. Update the database connection details in the Java code (e.g., URL, username, password).
4. Compile and run the Java application.
