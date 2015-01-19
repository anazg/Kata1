
import java.util.Date;

public class Person {

    private final String name;
    private final Date birthday;
    private static final double MILLISECONDS_PER_YEAR = 365.25*24*60*60*1000;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBrithday() {
        return birthday;
    }
    
    public int getAge() {
        Date now = new Date();
        return millisecondsToYears(now.getTime() - birthday.getTime());
    }
    
    private int millisecondsToYears (long milliseconds) {
        return (int) (milliseconds / MILLISECONDS_PER_YEAR);
    
    }
    
}