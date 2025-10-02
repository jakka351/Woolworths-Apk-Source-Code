package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentExtraInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentExtraInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f10600a;
    public final List b;

    public FulfilmentExtraInfo(String str, List list) {
        this.f10600a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentExtraInfo)) {
            return false;
        }
        FulfilmentExtraInfo fulfilmentExtraInfo = (FulfilmentExtraInfo) obj;
        return Intrinsics.c(this.f10600a, fulfilmentExtraInfo.f10600a) && Intrinsics.c(this.b, fulfilmentExtraInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10600a.hashCode() * 31);
    }

    public final String toString() {
        return a.i("FulfilmentExtraInfo(title=", this.f10600a, ", content=", ")", this.b);
    }
}
