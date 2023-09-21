import com.healthscript.beans.UserBean;
import com.healthscript.dao.UserDao;



public class Main {
    public static void main(String[] args) {
        //aqui eu chamo a instancia do user dao
        UserDao userDao = new UserDao();

        //aqui eu tenho que chamar o contrutor
        UserBean user = new UserBean("Maria", "Female", "22/08/2003", "maria@email.com", "topa", 2);

        //aqui passar a instancia para o DAO
        userDao.createUser(user);
    }
}
