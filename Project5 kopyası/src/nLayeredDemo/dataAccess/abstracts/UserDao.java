package nLayeredDemo.dataAccess.abstracts;
import nLayeredDemo.entities.concretes.User;
public interface UserDao {
   void add(User user);
   void delete(User user);
}
