package au.com.woolworths.shop.auth.keycloak;

import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment;
import com.google.android.gms.common.Scopes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthParameters;", "", "Companion", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeycloakAuthParameters {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10237a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f = "authorization_code";
    public final String g = "refresh_token";
    public final String h = "S256";
    public final String i = "code";
    public final List j = CollectionsKt.R(Scopes.OPEN_ID, "offline_access");
    public final String k = "login";
    public final String l = "myCountdownApp";
    public final Map m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthParameters$Companion;", "", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static KeycloakAuthParameters a(AppEnvironment environment, boolean z) {
            KeycloakAuthEnvironment uat;
            Intrinsics.h(environment, "environment");
            if ((environment instanceof AppEnvironment.Test) || (environment instanceof AppEnvironment.Dev)) {
                uat = new KeycloakAuthEnvironment.Qa();
            } else if ((environment instanceof AppEnvironment.Mock) || (environment instanceof AppEnvironment.Uat)) {
                uat = new KeycloakAuthEnvironment.Uat();
            } else {
                if (!(environment instanceof AppEnvironment.Production)) {
                    throw new NoWhenBranchMatchedException();
                }
                uat = new KeycloakAuthEnvironment.Prod();
            }
            return new KeycloakAuthParameters(uat, z);
        }
    }

    public KeycloakAuthParameters(KeycloakAuthEnvironment keycloakAuthEnvironment, boolean z) {
        this.f10237a = z;
        this.b = keycloakAuthEnvironment.getD();
        this.c = keycloakAuthEnvironment.getF10234a();
        this.d = keycloakAuthEnvironment.getB();
        this.e = keycloakAuthEnvironment.getC();
        this.m = keycloakAuthEnvironment.getE();
    }
}
