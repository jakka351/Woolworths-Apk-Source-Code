package au.com.woolworths.feature.shop.catalogue.productlist.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository", f = "SaleFinderProductListRepository.kt", l = {23}, m = "fetchCatalogueProductDetailsList")
/* loaded from: classes3.dex */
final class SaleFinderProductListRepository$fetchCatalogueProductDetailsList$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SaleFinderProductListRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaleFinderProductListRepository$fetchCatalogueProductDetailsList$1(SaleFinderProductListRepository saleFinderProductListRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = saleFinderProductListRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
