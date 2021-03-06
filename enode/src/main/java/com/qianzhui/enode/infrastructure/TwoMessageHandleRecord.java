package com.qianzhui.enode.infrastructure;

import java.util.Date;

/**
 * Created by junbo_xu on 2016/4/3.
 */
public class TwoMessageHandleRecord {
    public String messageId1;
    public String messageId2;
    public String message1TypeName;
    public String message2TypeName;
    public String handlerTypeName;
    public String aggregateRootTypeName;
    public String aggregateRootId;
    public int version;
    public Date createdOn;

    public String getMessageId1() {
        return messageId1;
    }

    public void setMessageId1(String messageId1) {
        this.messageId1 = messageId1;
    }

    public String getMessageId2() {
        return messageId2;
    }

    public void setMessageId2(String messageId2) {
        this.messageId2 = messageId2;
    }

    public String getMessage1TypeName() {
        return message1TypeName;
    }

    public void setMessage1TypeName(String message1TypeName) {
        this.message1TypeName = message1TypeName;
    }

    public String getMessage2TypeName() {
        return message2TypeName;
    }

    public void setMessage2TypeName(String message2TypeName) {
        this.message2TypeName = message2TypeName;
    }

    public String getHandlerTypeName() {
        return handlerTypeName;
    }

    public void setHandlerTypeName(String handlerTypeName) {
        this.handlerTypeName = handlerTypeName;
    }

    public String getAggregateRootTypeName() {
        return aggregateRootTypeName;
    }

    public void setAggregateRootTypeName(String aggregateRootTypeName) {
        this.aggregateRootTypeName = aggregateRootTypeName;
    }

    public String getAggregateRootId() {
        return aggregateRootId;
    }

    public void setAggregateRootId(String aggregateRootId) {
        this.aggregateRootId = aggregateRootId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
