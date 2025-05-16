package models;

public class addUserPojo {
    // POJO class for adding a user

    private String title;
    private String userId;
    private String name;
    private String surname;
    private String country;

    public addUserPojo(String userId, String title, String name, String surname, String country) {
        this.userId = userId;
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "addUserPojo{" +
                "title='" + title + '\'' +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
