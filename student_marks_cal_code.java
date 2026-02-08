import java.util.Scanner;

public class student_marks_cal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your Full Name:");
        String name=in.nextLine();
        System.out.println("Enter your 5 subject marks-->");
        System.out.print("Enter marks of Subject-1:");
        int subj1=in.nextInt();
        System.out.print("Enter marks of Subject-2:");
        int subj2=in.nextInt();
        System.out.print("Enter marks of Subject-3:");
        int subj3=in.nextInt();
        System.out.print("Enter marks of Subject-4:");
        int subj4=in.nextInt();
        System.out.print("Enter marks of Subject-5:");
        int subj5=in.nextInt();
        int marks[]={subj1,subj2,subj3,subj4,subj5};
        int i = 0;
        while (i < marks.length) {
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Error: Invalid marks entered");
                return;  //stop the program if find invalid no.
            }
            i++;
        }
        int total=subj1+subj2+subj3+subj4+subj5; //total of all subj
        double per=(total/500.0)*100;  //for %age fo 5 subj
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("YOUR PERCENTAGE AND GRADE:-");
        System.out.println("Name:"+name);
        System.out.println("Total of 5 subject:"+total);
        System.out.printf("Percentage: %.2f\n",per);
        System.out.print("Your Grade:");
        if(per>=90){
            System.out.print("A+");
        }else if (per>=75) {
            System.out.print("B");
        }else if(per>=60){
            System.out.print("C");
        } else if (per>=40) {
            System.out.print("D");
        } else if (per<40) {
            System.out.print("F");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        in.close();
    }
}
