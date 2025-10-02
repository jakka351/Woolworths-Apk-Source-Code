package au.com.woolworths.feature.shop.bundles;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesRepository", f = "BundlesRepository.kt", l = {58}, m = "fetchBundlesPage")
/* loaded from: classes3.dex */
final class BundlesRepository$fetchBundlesPage$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BundlesRepository r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesRepository$fetchBundlesPage$1(BundlesRepository bundlesRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = bundlesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, false, null, null, null, this);
    }
}
