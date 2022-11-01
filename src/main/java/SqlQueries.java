public class SqlQueries {
    public final static String CREATE_TABLE = """
            CREATE TABLE IF NOT EXISTS user(
            id int PRIMARY KEY AUTO_INCREMENT,
            first_name varchar(50),
            last_name varchar(50),
            age int)
            """;
    public final static String INSERT_USERS = """
            INSERT INTO user(first_name, last_name, age) VALUES (?, ? ,?)
            """;

    public static final String SELECT_ALL_USERS = """
            SELECT * FROM user
            """;

    public static final String SELECT_ALL_USERS_BETWEEN_18_60 = """
            SELECT * FROM user WHERE age BETWEEN 18 AND 60
            """;

    public static final String USERS_UNDER_EIGHTEEN = """
            SELECT * FROM user WHERE age<=18
            """;

    public static final String USERS_WHOSE_NAME_WIDTH_O = """
            SELECT * FROM user WHERE first_name LIKE '%o'
            """;

    public static final String NUMBER_USERS_WHOSE_NAME_CONTAINS_LETTER_A = """
            SELECT * FROM user WHERE LOWER(first_name) LIKE '%a%'
            """;
    public static final String NUMBER_OF_ADULT_USERS = """
            SELECT * FROM user WHERE age>=18
            """;
}
