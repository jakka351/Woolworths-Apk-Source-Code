package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat;
import com.google.crypto.tink.proto.AesCtrHmacStreamingParams;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;

@Deprecated
/* loaded from: classes6.dex */
public final class StreamingAeadKeyTemplates {
    static {
        a(16, 16);
        a(32, 32);
        b(16, 16, 4096);
        b(32, 32, 4096);
        b(32, 32, 1048576);
    }

    public static void a(int i, int i2) {
        HmacParams.Builder builderNewBuilder = HmacParams.newBuilder();
        builderNewBuilder.g();
        HmacParams hmacParams = (HmacParams) builderNewBuilder.e;
        HashType hashType = HashType.SHA256;
        hmacParams.setHash(hashType);
        builderNewBuilder.g();
        ((HmacParams) builderNewBuilder.e).setTagSize(32);
        HmacParams hmacParams2 = (HmacParams) builderNewBuilder.p1();
        AesCtrHmacStreamingParams.Builder builderNewBuilder2 = AesCtrHmacStreamingParams.newBuilder();
        builderNewBuilder2.g();
        ((AesCtrHmacStreamingParams) builderNewBuilder2.e).setCiphertextSegmentSize(4096);
        builderNewBuilder2.g();
        ((AesCtrHmacStreamingParams) builderNewBuilder2.e).setDerivedKeySize(i2);
        builderNewBuilder2.g();
        ((AesCtrHmacStreamingParams) builderNewBuilder2.e).setHkdfHashType(hashType);
        builderNewBuilder2.g();
        ((AesCtrHmacStreamingParams) builderNewBuilder2.e).setHmacParams(hmacParams2);
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams = (AesCtrHmacStreamingParams) builderNewBuilder2.p1();
        AesCtrHmacStreamingKeyFormat.Builder builderNewBuilder3 = AesCtrHmacStreamingKeyFormat.newBuilder();
        builderNewBuilder3.g();
        ((AesCtrHmacStreamingKeyFormat) builderNewBuilder3.e).setParams(aesCtrHmacStreamingParams);
        builderNewBuilder3.g();
        ((AesCtrHmacStreamingKeyFormat) builderNewBuilder3.e).setKeySize(i);
        AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = (AesCtrHmacStreamingKeyFormat) builderNewBuilder3.p1();
        KeyTemplate.Builder builderNewBuilder4 = KeyTemplate.newBuilder();
        builderNewBuilder4.p(aesCtrHmacStreamingKeyFormat.toByteString());
        new AesCtrHmacStreamingKeyManager();
        builderNewBuilder4.o("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        builderNewBuilder4.m(OutputPrefixType.RAW);
    }

    public static void b(int i, int i2, int i3) {
        AesGcmHkdfStreamingParams.Builder builderNewBuilder = AesGcmHkdfStreamingParams.newBuilder();
        builderNewBuilder.m(i3);
        builderNewBuilder.o(i2);
        builderNewBuilder.p();
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams = (AesGcmHkdfStreamingParams) builderNewBuilder.p1();
        AesGcmHkdfStreamingKeyFormat.Builder builderNewBuilder2 = AesGcmHkdfStreamingKeyFormat.newBuilder();
        builderNewBuilder2.m(i);
        builderNewBuilder2.o(aesGcmHkdfStreamingParams);
        AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) builderNewBuilder2.p1();
        KeyTemplate.Builder builderNewBuilder3 = KeyTemplate.newBuilder();
        builderNewBuilder3.p(aesGcmHkdfStreamingKeyFormat.toByteString());
        new AesGcmHkdfStreamingKeyManager();
        builderNewBuilder3.o("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        builderNewBuilder3.m(OutputPrefixType.RAW);
    }
}
