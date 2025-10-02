package au.com.woolworths.feature.shop.storelocator;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.StoreLocatorRepositoryImpl", f = "StoreLocatorRepositoryImpl.kt", l = {47}, m = "fetchNearbyStores")
/* loaded from: classes3.dex */
final class StoreLocatorRepositoryImpl$fetchNearbyStores$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ StoreLocatorRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorRepositoryImpl$fetchNearbyStores$1(StoreLocatorRepositoryImpl storeLocatorRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = storeLocatorRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(0.0d, 0.0d, this);
    }
}
