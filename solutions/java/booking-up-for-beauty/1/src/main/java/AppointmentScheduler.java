import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/d/y H:m:s");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        if (appointmentDate.isBefore(LocalDateTime.now())){
            return true;
        } else return false;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int time = appointmentDate.getHour();

        if (time >= 12 && time < 18){
            return true;
        } else return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, yyyy, 'at' h:mm a.").format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        int year = LocalDateTime.now().getYear();
        int month = 9;
        int day = 15;
        return LocalDate.of(year, month, day);
    }
}
