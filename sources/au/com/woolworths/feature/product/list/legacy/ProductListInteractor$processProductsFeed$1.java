package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.feature.product.list.legacy.data.ProductListData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor", f = "ProductListInteractor.kt", l = {822, 824}, m = "processProductsFeed")
/* loaded from: classes3.dex */
final class ProductListInteractor$processProductsFeed$1 extends ContinuationImpl {
    public ProductListData p;
    public Ref.ObjectRef q;
    public FirebasePerfMonitor r;
    public Ref.ObjectRef s;
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductListInteractor v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$processProductsFeed$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.w(null, false, this);
    }
}
