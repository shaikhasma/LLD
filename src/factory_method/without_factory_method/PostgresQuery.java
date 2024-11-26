package factory_method.without_factory_method;

public class PostgresQuery implements Query{
    @Override
    public PostgresQuery getQuery() {
        return null;
    }
}
