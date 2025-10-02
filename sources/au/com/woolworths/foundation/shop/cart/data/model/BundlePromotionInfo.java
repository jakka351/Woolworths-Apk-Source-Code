package au.com.woolworths.foundation.shop.cart.data.model;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/BundlePromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BundlePromotionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f8669a;
    public final boolean b;
    public final BundleType c;
    public final boolean d;

    public BundlePromotionInfo(String str, boolean z, BundleType bundleType, boolean z2) {
        this.f8669a = str;
        this.b = z;
        this.c = bundleType;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlePromotionInfo)) {
            return false;
        }
        BundlePromotionInfo bundlePromotionInfo = (BundlePromotionInfo) obj;
        return Intrinsics.c(this.f8669a, bundlePromotionInfo.f8669a) && this.b == bundlePromotionInfo.b && this.c == bundlePromotionInfo.c && this.d == bundlePromotionInfo.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + b.e(this.f8669a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = a.q("BundlePromotionInfo(title=", this.f8669a, ", isApplied=", ", bundleType=", this.b);
        sbQ.append(this.c);
        sbQ.append(", isShowBanner=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
