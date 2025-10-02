package au.com.woolworths.feature.shop.storelocator;

import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl", f = "StoreLocatorInteractorImpl.kt", l = {52}, m = "saveInStoreLocation")
/* loaded from: classes3.dex */
final class StoreLocatorInteractorImpl$saveInStoreLocation$1 extends ContinuationImpl {
    public Store p;
    public /* synthetic */ Object q;
    public final /* synthetic */ StoreLocatorInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorInteractorImpl$saveInStoreLocation$1(StoreLocatorInteractorImpl storeLocatorInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = storeLocatorInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
