package au.com.woolworths.feature.shop.bundles;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesRepository", f = "BundlesRepository.kt", l = {80}, m = "updateCartBundleQuantities")
/* loaded from: classes3.dex */
final class BundlesRepository$updateCartBundleQuantities$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BundlesRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesRepository$updateCartBundleQuantities$1(BundlesRepository bundlesRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = bundlesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, this);
    }
}
