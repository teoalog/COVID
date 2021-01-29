package covid;

public class Eody {

    /* Single instance of Eody. */
    private static final Eody instance = new Eody();
    private static int totalcases;

    private Eody() {
        totalcases = 0;
    }

    /* Return the single instance of Eody. */
    public static Eody getInstance() {
        return instance;
    }

    public int getTotalcases() {
        return totalcases;
    }

    /* This method increases the number of total cases when a new case is entered. */
    public void addCaseToEody() {
        totalcases = totalcases + 1;
    }
}
