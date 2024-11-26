package factory_method;

import static factory_method.DatabaseType.POSTGRESQL;

public class Postgres implements Database {
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostName() {

    }

    @Override
    public DatabaseType getDatabaseType() {
        return POSTGRESQL;
    }

    @Override
    public Query createQuery() {
        return null;
    }
}
