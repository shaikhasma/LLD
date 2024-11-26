package factory_method.without_factory_method;

import static factory_method.without_factory_method.DatabaseType.MYSQL;
import static factory_method.without_factory_method.DatabaseType.POSTGRESQL;
public class UserService {
    Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void createUser(){
        Query query;
        if(MYSQL.equals(database.getDatabaseType())){
            query = new MySqlQuery();
        } else if(POSTGRESQL.equals(database.getDatabaseType())){
            query = new PostgresQuery();
        }
    }



}
