package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DataBase {
    public static void main(String[] args) throws SQLException{
     Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/DB","ahmad","ahmadxxx");
     /*
      * we use the class (import java.sql.Connection) and (import java.sql.DriverManager)
      * to connect and access our data base by the method that into DriverManager Class
      * it is getConnection("the data base name","userName","Password").
      * it throws (SQLException). 
      */
     //Statement statement = connection.createStatement();
     Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
     /*
      * we use the class (java.sql.Statement) to create an Object of Statement class
      * we create it by the Connection Obj with a method createStatement(). 
      * it throws (SQLException). 
      */
     ResultSet resultSet = statement.executeQuery("SELECT * FROM WEEKDAYS");
     /*
      * we use the class (java.sql.ResultSet) ->  
      * to get somthing like a copy or a reference for our data base
      * by an obj from statement class and a method within it executeQuery()
      * this method takes SqlStatement String and execute it.
      * it throws (SQLException). 
      */
      resultSet.next();
      // it will move the cursor into the first row (The original would not be there).
      // if we use a get method after getting false the next mrthod it will throw a runtime error
      // it return a boolean:
      // true if the table has a next row then the one that we are in.
      // false if the table hasn't a next row then the one that we are in or when we are in the last row.
      int num1 = resultSet.getInt("DAYNUM");
      int num2 = resultSet.getInt(1);
      System.out.println(num1);
      System.out.println(num2);
      /*
       * we use the get...() methods to get any value from our table
       * it takes a String (**not case sensitive**) with the colman name that into our currint row
       * or it takes integer with the index of the colmen that in our current row (starts from one).
       * (you need to know the row that you are in).
       */
      /*********************************************************************************************/
      // Data base Methods:
      // 1. next() : it is up there.
      /////////////////////////////////////////////////////
      resultSet.previous();
      // 2. previous() : 
      // it move the cursor to the previous row.
      // it return a boolean:
      // true if the table has a previous row then the one that we are in.
      // false if the table hasn't a previous row then the one that we are in.
      /////////////////////////////////////////////////////
      resultSet.first();
      // 3. first() : 
      // it move the cursor to the first row.
      // it return a boolean:
      // true if the table has any row exist.
      // false if the table hasn't any row exist.
      /////////////////////////////////////////////////////
      resultSet.last();
      // 4. last() : 
      // it move the cursor to the last row.
      // it return a boolean:
      // true if the table has any row exist.
      // false if the table hasn't any row exist.
      // note: if we have just one row we will consider it as the first and last row.
      /////////////////////////////////////////////////////
      resultSet.absolute(1);
      // 5. absolute() : 
      // it move the cursor to a specific row index (starts from one).
      // it return a boolean:
      // true if the row with the given index is exist.
      // false if the row with the given index isn't exist.
      // when we use a positive int it will count from up to down
      // when we use a negative int it will count from down to up
      // note: if we need to use these four methods we need write this 
      // Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        System.out.println(resultSet.absolute(2));
        System.out.println(resultSet.getString(2));
      // resultSet.absolute(1) is the same as resultSet.first() .
      // resultSet.absolute(-1) is the same as resultSet.last() .
      ///////////////////////////////////////
      ///////// PreparedStatements //////////
      ///////////////////////////////////////
      // insert, update and delete can be performed
      // method1: using ResultSet
      // method2: using PreparedStatements
      
      //PreparedStatement enables you to create parameterized SQL statements.
      //They are efficient for repeated executions.
      //questionMarks as placeholders for parameters.
      //////////////////////////////////////////////////////////////////
      // insert statement using PreparedStatement
      String insert1 = "insert into WEEKDAYS (DayNum, DayName, MonthNum) values (?, ?, ?)";
      // this is equivalent to that:
      // It will work in the same order as the columns in the database.
      String insert2 = "insert into WEEKDAYS values (?, ?, ?)";
      PreparedStatement preparedstatement = connection.prepareStatement(insert1);
      preparedstatement.setInt(1,1673);
      // it will give a the value 130 to the first questionMarks.
      preparedstatement.setString(2,"7970");
      // it will give a the value "7970" to the second questionMarks.
      preparedstatement.setInt(3, 87);
      // it will give a the value 87 to the thired questionMarks.
      preparedstatement.executeUpdate();
      // executeUpdate():
      // this method will execute your update on the dataBase.
      // if any row are affected by the update it will return the number of updates.
      // if any row aren't affected by the update it will return 0.
      ////////////////////////////////////////////////////////////////
      // update statement using PreparedStatement
       String update = "update WEEKDAYS set daynum = ? where monthnum =?";
       preparedstatement = connection.prepareStatement(update);
       preparedstatement.setInt(1, 1000);
       preparedstatement.setInt(2, 2);
       preparedstatement.executeUpdate();
      ////////////////////////////////////////////////////////////////
      // delete statement using PreparedStatement
      String delete = "delete from WEEKDAYS where daynum = ?";
      preparedstatement = connection.prepareStatement(delete);
      preparedstatement.setInt(1, 1000);
      preparedstatement.executeUpdate();
      // don't forget the effected and executeUpdate() idea.
      //////////////////////////////////////////////////////
      // SQL Statemants:
      String sqlSelect1 = "select (columnName) from (tableName) where condition";
      String sqlSelect2 = "select (columnName) from (tableName) where (columnName) like '(charCS)%'";
      String sqlInsert = "insert into (tableName) ((columnName),(columnName),...) values (columnValue,columnValue,...)";
      String sqlUpdate = "update (tableName) set (columnName) = (columnValue) where condition";
      String sqlDelete = "delete from (tableName) where condition";
    }
}