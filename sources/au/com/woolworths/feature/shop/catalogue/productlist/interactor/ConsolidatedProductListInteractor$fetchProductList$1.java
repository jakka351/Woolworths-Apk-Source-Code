package au.com.woolworths.feature.shop.catalogue.productlist.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.productlist.interactor.ConsolidatedProductListInteractor", f = "ConsolidatedProductListInteractor.kt", l = {27, 33}, m = "fetchProductList")
/* loaded from: classes3.dex */
final class ConsolidatedProductListInteractor$fetchProductList$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ConsolidatedProductListInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsolidatedProductListInteractor$fetchProductList$1(ConsolidatedProductListInteractor consolidatedProductListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = consolidatedProductListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, null, this);
    }
}
