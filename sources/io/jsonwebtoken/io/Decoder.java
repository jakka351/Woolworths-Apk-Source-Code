package io.jsonwebtoken.io;

/* loaded from: classes7.dex */
public interface Decoder<T, R> {
    R decode(T t) throws DecodingException;
}
