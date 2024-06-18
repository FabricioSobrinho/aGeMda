package com.fabriciosobrinho.aGeMda.dtos;

import com.fabriciosobrinho.aGeMda.enums.WeekDays;

import java.time.LocalTime;

public record TimesRecordDto(LocalTime startHour, WeekDays dayWeek, LocalTime finishHour) {
}