package databases;

import java.sql.ResultSet;
import java.text.Format;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;

public class UnitTestConnectDB {

    /**
     * Use this class to unit test the SharedStepsDatabase class
     */
  //Note : I changed the queries because I am working with database WORLD
    public static void main(String[] args) throws Exception {

       SharedStepsDatabase ssdb = new SharedStepsDatabase();
//
//         //region ExecuteQueryReadOne
//        String query = "SELECT* FROM WORLD.CITY LIMIT 10";
//        String result = ssdb.executeQueryReadOne(query);
//
//        System.out.println(result);
//         //endregion
//
//         //region executeQueryReadAllSingleColumn
//        String queryTwo = "SELECT * FROM WORLD.CITY LIMIT 10";
//        List<String> results = ssdb.executeQueryReadAllSingleColumn(queryTwo, "Population");
//
//        for (String s : results) {
//            System.out.println(s);
//        }

         //endregion

         //region executeQueryReadAll
        String queryThree ="SELECT city.Name , countrylanguage.Language FROM city INNER JOIN countrylanguage ON city.CountryCode = countrylanguage.CountryCode";

        List<List<String>> data = ssdb.executeQueryReadAll(queryThree);

        if (data != null) {
            for (List<String> row : data) {
                for (String cell : row) {
                    System.out.print(cell + "\t\t");
                }
                System.out.println();
            }
        }

         //endregion

         //region InsertString
//        ssdb.insertString("test_insert_string", "test_string", "Testing String Insertion");
//        System.out.println(ssdb.executeQueryReadAllSingleColumn("SELECT * FROM TEST_INSERT_STRING", 2).get(0));

         //endregion

//         //region insertList
//        List<Object> names = new ArrayList<>();
//        names.add("Student1");
//        names.add("Student2");
//
//        ssdb.insertList("test_insert_list", "test_list", names);
//
//        String query = "SELECT * FROM TEST_INSERT_LIST";
//        List<String> results = ssdb.executeQueryReadAllSingleColumn(query, "test_list");
//
//        for (String s: results) {
//            System.out.println(s);
//        }
//
//         //endregion
//
//         //region insertMap
//        HashMap<Object, Object> map = new HashMap<>();
//        map.put("Student1", 7934);
//        map.put("Student2", 6319);
//
//        ssdb.insertMap("test_insert_map", map);
//
//        String querySix= "SELECT * FROM TEST_INSERT_MAP";
//        List<List<String>> results6 = ssdb.executeQueryReadAll(querySix);
//
//        for (List<String> row : results6) {
//            for (String cell : row) {
//                System.out.print(cell + "\t\t");
//            }
//            System.out.println();
//        }

         //endregion

        ssdb.closeResources();

    }
}
