import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class LastSeen {
    enum Date { Years, Months, Days, Hours, Minutes, Seconds   }
    public String getLastSeenStatus(String user, String lastSeen){
        LocalDateTime parsedLastSeen = LocalDateTime.parse(lastSeen, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        Map<Date, Integer> dateTimeDifference = getDateAndTimeDifferenceWithCurrentTime(parsedLastSeen);
        for(Date date : Date.values())
            if(dateTimeDifference.get(date) > 0)
                return user + " was online "+ dateTimeDifference.get(date) + " " + date + " ago";
        return user + " is online";    }

    private Map<Date, Integer> getDateAndTimeDifferenceWithCurrentTime(LocalDateTime parsedLastSeen){
        Map<Date, Integer> dateTimeDifference = new HashMap();
        LocalDateTime now = LocalDateTime.now();
        Period period = Period.between(parsedLastSeen.toLocalDate(), now.toLocalDate());
        Duration duration = Duration.between(parsedLastSeen, now);
        dateTimeDifference.put(Date.Years, period.getYears());
        dateTimeDifference.put(Date.Months, period.getMonths());
        dateTimeDifference.put(Date.Days, period.getDays());
        dateTimeDifference.put(Date.Hours, duration.toHoursPart());
        dateTimeDifference.put(Date.Minutes, duration.toMinutesPart());
        dateTimeDifference.put(Date.Seconds, duration.toSecondsPart());
        return dateTimeDifference;    }}