package com.healthscript.beans;
import java.util.Date;
import java.util.UUID;
import java.time.LocalDateTime;

public class UserBean {
    private UUID id;
    private String name;
    private String gender;
    private String birthDate;
    private String login;
    private String password;
    private int type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //FIXME: o contrutor deveria ser vazio por ser bean?

    //TODO: talvez o construtor seja inutil depois da existencia das funções de scanner (não lembro mais o pq)
    public UserBean(String name, String gender, String birthDate, String login, String password, int type){
        this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.login =  login;
        this.password = password;
        this.type = type;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
