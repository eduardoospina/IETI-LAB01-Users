package IETI.Lab1User.dto;

import java.time.LocalDate;

public class UserDto {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private String createdAt;

    public UserDto(String name, String email, String lastName){
        this.id = String.valueOf((int)(Math.random()*9));;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = LocalDate.now().toString();
    }

    public String getid() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getCreatedAt(){
        return createdAt;
    }
}
