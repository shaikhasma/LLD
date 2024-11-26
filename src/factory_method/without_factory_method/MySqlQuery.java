package factory_method.without_factory_method;

public class MySqlQuery implements Query {
    @Override
    public MySqlQuery getQuery() {
        return null;
    }
}
