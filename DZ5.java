import java.util.regex.*;
import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате dd/mm/yyyy: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Pattern p1 = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
        Pattern p2 = Pattern.compile("\\d{2}");
        Pattern mt31 = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19\\d{2}|[2-9]\\d{3})$");
        Pattern mt30 = Pattern.compile("^(0[1-9]|[12][0-9]|30)/(0[1-9]|1[012])/(19\\d{2}|[2-9]\\d{3})$");
        Pattern mt29 = Pattern.compile("^(0[1-9]|[12][0-9])/(02)/(19\\d{2}|[2-9]\\d{3})$");
        Pattern mt28 = Pattern.compile("^(0[1-9]|[12][0-8])/(02)/(19\\d{2}|[2-9]\\d{3})$");
        Matcher m1 = p1.matcher(text);
        Matcher m2 = p2.matcher(text);
        Matcher m31 = mt31.matcher(text);
        Matcher m30 = mt30.matcher(text);
        Matcher m29 = mt29.matcher(text);
        Matcher m28 = mt28.matcher(text);
        String mt = "", year = "";
        if (!m1.matches()){
            System.out.println("Выражение не соответствует формату dd/mm/yyyy");
        }
        else {
            if (m31.matches()) {
                int count = 1;
                while (m2.find()) {
                    if (count == 2) {
                        mt = m2.group();
                    }
                    if (count == 3 || count == 4) {
                        year = year + m2.group();
                    }
                    count++;
                }
            }
            switch (mt) {
                case "01", "03", "05", "07", "08", "10", "12":
                    if (!m31.matches()) {
                        System.out.println("Выражение не является датой");
                    } else {
                        System.out.println("Выражение не является датой");
                    }
                    break;
                case "04", "06", "09", "11":
                    if (!m30.matches()) {
                        System.out.println("Выражение не является датой");
                    } else {
                        System.out.println("Выражение не является датой");
                    }
                    break;
                case "02":
                    if (Integer.parseInt(year) % 4 == 0) {
                        if (!m29.matches()) {
                            System.out.println("Выражение не является датой");
                        } else {
                            System.out.println("Выражение не является датой");
                        }
                    }
                    else {
                        if (!m28.matches()) {
                            System.out.println("Выражение не является датой");
                        } else {
                            System.out.println("Выражение не является датой");
                        }
                    }
                    break;
                default:
                    System.out.println("Выражение не является датой");
            }
        }

    }
}
