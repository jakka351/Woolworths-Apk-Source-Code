package au.com.woolworths.android.onesite.app;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1", f = "BaseShopApplication.kt", l = {593}, m = "onForceLogout")
/* loaded from: classes3.dex */
final class BaseShopApplication$observerTokenRefresh$1$onForceLogout$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BaseShopApplication$observerTokenRefresh$1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShopApplication$observerTokenRefresh$1$onForceLogout$1(BaseShopApplication$observerTokenRefresh$1 baseShopApplication$observerTokenRefresh$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = baseShopApplication$observerTokenRefresh$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(this);
    }
}
