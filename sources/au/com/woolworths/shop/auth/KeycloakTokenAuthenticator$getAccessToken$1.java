package au.com.woolworths.shop.auth;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.KeycloakTokenAuthenticator", f = "KeycloakTokenAuthenticator.kt", l = {67, 50, 55, 56}, m = "getAccessToken")
/* loaded from: classes4.dex */
final class KeycloakTokenAuthenticator$getAccessToken$1 extends ContinuationImpl {
    public Mutex p;
    public /* synthetic */ Object q;
    public final /* synthetic */ KeycloakTokenAuthenticator r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakTokenAuthenticator$getAccessToken$1(KeycloakTokenAuthenticator keycloakTokenAuthenticator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = keycloakTokenAuthenticator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return KeycloakTokenAuthenticator.b(this.r, this);
    }
}
