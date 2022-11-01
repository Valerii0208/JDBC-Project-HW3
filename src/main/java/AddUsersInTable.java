import lombok.SneakyThrows;

public class AddUsersInTable {
    @SneakyThrows
    public void addUsers () {
        var preparedStatement = DbConnection.connection.prepareStatement(SqlQueries.INSERT_USERS);
        preparedStatement.setString(1, "John");
        preparedStatement.setString(2, "Dillinger");
        preparedStatement.setInt(3, 22);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Jonny");
        preparedStatement.setString(2, "Driter");
        preparedStatement.setInt(3, 15);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Katty");
        preparedStatement.setString(2, "Terry");
        preparedStatement.setInt(3, 28);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Harold");
        preparedStatement.setString(2, "Denny");
        preparedStatement.setInt(3, 22);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Timbo");
        preparedStatement.setString(2, "Dryzer");
        preparedStatement.setInt(3, 13);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Trello");
        preparedStatement.setString(2, "Trinch");
        preparedStatement.setInt(3, 82);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Matteo");
        preparedStatement.setString(2, "Perry");
        preparedStatement.setInt(3, 32);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Tom");
        preparedStatement.setString(2, "Aksel");
        preparedStatement.setInt(3, 7);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Tippo");
        preparedStatement.setString(2, "Dill");
        preparedStatement.setInt(3, 48);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Jerry");
        preparedStatement.setString(2, "Tom");
        preparedStatement.setInt(3, 17);
        preparedStatement.executeUpdate();
    }
}
