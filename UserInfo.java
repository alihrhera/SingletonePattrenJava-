
public class UserInfo {
    private String username ;
    private String phonenumber;
    private int age;



    public static  synchronized UserInfo getInstance(){
        if (obj==null){
            obj=new UserInfo();
        }
        return obj;
    }

    private static UserInfo obj;

    private UserInfo(){

    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
