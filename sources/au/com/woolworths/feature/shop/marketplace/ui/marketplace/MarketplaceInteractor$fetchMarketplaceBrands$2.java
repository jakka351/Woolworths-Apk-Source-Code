package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor", f = "MarketplaceInteractor.kt", l = {37}, m = "fetchMarketplaceBrands")
/* loaded from: classes3.dex */
final class MarketplaceInteractor$fetchMarketplaceBrands$2 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MarketplaceInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceInteractor$fetchMarketplaceBrands$2(MarketplaceInteractor marketplaceInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = marketplaceInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
