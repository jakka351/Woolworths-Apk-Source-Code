package au.com.woolworths.auth.auth0;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.auth.auth0.Auth0AuthManager", f = "Auth0AuthManager.kt", l = {175}, m = "getAccessToken")
/* loaded from: classes3.dex */
final class Auth0AuthManager$getAccessToken$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ Auth0AuthManager q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Auth0AuthManager$getAccessToken$1(Auth0AuthManager auth0AuthManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = auth0AuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
