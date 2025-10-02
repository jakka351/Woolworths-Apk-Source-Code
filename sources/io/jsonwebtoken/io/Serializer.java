package io.jsonwebtoken.io;

/* loaded from: classes7.dex */
public interface Serializer<T> {
    byte[] serialize(T t) throws SerializationException;
}
