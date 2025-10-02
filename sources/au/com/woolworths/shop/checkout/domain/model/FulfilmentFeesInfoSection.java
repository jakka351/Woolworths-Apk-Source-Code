package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentFeesInfoSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentFeesInfoSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f10603a;
    public final List b;

    public FulfilmentFeesInfoSection(String str, List list) {
        this.f10603a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentFeesInfoSection)) {
            return false;
        }
        FulfilmentFeesInfoSection fulfilmentFeesInfoSection = (FulfilmentFeesInfoSection) obj;
        return Intrinsics.c(this.f10603a, fulfilmentFeesInfoSection.f10603a) && Intrinsics.c(this.b, fulfilmentFeesInfoSection.b);
    }

    public final int hashCode() {
        String str = this.f10603a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("FulfilmentFeesInfoSection(title=", this.f10603a, ", items=", ")", this.b);
    }
}
