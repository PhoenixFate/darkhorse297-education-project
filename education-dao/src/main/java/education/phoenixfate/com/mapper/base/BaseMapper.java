package education.phoenixfate.com.mapper.base;

public interface BaseMapper<T> {

    T findById(Integer id);

    T findById(String id);

    int update(T t);

    int insert(T t);

    int deleteById(Integer id);

    int deleteById(String id);

}
