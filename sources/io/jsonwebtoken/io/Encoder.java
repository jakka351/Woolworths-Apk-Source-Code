package io.jsonwebtoken.io;

/* loaded from: classes7.dex */
public interface Encoder<T, R> {
    R encode(T t) throws EncodingException;
}
