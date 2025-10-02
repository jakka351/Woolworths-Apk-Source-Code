package au.com.woolworths.foundation.advertising.data.google;

import YU.a;
import androidx.camera.core.impl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/CacheKey;", "", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class CacheKey {

    /* renamed from: a, reason: collision with root package name */
    public final String f8398a;
    public final String b;
    public final Map c;

    public CacheKey(String adUnitId, String templateId, Map map) {
        Intrinsics.h(adUnitId, "adUnitId");
        Intrinsics.h(templateId, "templateId");
        this.f8398a = adUnitId;
        this.b = templateId;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheKey)) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) obj;
        return Intrinsics.c(this.f8398a, cacheKey.f8398a) && Intrinsics.c(this.b, cacheKey.b) && Intrinsics.c(this.c, cacheKey.c);
    }

    public final int hashCode() {
        int iC = b.c(this.f8398a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return iC + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("CacheKey(adUnitId=", this.f8398a, ", templateId=", this.b, ", targeting=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
