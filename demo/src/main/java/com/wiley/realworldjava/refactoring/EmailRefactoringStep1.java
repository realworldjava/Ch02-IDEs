package com.wiley.realworldjava.refactoring;

import java.time.LocalDate;
import java.util.Properties;
import java.util.function.Consumer;

public class EmailRefactoringStep1 {

    public void processWeeklyReminders(LocalDate lastMail, Properties props) {
        int numWeeks = 1;
        LocalDate nextMail = lastMail.plusWeeks(numWeeks);
        Consumer<Properties> mailer = this::sendWeeklyMailer;
        LocalDate now = LocalDate.now();
        if (now.isAfter(nextMail)) {
            mailer.accept(props);
        }
    }

    public void processBiWeeklyReminders(LocalDate lastMail, Properties props) {
        LocalDate nextMail = lastMail.plusWeeks(2);
        Consumer<Properties> mailer = this::sendBiWeeklyMailer;
        LocalDate now = LocalDate.now();
        if (now.isAfter(nextMail)) {
            mailer.accept(props);
        }
    }

    private void sendWeeklyMailer(Properties props) {
    }

    private void sendBiWeeklyMailer(Properties props) {
    }
}
