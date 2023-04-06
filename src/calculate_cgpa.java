import java.util.Scanner;


public class calculate_cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //to calculate cgpa using marks of three subject
        float math=75;
        float eng=80;
        float ip=90;
        float sum = math+eng+ip;
        float div= sum/100*3;
        System.out.println(div);
 //the code get complited.
    }
}
