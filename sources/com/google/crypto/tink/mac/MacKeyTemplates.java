package com.google.crypto.tink.mac;

import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;

@Deprecated
/* loaded from: classes6.dex */
public final class MacKeyTemplates {
    static {
        HashType hashType = HashType.SHA256;
        a(32, 16, hashType);
        a(32, 32, hashType);
        HashType hashType2 = HashType.SHA512;
        a(64, 32, hashType2);
        a(64, 64, hashType2);
        KeyTemplate.Builder builderNewBuilder = KeyTemplate.newBuilder();
        AesCmacKeyFormat.Builder builderNewBuilder2 = AesCmacKeyFormat.newBuilder();
        builderNewBuilder2.g();
        ((AesCmacKeyFormat) builderNewBuilder2.e).setKeySize(32);
        AesCmacParams.Builder builderNewBuilder3 = AesCmacParams.newBuilder();
        builderNewBuilder3.g();
        ((AesCmacParams) builderNewBuilder3.e).setTagSize(16);
        AesCmacParams aesCmacParams = (AesCmacParams) builderNewBuilder3.p1();
        builderNewBuilder2.g();
        ((AesCmacKeyFormat) builderNewBuilder2.e).setParams(aesCmacParams);
        builderNewBuilder.p(((AesCmacKeyFormat) builderNewBuilder2.p1()).toByteString());
        new AesCmacKeyManager();
        builderNewBuilder.o("type.googleapis.com/google.crypto.tink.AesCmacKey");
        builderNewBuilder.m(OutputPrefixType.TINK);
    }

    public static void a(int i, int i2, HashType hashType) {
        HmacParams.Builder builderNewBuilder = HmacParams.newBuilder();
        builderNewBuilder.g();
        ((HmacParams) builderNewBuilder.e).setHash(hashType);
        builderNewBuilder.g();
        ((HmacParams) builderNewBuilder.e).setTagSize(i2);
        HmacParams hmacParams = (HmacParams) builderNewBuilder.p1();
        HmacKeyFormat.Builder builderNewBuilder2 = HmacKeyFormat.newBuilder();
        builderNewBuilder2.g();
        ((HmacKeyFormat) builderNewBuilder2.e).setParams(hmacParams);
        builderNewBuilder2.g();
        ((HmacKeyFormat) builderNewBuilder2.e).setKeySize(i);
        HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) builderNewBuilder2.p1();
        KeyTemplate.Builder builderNewBuilder3 = KeyTemplate.newBuilder();
        builderNewBuilder3.p(hmacKeyFormat.toByteString());
        new HmacKeyManager();
        builderNewBuilder3.o("type.googleapis.com/google.crypto.tink.HmacKey");
        builderNewBuilder3.m(OutputPrefixType.TINK);
    }
}
