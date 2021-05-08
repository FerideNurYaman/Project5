package nLayeredDemo.core;

import nLayeredDemo.JGoogle.JGoogleService;
import nLayeredDemo.entities.concretes.User;

public class JGoogleManagerAdapter implements GoogleService {

    @Override
    public void addGoogle(User user) {
    JGoogleService service = new JGoogleService();
    service.addGoogle(user);

    }

}
