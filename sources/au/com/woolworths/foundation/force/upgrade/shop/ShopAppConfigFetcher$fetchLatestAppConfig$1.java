package au.com.woolworths.foundation.force.upgrade.shop;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher", f = "ShopAppConfigFetcher.kt", l = {25}, m = "fetchLatestAppConfig")
/* loaded from: classes4.dex */
final class ShopAppConfigFetcher$fetchLatestAppConfig$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShopAppConfigFetcher q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppConfigFetcher$fetchLatestAppConfig$1(ShopAppConfigFetcher shopAppConfigFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shopAppConfigFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
