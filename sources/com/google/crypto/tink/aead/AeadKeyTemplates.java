package com.google.crypto.tink.aead;

import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.AesCtrParams;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.proto.AesEaxParams;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;

@Deprecated
/* loaded from: classes6.dex */
public final class AeadKeyTemplates {

    /* renamed from: a, reason: collision with root package name */
    public static final KeyTemplate f14988a = c(16);
    public static final KeyTemplate b;

    static {
        c(32);
        b(16);
        b(32);
        b = a(16, 16);
        a(32, 32);
        KeyTemplate.Builder builderNewBuilder = KeyTemplate.newBuilder();
        new ChaCha20Poly1305KeyManager();
        builderNewBuilder.o("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        OutputPrefixType outputPrefixType = OutputPrefixType.TINK;
        builderNewBuilder.m(outputPrefixType);
        KeyTemplate.Builder builderNewBuilder2 = KeyTemplate.newBuilder();
        new XChaCha20Poly1305KeyManager();
        builderNewBuilder2.o("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        builderNewBuilder2.m(outputPrefixType);
    }

    public static KeyTemplate a(int i, int i2) {
        AesCtrKeyFormat.Builder builderNewBuilder = AesCtrKeyFormat.newBuilder();
        AesCtrParams.Builder builderNewBuilder2 = AesCtrParams.newBuilder();
        builderNewBuilder2.g();
        ((AesCtrParams) builderNewBuilder2.e).setIvSize(16);
        AesCtrParams aesCtrParams = (AesCtrParams) builderNewBuilder2.p1();
        builderNewBuilder.g();
        ((AesCtrKeyFormat) builderNewBuilder.e).setParams(aesCtrParams);
        builderNewBuilder.g();
        ((AesCtrKeyFormat) builderNewBuilder.e).setKeySize(i);
        AesCtrKeyFormat aesCtrKeyFormat = (AesCtrKeyFormat) builderNewBuilder.p1();
        HmacKeyFormat.Builder builderNewBuilder3 = HmacKeyFormat.newBuilder();
        HmacParams.Builder builderNewBuilder4 = HmacParams.newBuilder();
        builderNewBuilder4.g();
        ((HmacParams) builderNewBuilder4.e).setHash(HashType.SHA256);
        builderNewBuilder4.g();
        ((HmacParams) builderNewBuilder4.e).setTagSize(i2);
        HmacParams hmacParams = (HmacParams) builderNewBuilder4.p1();
        builderNewBuilder3.g();
        ((HmacKeyFormat) builderNewBuilder3.e).setParams(hmacParams);
        builderNewBuilder3.g();
        ((HmacKeyFormat) builderNewBuilder3.e).setKeySize(32);
        HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) builderNewBuilder3.p1();
        AesCtrHmacAeadKeyFormat.Builder builderNewBuilder5 = AesCtrHmacAeadKeyFormat.newBuilder();
        builderNewBuilder5.g();
        ((AesCtrHmacAeadKeyFormat) builderNewBuilder5.e).setAesCtrKeyFormat(aesCtrKeyFormat);
        builderNewBuilder5.g();
        ((AesCtrHmacAeadKeyFormat) builderNewBuilder5.e).setHmacKeyFormat(hmacKeyFormat);
        AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = (AesCtrHmacAeadKeyFormat) builderNewBuilder5.p1();
        KeyTemplate.Builder builderNewBuilder6 = KeyTemplate.newBuilder();
        builderNewBuilder6.p(aesCtrHmacAeadKeyFormat.toByteString());
        new AesCtrHmacAeadKeyManager();
        builderNewBuilder6.o("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        builderNewBuilder6.m(OutputPrefixType.TINK);
        return (KeyTemplate) builderNewBuilder6.p1();
    }

    public static void b(int i) {
        AesEaxKeyFormat.Builder builderNewBuilder = AesEaxKeyFormat.newBuilder();
        builderNewBuilder.g();
        ((AesEaxKeyFormat) builderNewBuilder.e).setKeySize(i);
        AesEaxParams.Builder builderNewBuilder2 = AesEaxParams.newBuilder();
        builderNewBuilder2.g();
        ((AesEaxParams) builderNewBuilder2.e).setIvSize(16);
        AesEaxParams aesEaxParams = (AesEaxParams) builderNewBuilder2.p1();
        builderNewBuilder.g();
        ((AesEaxKeyFormat) builderNewBuilder.e).setParams(aesEaxParams);
        AesEaxKeyFormat aesEaxKeyFormat = (AesEaxKeyFormat) builderNewBuilder.p1();
        KeyTemplate.Builder builderNewBuilder3 = KeyTemplate.newBuilder();
        builderNewBuilder3.p(aesEaxKeyFormat.toByteString());
        new AesEaxKeyManager();
        builderNewBuilder3.o("type.googleapis.com/google.crypto.tink.AesEaxKey");
        builderNewBuilder3.m(OutputPrefixType.TINK);
    }

    public static KeyTemplate c(int i) {
        AesGcmKeyFormat.Builder builderNewBuilder = AesGcmKeyFormat.newBuilder();
        builderNewBuilder.g();
        ((AesGcmKeyFormat) builderNewBuilder.e).setKeySize(i);
        AesGcmKeyFormat aesGcmKeyFormat = (AesGcmKeyFormat) builderNewBuilder.p1();
        KeyTemplate.Builder builderNewBuilder2 = KeyTemplate.newBuilder();
        builderNewBuilder2.p(aesGcmKeyFormat.toByteString());
        new AesGcmKeyManager();
        builderNewBuilder2.o("type.googleapis.com/google.crypto.tink.AesGcmKey");
        builderNewBuilder2.m(OutputPrefixType.TINK);
        return (KeyTemplate) builderNewBuilder2.p1();
    }
}
