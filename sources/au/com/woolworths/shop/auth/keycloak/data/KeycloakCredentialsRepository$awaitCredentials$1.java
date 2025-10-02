package au.com.woolworths.shop.auth.keycloak.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository", f = "KeycloakCredentialsRepository.kt", l = {25, 30, 31}, m = "awaitCredentials")
/* loaded from: classes4.dex */
final class KeycloakCredentialsRepository$awaitCredentials$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ KeycloakCredentialsRepository r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakCredentialsRepository$awaitCredentials$1(KeycloakCredentialsRepository keycloakCredentialsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = keycloakCredentialsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
