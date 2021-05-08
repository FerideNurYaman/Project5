package nLayeredDemo.JConfirmate.concretes;

import nLayeredDemo.JConfirmate.abstracts.Confirmate;
import nLayeredDemo.entities.concretes.User;

public class EmailConfirmate implements Confirmate {
    @Override
    public void validate(User user) {
    System.out.println("Kullanıcı Doğrulandı");
    }
}
