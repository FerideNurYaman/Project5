package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;

public class AbcUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı eklendi: " + user.getName());
    }

    @Override
    public void delete(User user) {

    }
}
