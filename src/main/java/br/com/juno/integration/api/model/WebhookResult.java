package br.com.juno.integration.api.model;

import java.io.Serializable;
import java.util.List;

public class WebhookResult implements Serializable {

    private String eventId;
    private String eventType;
    private String timestamp;
    private List<WebhookResultData> data;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<WebhookResultData> getData() {
        return data;
    }

    public void setData(List<WebhookResultData> data) {
        this.data = data;
    }
}
