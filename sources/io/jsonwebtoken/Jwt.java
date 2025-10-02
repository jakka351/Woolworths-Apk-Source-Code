package io.jsonwebtoken;

import io.jsonwebtoken.Header;

/* loaded from: classes7.dex */
public interface Jwt<H extends Header, B> {
    B getBody();

    H getHeader();
}
