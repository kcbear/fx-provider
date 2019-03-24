package com.data.provider.fx.web.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class FxLiveResponse {

    private @Valid Long timestamp = null;
    private @Valid String source = null;
    private @Valid List<Quote> quotes = new ArrayList<Quote>();

    /**
     **/
    public FxLiveResponse timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    @ApiModelProperty(required = true, value = "")
    @JsonProperty("timestamp")
    @NotNull
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     **/
    public FxLiveResponse source(String source) {
        this.source = source;
        return this;
    }


    @ApiModelProperty(example = "USD", required = true, value = "")
    @JsonProperty("source")
    @NotNull
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     **/
    public FxLiveResponse quotes(List<Quote> quotes) {
        this.quotes = quotes;
        return this;
    }


    @ApiModelProperty(required = true, value = "")
    @JsonProperty("quotes")
    @NotNull
    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FxLiveResponse fxLiveResponse = (FxLiveResponse) o;
        return Objects.equals(timestamp, fxLiveResponse.timestamp) &&
                Objects.equals(source, fxLiveResponse.source) &&
                Objects.equals(quotes, fxLiveResponse.quotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, source, quotes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FxLiveResponse {\n");

        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    quotes: ").append(toIndentedString(quotes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

