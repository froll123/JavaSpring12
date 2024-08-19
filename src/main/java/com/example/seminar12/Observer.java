package com.example.seminar12;

// Реализация шаблона Observer для уведомления наблюдателей об изменениях в теме.

public interface Observer {
    void update(String message);
}
