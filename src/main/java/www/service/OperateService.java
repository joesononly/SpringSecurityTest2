package www.service;

import java.util.List;

/*
* Created by:joeson
* Created:20190517
* Comment:DAO操作的接口
* */
public interface OperateService<T> {

    public void insert(T data);

    public void delete(T data);

    public void update(T data);

    public List<T> select(T object);
}
