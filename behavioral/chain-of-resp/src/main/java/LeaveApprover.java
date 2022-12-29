import application.LeaveApplication;

public interface LeaveApprover {

    String getRole();

    void processLeaveApplication(LeaveApplication leaveApplication);
}
