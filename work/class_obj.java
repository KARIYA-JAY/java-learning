import java.util.Scanner;

public class class_obj {
    public static void main(String[] args) {


        student s1 = new student();
       
        s1.setdata(20,50,10,40);
        s1.avg_marks();
    //    int jk = s1.avg;
    //    System.out.println(jk);
        
    }
    
}
class student
{
    String name ;
    String branch;
    long enroll_no;
    int maths;
    int scince;
    int bio;
    int ss;
    int avg ;

    void avg_marks()
    {
        avg = maths + scince +bio+ss ;
        avg /= 4;
        if(avg>=40)
        {
             System.out.println("average of mark is : "+avg);
        }
        else
        {
            System.out.println("Student is Failed and avg is :"+avg);
        }

    }

    void setdata(int m ,int s,int bi,int so)
    {
        System.out.println("Enter name of Student :");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();

        System.out.println("Enter your branch :");
        Scanner s2 = new Scanner(System.in);
        String branch = s2.nextLine();
       
        System.out.println("Enter your Enrollment_number :");
        Scanner s3 = new Scanner(System.in);
        long  enroll_no= s3.nextLong();
      
        maths = m;
        scince = s;
        bio = bi;
        ss = so;
        System.out.println("Name :"+name);
        System.out.println("branch :"+branch);
        System.out.println("Enrollment Number : "+enroll_no);
    }

}
