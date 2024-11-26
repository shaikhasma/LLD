package factory_method;

public class MySqlDatabase implements Database {
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostName() {

    }

    @Override
    public DatabaseType getDatabaseType() {
        return  DatabaseType.MYSQL;
    }

    @Override
    public Query createQuery() {
        return null;
    }
}
