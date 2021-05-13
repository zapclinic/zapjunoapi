package br.com.juno.integration.api.model;

import java.io.Serializable;

public class WebhookResultData implements Serializable {

    private String entityId;
    private String entityType;
    private WebhookResultDataAttributes attributes;

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public WebhookResultDataAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(WebhookResultDataAttributes attributes) {
        this.attributes = attributes;
    }
}
