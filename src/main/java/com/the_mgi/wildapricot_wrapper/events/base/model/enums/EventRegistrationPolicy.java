package com.the_mgi.wildapricot_wrapper.events.base.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.the_mgi.wildapricot_wrapper.base.GenericEnum;

public enum EventRegistrationPolicy implements GenericEnum<EventRegistrationPolicy, String> {
    DISABLED("Disabled"),
    NUMBER_OF_GUESTS("NumberOfGuests"),
    COLLECT_CONTACT_DETAILS("CollectContactDetails"),
    COLLECT_FULL_INFO("CollectFullInfo");

    private final String value;

    EventRegistrationPolicy(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static EventRegistrationPolicy create(String value) {
        return GenericEnum.getEnumTypeFromString(EventRegistrationPolicy.class, value);
    }

    @Override
    public String toString() {
        return "EventRegistrationPolicy{" +
               "value='" + value + '\'' +
               "} " + super.toString();
    }
}
