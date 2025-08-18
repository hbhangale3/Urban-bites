package com.hbhangale3.UrbanBite.email_notification.services;

import com.hbhangale3.UrbanBite.email_notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO);
}
