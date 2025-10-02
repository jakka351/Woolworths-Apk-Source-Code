package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscounts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutRewardsAndDiscounts {

    /* renamed from: a, reason: collision with root package name */
    public final String f10582a;
    public final ArrayList b;
    public final Object c;

    public CheckoutRewardsAndDiscounts(String str, ArrayList arrayList, List list) {
        this.f10582a = str;
        this.b = arrayList;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutRewardsAndDiscounts)) {
            return false;
        }
        CheckoutRewardsAndDiscounts checkoutRewardsAndDiscounts = (CheckoutRewardsAndDiscounts) obj;
        return this.f10582a.equals(checkoutRewardsAndDiscounts.f10582a) && this.b.equals(checkoutRewardsAndDiscounts.b) && this.c.equals(checkoutRewardsAndDiscounts.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.b(this.f10582a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return android.support.v4.media.session.a.o(this.c, ")", d.x("CheckoutRewardsAndDiscounts(title=", this.f10582a, ", rewardsAndDiscounts=", ", impressionAnalytics=", this.b));
    }
}
