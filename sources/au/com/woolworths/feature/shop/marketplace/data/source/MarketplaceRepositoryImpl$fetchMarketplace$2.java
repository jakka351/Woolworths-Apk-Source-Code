package au.com.woolworths.feature.shop.marketplace.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.data.source.MarketplaceRepositoryImpl", f = "MarketplaceRepositoryImpl.kt", l = {69}, m = "fetchMarketplace")
/* loaded from: classes3.dex */
final class MarketplaceRepositoryImpl$fetchMarketplace$2 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MarketplaceRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceRepositoryImpl$fetchMarketplace$2(MarketplaceRepositoryImpl marketplaceRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = marketplaceRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, false, this);
    }
}
