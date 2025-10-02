package au.com.woolworths.auth.auth0;

import au.com.woolworths.auth.api.Identity;
import com.auth0.android.result.Credentials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/auth/auth0/Auth0Identity;", "Lau/com/woolworths/auth/api/Identity;", "auth-auth0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Auth0Identity implements Identity {

    /* renamed from: a, reason: collision with root package name */
    public final Credentials f4607a;

    public Auth0Identity(Credentials credentials) {
        Intrinsics.h(credentials, "credentials");
        this.f4607a = credentials;
    }

    @Override // au.com.woolworths.auth.api.Identity
    public final String a() {
        return this.f4607a.getAccessToken();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Auth0Identity) && Intrinsics.c(this.f4607a, ((Auth0Identity) obj).f4607a);
    }

    public final int hashCode() {
        return this.f4607a.hashCode();
    }

    public final String toString() {
        return "Auth0Identity(credentials=" + this.f4607a + ")";
    }
}
