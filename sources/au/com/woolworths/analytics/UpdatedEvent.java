package au.com.woolworths.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/UpdatedEvent;", "Lau/com/woolworths/analytics/Event;", "specs-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class UpdatedEvent implements Event {
    public final String d;
    public final LinkedHashMap e;
    public final String f;
    public final EventConfig g;

    public UpdatedEvent(String tealiumKey, LinkedHashMap linkedHashMap, String str, EventConfig config) {
        Intrinsics.h(tealiumKey, "tealiumKey");
        Intrinsics.h(config, "config");
        this.d = tealiumKey;
        this.e = linkedHashMap;
        this.f = str;
        this.g = config;
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: c, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedEvent)) {
            return false;
        }
        UpdatedEvent updatedEvent = (UpdatedEvent) obj;
        return Intrinsics.c(this.d, updatedEvent.d) && this.e.equals(updatedEvent.e) && Intrinsics.c(this.f, updatedEvent.f) && Intrinsics.c(this.g, updatedEvent.g);
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: getConfig, reason: from getter */
    public final EventConfig getG() {
        return this.g;
    }

    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        String str = this.f;
        return Boolean.hashCode(this.g.f4017a) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "UpdatedEvent(tealiumKey=" + this.d + ", data=" + this.e + ", firebaseEventName=" + this.f + ", config=" + this.g + ")";
    }
}
