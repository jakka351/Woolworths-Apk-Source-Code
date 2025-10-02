package com.swrve.sdk.messaging.model;

import androidx.compose.ui.input.pointer.a;
import java.util.List;

/* loaded from: classes6.dex */
public class Conditions {
    private List<Arg> args;
    private String key;
    private Op op = null;
    private Object value;

    public enum Op {
        OR,
        AND,
        CONTAINS,
        NUMBER_GT,
        NUMBER_LT,
        NUMBER_BETWEEN,
        NUMBER_NOT_BETWEEN,
        NUMBER_EQ,
        EQ
    }

    public List<Arg> getArgs() {
        return this.args;
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
        StringBuilder sb = new StringBuilder("Conditions{key='");
        sb.append(this.key);
        sb.append("', op='");
        sb.append(this.op);
        sb.append("', value='");
        sb.append(this.value);
        sb.append("', args=");
        return a.o(sb, this.args, '}');
    }
}
