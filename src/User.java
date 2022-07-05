import javax.swing.*;
import java.sql.*;

public class User {
    private String fullName;
    private String userID;
    private String passWord;
    private String email;


    public User(String fullName, String userID, String passWord, String email) {
        this.fullName = fullName;
        this.userID = userID;
        this.passWord = passWord;
        this.email = email;
    }

    public static User signUp() throws SQLException {
        String fullName = JOptionPane.showInputDialog(null ,"Please Enter Your FullName :",
                "Sign-Up page" , JOptionPane.QUESTION_MESSAGE);
        String userName = JOptionPane.showInputDialog(null ,"Please Enter Your username :",
                "Sign-Up page" , JOptionPane.QUESTION_MESSAGE);
        String passWord = JOptionPane.showInputDialog(null ,"Please Enter your passWord :",
                "Sign-Up Page" , JOptionPane.QUESTION_MESSAGE);
        String email = JOptionPane.showInputDialog(null ,"Please Enter Your Email :",
                "Sign-Up page" , JOptionPane.QUESTION_MESSAGE);

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trello?" +
                "autoReconnect=true&useSSL=false", "root", "");

       PreparedStatement preparedStatement = connection.prepareStatement("Select * from Users where username = ? " +
               "or email = ?");
       preparedStatement.setString(1, userName);
       preparedStatement.setString(2, email);
       ResultSet resultSet = preparedStatement.executeQuery();
       boolean isRegistered = false;
       if(resultSet.next()){
           JOptionPane.showMessageDialog(null, "This User Name or Email has Been" +
                           " Chosen Before" ,"Sign-Up page",JOptionPane.INFORMATION_MESSAGE);
           return null;
       }
       else {
           PreparedStatement preparedStatement2 = connection.prepareStatement("Insert into Users values(?, ?, ?, ?, ?)");
           preparedStatement2.setString(1, userName);
           preparedStatement2.setString(2, passWord);
           preparedStatement2.setString(3, email);
           preparedStatement2.setString(4, fullName);
           preparedStatement2.setString(5, "");
           preparedStatement2.executeUpdate();
           User newUser = new User(fullName ,userName ,passWord, email);
           JOptionPane.showMessageDialog(null, "Your Account Was Registered " +
                   "Successfully" ,"Sign-Up page",JOptionPane.INFORMATION_MESSAGE);
           return newUser;
       }

    }

}