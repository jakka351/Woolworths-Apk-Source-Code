package au.com.woolworths.shop.lists.data.workers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker", f = "ProductsSyncWorker.kt", l = {23, 24}, m = "doWork")
/* loaded from: classes.dex */
final class ProductsSyncWorker$doWork$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductsSyncWorker q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsSyncWorker$doWork$1(ProductsSyncWorker productsSyncWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productsSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
