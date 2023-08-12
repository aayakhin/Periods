import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String[] inputDate = scanner.nextLine().split(" ");
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(inputDate[0], formatter);
        LocalDate end = LocalDate.parse(inputDate[1], formatter);

        List<String> periods;
        periods=PeriodsBetween.get(start, end, type);

        System.out.println(periods.size());
        for (String x: periods){
            System.out.println(x);
        }
    }
}
