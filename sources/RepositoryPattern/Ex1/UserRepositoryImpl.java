package RepositoryPattern.Ex1;

/*

DAO seems a perfect candidate to access the data, and a repository is an ideal way to implement a business use-case.
The implementations of DAO and repository look very similar because the User class is an anemic domain.
And, a repository is just another layer over the data-access layer (DAO).

 */

public class UserRepositoryImpl implements UserRepository {

    // use the UserDaoImpl to send/retrieve data from the database
    private UserDaoImpl userDaoImpl;

    @Override
    public User get(Long id) {
        User user = userDaoImpl.read(id);
        return user;
    }

    @Override
    public void add(User user) {
        userDaoImpl.create(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }

}