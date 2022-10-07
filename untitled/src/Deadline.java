import java.util.Date;

public class Deadline implements IDeadline{

    private Date date;

    public Deadline(Date date) {
        this.date = date;
    }

    public Deadline(int days) {
        // TODO Je ne sais pas quoi mettre dans ce constructeur
        // via calandar getInstanceCalandar
    }

    private void setDeadLine(int days){
        // TODO Je ne sais pas quoi mettre dans ce setter
    }

    @Override
    public boolean expired() {
        return false;
    }
}
