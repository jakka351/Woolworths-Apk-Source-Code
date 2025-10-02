package au.com.woolworths.shop.checkout.domain.model.timeselector;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/timeselector/FulfilmentWindowsFooterV2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsFooterV2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10672a;
    public final String b;
    public final boolean c;

    public FulfilmentWindowsFooterV2(String str, String str2, boolean z) {
        this.f10672a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsFooterV2)) {
            return false;
        }
        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV2 = (FulfilmentWindowsFooterV2) obj;
        return Intrinsics.c(this.f10672a, fulfilmentWindowsFooterV2.f10672a) && Intrinsics.c(this.b, fulfilmentWindowsFooterV2.b) && this.c == fulfilmentWindowsFooterV2.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.c(this.f10672a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.k(")", a.v("FulfilmentWindowsFooterV2(title=", this.f10672a, ", subtitle=", this.b, ", isSpecial="), this.c);
    }
}
