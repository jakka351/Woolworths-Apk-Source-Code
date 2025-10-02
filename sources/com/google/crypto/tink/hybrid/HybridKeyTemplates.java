package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.aead.AeadKeyTemplates;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EciesAeadDemParams;
import com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;

@Deprecated
/* loaded from: classes6.dex */
public final class HybridKeyTemplates {
    static {
        byte[] bArr = new byte[0];
        KeyTemplate keyTemplate = AeadKeyTemplates.f14988a;
        EcPointFormat ecPointFormat = EcPointFormat.UNCOMPRESSED;
        OutputPrefixType outputPrefixType = OutputPrefixType.TINK;
        a(ecPointFormat, keyTemplate, outputPrefixType, bArr);
        a(EcPointFormat.COMPRESSED, keyTemplate, OutputPrefixType.RAW, bArr);
        a(ecPointFormat, AeadKeyTemplates.b, outputPrefixType, bArr);
    }

    public static void a(EcPointFormat ecPointFormat, KeyTemplate keyTemplate, OutputPrefixType outputPrefixType, byte[] bArr) {
        EciesAeadHkdfKeyFormat.Builder builderNewBuilder = EciesAeadHkdfKeyFormat.newBuilder();
        EciesHkdfKemParams.Builder builderNewBuilder2 = EciesHkdfKemParams.newBuilder();
        builderNewBuilder2.g();
        ((EciesHkdfKemParams) builderNewBuilder2.e).setCurveType(EllipticCurveType.NIST_P256);
        builderNewBuilder2.g();
        ((EciesHkdfKemParams) builderNewBuilder2.e).setHkdfHashType(HashType.SHA256);
        ByteString byteStringI = ByteString.i(0, bArr.length, bArr);
        builderNewBuilder2.g();
        ((EciesHkdfKemParams) builderNewBuilder2.e).setHkdfSalt(byteStringI);
        EciesHkdfKemParams eciesHkdfKemParams = (EciesHkdfKemParams) builderNewBuilder2.p1();
        EciesAeadDemParams.Builder builderNewBuilder3 = EciesAeadDemParams.newBuilder();
        builderNewBuilder3.g();
        ((EciesAeadDemParams) builderNewBuilder3.e).setAeadDem(keyTemplate);
        EciesAeadDemParams eciesAeadDemParams = (EciesAeadDemParams) builderNewBuilder3.p1();
        EciesAeadHkdfParams.Builder builderNewBuilder4 = EciesAeadHkdfParams.newBuilder();
        builderNewBuilder4.g();
        ((EciesAeadHkdfParams) builderNewBuilder4.e).setKemParams(eciesHkdfKemParams);
        builderNewBuilder4.g();
        ((EciesAeadHkdfParams) builderNewBuilder4.e).setDemParams(eciesAeadDemParams);
        builderNewBuilder4.g();
        ((EciesAeadHkdfParams) builderNewBuilder4.e).setEcPointFormat(ecPointFormat);
        EciesAeadHkdfParams eciesAeadHkdfParams = (EciesAeadHkdfParams) builderNewBuilder4.p1();
        builderNewBuilder.g();
        ((EciesAeadHkdfKeyFormat) builderNewBuilder.e).setParams(eciesAeadHkdfParams);
        EciesAeadHkdfKeyFormat eciesAeadHkdfKeyFormat = (EciesAeadHkdfKeyFormat) builderNewBuilder.p1();
        KeyTemplate.Builder builderNewBuilder5 = KeyTemplate.newBuilder();
        new EciesAeadHkdfPrivateKeyManager();
        builderNewBuilder5.o("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        builderNewBuilder5.m(outputPrefixType);
        builderNewBuilder5.p(eciesAeadHkdfKeyFormat.toByteString());
    }
}
