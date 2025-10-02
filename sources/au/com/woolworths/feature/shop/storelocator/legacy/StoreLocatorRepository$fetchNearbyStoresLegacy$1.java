package au.com.woolworths.feature.shop.storelocator.legacy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository", f = "StoreLocatorRepository.kt", l = {35}, m = "fetchNearbyStoresLegacy")
/* loaded from: classes3.dex */
final class StoreLocatorRepository$fetchNearbyStoresLegacy$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ StoreLocatorRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorRepository$fetchNearbyStoresLegacy$1(StoreLocatorRepository storeLocatorRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = storeLocatorRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(0.0d, 0.0d, null, this);
    }
}
