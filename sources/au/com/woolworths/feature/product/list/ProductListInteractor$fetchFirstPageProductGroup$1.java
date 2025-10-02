package au.com.woolworths.feature.product.list;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor", f = "ProductListInteractor.kt", l = {729, 764, 770}, m = "fetchFirstPageProductGroup")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchFirstPageProductGroup$1 extends ContinuationImpl {
    public Object p;
    public Ref.ObjectRef q;
    public Ref.ObjectRef r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ProductListInteractor u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchFirstPageProductGroup$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, null, null, false, null, this);
    }
}
