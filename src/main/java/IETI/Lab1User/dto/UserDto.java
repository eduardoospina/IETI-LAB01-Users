package IETI.Lab1User.dto;

public class UserDto {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private String createdAt;

    public UserDto(String id, String name, String email, String lastName, String createdAt){
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public String getid() {
        return id;
    }

    public void setid(String name) {
        this.id = id;
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

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt(){
        return createdAt;
    }
}
