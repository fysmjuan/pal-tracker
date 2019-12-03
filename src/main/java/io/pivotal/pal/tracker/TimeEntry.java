package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;


public class TimeEntry {

    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry() {

    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if( obj instanceof TimeEntry) {
//            TimeEntry compareTo = (TimeEntry) obj;
//            System.out.println("date.equals(compareTo.date) " + date.equals(compareTo.date));
//            System.out.println(" id == compareTo.id " + (id == compareTo.id));
//            System.out.println(" projectId == compareTo.projectId " + (projectId == compareTo.projectId));
//            System.out.println(" userId == compareTo.userId " + (userId == compareTo.userId));
//            System.out.println(" hours == compareTo.hours " + (hours == compareTo.hours));
//
//            return id == compareTo.id &&
//                    projectId == compareTo.projectId &&
//                    userId == compareTo.userId &&
//                    date.equals(compareTo.date) &&
//                    hours == compareTo.hours;
//
//        }
//        else {
//            return false;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return id == timeEntry.id &&
                projectId == timeEntry.projectId &&
                userId == timeEntry.userId &&
                hours == timeEntry.hours &&
                date.equals(timeEntry.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, userId, date, hours);
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }

}
