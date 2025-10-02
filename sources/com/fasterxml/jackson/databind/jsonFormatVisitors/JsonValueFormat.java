package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.google.android.gms.common.Scopes;

/* loaded from: classes4.dex */
public enum JsonValueFormat {
    /* JADX INFO: Fake field, exist only in values array */
    COLOR("color"),
    /* JADX INFO: Fake field, exist only in values array */
    DATE("date"),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_TIME("date-time"),
    /* JADX INFO: Fake field, exist only in values array */
    EMAIL(Scopes.EMAIL),
    /* JADX INFO: Fake field, exist only in values array */
    HOST_NAME("host-name"),
    /* JADX INFO: Fake field, exist only in values array */
    IP_ADDRESS("ip-address"),
    /* JADX INFO: Fake field, exist only in values array */
    IPV6("ipv6"),
    /* JADX INFO: Fake field, exist only in values array */
    PHONE("phone"),
    /* JADX INFO: Fake field, exist only in values array */
    REGEX("regex"),
    /* JADX INFO: Fake field, exist only in values array */
    STYLE("style"),
    /* JADX INFO: Fake field, exist only in values array */
    TIME("time"),
    /* JADX INFO: Fake field, exist only in values array */
    URI("uri"),
    /* JADX INFO: Fake field, exist only in values array */
    UTC_MILLISEC("utc-millisec"),
    /* JADX INFO: Fake field, exist only in values array */
    UUID("uuid");

    public final String d;

    JsonValueFormat(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
