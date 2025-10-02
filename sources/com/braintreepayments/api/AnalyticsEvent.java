package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEvent;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnalyticsEvent {

    /* renamed from: a, reason: collision with root package name */
    public final String f13693a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;
    public final long i;

    public AnalyticsEvent(String str, String str2, boolean z, boolean z2, Long l, Long l2, String str3, long j, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        l = (i & 32) != 0 ? null : l;
        l2 = (i & 64) != 0 ? null : l2;
        str3 = (i & 128) != 0 ? null : str3;
        j = (i & 256) != 0 ? System.currentTimeMillis() : j;
        this.f13693a = str;
        this.b = str2;
        this.c = null;
        this.d = z;
        this.e = z2;
        this.f = l;
        this.g = l2;
        this.h = str3;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        return Intrinsics.c(this.f13693a, analyticsEvent.f13693a) && Intrinsics.c(this.b, analyticsEvent.b) && Intrinsics.c(this.c, analyticsEvent.c) && this.d == analyticsEvent.d && this.e == analyticsEvent.e && Intrinsics.c(this.f, analyticsEvent.f) && Intrinsics.c(this.g, analyticsEvent.g) && Intrinsics.c(this.h, analyticsEvent.h) && this.i == analyticsEvent.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f13693a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode3 + i) * 31;
        boolean z2 = this.e;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Long l = this.f;
        int iHashCode4 = (i3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.h;
        return Long.hashCode(this.i) + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsEvent(name=");
        sb.append(this.f13693a);
        sb.append(", payPalContextId=");
        sb.append(this.b);
        sb.append(", linkType=");
        sb.append(this.c);
        sb.append(", venmoInstalled=");
        sb.append(this.d);
        sb.append(", isVaultRequest=");
        sb.append(this.e);
        sb.append(", startTime=");
        sb.append(this.f);
        sb.append(", endTime=");
        sb.append(this.g);
        sb.append(", endpoint=");
        sb.append(this.h);
        sb.append(", timestamp=");
        return androidx.camera.core.impl.b.q(sb, this.i, ')');
    }
}
