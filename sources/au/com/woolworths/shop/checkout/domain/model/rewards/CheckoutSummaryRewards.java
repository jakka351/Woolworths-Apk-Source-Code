package au.com.woolworths.shop.checkout.domain.model.rewards;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewards;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutSummaryRewards {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10654a;

    public CheckoutSummaryRewards(ArrayList arrayList) {
        this.f10654a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutSummaryRewards) && this.f10654a.equals(((CheckoutSummaryRewards) obj).f10654a);
    }

    public final int hashCode() {
        return this.f10654a.hashCode();
    }

    public final String toString() {
        return a.k("CheckoutSummaryRewards(rewardsSections=", ")", this.f10654a);
    }
}
