package io.jsonwebtoken;

/* loaded from: classes7.dex */
public interface CompressionCodecResolver {
    CompressionCodec resolveCompressionCodec(Header header) throws CompressionException;
}
