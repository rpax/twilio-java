/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.pricing.v2.voice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.type.InboundCallPrice;
import com.twilio.type.OutboundCallPriceWithOrigin;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Number extends Resource {
    private static final long serialVersionUID = 178498461042765L;

    /**
     * Create a NumberFetcher to execute fetch.
     * 
     * @param pathDestinationNumber Fetches voice prices for number
     * @return NumberFetcher capable of executing the fetch
     */
    public static NumberFetcher fetcher(final com.twilio.type.PhoneNumber pathDestinationNumber) {
        return new NumberFetcher(pathDestinationNumber);
    }

    /**
     * Converts a JSON String into a Number object using the provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Number object represented by the provided JSON
     */
    public static Number fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Number.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Number object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Number object represented by the provided JSON
     */
    public static Number fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Number.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final com.twilio.type.PhoneNumber destinationNumber;
    private final com.twilio.type.PhoneNumber originationNumber;
    private final String country;
    private final String isoCountry;
    private final List<OutboundCallPriceWithOrigin> outboundCallPrices;
    private final InboundCallPrice inboundCallPrice;
    private final Currency priceUnit;
    private final URI url;

    @JsonCreator
    private Number(@JsonProperty("destination_number")
                   final com.twilio.type.PhoneNumber destinationNumber, 
                   @JsonProperty("origination_number")
                   final com.twilio.type.PhoneNumber originationNumber, 
                   @JsonProperty("country")
                   final String country, 
                   @JsonProperty("iso_country")
                   final String isoCountry, 
                   @JsonProperty("outbound_call_prices")
                   final List<OutboundCallPriceWithOrigin> outboundCallPrices, 
                   @JsonProperty("inbound_call_price")
                   final InboundCallPrice inboundCallPrice, 
                   @JsonProperty("price_unit")
                   @JsonDeserialize(using = com.twilio.converter.CurrencyDeserializer.class)
                   final Currency priceUnit, 
                   @JsonProperty("url")
                   final URI url) {
        this.destinationNumber = destinationNumber;
        this.originationNumber = originationNumber;
        this.country = country;
        this.isoCountry = isoCountry;
        this.outboundCallPrices = outboundCallPrices;
        this.inboundCallPrice = inboundCallPrice;
        this.priceUnit = priceUnit;
        this.url = url;
    }

    /**
     * Returns The The destination phone number, in E.164.
     * 
     * @return The destination phone number, in E.164
     */
    public final com.twilio.type.PhoneNumber getDestinationNumber() {
        return this.destinationNumber;
    }

    /**
     * Returns The The origination phone number, in E.164.
     * 
     * @return The origination phone number, in E.164
     */
    public final com.twilio.type.PhoneNumber getOriginationNumber() {
        return this.originationNumber;
    }

    /**
     * Returns The Name of the country.
     * 
     * @return Name of the country
     */
    public final String getCountry() {
        return this.country;
    }

    /**
     * Returns The The ISO country code.
     * 
     * @return The ISO country code
     */
    public final String getIsoCountry() {
        return this.isoCountry;
    }

    /**
     * Returns The List of OutboundCallPriceWithOrigin records.
     * 
     * @return List of OutboundCallPriceWithOrigin records
     */
    public final List<OutboundCallPriceWithOrigin> getOutboundCallPrices() {
        return this.outboundCallPrices;
    }

    /**
     * Returns The List of InboundCallPrice records.
     * 
     * @return List of InboundCallPrice records
     */
    public final InboundCallPrice getInboundCallPrice() {
        return this.inboundCallPrice;
    }

    /**
     * Returns The The currency in which prices are measured, in ISO 4127 format
     * (e.g. usd, eur, jpy)..
     * 
     * @return The currency in which prices are measured, in ISO 4127 format (e.g.
     *         usd, eur, jpy).
     */
    public final Currency getPriceUnit() {
        return this.priceUnit;
    }

    /**
     * Returns The The URL of this resource..
     * 
     * @return The URL of this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Number other = (Number) o;

        return Objects.equals(destinationNumber, other.destinationNumber) && 
               Objects.equals(originationNumber, other.originationNumber) && 
               Objects.equals(country, other.country) && 
               Objects.equals(isoCountry, other.isoCountry) && 
               Objects.equals(outboundCallPrices, other.outboundCallPrices) && 
               Objects.equals(inboundCallPrice, other.inboundCallPrice) && 
               Objects.equals(priceUnit, other.priceUnit) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationNumber,
                            originationNumber,
                            country,
                            isoCountry,
                            outboundCallPrices,
                            inboundCallPrice,
                            priceUnit,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("destinationNumber", destinationNumber)
                          .add("originationNumber", originationNumber)
                          .add("country", country)
                          .add("isoCountry", isoCountry)
                          .add("outboundCallPrices", outboundCallPrices)
                          .add("inboundCallPrice", inboundCallPrice)
                          .add("priceUnit", priceUnit)
                          .add("url", url)
                          .toString();
    }
}