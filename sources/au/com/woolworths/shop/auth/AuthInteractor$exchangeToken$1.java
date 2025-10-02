package au.com.woolworths.shop.auth;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.AuthInteractor", f = "AuthInteractor.kt", l = {15}, m = "exchangeToken")
/* loaded from: classes4.dex */
final class AuthInteractor$exchangeToken$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ AuthInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthInteractor$exchangeToken$1(AuthInteractor authInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = authInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
