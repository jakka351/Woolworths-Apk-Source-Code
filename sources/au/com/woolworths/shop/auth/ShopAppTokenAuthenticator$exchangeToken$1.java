package au.com.woolworths.shop.auth;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator", f = "ShopAppTokenAuthenticator.kt", l = {286}, m = "exchangeToken")
/* loaded from: classes4.dex */
final class ShopAppTokenAuthenticator$exchangeToken$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShopAppTokenAuthenticator q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppTokenAuthenticator$exchangeToken$1(ShopAppTokenAuthenticator shopAppTokenAuthenticator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shopAppTokenAuthenticator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return ShopAppTokenAuthenticator.b(this.q, null, this);
    }
}
