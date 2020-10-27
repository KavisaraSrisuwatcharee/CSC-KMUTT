package GradeObj;

class Student {
    int id;
    String name;
    char gender;
    int score;
    char GPA;
    public Student(int id, String name, char gender, int score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public char calGPA(){
        if(score<=100 && score>=80){
            return 'A';
        }else if(score<80 && score>=70){
            return 'B';
        }else if(score<70 && score>=60){
            return 'C';
        }else if(score<60 && score>=50){
            return 'D';
        }else{
           return 'F';
        }
    }
}

class Mains{
    public static void main(String[] args) {
        // DO NOT MODIFY THE DRIVER CLASS
        Student boy = new Student(1133,"Thanaphon",'M',73);
        Student c = new Student(1130, "Sethanant", 'M', 60);
        boy.setName("Thanaphon Sombunkaeo");

        System.out.println(boy.getName());
        System.out.println(boy.getGender());
        System.out.println(boy.calGPA());

        boy.setScore(53);
        System.out.println("After change score : ");
        System.out.println(boy.calGPA());

        System.out.println("----C-----");
        System.out.println(c.getGender());
        System.out.println(c.getId());
        c.setId(230);
        c.setGender('F');
        System.out.println(c.getId());
        System.out.println(c.getScore());
        System.out.println(c.calGPA());
        System.out.println(c.getGender());
    }
}

//if(score<=100 && score>=80){
//
//        }else if(score<80 && score>=70){
//        GPA+='B';
//        }else if(score<70 && score>=60){
//        GPA+='C';
//        }else if(score<60 && score>=50){
//        GPA+='D';
//        }else{
//        GPA+='F';
//        }

