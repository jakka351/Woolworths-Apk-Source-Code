package au.com.woolworths.shop.checkout.domain.model.substitution;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/CheaperSubstitutesSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheaperSubstitutesSection {

    /* renamed from: a, reason: collision with root package name */
    public final BroadcastBannerData f10658a;

    public CheaperSubstitutesSection(BroadcastBannerData broadcastBannerData) {
        this.f10658a = broadcastBannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheaperSubstitutesSection) && Intrinsics.c(this.f10658a, ((CheaperSubstitutesSection) obj).f10658a);
    }

    public final int hashCode() {
        BroadcastBannerData broadcastBannerData = this.f10658a;
        if (broadcastBannerData == null) {
            return 0;
        }
        return broadcastBannerData.hashCode();
    }

    public final String toString() {
        return "CheaperSubstitutesSection(banner=" + this.f10658a + ")";
    }
}
