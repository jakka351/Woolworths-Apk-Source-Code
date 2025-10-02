package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.LiveData;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$5 implements Function1<PageKeyedPagingSource<Integer, Object>, LiveData<Integer>> {
    public static final ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$5 d = new ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$5();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PageKeyedPagingSource) obj).f;
    }
}
