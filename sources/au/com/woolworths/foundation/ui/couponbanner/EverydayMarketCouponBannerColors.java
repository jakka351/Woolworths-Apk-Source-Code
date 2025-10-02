package au.com.woolworths.foundation.ui.couponbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/couponbanner/EverydayMarketCouponBannerColors;", "", "everydaymarket_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EverydayMarketCouponBannerColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f8914a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public EverydayMarketCouponBannerColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f8914a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayMarketCouponBannerColors)) {
            return false;
        }
        EverydayMarketCouponBannerColors everydayMarketCouponBannerColors = (EverydayMarketCouponBannerColors) obj;
        return Color.c(this.f8914a, everydayMarketCouponBannerColors.f8914a) && Color.c(this.b, everydayMarketCouponBannerColors.b) && Color.c(this.c, everydayMarketCouponBannerColors.c) && Color.c(this.d, everydayMarketCouponBannerColors.d) && Color.c(this.e, everydayMarketCouponBannerColors.e) && Color.c(this.f, everydayMarketCouponBannerColors.f);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.f) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.f8914a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = Color.i(this.f8914a);
        String strI2 = Color.i(this.b);
        String strI3 = Color.i(this.c);
        String strI4 = Color.i(this.d);
        String strI5 = Color.i(this.e);
        String strI6 = Color.i(this.f);
        StringBuilder sbV = YU.a.v("EverydayMarketCouponBannerColors(backgroundColor=", strI, ", descriptionTextColor=", strI2, ", codeTextColor=");
        androidx.constraintlayout.core.state.a.B(sbV, strI3, ", buttonDefaultColor=", strI4, ", buttonPressedColor=");
        return androidx.constraintlayout.core.state.a.l(sbV, strI5, ", termsAndConditionsTextColor=", strI6, ")");
    }
}
