package au.com.woolworths.feature.shop.storelocator.legacy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl", f = "LegacyStoreLocatorInteractorImpl.kt", l = {70, 71}, m = "getStoreDetail")
/* loaded from: classes3.dex */
final class LegacyStoreLocatorInteractorImpl$getStoreDetail$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ LegacyStoreLocatorInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyStoreLocatorInteractorImpl$getStoreDetail$1(LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = legacyStoreLocatorInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, this);
    }
}
