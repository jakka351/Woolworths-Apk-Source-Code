package au.com.woolworths.foundation.feature.analytics.list;

import androidx.compose.runtime.Stable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/feature/analytics/list/ListItemKeyToEvent;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListItemKeyToEvent<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8492a;
    public final Object b;

    public ListItemKeyToEvent(String key, Object obj) {
        Intrinsics.h(key, "key");
        this.f8492a = key;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListItemKeyToEvent)) {
            return false;
        }
        ListItemKeyToEvent listItemKeyToEvent = (ListItemKeyToEvent) obj;
        return Intrinsics.c(this.f8492a, listItemKeyToEvent.f8492a) && Intrinsics.c(this.b, listItemKeyToEvent.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8492a.hashCode() * 31);
    }

    public final String toString() {
        return "ListItemKeyToEvent(key=" + this.f8492a + ", event=" + this.b + ")";
    }
}
