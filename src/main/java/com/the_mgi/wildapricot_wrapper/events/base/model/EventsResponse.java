package com.the_mgi.wildapricot_wrapper.events.base.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventsResponse {
    /**
     * List of event identifiers that match request criteria. The field appears only if idsOnly parameter was passed in request.
     */
    @JsonProperty("EventsIdentifiers")
    private List<Integer> eventIdentifiers;

    /**
     * List of events that match request criteria.
     */
    @JsonProperty("Events")
    private List<Events> events;

    /**
     * Number of events that match request criteria. This field appears only if $count parameter was passed in request.
     */
    @JsonProperty("EventsIdentifiers")
    private Integer count;

    public EventsResponse setEventIdentifiers(List<Integer> eventIdentifiers) {
        this.eventIdentifiers = eventIdentifiers;
        return this;
    }

    public EventsResponse setEvents(List<Events> events) {
        this.events = events;
        return this;
    }

    public EventsResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return "EventsResponse{" +
               "eventIdentifiers=" + eventIdentifiers +
               ", events=" + events +
               ", count=" + count +
               '}';
    }
}
