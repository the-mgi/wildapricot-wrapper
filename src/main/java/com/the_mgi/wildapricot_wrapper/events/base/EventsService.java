package com.the_mgi.wildapricot_wrapper.events.base;

import com.fasterxml.jackson.core.type.TypeReference;
import com.the_mgi.wildapricot_wrapper.ApplicationService;
import com.the_mgi.wildapricot_wrapper.WildApricot;
import com.the_mgi.wildapricot_wrapper.events.base.model.EventsResponse;
import com.the_mgi.wildapricot_wrapper.exception.HttpException;

import java.util.List;

public class EventsService {
    private final ApplicationService applicationService;

    public EventsService(WildApricot wildApricot) {
        this.applicationService = ApplicationService.getInstance(wildApricot);
    }

    /**
     * Events List
     *
     * @param accountId Your account identifier (pathVariable)
     * @param $async    Controls whether the API call is perform asynchronously. Default value if true.
     * @param resultId  This parameter is used on a second step of asynchronous search. It should equal to the value of ResultId in response to the first step of asynchronous search.
     * @param $filter   Filters the results of the Events API call so that only those records that match the filter criteria are included.
     *                  <br />
     *                  The following filter criterias are supported:
     *                  <ul>
     *                    <li>Id, Supported operations: in.</li>
     *                    <li>RegistrationEnabled, Supported operations: eq, ne.</li>
     *                    <li>IsUpcoming, Supported operations: eq, ne.</li>
     *                    <li>Tags, Supported operations: in.</li>
     *                    <li>StartDate, Supported operations: eq, ne, gt, ge, lt, le.</li>
     *                    <li>EndDate, Supported operations: eq, ne, gt, ge, lt, le.</li>
     *                    <li>Name, Supported operations: eq, ne, substringof.</li>
     *                    <li>TextIndex, Supported operations: substringof.</li>
     *                  </ul>
     * @param $sort     This parameter can be used to sort list of IDs or list of events. Possible values are
     *                  <ul>
     *                      <li>ByStartDate asc - sort events by their Start date. Ascending order.</li>
     *                      <li>ByStartDate desc - sort events by their Start date. Descending order.</li>
     *                      <li>ByStartSession asc - sort events by start of their sessions (if exists). All past events ignored</li>
     *                  </ul>
     *                  <br/>
     *                  Example: $sort=ByStartDate asc
     * @param $skip     'Specifies the number of records to skip (not include in a result set). For example if you expect about 300 records in result set and want to get them in small portions, you could make do so with 3 calls:'
     *                  <ul>
     *                      <li>...&$top=100 - will return records from 0 to 99 - ...?$skip=100&top=100' - will return records from 100 to 199 - ...?$skip=200' - will return records from 199 to the end</li>
     *                  </ul>
     * @param $top      this parameter specifies the maximum number of entries to be returned
     * @param $count    Specifies that result should contain only a total number of records matching criteria. Requests with specified $count parameter are always processed as synchronous.
     * @param idsOnly   When idsOnly specified, the API returns only a list of identifiers matching criteria.
     * @return A wrapper object, which contains a list of events, event identifiers or events count.
     * @throws HttpException provides exception descriptions
     *                       <ul>
     *                          <li>400 On invalid parameters. See error details in response body.</li>
     *                          <li>401 oAuth token was not provided, invalid or does not provide access to requested URL</li>
     *                          <li>429 Too many requests from same account. Wait for a minute and try again, however this exception is handled, will automatically wait for 1 minutes, and then do another call.</li>
     *                       </ul>
     */
    public EventsResponse getEventsList(
        Integer accountId,
        Boolean $async,
        String resultId,
        String $filter,
        String $sort,
        Integer $skip,
        Integer $top,
        Boolean $count,
        Boolean idsOnly
    ) throws HttpException {
        return this.applicationService.execute(
            "accounts/" + accountId + "/events",
            new TypeReference<>() {
            },
            List.of()
        );
    }
}
