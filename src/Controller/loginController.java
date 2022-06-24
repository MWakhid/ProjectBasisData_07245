package Controller;

public class loginController {
    public int login(String email, String password){
        int log = allobjectcontroller.login.cekLogin(email, password);
        return log;
    }

    public int logindosen(String email, String password){
        int log = allobjectcontroller.login.cekLogindosen(email, password);
        return log;
    }
}