package com.the_mgi.wildapricot_wrapper.events.base.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.the_mgi.wildapricot_wrapper.contact.base.converters.DateConverter;
import com.the_mgi.wildapricot_wrapper.contact.custom_fields.model.LinkedResource;
import com.the_mgi.wildapricot_wrapper.events.base.model.enums.EventRegistrationCancellationBehavior;
import com.the_mgi.wildapricot_wrapper.events.base.model.enums.EventRegistrationPolicy;
import com.the_mgi.wildapricot_wrapper.events.base.model.enums.EventRegistrationTypeAvailability;
import com.the_mgi.wildapricot_wrapper.events.base.model.enums.EventRegistrationUnavailabilityPolicy;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventRegistrationType {
    /**
     * Unique event registration type identifier.
     */
    @JsonProperty("Id")
    private String id;

    /**
     * Permanent resource URL in API.
     */
    @JsonProperty("Url")
    private String url;

    /**
     * Indicates whether this registration type is enabled
     */
    @JsonProperty("IsEnabled")
    private Boolean isEnabled;

    /**
     * Identifier of event related to the registration type.
     */
    @JsonProperty("EventId")
    private Integer eventId;

    /**
     * Registration type title.
     */
    @JsonProperty("Name")
    private String name;

    /**
     * Plain text description for the event registration type.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Base price registrant pays for this registration type.
     */
    @JsonProperty("BasePrice")
    private Double basePrice;

    /**
     * Price for each additional guest.
     */
    @JsonProperty("GuestPrice")
    private Double guestPrice;

    /**
     * Indicates whether account tax scope settings should be used to calculate final price.
     */
    @JsonProperty("UseTaxScopeSettings")
    private Boolean useTaxScopeSettings;

    /**
     * Indicates who the registration type is available to.
     */
    @JsonProperty("Availability")
    private EventRegistrationTypeAvailability availability;

    /**
     * Registration code required to apply for event with this registration type. This property has value only if Availability is CodeRequired.
     */
    @JsonProperty("RegistrationCode")
    private String registrationCode;

    /**
     * Which membership levels can apply for event. This property has value only if Availability is MembersOnly.
     */
    @JsonProperty("AvailableForMembershipLevels")
    private List<LinkedResource> availableForMembershipLevels;

    /**
     * This registration type is available starting from this date. Can be null.
     */
    @JsonProperty("AvailableFrom")
    @JsonDeserialize(converter = DateConverter.class)
    private Date availableFrom;

    /**
     * This registration type is available until this date. Can be null.
     */
    @JsonProperty("AvailableThrough")
    @JsonDeserialize(converter = DateConverter.class)
    private Date availableThrough;

    /**
     * Maximum number of registrants for this registration type.
     */
    @JsonProperty("MaximumRegistrantsCount")
    private Integer maximumRegistrantsCount;

    /**
     * Current number of registrants for this registration type.
     */
    @JsonProperty("CurrentRegistrantsCount")
    private Integer currentRegistrantsCount;

    /**
     * Describes how guests are registered. Allowed values are
     * <ul>
     *     <li>Disabled - guest registration is not allowed - NumberOfGuests - number of guests should be specified. - CollectContactDetails - contact information should be collected for each guest. - CollectFullInfo - full registration info should be collected for each guest.</li>
     * </ul>
     */
    @JsonProperty("GuestRegistrationPolicy")
    private EventRegistrationPolicy guestRegistrationPolicy;

    /**
     * Indicates what is displayed if the registration type is not available for a particular visitor.
     */
    @JsonProperty("UnavailabilityPolicy")
    private EventRegistrationUnavailabilityPolicy unavailabilityPolicy;

    /**
     * Indicates if it is possible for attendee to self-cancel event registration.
     */
    @JsonProperty("CancellationBehaviour")
    private EventRegistrationCancellationBehavior cancellationBehaviour;
}
