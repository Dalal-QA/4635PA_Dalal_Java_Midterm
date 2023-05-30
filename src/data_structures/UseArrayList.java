package data_structures;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */
    private static Properties prop;
    private static Connection connection;
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        // Here I am using add() method to add elements to the ArrayList
        arrayList.add("Mazda");
        arrayList.add("Porsche");
        arrayList.add("Hyundai");
        arrayList.add("Lexus");

        // here I am using get () method to peek the element at the index 3
        String elementAtIndex3 = arrayList.get(3);
        System.out.println("The car brand at the index three is: " + elementAtIndex3);

        // Here I am using remove() to remove the element at index  2
        arrayList.remove(2);
        //System.out.println(arrayList.remove(2));


        //Retrieve all the data by using for each-loop
        System.out.println("The elements of this array list  are: ");
         for(String carBrand: arrayList){
             System.out.println(carBrand);
         }


         //Retrieve all the data by using for while loop iterator

        System.out.println("The elements of this array list  are: ");
         Iterator<String> iterator = arrayList.iterator();
         while(iterator.hasNext()){
             String carBrand = iterator.next();
             System.out.println(carBrand);
         }

         /*
         Note: the peek() method is not applicable to ArrayList because ArrayList is not a data structure that inherently supports the concept of "peeking" at the top or front element.
         The peek() method is typically associated with data structures like Stacks and Queues, where it retrieves the element at the top of the stack or the front of the queue without removing it.
         In ArrayList, which is a dynamic array implementation, there is no concept of a specific element at the "top" or "front" because elements are not inherently ordered or structured in a stack or queue manner. Instead, elements in an ArrayList are stored sequentially based on their insertion order.

          */





            connection = getJDBCConnection();

            if (connection != null) {
                System.out.println("WE SUCCESSFULLY ESTABLISHED A JDBC CONNECTION!");
            }
             // Here I am retrieving Data from the DataBase 'world' table 'country'
            String query = "SELECT * FROM country WHERE name = \"Anguilla\" and Region=\"Caribbean\"";

            String insertQuery = "INSERT INTO country (name, region) VALUES ('Dalal', 'Algeria');";

            String retrieveQuery="SELECT* FROM country WHERE name =\"Dalal\" and region =\"Algeria\"";



            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                List<List<String>> results = new ArrayList<>();

                while (resultSet.next()) {
                    List<String> row = new ArrayList<>();

                    for (int i = 1; i <= columnCount; i++) {
                        row.add(resultSet.getString(i));
                    }

                    results.add(row);
                }

                for (List<String> row : results) {
                    for (String value : row) {
                        System.out.print(value + "\t|");
                    }
                    System.out.println();
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

        public static Connection getJDBCConnection() {
            prop = loadProperties();

            if (prop != null) {
                String driverClass = prop.getProperty("MYSQLJDBC.driver");
                String host = prop.getProperty("MYSQLJDBC.host");
                String user = prop.getProperty("MYSQLJDBC.userName");
                String password = prop.getProperty("MYSQLJDBC.password");

                try {
                    Class.forName(driverClass);
                } catch (ClassNotFoundException cnfe) {
                    cnfe.printStackTrace();
                }

                try {
                    connection = DriverManager.getConnection(host, user, password);
                } catch (SQLException sqle) {
                    System.out.println("Unable to establish connection to MYSQL database!");
                }

            } else {
                System.out.println("Properties object is null");
            }
            return connection;
        }

        private static Properties loadProperties() {
            prop = new Properties();
            String propFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "secret.properties";

            try (InputStream ism = new FileInputStream(propFilePath)) {
                prop.load(ism);
            } catch (FileNotFoundException fnfe) {
                System.out.println("FILE IS NOT AVAILABLE AT: " + propFilePath);
                fnfe.printStackTrace();
            } catch (IOException ioe) {
                throw new RuntimeException(ioe);
            }

            return prop;
        }
       //connection successfully established.






    }
