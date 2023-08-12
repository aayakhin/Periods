import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class PeriodsBetween {

    public static List<String> get(LocalDate start, LocalDate end, String type) {
        LocalDate endPeriod;
        List<String> result = new ArrayList<>();
        if (type.equals("WEEK")) {
            while (start.isBefore(end) || start.equals(end)) {
                endPeriod = start.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
                if (endPeriod.isBefore(end))
                    result.add(start + " " + endPeriod);
                else result.add(start + " " + end);
                start = endPeriod.plusDays(1);
            }
        }
        if (type.equals("MONTH")) {
            while (start.isBefore(end) || start.equals(end)) {
                endPeriod = start.with(TemporalAdjusters.lastDayOfMonth());
                if (endPeriod.isBefore(end))
                    result.add(start + " " + endPeriod);
                else result.add(start + " " + end);
                start = endPeriod.plusDays(1);
            }
        }
        if (type.equals("QUARTER")){
            while (start.isBefore(end) || start.equals(end)) {
                int quarter;
                if (start.getMonthValue() % 3 == 0)
                    quarter = start.getMonthValue() / 3;
                else
                    quarter = start.getMonthValue() / 3 + 1;
                endPeriod = start.with(TemporalAdjusters.lastDayOfMonth()).withMonth(quarter * 3);
                if (endPeriod.isBefore(end))
                    result.add(start + " " + endPeriod);
                else result.add(start + " " + end);

                start = endPeriod.plusDays(1);
            }
        }
        if (type.equals("YEAR")){
            while (start.isBefore(end) || start.equals(end)) {
                endPeriod = start.with(TemporalAdjusters.lastDayOfYear());
                if (endPeriod.isBefore(end))
                    result.add(start + " " + endPeriod);
                else result.add(start + " " + end);
                start = endPeriod.plusDays(1);
            }
        }
        if (type.equals("REVIEW")) {
            while (start.isBefore(end) || start.equals(end)) {
                if (start.getMonthValue() <= 9)
                    endPeriod = start.with(TemporalAdjusters.lastDayOfMonth()).withMonth(9);
                else
                    endPeriod = start.with(TemporalAdjusters.lastDayOfMonth()).withMonth(3).plusYears(1);
                if (endPeriod.isBefore(end))
                    result.add(start + " " + endPeriod);
                else result.add(start + " " + end);
                start = endPeriod.plusDays(1);
            }
        }
        return result;
    }
}
