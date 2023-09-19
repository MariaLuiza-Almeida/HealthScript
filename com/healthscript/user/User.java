package com.healthscript.user;
import java.util.Date;

public class User {
    int id;
    String name;
    String gender;
    Date birthDate;
    String login;
    String password;
    int type;
    Date createdAt;
    Date updatedAt;

    private void createUser(User user){
        System.out.println("parametro -> " + user.name);

    }

    public static void main(String[] args) {
        User user = new User();
        user.gender = "Female";
        user.name = "José Reinaldo";
        user.createUser(user);
    }
}
