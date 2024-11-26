package factory_method.without_factory_method;

public class PostgresDatabase implements Database{
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostName() {

    }

    @Override
    public Database getDatabaseType() {
        return new PostgresDatabase();
    }
}
