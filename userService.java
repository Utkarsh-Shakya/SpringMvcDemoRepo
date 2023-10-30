import java.util.List;

public interface UserService {

    void createUser(User user);

    User getUserById(Long userId);

    void updateUser(User updatedUser);

    void deleteUser(Long userId);

    List<User> getAllUsers();
}
