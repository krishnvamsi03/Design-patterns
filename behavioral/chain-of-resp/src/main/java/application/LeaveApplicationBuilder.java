package application;

import java.time.LocalDate;
import java.util.Date;

public class LeaveApplicationBuilder {

    private LeaveApplication.Type type;

    private LeaveApplication.Status status = LeaveApplication.Status.PENDING;

    private LocalDate from;

    private LocalDate to;

    private String approver;

    public LeaveApplicationBuilder withFrom(LocalDate date) {
        this.from = date;
        return this;
    }

    public LeaveApplicationBuilder withTo(LocalDate date) {
        this.to = date;
        return this;
    }

    public LeaveApplicationBuilder withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    public LeaveApplicationBuilder withType(LeaveApplication.Type type) {
        this.type = type;
        return this;
    }

    public LeaveApplication build() {
        return new LeaveApplication(from, to, approver, type, status);
    }
}
