package com.the_mgi.wildapricot_wrapper.events.base.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.the_mgi.wildapricot_wrapper.account.model.Timezone;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDetails {
    /**
     * Full event description in HTML format. Important - Links to images can be relative.
     */
    @JsonProperty("DescriptionHtml")
    private String descriptionHtml;

    /**
     * A description how registrant can pay for attendance to this event. Payment instructions for this event only.
     */
    @JsonProperty("PaymentInstructions")
    private String paymentInstructions;

    /**
     * Details about account time zone
     */
    @JsonProperty("TimeZone")
    private Timezone timeZone;

    /**
     * Collection of configured registration types for the event.
     */
    @JsonProperty("RegistrationTypes")
    private EventRegistrationType registrationTypes;

}
