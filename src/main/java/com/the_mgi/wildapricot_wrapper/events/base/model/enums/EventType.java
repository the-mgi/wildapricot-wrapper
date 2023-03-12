package com.the_mgi.wildapricot_wrapper.events.base.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.the_mgi.wildapricot_wrapper.base.GenericEnum;

public enum EventType implements GenericEnum<EventType, String> {
    REGULAR("Regular"),
    RSVP("RSVP");

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static EventType create(String value) {
        return GenericEnum.getEnumTypeFromString(EventType.class, value);
    }

    @Override
    public String toString() {
        return "EventType{" +
               "value='" + value + '\'' +
               "} " + super.toString();
    }
}
