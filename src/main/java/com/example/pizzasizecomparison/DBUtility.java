package com.example.pizzasizecomparison;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String dbUser = "Hetashvi200541827";
    private static String password = "S9dEYkOlPx";
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/pizza_data";

    /*This method will return a list of GodFathers Pizza data from the database */
    public static ArrayList<Pizza> getGodfathersPizzaSizesFromDB(){
        ArrayList<Pizza> godFathers = new ArrayList<>();

        String sql = "SELECT * FROM godfathers_data";

        //Connect ot the DB - use a try... with resources block to ensure
        //the connection, statement and resultSet are automatically closed
        try(
                Connection conn = DriverManager.getConnection(connectURL, dbUser, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        )
        {
            while (resultSet.next()) //.next will point at the next row
            {
                String pizzaName = resultSet.getString("Pizza Name");
                String pizzaType = resultSet.getString("Type");
                String pizzaSize = resultSet.getString("Size");
                float pizzaPrice = resultSet.getFloat("Price");
                Pizza pizzas = new Pizza(pizzaName,pizzaType,pizzaSize,pizzaPrice);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //run a query to get the users
        //loop over the users returned and create user objects
        //add the User objects to the ArrayList
        return godFathers;
    }
}
