import java.util.Scanner;

public class GradeAverage  {
    public static void main(String[] args) {
        int math , physics , chemical , biology , turkish , music ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Your Math score : ");
        math = inp.nextInt();

        System.out.print("Your Physics score : ");
        physics = inp.nextInt();

        System.out.print("Your Chemical score : ");
        chemical = inp.nextInt();

        System.out.print("Your Biology score : ");
        biology = inp.nextInt();

        System.out.print("Your Turkish score : ");
        turkish = inp.nextInt();

        System.out.print("Your Music score : ");
        music = inp.nextInt();

        int total = (math + physics + chemical + biology + turkish + music );
        double result = (total/6);

        System.out.println("Your average score is : " + result);

        if (result >= 60){
            System.out.println("Passed the class");
        }

        else if (result < 60){
            System.out.println("Failed the class");
        }


    }
}
