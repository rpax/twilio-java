/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v1.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Verification extends Resource {
    private static final long serialVersionUID = 209968229129653L;

    public enum Channel {
        SMS("sms"),
        CALL("call");

        private final String value;

        private Channel(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Channel from a string.
         * @param value string value
         * @return generated Channel
         */
        @JsonCreator
        public static Channel forValue(final String value) {
            return Promoter.enumFromString(value, Channel.values());
        }
    }

    /**
     * Create a VerificationCreator to execute create.
     * 
     * @param pathServiceSid Service Sid.
     * @param to To phonenumber
     * @param channel sms or call
     * @return VerificationCreator capable of executing the create
     */
    public static VerificationCreator creator(final String pathServiceSid, 
                                              final String to, 
                                              final String channel) {
        return new VerificationCreator(pathServiceSid, to, channel);
    }

    /**
     * Converts a JSON String into a Verification object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Verification object represented by the provided JSON
     */
    public static Verification fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Verification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Verification object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Verification object represented by the provided JSON
     */
    public static Verification fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Verification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String serviceSid;
    private final String accountSid;
    private final com.twilio.type.PhoneNumber to;
    private final Verification.Channel channel;
    private final String status;
    private final Boolean valid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;

    @JsonCreator
    private Verification(@JsonProperty("sid")
                         final String sid, 
                         @JsonProperty("service_sid")
                         final String serviceSid, 
                         @JsonProperty("account_sid")
                         final String accountSid, 
                         @JsonProperty("to")
                         final com.twilio.type.PhoneNumber to, 
                         @JsonProperty("channel")
                         final Verification.Channel channel, 
                         @JsonProperty("status")
                         final String status, 
                         @JsonProperty("valid")
                         final Boolean valid, 
                         @JsonProperty("date_created")
                         final String dateCreated, 
                         @JsonProperty("date_updated")
                         final String dateUpdated) {
        this.sid = sid;
        this.serviceSid = serviceSid;
        this.accountSid = accountSid;
        this.to = to;
        this.channel = channel;
        this.status = status;
        this.valid = valid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
    }

    /**
     * Returns The A string that uniquely identifies this Verification..
     * 
     * @return A string that uniquely identifies this Verification.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The Service Sid..
     * 
     * @return Service Sid.
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The Account Sid..
     * 
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The To phonenumber.
     * 
     * @return To phonenumber
     */
    public final com.twilio.type.PhoneNumber getTo() {
        return this.to;
    }

    /**
     * Returns The sms or call.
     * 
     * @return sms or call
     */
    public final Verification.Channel getChannel() {
        return this.channel;
    }

    /**
     * Returns The pending, approved, denied or expired.
     * 
     * @return pending, approved, denied or expired
     */
    public final String getStatus() {
        return this.status;
    }

    /**
     * Returns The successful verification.
     * 
     * @return successful verification
     */
    public final Boolean getValid() {
        return this.valid;
    }

    /**
     * Returns The The date this Verification was created.
     * 
     * @return The date this Verification was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date this Verification was updated.
     * 
     * @return The date this Verification was updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Verification other = (Verification) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(to, other.to) && 
               Objects.equals(channel, other.channel) && 
               Objects.equals(status, other.status) && 
               Objects.equals(valid, other.valid) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            serviceSid,
                            accountSid,
                            to,
                            channel,
                            status,
                            valid,
                            dateCreated,
                            dateUpdated);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("serviceSid", serviceSid)
                          .add("accountSid", accountSid)
                          .add("to", to)
                          .add("channel", channel)
                          .add("status", status)
                          .add("valid", valid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .toString();
    }
}