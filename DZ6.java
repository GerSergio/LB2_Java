import java.util.Scanner;
import java.util.regex.*;
public class DZ6 {

    public static void main(String[] args){
        System.out.println("Введите пароль");
        Scanner sc = new Scanner(System.in);
        Pattern p0 = Pattern.compile("^[A-Za-z0-9_]{8,}$");
        Pattern p1 = Pattern.compile("[A-Z]");
        Pattern p2 = Pattern.compile("[a-z]");
        Pattern p3 = Pattern.compile("[0-9]");
        while (true) {
            String pass = sc.nextLine();
            Matcher m0 = p0.matcher(pass);
            Matcher m1 = p1.matcher(pass);
            Matcher m2 = p2.matcher(pass);
            Matcher m3 = p3.matcher(pass);
            if (m0.matches() & m1.find() & m2.find() & m3.find()) {
                System.out.println("Пароль соответствует критериям и надежен. ");
                break;
            } else {
                System.out.println("Пароль не соответствует критериям и ненадежен. ");
                System.out.println("Повторите ввод пароля.");
            }
        }
    }
}