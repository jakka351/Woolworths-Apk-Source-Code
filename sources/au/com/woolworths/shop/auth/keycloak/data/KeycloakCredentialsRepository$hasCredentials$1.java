package au.com.woolworths.shop.auth.keycloak.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.keycloak.data.KeycloakCredentialsRepository", f = "KeycloakCredentialsRepository.kt", l = {42}, m = "hasCredentials")
/* loaded from: classes4.dex */
final class KeycloakCredentialsRepository$hasCredentials$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ KeycloakCredentialsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakCredentialsRepository$hasCredentials$1(KeycloakCredentialsRepository keycloakCredentialsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = keycloakCredentialsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(this);
    }
}
