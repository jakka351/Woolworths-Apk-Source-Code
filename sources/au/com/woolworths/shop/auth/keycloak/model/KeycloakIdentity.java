package au.com.woolworths.shop.auth.keycloak.model;

import au.com.woolworths.auth.api.Identity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/model/KeycloakIdentity;", "Lau/com/woolworths/auth/api/Identity;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeycloakIdentity implements Identity {

    /* renamed from: a, reason: collision with root package name */
    public final KeycloakCredentials f10246a;

    public KeycloakIdentity(KeycloakCredentials credentials) {
        Intrinsics.h(credentials, "credentials");
        this.f10246a = credentials;
    }

    @Override // au.com.woolworths.auth.api.Identity
    public final String a() {
        return this.f10246a.b;
    }
}
