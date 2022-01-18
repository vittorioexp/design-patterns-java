package RepositoryPattern.Ex1;

public class UserDaoImpl implements UserDao {
    private final FakeEntityManager entityManager;

    public UserDaoImpl(FakeEntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String userName) {

    }

    @Override
    public User read(long id) {
        return entityManager.find(User.class, id);
    }

}