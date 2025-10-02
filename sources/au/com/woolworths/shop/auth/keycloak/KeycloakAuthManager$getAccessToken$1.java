package au.com.woolworths.shop.auth.keycloak;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager", f = "KeycloakAuthManager.kt", l = {127}, m = "getAccessToken")
/* loaded from: classes4.dex */
final class KeycloakAuthManager$getAccessToken$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ KeycloakAuthManager q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakAuthManager$getAccessToken$1(KeycloakAuthManager keycloakAuthManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = keycloakAuthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
