package com.google.firebase.firestore.model;

import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class ServerTimestamps {
    public static Timestamp a(Value value) {
        return value.d0().Q("__local_write_time__").g0();
    }

    public static Value b(Value value) {
        Value valueP = value.d0().P("__previous_value__");
        return c(valueP) ? b(valueP) : valueP;
    }

    public static boolean c(Value value) {
        Value valueP = value == null ? null : value.d0().P("__type__");
        return valueP != null && "server_timestamp".equals(valueP.f0());
    }
}
