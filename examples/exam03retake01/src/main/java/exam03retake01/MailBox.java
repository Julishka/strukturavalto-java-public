package exam03retake01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MailBox {
    protected List<Mail> mails;

    public MailBox() {
        mails = new ArrayList<>();
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String criteria) {
        //TODO: find prettier solution
        Objects.requireNonNull(criteria);
        List<Mail> searchResult = new ArrayList<>();
        for (Mail mail : mails) {
            if (criteria.startsWith("from:")) {
                String cropped = criteria.replace("from:", "");
                if (mail.getFrom().getEmail().equals(cropped) || mail.getFrom().getName().equals(cropped)) {
                    searchResult.add(mail);
                }
            } else if (criteria.startsWith("to:")) {
                String cropped = criteria.replace("to:", "");
                for (Contact contact : mail.getTo()) {
                    if (contact.getName().equals(cropped) || contact.getEmail().equals(cropped)) {
                        searchResult.add(mail);
                    }
                }
            } else if (mail.getMessage().contains(criteria) || mail.getSubject().contains(criteria)) {
                searchResult.add(mail);
            }
        }

        return searchResult;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }
}
