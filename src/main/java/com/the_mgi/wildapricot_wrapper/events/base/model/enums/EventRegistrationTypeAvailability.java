package com.the_mgi.wildapricot_wrapper.events.base.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.the_mgi.wildapricot_wrapper.base.GenericEnum;

public enum EventRegistrationTypeAvailability implements GenericEnum<EventRegistrationTypeAvailability, String> {
    EVERYONE("Everyone"),
    MEMBERS_ONLY("MembersOnly"),
    CODE_REQUIRED("CodeRequired");

    private final String value;

    EventRegistrationTypeAvailability(String string) {
        this.value = string;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static EventRegistrationTypeAvailability create(String value) {
        return GenericEnum.getEnumTypeFromString(EventRegistrationTypeAvailability.class, value);
    }

    @Override
    public String toString() {
        return "EventRegistrationTypeAvailability{" +
               "value='" + value + '\'' +
               "} " + super.toString();
    }
}
