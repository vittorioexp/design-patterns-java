package RepositoryPattern.Ex1;

/*

 DAO Pattern, is an abstraction of data persistence and is considered closer
 to the underlying storage, which is often table-centric.

 */

public interface UserDao {
    void create(User user);
    User read(long id);
    void update(User user);
    void delete(String userName);
}