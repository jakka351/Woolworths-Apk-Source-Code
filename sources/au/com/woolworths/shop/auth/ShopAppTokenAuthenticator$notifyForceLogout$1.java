package au.com.woolworths.shop.auth;

import au.com.woolworths.android.onesite.network.RefreshTokenListener;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator", f = "ShopAppTokenAuthenticator.kt", l = {307}, m = "notifyForceLogout")
/* loaded from: classes4.dex */
final class ShopAppTokenAuthenticator$notifyForceLogout$1 extends ContinuationImpl {
    public Throwable p;
    public Iterator q;
    public RefreshTokenListener.Callback r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ShopAppTokenAuthenticator t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppTokenAuthenticator$notifyForceLogout$1(ShopAppTokenAuthenticator shopAppTokenAuthenticator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = shopAppTokenAuthenticator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return ShopAppTokenAuthenticator.c(this.t, null, null, this);
    }
}
