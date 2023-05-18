import java.lang.reflect.Array;
import java.util.ArrayList;

public class Credenziali {

    String mail;
    String password;
    String otp;

    ArrayList<Credenziali> listaCredenziali = new ArrayList<>();

    public Credenziali(String mail, String password, String opt){
        this.mail = mail;
        this.password = password;
        this.otp = otp;
    }

}
