package io.github.benas.websocket.model;

import java.util.Date;

public class Message {

    private String content;
    private String sender;
    private Date received;

    public final String getContent() {
        return content;
    }

    public final void setContent(final String content) {
        this.content = content;
    }

    public final String getSender() {
        return sender;
    }

    public final void setSender(final String sender) {
        this.sender = sender;
    }

    public final Date getReceived() {
        return received;
    }

    public final void setReceived(final Date received) {
        this.received = received;
    }

}
