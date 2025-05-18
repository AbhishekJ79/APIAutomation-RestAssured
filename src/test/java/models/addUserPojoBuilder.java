package models;

public class addUserPojoBuilder {

    //builder design pattern
    //with the help of builder design pattern we can assign the values in any order
    private String title;
    private String userId;
    private String name;
    private String surname;
    private String country;

    public addUserPojoBuilder(String userId, String title, String name, String surname, String country) {
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

    // create inner class static
    public static class Builder {
        private String title;
        private String userId;
        private String name;
        private String surname;
        private String country;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

  // return the object of the outer class
        // this is the main point of builder design pattern
        // we are returning the object of outer class
        // so that we can call the methods in any order
        // and at last we can call the build method to get the object of outer class

      public addUserPojoBuilder build() {
          return new addUserPojoBuilder(userId, title, name, surname, country);
        }
    }
}
