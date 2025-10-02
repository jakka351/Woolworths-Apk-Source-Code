package au.com.woolworths.shop.checkout.domain.model.timeselector;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/timeselector/FulfilmentBottomSheet;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentBottomSheet {

    /* renamed from: a, reason: collision with root package name */
    public final String f10670a;
    public final String b;

    public FulfilmentBottomSheet(String str, String str2) {
        this.f10670a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentBottomSheet)) {
            return false;
        }
        FulfilmentBottomSheet fulfilmentBottomSheet = (FulfilmentBottomSheet) obj;
        return Intrinsics.c(this.f10670a, fulfilmentBottomSheet.f10670a) && Intrinsics.c(this.b, fulfilmentBottomSheet.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10670a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("FulfilmentBottomSheet(title=", this.f10670a, ", body=", this.b, ")");
    }
}
