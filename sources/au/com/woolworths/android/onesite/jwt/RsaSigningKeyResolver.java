package au.com.woolworths.android.onesite.jwt;

import android.util.Base64;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.SigningKeyResolverAdapter;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/RsaSigningKeyResolver;", "Lio/jsonwebtoken/SigningKeyResolverAdapter;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RsaSigningKeyResolver extends SigningKeyResolverAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f4263a;

    public RsaSigningKeyResolver(List keys) {
        Intrinsics.h(keys, "keys");
        this.f4263a = keys;
    }

    @Override // io.jsonwebtoken.SigningKeyResolverAdapter, io.jsonwebtoken.SigningKeyResolver
    public final Key resolveSigningKey(JwsHeader header, Claims claims) throws InvalidKeySpecException {
        Object next;
        Intrinsics.h(header, "header");
        String keyId = header.getKeyId();
        Iterator it = this.f4263a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((JwksKey) next).getKid(), keyId)) {
                break;
            }
        }
        JwksKey jwksKey = (JwksKey) next;
        if (jwksKey == null) {
            throw new RewardsJwtException("Error resolving public key", new IllegalArgumentException("KeyId does not exist"));
        }
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode(jwksKey.getN(), 8)), new BigInteger(1, Base64.decode(jwksKey.getE(), 8))));
        Intrinsics.g(publicKeyGeneratePublic, "generatePublic(...)");
        return publicKeyGeneratePublic;
    }
}
