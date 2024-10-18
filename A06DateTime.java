import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class DateTimeManager {

    public void displayCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formatted = currentDateTime.format(formatter);

        System.out.println("Date Time: " + formatted);
    }

    public void calculateAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);

        System.out.println("Age: " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days.");
    }

    public void addDurationToCurrentDate(long num, String type) {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate;

        if (type == null) {
            System.err.println("Error: Invalid duration type.");
            return;
        }

        switch (type) {
            case "days" -> futureDate = currentDate.plusDays(num);
            case "months" -> futureDate = currentDate.plusMonths(num);
            case "years" -> futureDate = currentDate.plusYears(num);
            default -> {
                System.err.println("Error: Unknown duration type.");
                return;
            }
        }

        System.out.println("Future date: " + futureDate);
    }

    public void calculateDifferenceBetweenDates(LocalDate start, LocalDate end) {
        Period diff = Period.between(start, end);

        System.out.println("Difference between " + start + " and " + end + ": " 
                           + diff.getYears() + " years, " 
                           + diff.getMonths() + " months, and " 
                           + diff.getDays() + " days.");
    }

    public void parseDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);

        System.out.println("Parsed Date: " + date);
    }

    public void displayTimeZoneDateTime(String timeZone) {
        ZonedDateTime timeZoneNow = ZonedDateTime.now(ZoneId.of(timeZone));
        System.out.println("Date and Time in " + timeZone + ": " + timeZoneNow);
    }
}

public class A06DateTime {
    public static void main(String[] args) {
        DateTimeManager dtManager = new DateTimeManager();

        // Get current date and time
        dtManager.displayCurrentDateTime();

        // Calculate age
        dtManager.calculateAge(LocalDate.of(1995, 5, 23)); // Example birthday

        // Add 15 days to current date
        dtManager.addDurationToCurrentDate(15, "days");

        // Difference between two dates
        dtManager.calculateDifferenceBetweenDates(LocalDate.of(2020, 1, 1), LocalDate.of(2023, 10, 14));

        // Parse date from string (Adjusted to match the formatter "dd-MM-yyyy")
        dtManager.parseDate("14-10-2024");

        // Display current date and time in different time zones
        dtManager.displayTimeZoneDateTime("Europe/London");
    }
}
