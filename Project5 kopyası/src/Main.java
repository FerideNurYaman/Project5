import nLayeredDemo.JConfirmate.concretes.EmailConfirmate;
import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.business.concretes.UserManager;
import nLayeredDemo.core.JGoogleManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcUserDao;
import nLayeredDemo.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new AbcUserDao(), new EmailConfirmate(), new JGoogleManagerAdapter());
        User user = new User("Feride","Yaman","feride26","adminadmin");
        userService.add(user);
    }
}
