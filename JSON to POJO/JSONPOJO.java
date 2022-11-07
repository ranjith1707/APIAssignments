package apiconnection;

public class JSONPOJO {
   private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
    public JSONPOJO(){

    }

    public JSONPOJO(String last_name,int id,String avatar, String first_name, String email) {
        this.last_name=last_name;
        this.id=id;
        this.email=email;
        this.first_name=first_name;
        this.avatar=avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void printData() {
        System.out.println("id : "+getId()+"\n First Name : "+getFirst_name()+"\n Last Name"+getLast_name()+"\n EMail : "+getEmail()+" \n Avatar  : "+getAvatar());
    }
}
