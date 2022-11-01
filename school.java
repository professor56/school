import java.util.*;;
public class school {
    public static void main(String[] args) {
        student();
    }
    public static void student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("School admission form ");
        System.out.println();
        System.out.println("Enter the your full name");
        String nb =sc.next();
        System.out.println("Enter the your age");
        int g=sc.nextInt();
        Random up=new Random();
        int id=up.nextInt(000000,999999);
        System.out.println("Enter the parent phone number");
        long pn=sc.nextLong();
        System.out.println("Enter the mother name");
        String mom=sc.next();
        System.out.println("Enter the father name");
        String fn=sc.next();
        System.out.println("Enter the gender");
        String hn=sc.next();
        System.out.println();
        System.out.println("Name: "+nb);
        System.out.println("Age: "+g);
        System.out.println("Phone Number: "+pn);
        System.out.println("Mother Name: "+mom);
        System.out.println("Father Name: "+fn);
        System.out.println("Your Gender: "+hn);
        System.out.println("Your id number: "+id);


    }
}
