package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.SharedStateStatus;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/SharedState;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SharedState {

    /* renamed from: a, reason: collision with root package name */
    public final int f13187a;
    public final SharedStateStatus b;
    public final Map c;

    public SharedState(int i, SharedStateStatus sharedStateStatus, Map map) {
        this.f13187a = i;
        this.b = sharedStateStatus;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedState)) {
            return false;
        }
        SharedState sharedState = (SharedState) obj;
        return this.f13187a == sharedState.f13187a && this.b == sharedState.b && Intrinsics.c(this.c, sharedState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f13187a) * 31)) * 31;
        Map map = this.c;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharedState(version=");
        sb.append(this.f13187a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", data=");
        return android.support.v4.media.session.a.u(sb, this.c, ')');
    }
}
