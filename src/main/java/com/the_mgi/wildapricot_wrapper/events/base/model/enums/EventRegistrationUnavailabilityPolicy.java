package com.the_mgi.wildapricot_wrapper.events.base.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.the_mgi.wildapricot_wrapper.base.GenericEnum;

public enum EventRegistrationUnavailabilityPolicy implements GenericEnum<EventRegistrationUnavailabilityPolicy, String> {
    SHOW_DISABLED("ShowDisabled"),
    HIDE("Hide");

    private final String value;

    EventRegistrationUnavailabilityPolicy(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static EventRegistrationUnavailabilityPolicy create(String value) {
        return GenericEnum.getEnumTypeFromString(EventRegistrationUnavailabilityPolicy.class, value);
    }

    @Override
    public String toString() {
        return "EventRegistrationUnavailabilityPolicy{" +
               "value='" + value + '\'' +
               "} " + super.toString();
    }
}
