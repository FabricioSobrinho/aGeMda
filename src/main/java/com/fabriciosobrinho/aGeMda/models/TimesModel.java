package com.fabriciosobrinho.aGeMda.models;


import com.fabriciosobrinho.aGeMda.enums.WeekDays;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "times")
public class TimesModel implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    LocalTime startHour;
    WeekDays dayWeek;
    LocalTime finishHour;

    public LocalTime getStartHour() {
        return startHour;
    }

    public void setStartHour(LocalTime startHour) {
        this.startHour = startHour;
    }

    public WeekDays getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(WeekDays dayWeek) {
        this.dayWeek = dayWeek;
    }

    public LocalTime getFinishHour() {
        return finishHour;
    }

    public void setFinishHour(LocalTime finishHour) {
        this.finishHour = finishHour;
    }
}
