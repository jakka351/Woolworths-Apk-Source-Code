package io.jsonwebtoken;

/* loaded from: classes7.dex */
public interface Jws<B> extends Jwt<JwsHeader, B> {
    String getSignature();
}
