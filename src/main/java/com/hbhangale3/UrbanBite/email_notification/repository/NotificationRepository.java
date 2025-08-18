package com.hbhangale3.UrbanBite.email_notification.repository;

import com.hbhangale3.UrbanBite.email_notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
