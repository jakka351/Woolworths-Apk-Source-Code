package au.com.woolworths.shop.checkout.domain.model;

import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.address.MarketFulfilmentAddressStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MarketFulfilmentAddressStatus.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MarketFulfilmentAddressStatus marketFulfilmentAddressStatus = MarketFulfilmentAddressStatus.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final CheckoutRewardsAndDiscount.StoreCredit a(Checkout checkout) {
        Intrinsics.h(checkout, "<this>");
        List list = checkout.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CheckoutRewardsAndDiscounts) {
                arrayList.add(obj);
            }
        }
        CheckoutRewardsAndDiscounts checkoutRewardsAndDiscounts = (CheckoutRewardsAndDiscounts) CollectionsKt.F(arrayList);
        if (checkoutRewardsAndDiscounts == null) {
            return null;
        }
        ArrayList arrayList2 = checkoutRewardsAndDiscounts.b;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof CheckoutRewardsAndDiscount.StoreCredit) {
                arrayList3.add(obj2);
            }
        }
        return (CheckoutRewardsAndDiscount.StoreCredit) CollectionsKt.F(arrayList3);
    }
}
