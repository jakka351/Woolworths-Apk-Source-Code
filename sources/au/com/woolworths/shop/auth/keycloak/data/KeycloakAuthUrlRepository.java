package au.com.woolworths.shop.auth.keycloak.data;

import au.com.woolworths.shop.auth.keycloak.KeycloakAuthParameters;
import au.com.woolworths.shop.auth.keycloak.utils.PkceUtil;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okio.Base64;
import okio.ByteString;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakAuthUrlRepository;", "", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeycloakAuthUrlRepository {

    /* renamed from: a, reason: collision with root package name */
    public final KeycloakAuthParameters f10241a;
    public final boolean b;

    public KeycloakAuthUrlRepository(KeycloakAuthParameters keycloakAuthParameters, boolean z) {
        this.f10241a = keycloakAuthParameters;
        this.b = z;
    }

    public final String a() {
        String strSubstring;
        String strSubstring2;
        KeycloakAuthParameters keycloakAuthParameters = this.f10241a;
        String str = keycloakAuthParameters.c;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        ByteString byteString = ByteString.g;
        String strB = Base64.b(ByteString.Companion.d(bArr).data, Base64.d());
        int iA = StringsKt.A(strB);
        while (true) {
            strSubstring = "";
            if (-1 >= iA) {
                strSubstring2 = "";
                break;
            }
            if (strB.charAt(iA) != '=') {
                strSubstring2 = strB.substring(0, iA + 1);
                Intrinsics.g(strSubstring2, "substring(...)");
                break;
            }
            iA--;
        }
        PkceUtil.f10247a = strSubstring2;
        Charset charsetForName = Charset.forName("US-ASCII");
        Intrinsics.g(charsetForName, "forName(...)");
        byte[] bytes = strSubstring2.getBytes(charsetForName);
        Intrinsics.g(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.g(messageDigest, "getInstance(...)");
        messageDigest.update(bytes, 0, bytes.length);
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.g(bArrDigest, "digest(...)");
        ByteString byteString2 = ByteString.g;
        String strB2 = Base64.b(ByteString.Companion.d(bArrDigest).data, Base64.d());
        int iA2 = StringsKt.A(strB2);
        while (true) {
            if (-1 < iA2) {
                if (strB2.charAt(iA2) != '=') {
                    strSubstring = strB2.substring(0, iA2 + 1);
                    Intrinsics.g(strSubstring, "substring(...)");
                    break;
                }
                iA2--;
            } else {
                break;
            }
        }
        String codeVerifier = keycloakAuthParameters.h;
        Intrinsics.h(codeVerifier, "codeVerifier");
        HttpUrl.j.getClass();
        HttpUrl httpUrlD = HttpUrl.Companion.d(str);
        if (httpUrlD == null) {
            throw new IllegalArgumentException(YU.a.A("💥 Invalid base URL: ", str));
        }
        HttpUrl.Builder builderG = httpUrlD.g();
        builderG.c("client_id", "mobile_supers");
        builderG.c("redirect_uri", keycloakAuthParameters.b);
        builderG.c("response_type", keycloakAuthParameters.i);
        builderG.c("scope", CollectionsKt.M(keycloakAuthParameters.j, " ", null, null, null, 62));
        builderG.c("code_challenge", strSubstring);
        builderG.c("code_challenge_method", codeVerifier);
        builderG.c("kc_idp_hint", keycloakAuthParameters.f10237a ? "auth0" : "gigya");
        builderG.c("prompt", keycloakAuthParameters.k);
        builderG.c("display", keycloakAuthParameters.l);
        builderG.c("ext-id", "mobile_supers");
        if (this.b) {
            builderG.c("screen_hint", "signup");
        }
        return builderG.d().i;
    }
}
