package Human;

public class Human {
    String fName;
    String lName;
    int age;
    String gender;
    String nickName;
    Boolean graduated;
    public Human(String fName, String lName, int age, String gender, String nickName, Boolean graduated){
        this.fName=fName;
        this.lName=lName;
        this.age=age;
        this.gender=gender;
        this.nickName=nickName;
        this.graduated=graduated;
    }
    public Human(String fName,String lName,int age,String gender,Boolean graduated){
        this.fName=fName;
        this.lName=lName;
        this.age=age;
        this.gender=gender;
        this.nickName="oops";
        this.graduated=graduated;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }
    public void greet(){
        System.out.println("Hi,My name is "+this.fName);
    }
    public boolean isGraduated(){
        return this.graduated;
    }

}
