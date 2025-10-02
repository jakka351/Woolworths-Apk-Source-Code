package au.com.woolworths.shop.product.details;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl", f = "ProductDetailsPageInteractor.kt", l = {142, 159}, m = "fetchNodeContent")
/* loaded from: classes4.dex */
final class ProductDetailsPageInteractorImpl$fetchNodeContent$1 extends ContinuationImpl {
    public String p;
    public List q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ProductDetailsPageInteractorImpl t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsPageInteractorImpl$fetchNodeContent$1(ProductDetailsPageInteractorImpl productDetailsPageInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = productDetailsPageInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(null, null, this);
    }
}
