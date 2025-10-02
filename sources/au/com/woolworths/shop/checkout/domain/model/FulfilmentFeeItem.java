package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentFeeItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentFeeItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10601a;
    public final String b;
    public final List c;

    public FulfilmentFeeItem(String str, String str2, List list) {
        this.f10601a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentFeeItem)) {
            return false;
        }
        FulfilmentFeeItem fulfilmentFeeItem = (FulfilmentFeeItem) obj;
        return Intrinsics.c(this.f10601a, fulfilmentFeeItem.f10601a) && Intrinsics.c(this.b, fulfilmentFeeItem.b) && Intrinsics.c(this.c, fulfilmentFeeItem.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10601a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return a.t(YU.a.v("FulfilmentFeeItem(title=", this.f10601a, ", subtitle=", this.b, ", prices="), this.c, ")");
    }
}
