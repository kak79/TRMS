package com.project.TRMS.models;

import javax.persistence.*;
import java.util.Objects;
@Entity
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private int eventId;
    @Column(name = "type_name")
    private String name;
    private double percentCoverage;

    public EventType() {
    }


    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentCovered() {
        return percentCoverage;
    }

    public void setPercentCovered(double percentCovered) {
        if (percentCovered <= 0.0) this.percentCoverage = 0;
        else if (percentCoverage >= 100.0) this.percentCoverage = 100.0;
        else this.percentCoverage = percentCoverage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, name, percentCoverage);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventType other = (EventType) obj;
        return eventId == other.eventId && Objects.equals(name, other.name)
                && Double.doubleToLongBits(percentCoverage) == Double.doubleToLongBits(other.percentCoverage);
    }

    @Override
    public String toString() {
        return "EventType [eventId=" + eventId + ", name=" + name + ", percentCoverage=" + percentCoverage + "]";
    }

}
