package com.healthscript.beans;
import java.util.Arrays;

//TODO: verificar qual seria a maneira correta de dividir as função entre o bean e o dao do storage
public class StorageBean {
    UserBean [] users;

    public void setUsers(UserBean user) {
        System.out.println("teste -> " + user.getName() + user.getBirthDate());
        //os valores estão chegando aqui

        //aqui provavelmente está errado e vai somente sobrepor
        UserBean[] usersStorage = new UserBean[1];
        usersStorage = Arrays.copyOf(usersStorage, usersStorage.length + 1);
        usersStorage[usersStorage.length - 1] = user;
        this.users = usersStorage;
    }

    public UserBean[] getUsers() {
        System.out.println(Arrays.toString(this.users));
        return users;
    }
}

