package solid.lesson5_DIP;

//High level class

public class LoginManager {
    Authentificator authentificator;

    public void login(Authentificator authentificator) {
        this.authentificator = authentificator;
    }

    public void login(User user) {
        authentificator.auth(user);
    }
}
