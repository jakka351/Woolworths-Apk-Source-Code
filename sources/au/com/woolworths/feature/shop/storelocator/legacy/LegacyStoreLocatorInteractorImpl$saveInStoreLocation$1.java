package au.com.woolworths.feature.shop.storelocator.legacy;

import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl", f = "LegacyStoreLocatorInteractorImpl.kt", l = {58}, m = "saveInStoreLocation")
/* loaded from: classes3.dex */
final class LegacyStoreLocatorInteractorImpl$saveInStoreLocation$1 extends ContinuationImpl {
    public StoreLocatorResult.Store p;
    public /* synthetic */ Object q;
    public final /* synthetic */ LegacyStoreLocatorInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyStoreLocatorInteractorImpl$saveInStoreLocation$1(LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = legacyStoreLocatorInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
