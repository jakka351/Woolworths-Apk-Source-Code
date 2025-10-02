package com.braintreepayments.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/HttpResponseTiming;", "", "SharedUtils_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HttpResponseTiming {

    /* renamed from: a, reason: collision with root package name */
    public long f13728a;
    public long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponseTiming)) {
            return false;
        }
        HttpResponseTiming httpResponseTiming = (HttpResponseTiming) obj;
        return this.f13728a == httpResponseTiming.f13728a && this.b == httpResponseTiming.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f13728a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponseTiming(startTime=");
        sb.append(this.f13728a);
        sb.append(", endTime=");
        return androidx.camera.core.impl.b.q(sb, this.b, ')');
    }
}
