package nLayeredDemo.business.concretes;

import nLayeredDemo.JConfirmate.abstracts.Confirmate;
import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.core.GoogleService;
import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;

public class UserManager implements UserService {
    private UserDao userDao;
    private Confirmate confirmate;
    private GoogleService googleService;

    public UserManager(UserDao userDao, Confirmate confirmate, GoogleService googleService){
        this.userDao = userDao;
        this.confirmate = confirmate;
        this.googleService = googleService;
    }


    @Override
    public void add(User user) {
        if(user.getPassword().length()<6){
            System.out.println("Parola en az 6 karakterden oluşmalıdır.");
        }
        else if (user.getName().length()<2){
            System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır");
            return;
        }
        else if (user.getLastName().length()<2){
            System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır");
            return;
        }
        this.confirmate.validate(user);
        this.googleService.addGoogle(user);
        this.userDao.add(user);

    }
}
