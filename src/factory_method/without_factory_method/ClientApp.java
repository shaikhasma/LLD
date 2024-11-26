package factory_method.without_factory_method;

public class ClientApp {
    public static void main(String[] args) {
        UserService userService = new UserService(new MySqlDatabase());
        userService.createUser();
    }
}
