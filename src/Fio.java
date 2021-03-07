import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fio {
    public static void main(String[] args) {


        // String FIO = "Фёдоров Дмитрий Петрович";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ФИО!");
        String FIO = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(FIO);
        if (FIO.equals("0") || FIO.equals(" ") || FIO.equals("") || FIO.equals(null) || matcher.find()
                || FIO.split(" ").length == 1 || FIO.split(" ").length == 2) {
            System.out.println("Неправильно!");
        } else {
            int F = FIO.indexOf(" ");
            String str4 = FIO.substring(0, F).trim();

            int FN = FIO.lastIndexOf(" ");
            String str5 = FIO.substring(F, FN).trim();

            int LN = FIO.lastIndexOf(" ");
            String str6 = FIO.substring(LN);

            System.out.println("Фамилия: " + str4 + " \nИмя: " + str5 + "\nОтчество: " + str6);

        }
    }
}
