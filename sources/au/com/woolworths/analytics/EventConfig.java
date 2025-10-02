package au.com.woolworths.analytics;

import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/EventConfig;", "", "specs-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventConfig {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4017a;

    public EventConfig(boolean z) {
        this.f4017a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventConfig) && this.f4017a == ((EventConfig) obj).f4017a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4017a);
    }

    public final String toString() {
        return a.n("EventConfig(forceBundle=", ")", this.f4017a);
    }
}
