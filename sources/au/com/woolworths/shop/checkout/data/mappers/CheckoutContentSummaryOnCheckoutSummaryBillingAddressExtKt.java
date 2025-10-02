package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddress;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutContentSummaryOnCheckoutSummaryBillingAddressExtKt {
    public static final CheckoutSummaryBillingAddress a(CheckoutContentSummary.OnCheckoutSummaryBillingAddress onCheckoutSummaryBillingAddress) {
        Intrinsics.h(onCheckoutSummaryBillingAddress, "<this>");
        return new CheckoutSummaryBillingAddress(onCheckoutSummaryBillingAddress.f22263a, onCheckoutSummaryBillingAddress.b);
    }
}
