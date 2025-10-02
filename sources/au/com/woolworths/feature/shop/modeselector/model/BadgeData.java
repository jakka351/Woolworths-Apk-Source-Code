package au.com.woolworths.feature.shop.modeselector.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.badge.BadgeTypeApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/BadgeData;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BadgeData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7524a;
    public final BadgeTypeApiData b;

    public BadgeData(String label, BadgeTypeApiData type) {
        Intrinsics.h(label, "label");
        Intrinsics.h(type, "type");
        this.f7524a = label;
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeData)) {
            return false;
        }
        BadgeData badgeData = (BadgeData) obj;
        return Intrinsics.c(this.f7524a, badgeData.f7524a) && this.b == badgeData.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7524a.hashCode() * 31);
    }

    public final String toString() {
        return "BadgeData(label=" + this.f7524a + ", type=" + this.b + ")";
    }
}
