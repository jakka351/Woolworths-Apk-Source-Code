package au.com.woolworths.foundation.shop.cart.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/BuyMoreSaveMorePromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyMoreSaveMorePromotionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f8670a;
    public final String b;
    public final String c;
    public final boolean d;
    public final BuyMoreSaveMoreType e;
    public final AnalyticsData f;

    public BuyMoreSaveMorePromotionInfo(String str, String str2, String str3, boolean z, BuyMoreSaveMoreType buyMoreSaveMoreType, AnalyticsData analyticsData) {
        this.f8670a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = buyMoreSaveMoreType;
        this.f = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyMoreSaveMorePromotionInfo)) {
            return false;
        }
        BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo = (BuyMoreSaveMorePromotionInfo) obj;
        return Intrinsics.c(this.f8670a, buyMoreSaveMorePromotionInfo.f8670a) && Intrinsics.c(this.b, buyMoreSaveMorePromotionInfo.b) && Intrinsics.c(this.c, buyMoreSaveMorePromotionInfo.c) && this.d == buyMoreSaveMorePromotionInfo.d && this.e == buyMoreSaveMorePromotionInfo.e && Intrinsics.c(this.f, buyMoreSaveMorePromotionInfo.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + b.e(b.c(b.c(this.f8670a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("BuyMoreSaveMorePromotionInfo(offerId=", this.f8670a, ", title=", this.b, ", action=");
        d.A(this.c, ", isApplied=", ", type=", sbV, this.d);
        sbV.append(this.e);
        sbV.append(", clickAnalytics=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
