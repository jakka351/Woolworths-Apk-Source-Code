package au.com.woolworths.promotion.banner.ui;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionBanner;", "", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromotionBanner {

    /* renamed from: a, reason: collision with root package name */
    public final InsetBannerData f9341a;
    public final PromotionBannerAction b;

    public PromotionBanner(InsetBannerData insetBannerData, PromotionBannerAction promotionBannerAction) {
        this.f9341a = insetBannerData;
        this.b = promotionBannerAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionBanner)) {
            return false;
        }
        PromotionBanner promotionBanner = (PromotionBanner) obj;
        return Intrinsics.c(this.f9341a, promotionBanner.f9341a) && Intrinsics.c(this.b, promotionBanner.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9341a.hashCode() * 31);
    }

    public final String toString() {
        return "PromotionBanner(banner=" + this.f9341a + ", action=" + this.b + ")";
    }
}
