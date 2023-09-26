package com.healthscript;
import java.util.Date;

//TODO: excluir
public class User {
    private int id;
    private String name;
    private String gender;
    private Date birthDate;
    private String login;
    private String password;
    private int type;
    private Date createdAt;
    private Date updatedAt;

    private void createUser(User user){
        this.name = user.name;
        System.out.print(this.name + this.gender);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {
        User user = new User();
        user.gender = "Female";
        user.name = "José Reinaldo";
        user.createUser(user);
    }
}
