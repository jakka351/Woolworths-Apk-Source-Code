package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.LiveData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$3 implements Function1<PageKeyedPagingSource<Integer, Object>, LiveData<NetworkState>> {
    public static final ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$3 d = new ProductListInteractor$fetchProductListByProductGroup$$inlined$getPageListing$3();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PageKeyedPagingSource) obj).e;
    }
}
