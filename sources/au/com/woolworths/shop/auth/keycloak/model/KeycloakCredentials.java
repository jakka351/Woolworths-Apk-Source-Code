package au.com.woolworths.shop.auth.keycloak.model;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/model/KeycloakCredentials;", "", "Companion", "$serializer", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class KeycloakCredentials {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f10244a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/model/KeycloakCredentials$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/shop/auth/keycloak/model/KeycloakCredentials;", "serializer", "()Lkotlinx/serialization/KSerializer;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<KeycloakCredentials> serializer() {
            return KeycloakCredentials$$serializer.f10245a;
        }
    }

    public /* synthetic */ KeycloakCredentials(String str, String str2, String str3, String str4, int i, String str5, long j) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.a(i, 63, KeycloakCredentials$$serializer.f10245a.getDescriptor());
            throw null;
        }
        this.f10244a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeycloakCredentials)) {
            return false;
        }
        KeycloakCredentials keycloakCredentials = (KeycloakCredentials) obj;
        return Intrinsics.c(this.f10244a, keycloakCredentials.f10244a) && Intrinsics.c(this.b, keycloakCredentials.b) && this.c == keycloakCredentials.c && Intrinsics.c(this.d, keycloakCredentials.d) && Intrinsics.c(this.e, keycloakCredentials.e) && Intrinsics.c(this.f, keycloakCredentials.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(b.c(b.b(b.c(this.f10244a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("KeycloakCredentials(tokenType=", this.f10244a, ", accessToken=", this.b, ", expiresIn=");
        sbV.append(this.c);
        sbV.append(", refreshToken=");
        sbV.append(this.d);
        androidx.constraintlayout.core.state.a.B(sbV, ", idToken=", this.e, ", scope=", this.f);
        sbV.append(")");
        return sbV.toString();
    }

    public KeycloakCredentials(long j, String tokenType, String accessToken, String refreshToken, String idToken, String scope) {
        Intrinsics.h(tokenType, "tokenType");
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(idToken, "idToken");
        Intrinsics.h(scope, "scope");
        this.f10244a = tokenType;
        this.b = accessToken;
        this.c = j;
        this.d = refreshToken;
        this.e = idToken;
        this.f = scope;
    }
}
