import lombok.SneakyThrows;
import java.util.ArrayList;

public class UsersImpl implements UsersRepository{
    @SneakyThrows
    @Override
    public ArrayList<Object> allUsers() {
        System.out.println("============================================");
        System.out.println("ALL USERS IN TABLE:");
        System.out.println("============================================");

        var statement = DbConnection.connection.createStatement();
        var resultSet = statement.executeQuery(SqlQueries.SELECT_ALL_USERS);
        var allUsersInTable = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirst_name(resultSet.getString("first_name"));
            user.setLast_name(resultSet.getString("last_name"));
            user.setAge(resultSet.getInt("age"));

            allUsersInTable.add(user);
        }

        return allUsersInTable;
    }

    @SneakyThrows
    @Override
    public ArrayList<Object> usersUnderEighteen() {
        System.out.println("============================================");
        System.out.println("USERS UNDER EIGHTEEN: ");
        System.out.println("============================================");

        var statement = DbConnection.connection.createStatement();
        var resultSet = statement.executeQuery(SqlQueries.USERS_UNDER_EIGHTEEN);
        var usersUnderEighteen = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirst_name(resultSet.getString("first_name"));
            user.setLast_name(resultSet.getString("last_name"));
            user.setAge(resultSet.getInt("age"));
            usersUnderEighteen.add(user);
        }

        return usersUnderEighteen;
    }

    @SneakyThrows
    @Override
    public ArrayList<Object> usersWhoseNameWidthO() {
        System.out.println("============================================");
        System.out.println("USERS WHOSE NAME ENDS WIDTH O: ");
        System.out.println("============================================");
        var statement = DbConnection.connection.createStatement();
        var resultSet = statement.executeQuery(SqlQueries.USERS_WHOSE_NAME_WIDTH_O);
        var usersWhoseNameWidthO = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirst_name(resultSet.getString("first_name"));
            user.setLast_name(resultSet.getString("last_name"));
            user.setAge(resultSet.getInt("age"));
            usersWhoseNameWidthO.add(user);
        }

        return usersWhoseNameWidthO;
    }

    @SneakyThrows
    @Override
    public ArrayList<Object> usersBetweenTheAgesEighteenAndSixty() {
        System.out.println("============================================");
        System.out.println("USERS BETWEEN THE AGES 18 - 60: ");
        System.out.println("============================================");

        var statement = DbConnection.connection.createStatement();
        var resultSet = statement.executeQuery(SqlQueries.SELECT_ALL_USERS_BETWEEN_18_60);
        var usersBetweenTheAgesEighteenAndSixty = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirst_name(resultSet.getString("first_name"));
            user.setLast_name(resultSet.getString("last_name"));
            user.setAge(resultSet.getInt("age"));
            usersBetweenTheAgesEighteenAndSixty.add(user);
        }

        return usersBetweenTheAgesEighteenAndSixty;
    }

    @SneakyThrows
    @Override
    public int numberOfUsersWidthALatterAinTheirName() {
        System.out.println("============================================");
        var statement = DbConnection.connection.createStatement();
        var resultSet = statement.executeQuery(SqlQueries.NUMBER_USERS_WHOSE_NAME_CONTAINS_LETTER_A);
        var numberOfUsersWidthALatterAinTheirName = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            numberOfUsersWidthALatterAinTheirName.add(user);
        }

        return numberOfUsersWidthALatterAinTheirName.size();
    }

    @SneakyThrows
    @Override
    public int numberOfTheAdultUsers() {
        var statement = DbConnection.connection.createStatement();
        var resultSet = statement.executeQuery(SqlQueries.NUMBER_OF_ADULT_USERS);
        var numberOfTheAdultUsers = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            numberOfTheAdultUsers.add(user);
        }

        return numberOfTheAdultUsers.size();
    }
}
