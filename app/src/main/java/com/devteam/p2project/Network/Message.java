package com.devteam.p2project.Network;

import java.io.Serializable;
import java.net.InetAddress;

/**
 * Created by claudiocavallaro on 01/06/16.
 */
public class Message implements Serializable {

    private byte type;
    private Object content;
    private InetAddress recipient;

    public Message(byte type, Object content) {
        super();
        this.type = type;
        this.content = content;
    }

    public Message(byte type, Object content, InetAddress recipient) {
        super();
        this.type = type;
        this.content = content;
        this.recipient = recipient;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public InetAddress getRecipient() {
        return recipient;
    }

    public void setRecipient(InetAddress recipient) {
        this.recipient = recipient;
    }

}