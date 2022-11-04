import java.util.ArrayList;

public interface UsersRepository {
    ArrayList<User> allUsers();
    ArrayList<User> usersUnderEighteen();
    ArrayList<User> usersWhoseNameWidthO();
    ArrayList<User> usersBetweenTheAgesEighteenAndSixty();
    int numberOfUsersWidthALatterAinTheirName();
    int numberOfTheAdultUsers();
}
