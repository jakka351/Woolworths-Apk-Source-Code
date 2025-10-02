package au.com.woolworths.foundation.wxid.shop;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.wxid.shop.ShopWxidFetcher", f = "ShopWxidFetcher.kt", l = {21}, m = "fetchWxid")
/* loaded from: classes4.dex */
final class ShopWxidFetcher$fetchWxid$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShopWxidFetcher q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWxidFetcher$fetchWxid$1(ShopWxidFetcher shopWxidFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shopWxidFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
