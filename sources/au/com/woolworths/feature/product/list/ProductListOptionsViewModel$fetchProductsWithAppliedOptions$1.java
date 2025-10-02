package au.com.woolworths.feature.product.list;

import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListOptionsViewModel", f = "ProductListOptionsViewModel.kt", l = {479, 488}, m = "fetchProductsWithAppliedOptions")
/* loaded from: classes3.dex */
final class ProductListOptionsViewModel$fetchProductsWithAppliedOptions$1 extends ContinuationImpl {
    public Activities.ProductList.ExtraProductListSource p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ProductListOptionsViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListOptionsViewModel$fetchProductsWithAppliedOptions$1(ProductListOptionsViewModel productListOptionsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = productListOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.t6(null, this);
    }
}
