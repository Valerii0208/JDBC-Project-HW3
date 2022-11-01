import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DbConnection dbConnection = new DbConnection();
        dbConnection.connectDataBase();
        CreateTable table = new CreateTable();
        table.createTable();
        AddUsersInTable addUsersInTable = new AddUsersInTable();
        addUsersInTable.addUsers();

        UsersImpl userImpl = new UsersImpl();
        userImpl.allUsers().forEach(System.out::println);
        userImpl.usersUnderEighteen().forEach(System.out::println);
        userImpl.usersBetweenTheAgesEighteenAndSixty().forEach(System.out::println);
        userImpl.usersWhoseNameWidthO().forEach(System.out::println);
        System.out.println("NUMBER OF USERS WIDTH LATTER A IN THEIR NAME: " + userImpl.numberOfUsersWidthALatterAinTheirName());
        System.out.println("NUMBER OF ADULT USERS: " + userImpl.numberOfTheAdultUsers());

        try {
            DbConnection.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
