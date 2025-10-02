package au.com.woolworths.foundation.rewards.common.ui.banners.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/banners/data/MandyBanner;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MandyBanner {

    /* renamed from: a, reason: collision with root package name */
    public final String f8574a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public MandyBanner(String str, String str2, String str3, String str4, String str5) {
        this.f8574a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandyBanner)) {
            return false;
        }
        MandyBanner mandyBanner = (MandyBanner) obj;
        return Intrinsics.c(this.f8574a, mandyBanner.f8574a) && Intrinsics.c(this.b, mandyBanner.b) && Intrinsics.c(this.c, mandyBanner.c) && Intrinsics.c(this.d, mandyBanner.d) && Intrinsics.c(this.e, mandyBanner.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(b.c(b.c(this.f8574a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbV = a.v("MandyBanner(mandyImageUrl=", this.f8574a, ", mandyBannerTitle=", this.b, ", mandyBannerDescription=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", mandyBannerAction=", this.d, ", mandyBannerActionUrl=");
        return a.o(sbV, this.e, ")");
    }
}
