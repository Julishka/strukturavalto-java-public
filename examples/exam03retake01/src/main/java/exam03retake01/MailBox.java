package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    protected List<Mail> mails;

    public MailBox() {
        mails = new ArrayList<>();
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String criteria) {
        //TODO
        return null;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }
}
