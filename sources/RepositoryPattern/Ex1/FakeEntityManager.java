package RepositoryPattern.Ex1;

public class FakeEntityManager {
    public void persist(User user) {
    }

    public User find(Class<User> userClass, long id) {
        return null;
    }
}
