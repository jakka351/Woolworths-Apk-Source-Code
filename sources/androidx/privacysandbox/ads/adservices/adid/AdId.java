package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdId;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdId {

    /* renamed from: a, reason: collision with root package name */
    public final String f3615a;
    public final boolean b;

    public AdId(String str, boolean z) {
        this.f3615a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return Intrinsics.c(this.f3615a, adId.f3615a) && this.b == adId.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f3615a.hashCode() * 31);
    }

    public final String toString() {
        return "AdId: adId=" + this.f3615a + ", isLimitAdTrackingEnabled=" + this.b;
    }
}
