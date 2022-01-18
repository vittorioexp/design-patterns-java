package RepositoryPattern.Ex1;

/*

Repository is a mechanism for encapsulating storage, retrieval,
and search behavior, which emulates a collection of objects.
It mediates between the domain and data mapping layers using
a collection-like interface for accessing domain objects.

 */

public interface UserRepository {
    User get(Long id);
    void add(User user);
    void update(User user);
    void remove(User user);
}