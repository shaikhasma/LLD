package factory_method;

public class UserService {
    Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void createUser(){
        Query query = database.createQuery();
    }
}
