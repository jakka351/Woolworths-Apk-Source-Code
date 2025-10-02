package au.com.woolworths.shop.auth.keycloak;

import android.net.Uri;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/auth/keycloak/KeycloakAuthManager$signInOrRegister$2$1", "Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthCallback;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeycloakAuthManager$signInOrRegister$2$1 implements KeycloakAuthCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f10236a;
    public final /* synthetic */ KeycloakAuthManager b;

    public KeycloakAuthManager$signInOrRegister$2$1(CancellableContinuationImpl cancellableContinuationImpl, KeycloakAuthManager keycloakAuthManager) {
        this.f10236a = cancellableContinuationImpl;
        this.b = keycloakAuthManager;
    }

    public final void a(Uri uri) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f), null, null, new KeycloakAuthManager$signInOrRegister$2$1$onSuccess$1(this.f10236a, uri, this.b, null), 3);
    }
}
