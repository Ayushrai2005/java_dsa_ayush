public class static1 {
    public static void main(String[] args) {

        student s1 = new student();
        s1.Schoolname = "JMV";

        student s2 = new student();
        System.out.println(s2.Schoolname);

        student s3 = new student();
        s3.Schoolname = "ABC";
        System.out.println(s2.Schoolname);

    }
}

class student {

    // static function

    static int percentage(int math, int phy, int chem) {

        return (math + phy + chem) / 3;
    }

    String name;
    int rollno;

    // Static variable
    static String Schoolname;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}
