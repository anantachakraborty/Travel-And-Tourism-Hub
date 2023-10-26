# Travel & Tourism Management System

## About the Project

The Travel & Tourism Management System is an automated platform designed to streamline and simplify various travel-related processes and activities. This system's primary objective is to provide users with an easy and efficient way to perform essential travel operations.

## Key Features

1. **Access Travel Information:** Easily explore information about different travel destinations.
2. **Tour Tracking:** Effortlessly keep track of your tour details through the application.
3. **Travel Agency Information:** Access details about travel agencies and their services.

## Advantages of the Project

1. **Accurate Information:** The system ensures the accuracy of travel-related data.
2. **Process Simplification:** It simplifies manual work, reducing the need for extensive documentation.
3. **Real-time Information:** Provides up-to-date travel information.
4. **User-Friendly Environment:** Offers a user-friendly interface with warning messages.
5. **Detailed Traveler Information:** Allows for the provision of traveler details.
6. **Booking Confirmation Notifications:** Sends booking confirmation notifications to users.


## Getting Started

To get started, you can follow these steps:

1. **Clone the Repository:** 


2. **Set Up MySQL Database:**

- If you have MySQL and MySQL Workbench installed, you can use MySQL Workbench to create a database by running the SQL script provided in the `database` folder. The SQL script is named `database_travel-&-tourism_mgmt_sys.sql`.

- Alternatively, you can import the SQL script using the command line:
  mysql -u your_username -p your_database_name < database/database_travel-&-tourism_mgmt_sys.sql

Make sure to replace `your_username` and `your_database_name`.

3. **Set Up Environment Variables:** Ensure you've set up the necessary environment variables for your database credentials.

4. **Run the Application:** Launch the application and start enjoying the benefits of simplified travel management.


## Environment Variables

Before running the project, make sure to set up the following environment variables with your MySQL database credentials (in the DBConn.java file):

- `DB_URL`: The URL to your MySQL database.
- `DB_USER`: Your MySQL database username.
- `DB_PASSWORD`: Your MySQL database password.


## JDBC Connectivity

The Travel & Tourism Management System relies on JDBC (Java Database Connectivity) to establish a connection to the MySQL database. This connection enables the application to retrieve and manipulate travel-related data.

- **Database Management System:** MySQL
- **JDBC Library:** MySQL Connector/J 8.0.28

This JDBC connection is responsible for seamless communication between the application and the database.


## Technologies and Tools

The Travel & Tourism Management System project is built using the following technologies and tools:

- **Java:** The core programming language used for building the application.
- **Swing and AWT:** Java's Swing and Abstract Window Toolkit (AWT) are employed for creating the user interface components.
- **MySQL:** The project uses MySQL as the database management system for storing and retrieving travel-related data.
- **IDE:** Developed using NetBeans, a popular integrated development environment for Java.
- **MySQL Connector/J 8.0.28:** The MySQL Connector/J library is used to establish the connection between the Java application and the MySQL database.
- **JDK 20:** The project is developed using Java Development Kit (JDK) version 20, ensuring compatibility with the latest Java features and enhancements.

These technologies and tools collectively contribute to the development and functionality of the Travel & Tourism Management System.
