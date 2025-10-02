package com.braintreepayments.api;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEventParams;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final /* data */ class AnalyticsEventParams {

    /* renamed from: a, reason: collision with root package name */
    public String f13696a = null;
    public boolean b = false;
    public final Long c;
    public final Long d;
    public final String e;

    public AnalyticsEventParams(String str, Long l, Long l2) {
        this.c = l;
        this.d = l2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsEventParams)) {
            return false;
        }
        AnalyticsEventParams analyticsEventParams = (AnalyticsEventParams) obj;
        return Intrinsics.c(this.f13696a, analyticsEventParams.f13696a) && this.b == analyticsEventParams.b && Intrinsics.c(this.c, analyticsEventParams.c) && Intrinsics.c(this.d, analyticsEventParams.d) && Intrinsics.c(this.e, analyticsEventParams.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f13696a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 961;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        Long l = this.c;
        int iHashCode2 = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsEventParams(payPalContextId=");
        sb.append(this.f13696a);
        sb.append(", linkType=null, isVaultRequest=");
        sb.append(this.b);
        sb.append(", startTime=");
        sb.append(this.c);
        sb.append(", endTime=");
        sb.append(this.d);
        sb.append(", endpoint=");
        return androidx.camera.core.impl.b.r(sb, this.e, ')');
    }
}
