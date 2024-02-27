public class time {

    public static void main(String[] args) {

        time1 t1 = new time1();
        time1 t2 = new time1();
        time1 t3 = new time1();

        t1.gettime(50, 30, 8);
        t2.gettime(55, 38, 5);

        t2.addtime(t1);
        t2.show();
        
        
        
    }
    
}

class time1{

    int second ;
    int minute ;
    int hour;

    void gettime(int s , int m , int h ){

        second = s;
        minute = m;
        hour = h;
    }

    // time1
    void addtime(time1 t)
    {
          //  time1 temp = new time1();

            // temp.second = second+t.second;
            // temp.minute = minute+t.minute +(temp.second/60);
            // temp.hour = hour + t.hour + (temp.minute/ 60);
            // temp.minute = temp.minute % 60 ;
            // temp.second = temp.second % 60 ;
            second = second+t.second;
            minute = minute+t.minute +(second/60);
            hour = hour + t.hour + (minute/ 60);
            minute = minute % 60 ;
            second = second % 60 ;

           // return temp;

    }

    void show() 
    {
        System.out.println("time is :" +hour+":"+minute+":"+second);
    }   

}


