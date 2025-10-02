package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderViewModel", f = "ProductFinderViewModel.kt", l = {117}, m = "fetchRecentSearches")
/* loaded from: classes3.dex */
final class ProductFinderViewModel$fetchRecentSearches$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductFinderViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFinderViewModel$fetchRecentSearches$1(ProductFinderViewModel productFinderViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productFinderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return ProductFinderViewModel.p6(this.q, this);
    }
}
