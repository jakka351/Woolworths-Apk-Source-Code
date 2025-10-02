package au.com.woolworths.feature.shop.bundles.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundleCartQuantityUpdate;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundleCartQuantityUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final String f6754a;
    public final double b;
    public final String c;
    public final String d;
    public final double e;
    public final double f;

    public BundleCartQuantityUpdate(String productId, double d, String str, String str2, double d2, double d3) {
        Intrinsics.h(productId, "productId");
        this.f6754a = productId;
        this.b = d;
        this.c = str;
        this.d = str2;
        this.e = d2;
        this.f = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleCartQuantityUpdate)) {
            return false;
        }
        BundleCartQuantityUpdate bundleCartQuantityUpdate = (BundleCartQuantityUpdate) obj;
        return Intrinsics.c(this.f6754a, bundleCartQuantityUpdate.f6754a) && Double.compare(this.b, bundleCartQuantityUpdate.b) == 0 && Intrinsics.c(this.c, bundleCartQuantityUpdate.c) && Intrinsics.c(this.d, bundleCartQuantityUpdate.d) && Double.compare(this.e, bundleCartQuantityUpdate.e) == 0 && Double.compare(this.f, bundleCartQuantityUpdate.f) == 0;
    }

    public final int hashCode() {
        int iA = a.a(this.b, this.f6754a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Double.hashCode(this.f) + a.a(this.e, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "BundleCartQuantityUpdate(productId=", this.f6754a, ", quantity=");
        androidx.constraintlayout.core.state.a.B(sbR, ", adId=", this.c, ", source=", this.d);
        au.com.woolworths.android.onesite.a.z(sbR, ", maximum=", this.e, ", increment=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
