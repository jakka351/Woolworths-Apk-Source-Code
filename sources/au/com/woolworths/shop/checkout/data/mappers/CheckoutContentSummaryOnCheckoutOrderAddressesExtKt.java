package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerInfo;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressGrocery;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressMarket;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddresses;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutContentSummaryOnCheckoutOrderAddressesExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [au.com.woolworths.shop.checkout.domain.model.address.OrderAddressGrocery] */
    public static final OrderAddresses a(CheckoutContentSummary.OnCheckoutOrderAddresses onCheckoutOrderAddresses) {
        Intrinsics.h(onCheckoutOrderAddresses, "<this>");
        String str = onCheckoutOrderAddresses.f22251a;
        ArrayList arrayList = onCheckoutOrderAddresses.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            OrderAddressMarket orderAddressMarket = null;
            if (!it.hasNext()) {
                break;
            }
            CheckoutContentSummary.AddressSection addressSection = (CheckoutContentSummary.AddressSection) it.next();
            CheckoutContentSummary.OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = addressSection.b;
            if (onCheckoutOrderGroceryAddress != null) {
                orderAddressMarket = new OrderAddressGrocery(onCheckoutOrderGroceryAddress.f22252a, onCheckoutOrderGroceryAddress.c, onCheckoutOrderGroceryAddress.b, onCheckoutOrderGroceryAddress.d);
            } else {
                CheckoutContentSummary.OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = addressSection.c;
                if (onCheckoutOrderMarketAddress != null) {
                    String str2 = onCheckoutOrderMarketAddress.f22253a;
                    String str3 = onCheckoutOrderMarketAddress.c;
                    String str4 = onCheckoutOrderMarketAddress.b;
                    ArrayList<CheckoutContentSummary.SellerInfo> arrayList3 = onCheckoutOrderMarketAddress.d;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                    for (CheckoutContentSummary.SellerInfo sellerInfo : arrayList3) {
                        Intrinsics.h(sellerInfo, "<this>");
                        arrayList4.add(new MarketSellerInfo(sellerInfo.f22293a, sellerInfo.b));
                    }
                    orderAddressMarket = new OrderAddressMarket(str2, str3, str4, arrayList4);
                }
            }
            if (orderAddressMarket != null) {
                arrayList2.add(orderAddressMarket);
            }
        }
        CheckoutContentSummary.InsetBanner insetBanner = onCheckoutOrderAddresses.c;
        return new OrderAddresses(str, arrayList2, insetBanner != null ? new InsetBannerApiData(InsetBannerDisplayTypeExtKt.a(insetBanner.f22241a), insetBanner.b, null, null, null, null, 32, null) : null);
    }
}
