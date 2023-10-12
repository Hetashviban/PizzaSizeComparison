package com.example.pizzasizecomparison;

import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;

import static javafx.collections.FXCollections.observableArrayList;

public class DBUtility {
    private static String dbUser = "Hetashvi200541827";
    private static String password = "S9dEYkOlPx";
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/Hetashvi200541827";

    /*This method will return a list of GodFathers Pizza data from the database */
    public static ArrayList<Pizza> getPizzaDataFromDB()
    {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        //connect to the db
        String sql = "SELECT * FROM godfathers_data;";

        try(
                Connection conn = DriverManager.getConnection(connectURL, dbUser, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        )
        {
            while (resultSet.next())
            {
                String pizzaName = resultSet.getString("Pizza Name");
                String pizzaType = resultSet.getString("Type");
                String pizzaSize = resultSet.getString("Size");
                float pizzaPrice = resultSet.getFloat("Price");
                Pizza newPizza = new Pizza(pizzaName, pizzaType, pizzaSize, pizzaPrice);
                pizzas.add(newPizza);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return pizzas;
    }



    /*This method will return the data from the DB to the pieChart*/
    public static PieChart.Data[] getPieChartSeries() {
        ArrayList<PieChart.Data> seriesData = new ArrayList<>();

        String sql = "SELECT Size, COUNT(*) AS NumberOfPizzas " +
                "FROM godfathers_data " +
                "GROUP BY Size";

        try (
                Connection conn = DriverManager.getConnection(connectURL, dbUser, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next())
            {
                String size = resultSet.getString("Size");
                int count = resultSet.getInt("NumberOfPizzas");
                seriesData.add(new PieChart.Data(size, count));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Convert the ArrayList to an array and return
        return seriesData.toArray(new PieChart.Data[0]);
    }

}
