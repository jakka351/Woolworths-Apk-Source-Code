package io.jsonwebtoken;

/* loaded from: classes7.dex */
public interface JwtHandler<T> {
    T onClaimsJws(Jws<Claims> jws);

    T onClaimsJwt(Jwt<Header, Claims> jwt);

    T onPlaintextJws(Jws<String> jws);

    T onPlaintextJwt(Jwt<Header, String> jwt);
}
