import java.util.ArrayList;

public interface UsersRepository {
    ArrayList<Object> allUsers();
    ArrayList<Object> usersUnderEighteen();
    ArrayList<Object> usersWhoseNameWidthO();
    ArrayList<Object> usersBetweenTheAgesEighteenAndSixty();
    int numberOfUsersWidthALatterAinTheirName();
    int numberOfTheAdultUsers();
}
