package factory_method;

public interface Database {
    void setUrl();
    void getHostName();

    DatabaseType getDatabaseType();

    /* Factory Method Patter */
    Query createQuery();
}
