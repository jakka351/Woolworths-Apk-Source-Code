package au.com.woolworths.shop.checkout.domain.model.rewards;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsUnregistered;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutSummaryRewardsUnregistered {

    /* renamed from: a, reason: collision with root package name */
    public final String f10657a;

    public CheckoutSummaryRewardsUnregistered(String str) {
        this.f10657a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutSummaryRewardsUnregistered) && Intrinsics.c(this.f10657a, ((CheckoutSummaryRewardsUnregistered) obj).f10657a);
    }

    public final int hashCode() {
        return this.f10657a.hashCode();
    }

    public final String toString() {
        return a.h("CheckoutSummaryRewardsUnregistered(buttonTitle=", this.f10657a, ")");
    }
}
