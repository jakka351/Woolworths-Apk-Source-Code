package com.swrve.sdk.messaging.model;

import android.support.v4.media.session.a;

/* loaded from: classes6.dex */
public class Arg {
    private String key;
    private Op op;
    private Object value;

    public enum Op {
        EQ,
        CONTAINS,
        NUMBER_GT,
        NUMBER_LT,
        NUMBER_EQ,
        NUMBER_NOT_BETWEEN,
        NUMBER_BETWEEN
    }

    public String getKey() {
        return this.key;
    }

    public Op getOp() {
        return this.op;
    }

    public Object getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Arg{key='");
        sb.append(this.key);
        sb.append("', op='");
        sb.append(this.op);
        sb.append("', value='");
        return a.o(this.value, "'}", sb);
    }
}
