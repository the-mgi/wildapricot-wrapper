package com.the_mgi.wildapricot_wrapper.events.base.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.the_mgi.wildapricot_wrapper.base.GenericEnum;

/**
 * Event accessibility.
 * <ul>
 *     <li>Public means event accessible for everyone</li>
 *     <li>AdminOnly means event accessible for administrators only</li>
 *     <li>Restricted means event accessible for specific membership levels or groups.</li>
 * </ul>
 */
public enum EventAccessLevel implements GenericEnum<EventAccessLevel, String> {
    PUBLIC("Public"),
    ADMIN_ONLY("AdminOnly"),
    RESTRICTED("Restricted");

    private final String value;

    EventAccessLevel(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return null;
    }

    @JsonCreator
    public static EventAccessLevel create(String value) {
        return GenericEnum.getEnumTypeFromString(EventAccessLevel.class, value);
    }

    @Override
    public String toString() {
        return "EventAccessLevel{" +
               "value='" + value + '\'' +
               "} " + super.toString();
    }
}
