package com.wiley.realworldjava.refactoring;

import java.time.LocalDate;
import java.util.Properties;
import java.util.function.Consumer;

public class EmailRefactoringStep2 {

    public void processWeeklyReminders(LocalDate lastMail, Properties props) {
        LocalDate nextMail = lastMail.plusWeeks(1);
        Consumer<Properties> mailer = this::sendWeeklyMailer;
        sendIfTime(props, nextMail, mailer);
    }

    public void processBiWeeklyReminders(LocalDate lastMail, Properties props) {
        LocalDate nextMail = lastMail.plusWeeks(2);
        Consumer<Properties> mailer = this::sendBiWeeklyMailer;
        sendIfTime(props, nextMail, mailer);
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
