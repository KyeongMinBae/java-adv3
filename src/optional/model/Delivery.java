package optional.model;

public class Delivery {
    private String status;
    private boolean cancled;

    public Delivery(String status, boolean cancled) {
        this.status = status;
        this.cancled = cancled;
    }

    public String getStatus() {
        return status;
    }

    public boolean isCancled() {
        return cancled;
    }
}
