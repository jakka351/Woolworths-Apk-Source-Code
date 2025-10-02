package com.google.crypto.tink.signature;

import com.google.crypto.tink.proto.EcdsaKeyFormat;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPssKeyFormat;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.math.BigInteger;
import java.security.spec.RSAKeyGenParameterSpec;

@Deprecated
/* loaded from: classes6.dex */
public final class SignatureKeyTemplates {
    static {
        HashType hashType = HashType.SHA256;
        EllipticCurveType ellipticCurveType = EllipticCurveType.NIST_P256;
        EcdsaSignatureEncoding ecdsaSignatureEncoding = EcdsaSignatureEncoding.DER;
        OutputPrefixType outputPrefixType = OutputPrefixType.TINK;
        a(hashType, ellipticCurveType, ecdsaSignatureEncoding, outputPrefixType);
        HashType hashType2 = HashType.SHA512;
        EllipticCurveType ellipticCurveType2 = EllipticCurveType.NIST_P384;
        a(hashType2, ellipticCurveType2, ecdsaSignatureEncoding, outputPrefixType);
        EllipticCurveType ellipticCurveType3 = EllipticCurveType.NIST_P521;
        a(hashType2, ellipticCurveType3, ecdsaSignatureEncoding, outputPrefixType);
        EcdsaSignatureEncoding ecdsaSignatureEncoding2 = EcdsaSignatureEncoding.IEEE_P1363;
        a(hashType, ellipticCurveType, ecdsaSignatureEncoding2, outputPrefixType);
        a(hashType2, ellipticCurveType2, ecdsaSignatureEncoding2, outputPrefixType);
        OutputPrefixType outputPrefixType2 = OutputPrefixType.RAW;
        a(hashType, ellipticCurveType, ecdsaSignatureEncoding2, outputPrefixType2);
        a(hashType2, ellipticCurveType3, ecdsaSignatureEncoding2, outputPrefixType);
        KeyTemplate.Builder builderNewBuilder = KeyTemplate.newBuilder();
        new Ed25519PrivateKeyManager();
        builderNewBuilder.o("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        builderNewBuilder.m(outputPrefixType);
        KeyTemplate.Builder builderNewBuilder2 = KeyTemplate.newBuilder();
        new Ed25519PrivateKeyManager();
        builderNewBuilder2.o("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        builderNewBuilder2.m(outputPrefixType2);
        BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
        b(hashType, 3072, outputPrefixType);
        b(hashType, 3072, outputPrefixType2);
        b(hashType2, 4096, outputPrefixType);
        c(hashType, hashType, 32, 3072);
        c(hashType2, hashType2, 64, 4096);
    }

    public static void a(HashType hashType, EllipticCurveType ellipticCurveType, EcdsaSignatureEncoding ecdsaSignatureEncoding, OutputPrefixType outputPrefixType) {
        EcdsaParams.Builder builderNewBuilder = EcdsaParams.newBuilder();
        builderNewBuilder.g();
        ((EcdsaParams) builderNewBuilder.e).setHashType(hashType);
        builderNewBuilder.g();
        ((EcdsaParams) builderNewBuilder.e).setCurve(ellipticCurveType);
        builderNewBuilder.g();
        ((EcdsaParams) builderNewBuilder.e).setEncoding(ecdsaSignatureEncoding);
        EcdsaParams ecdsaParams = (EcdsaParams) builderNewBuilder.p1();
        EcdsaKeyFormat.Builder builderNewBuilder2 = EcdsaKeyFormat.newBuilder();
        builderNewBuilder2.g();
        ((EcdsaKeyFormat) builderNewBuilder2.e).setParams(ecdsaParams);
        EcdsaKeyFormat ecdsaKeyFormat = (EcdsaKeyFormat) builderNewBuilder2.p1();
        KeyTemplate.Builder builderNewBuilder3 = KeyTemplate.newBuilder();
        builderNewBuilder3.p(ecdsaKeyFormat.toByteString());
        new EcdsaSignKeyManager();
        builderNewBuilder3.o("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        builderNewBuilder3.m(outputPrefixType);
    }

    public static void b(HashType hashType, int i, OutputPrefixType outputPrefixType) {
        BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
        RsaSsaPkcs1Params.Builder builderNewBuilder = RsaSsaPkcs1Params.newBuilder();
        builderNewBuilder.g();
        ((RsaSsaPkcs1Params) builderNewBuilder.e).setHashType(hashType);
        RsaSsaPkcs1Params rsaSsaPkcs1Params = (RsaSsaPkcs1Params) builderNewBuilder.p1();
        RsaSsaPkcs1KeyFormat.Builder builderNewBuilder2 = RsaSsaPkcs1KeyFormat.newBuilder();
        builderNewBuilder2.g();
        ((RsaSsaPkcs1KeyFormat) builderNewBuilder2.e).setParams(rsaSsaPkcs1Params);
        builderNewBuilder2.g();
        ((RsaSsaPkcs1KeyFormat) builderNewBuilder2.e).setModulusSizeInBits(i);
        byte[] byteArray = bigInteger.toByteArray();
        ByteString byteString = ByteString.e;
        ByteString byteStringI = ByteString.i(0, byteArray.length, byteArray);
        builderNewBuilder2.g();
        ((RsaSsaPkcs1KeyFormat) builderNewBuilder2.e).setPublicExponent(byteStringI);
        RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = (RsaSsaPkcs1KeyFormat) builderNewBuilder2.p1();
        KeyTemplate.Builder builderNewBuilder3 = KeyTemplate.newBuilder();
        builderNewBuilder3.p(rsaSsaPkcs1KeyFormat.toByteString());
        new RsaSsaPkcs1SignKeyManager();
        builderNewBuilder3.o("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        builderNewBuilder3.m(outputPrefixType);
    }

    public static void c(HashType hashType, HashType hashType2, int i, int i2) {
        BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
        RsaSsaPssParams.Builder builderNewBuilder = RsaSsaPssParams.newBuilder();
        builderNewBuilder.g();
        ((RsaSsaPssParams) builderNewBuilder.e).setSigHash(hashType);
        builderNewBuilder.g();
        ((RsaSsaPssParams) builderNewBuilder.e).setMgf1Hash(hashType2);
        builderNewBuilder.g();
        ((RsaSsaPssParams) builderNewBuilder.e).setSaltLength(i);
        RsaSsaPssParams rsaSsaPssParams = (RsaSsaPssParams) builderNewBuilder.p1();
        RsaSsaPssKeyFormat.Builder builderNewBuilder2 = RsaSsaPssKeyFormat.newBuilder();
        builderNewBuilder2.g();
        ((RsaSsaPssKeyFormat) builderNewBuilder2.e).setParams(rsaSsaPssParams);
        builderNewBuilder2.g();
        ((RsaSsaPssKeyFormat) builderNewBuilder2.e).setModulusSizeInBits(i2);
        byte[] byteArray = bigInteger.toByteArray();
        ByteString byteString = ByteString.e;
        ByteString byteStringI = ByteString.i(0, byteArray.length, byteArray);
        builderNewBuilder2.g();
        ((RsaSsaPssKeyFormat) builderNewBuilder2.e).setPublicExponent(byteStringI);
        RsaSsaPssKeyFormat rsaSsaPssKeyFormat = (RsaSsaPssKeyFormat) builderNewBuilder2.p1();
        KeyTemplate.Builder builderNewBuilder3 = KeyTemplate.newBuilder();
        builderNewBuilder3.p(rsaSsaPssKeyFormat.toByteString());
        new RsaSsaPssSignKeyManager();
        builderNewBuilder3.o("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        builderNewBuilder3.m(OutputPrefixType.TINK);
    }
}
