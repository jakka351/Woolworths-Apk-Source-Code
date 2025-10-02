package com.braintreepayments.api;

import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEventBlob;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnalyticsEventBlob {

    /* renamed from: a, reason: collision with root package name */
    public final String f13694a;
    public final long b;

    public AnalyticsEventBlob(String jsonString, long j) {
        Intrinsics.h(jsonString, "jsonString");
        this.f13694a = jsonString;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsEventBlob)) {
            return false;
        }
        AnalyticsEventBlob analyticsEventBlob = (AnalyticsEventBlob) obj;
        return Intrinsics.c(this.f13694a, analyticsEventBlob.f13694a) && this.b == analyticsEventBlob.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f13694a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsEventBlob(jsonString=");
        sb.append(this.f13694a);
        sb.append(", id=");
        return androidx.camera.core.impl.b.q(sb, this.b, ')');
    }
}
