package com.healthscript.dao;
import com.healthscript.beans.StorageBean;
import com.healthscript.beans.UserBean;

//aqui ta confltuoso onde o que deve ser declarado. realmente essa declaração de storage deveria estar aqui?
public class UserDao {
    public void createUser(UserBean user){
        //TODO: aqui, precisa ter uma classe que vai fazer o papel de storage
        //TODO: precisamos também ter um método de scanner, que pega os valores escritos na tela pelo usuário
        StorageBean usersStorage = new StorageBean();
        usersStorage.setUsers(user);
        usersStorage.getUsers();
    }
}
