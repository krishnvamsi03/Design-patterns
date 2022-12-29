import java.security.Provider;

public class AddMemberCommand implements Command {

    private String contact;

    private String contactGroup;

    private EWSService service;

    public AddMemberCommand(String contact, String contactGroup,
                            EWSService service) {
        this.contact = contact;
        this.contactGroup = contactGroup;
        this.service = service;
    }

    @Override
    public void execute() {
        service.addMember(contact, contactGroup);
    }
}
