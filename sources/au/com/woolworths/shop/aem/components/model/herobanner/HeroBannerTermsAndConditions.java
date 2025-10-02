package au.com.woolworths.shop.aem.components.model.herobanner;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerTermsAndConditions;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeroBannerTermsAndConditions {

    /* renamed from: a, reason: collision with root package name */
    public final String f10165a;
    public final ActionData b;

    public HeroBannerTermsAndConditions(String str, ActionData actionData) {
        this.f10165a = str;
        this.b = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroBannerTermsAndConditions)) {
            return false;
        }
        HeroBannerTermsAndConditions heroBannerTermsAndConditions = (HeroBannerTermsAndConditions) obj;
        return Intrinsics.c(this.f10165a, heroBannerTermsAndConditions.f10165a) && Intrinsics.c(this.b, heroBannerTermsAndConditions.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10165a.hashCode() * 31;
        ActionData actionData = this.b;
        return iHashCode + (actionData == null ? 0 : actionData.hashCode());
    }

    public final String toString() {
        return "HeroBannerTermsAndConditions(text=" + this.f10165a + ", action=" + this.b + ")";
    }
}
