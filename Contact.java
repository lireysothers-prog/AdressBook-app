public class Contact {
    private int id;
    private String fullName;
    private String number;
    private String email;
    private String post;
    private String birthdate;

    public Contact(int id, String fullName, String post, String birthdate, String number, String email) {
        this.id = id;
        this.fullName = fullName;
        this.post = post;
        this.birthdate = birthdate;
        this.number = number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}