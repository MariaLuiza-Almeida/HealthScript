package com.healthscript.dao;
import com.healthscript.beans.UserBean;

public class UserDao {
    public void createUser(UserBean user){
        //TODO: aqui, precisa ter uma classe que vai fazer o papel de storage
        //TODO: precisamos também ter um método de scanner, que pega os valores escritos na tela pelo usuário
        System.out.println("------>" + user.getName());
    }
}
