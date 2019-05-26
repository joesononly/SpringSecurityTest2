package www.mapper;

import java.util.List;

public interface BaseMapper<T> {
    public void insert(T data);

    public void delete(T data);

    public List<T> select(T data);

    public void update(T data);
}
