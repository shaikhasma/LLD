package factory_method.without_factory_method;

public interface Database {
    void setUrl();
    void getHostName();

    Database getDatabaseType();
}
