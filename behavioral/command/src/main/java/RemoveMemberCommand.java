public class RemoveMemberCommand implements Command {

    private String contact;

    private String contactGroup;

    private EWSService service;

    public RemoveMemberCommand(String contact, String contactGroup,
                               EWSService service) {
        this.contact = contact;
        this.contactGroup = contactGroup;
        this.service = service;
    }

    @Override
    public void execute() {
        service.removeMember(contact, contactGroup);
    }
}
