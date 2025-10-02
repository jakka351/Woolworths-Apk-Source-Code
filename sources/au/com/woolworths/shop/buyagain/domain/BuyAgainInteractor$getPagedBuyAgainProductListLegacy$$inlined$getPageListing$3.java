package au.com.woolworths.shop.buyagain.domain;

import androidx.lifecycle.LiveData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$3 implements Function1<PageKeyedPagingSource<Integer, ProductCard>, LiveData<NetworkState>> {
    public static final BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$3 d = new BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$3();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PageKeyedPagingSource) obj).e;
    }
}
