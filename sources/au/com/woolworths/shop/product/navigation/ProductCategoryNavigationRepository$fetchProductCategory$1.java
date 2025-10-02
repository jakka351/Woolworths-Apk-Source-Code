package au.com.woolworths.shop.product.navigation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository", f = "ProductCategoryNavigationRepository.kt", l = {34}, m = "fetchProductCategory")
/* loaded from: classes4.dex */
final class ProductCategoryNavigationRepository$fetchProductCategory$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductCategoryNavigationRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCategoryNavigationRepository$fetchProductCategory$1(ProductCategoryNavigationRepository productCategoryNavigationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productCategoryNavigationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, null, this);
    }
}
