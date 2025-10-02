package au.com.woolworths.shop.aem.components.model.herobanner;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerAction;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeroBannerAction {

    /* renamed from: a, reason: collision with root package name */
    public final String f10164a;
    public final AnalyticsData b;
    public final ActionType c;

    public HeroBannerAction(String str, AnalyticsData analyticsData, ActionType type) {
        Intrinsics.h(type, "type");
        this.f10164a = str;
        this.b = analyticsData;
        this.c = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroBannerAction)) {
            return false;
        }
        HeroBannerAction heroBannerAction = (HeroBannerAction) obj;
        return Intrinsics.c(this.f10164a, heroBannerAction.f10164a) && Intrinsics.c(this.b, heroBannerAction.b) && this.c == heroBannerAction.c;
    }

    public final int hashCode() {
        int iHashCode = this.f10164a.hashCode() * 31;
        AnalyticsData analyticsData = this.b;
        return this.c.hashCode() + ((iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31);
    }

    public final String toString() {
        return "HeroBannerAction(action=" + this.f10164a + ", analytics=" + this.b + ", type=" + this.c + ")";
    }
}
