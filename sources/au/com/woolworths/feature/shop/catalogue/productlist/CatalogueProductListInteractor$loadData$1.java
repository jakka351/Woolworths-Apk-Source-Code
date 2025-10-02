package au.com.woolworths.feature.shop.catalogue.productlist;

import au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor", f = "CatalogueProductListInteractor.kt", l = {36, 37, 48, 49}, m = "loadData")
/* loaded from: classes3.dex */
final class CatalogueProductListInteractor$loadData$1 extends ContinuationImpl {
    public ProductList p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CatalogueProductListInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueProductListInteractor$loadData$1(CatalogueProductListInteractor catalogueProductListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = catalogueProductListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, null, this);
    }
}
