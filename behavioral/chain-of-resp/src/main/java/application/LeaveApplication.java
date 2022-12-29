package application;

import java.time.LocalDate;
import java.util.Date;

public class LeaveApplication {

    public enum Type {SICK, PT0, SABATICAL}

    public enum Status {APPROVED, PENDING, REJECTED}

    private Type type;

    private Status status;

    private LocalDate from;

    private LocalDate to;

    private String approver;

    public LeaveApplication(LocalDate from, LocalDate to, String approver,
                            Type type,
                            Status status) {
        this.from = from;
        this.to = to;
        this.approver = approver;
        this.type = type;
        this.status = status;
    }

    public int getNoOfDays() {
        return to.getDayOfMonth() - from.getDayOfMonth();
    }

    public Type getType() {
        return type;
    }

    public void updateStatus(String approver, Status status) {
        this.approver = approver;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Leave application from " + from + " to " + to + " status " + status + " by " + approver;
    }

}
