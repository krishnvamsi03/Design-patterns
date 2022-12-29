import application.LeaveApplication;
import application.LeaveApplicationBuilder;

import java.time.LocalDate;
import java.util.Locale;

public class LeavProcessorMain {

    public static void main(String[] args) {
        LeaveApplication application =
                new LeaveApplicationBuilder()
                        .withFrom(LocalDate.now())
                        .withTo(LocalDate.of(2022, 12, 26))
                        .withType(LeaveApplication.Type.SICK)
                        .build();
        System.out.println(application);
        System.out.println("**** processing your application ******");
        LeaveApprover leaveApprover = createChain();
        leaveApprover.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        LeaveApprover directore = new Director(null);
        LeaveApprover manager = new Manager(directore);
        LeaveApprover lead = new Lead(manager);
        return lead;
    }
}
