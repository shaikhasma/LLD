package factory_method;

import factory_method.without_factory_method.MySqlDatabase;
import factory_method.without_factory_method.UserService;

public class ClientApp {
    public static void main(String[] args) {
        UserService userService = new UserService(new MySqlDatabase());
    }
}
