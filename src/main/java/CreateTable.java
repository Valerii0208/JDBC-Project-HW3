import lombok.SneakyThrows;

public class CreateTable {
    @SneakyThrows
    public void createTable() {
        var statement = DbConnection.connection.createStatement();
        statement.execute(SqlQueries.CREATE_TABLE);
    }
}
