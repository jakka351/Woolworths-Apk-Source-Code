package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartImageTextBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartInlineMessage;
import au.com.woolworths.foundation.shop.cart.data.model.CartMarketplaceSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartSection;
import au.com.woolworths.foundation.shop.cart.data.model.EverydayMarketCouponBannerDataSection;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceSeller;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartViewModelKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final ArrayList a(Cart cart) {
        ?? arrayList;
        Intrinsics.h(cart, "<this>");
        ArrayList<CartSection> arrayList2 = cart.d;
        ArrayList arrayList3 = new ArrayList();
        for (CartSection cartSection : arrayList2) {
            if (cartSection instanceof CartProductSection) {
                ArrayList arrayList4 = ((CartProductSection) cartSection).c;
                arrayList = new ArrayList();
                for (Object obj : arrayList4) {
                    if (obj instanceof CartProductCard) {
                        arrayList.add(obj);
                    }
                }
            } else if (cartSection instanceof CartPromotionSection) {
                ArrayList arrayList5 = ((CartPromotionSection) cartSection).c;
                arrayList = new ArrayList();
                for (Object obj2 : arrayList5) {
                    if (obj2 instanceof CartProductCard) {
                        arrayList.add(obj2);
                    }
                }
            } else if (cartSection instanceof CartMarketplaceSection) {
                ArrayList arrayList6 = ((CartMarketplaceSection) cartSection).d;
                arrayList = new ArrayList();
                Iterator it = arrayList6.iterator();
                while (it.hasNext()) {
                    Iterable iterable = (Iterable) ((MarketplaceSeller) it.next()).c;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (obj3 instanceof CartProductCard) {
                            arrayList7.add(obj3);
                        }
                    }
                    CollectionsKt.h(arrayList7, arrayList);
                }
            } else {
                boolean z = cartSection instanceof CartInlineMessage;
                EmptyList emptyList = EmptyList.d;
                if (!z && !(cartSection instanceof CartImageTextBanner) && !(cartSection instanceof CartBanner) && !(cartSection instanceof EverydayMarketCouponBannerDataSection)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = emptyList;
            }
            CollectionsKt.h((Iterable) arrayList, arrayList3);
        }
        return arrayList3;
    }
}
