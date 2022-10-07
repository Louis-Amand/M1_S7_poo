import java.util.Calendar;
import java.util.Date;

/**
 * The type Deadline.
 */
public class Deadline implements IDeadline {
    private Date date;

    /**
     * Instantiates a new Deadline.
     *
     * @param date the date
     */
    public Deadline(Date date) {
        this.date = date;
    }

    /**
     * Instantiates a new Deadline.
     *
     * @param days the days
     */
    public Deadline(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, days);
        this.date = calendar.getTime();
    }

    private void setDeadLine(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, days);
        this.date = calendar.getTime();
    }

    @Override
    public boolean expired() {
        if(this.date.before(Calendar.getInstance().getTime())){
            return true;
        }
        {
            return false;
        }
    }
}
