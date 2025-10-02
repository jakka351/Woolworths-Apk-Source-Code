package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/MandyBanner;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MandyBanner implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final String f6272a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public MandyBanner(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f6272a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandyBanner)) {
            return false;
        }
        MandyBanner mandyBanner = (MandyBanner) obj;
        return Intrinsics.c(this.f6272a, mandyBanner.f6272a) && Intrinsics.c(this.b, mandyBanner.b) && Intrinsics.c(this.c, mandyBanner.c) && Intrinsics.c(this.d, mandyBanner.d) && Intrinsics.c(this.e, mandyBanner.e) && Intrinsics.c(this.f, mandyBanner.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(b.c(b.c(b.c(this.f6272a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("MandyBanner(id=", this.f6272a, ", mandyImageUrl=", this.b, ", mandyBannerTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", mandyBannerDescription=", this.d, ", mandyBannerAction=");
        return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", mandyBannerActionUrl=", this.f, ")");
    }
}
