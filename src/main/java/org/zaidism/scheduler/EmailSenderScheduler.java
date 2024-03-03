package org.zaidism.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
@EnableScheduling // cab be applied on main class to achieve scheduling in all the places
@Slf4j
public class EmailSenderScheduler {

  // after every 2 seconds
  @Scheduled(fixedDelay = 2000)
  // @Scheduled(cron = "5 4 * * sun") //At 04:05 on Sunday.
  public void sendEmail() { // method must be with void return type
    log.info("Email Sent...." + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
  }
}
