package com.wiley.realworldjava.refactoring;

import java.time.LocalDate;
import java.util.Properties;
import java.util.function.Consumer;

public class EmailRefactoringStep3 {

    public void processWeeklyReminders(LocalDate lastMail, Properties props) {
        LocalDate nextMail = lastMail.plusWeeks(1);
        sendIfTime(props, nextMail, this::sendWeeklyMailer);
    }

    public void processBiWeeklyReminders(LocalDate lastMail, Properties props) {
        LocalDate nextMail = lastMail.plusWeeks(2);
        sendIfTime(props, nextMail, this::sendBiWeeklyMailer);
    }

    private static void sendIfTime(Properties props, LocalDate nextMail, Consumer<Properties> mailer) {
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
