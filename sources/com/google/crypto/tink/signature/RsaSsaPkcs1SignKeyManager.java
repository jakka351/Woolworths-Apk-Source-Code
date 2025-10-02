package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrivateKeyTypeManager;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce;
import com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes.dex */
public final class RsaSsaPkcs1SignKeyManager extends PrivateKeyTypeManager<RsaSsaPkcs1PrivateKey, RsaSsaPkcs1PublicKey> {
    public static final byte[] d = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    /* renamed from: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<PublicKeySign, RsaSsaPkcs1PrivateKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = (RsaSsaPkcs1PrivateKey) messageLite;
            KeyFactory keyFactory = (KeyFactory) EngineFactory.j.a("RSA");
            RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce = new RsaSsaPkcs1SignJce((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getE().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getD().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getP().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getQ().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getDp().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getDq().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getCrt().w()))), SigUtil.c(rsaSsaPkcs1PrivateKey.getPublicKey().getParams().getHashType()));
            RsaSsaPkcs1VerifyJce rsaSsaPkcs1VerifyJce = new RsaSsaPkcs1VerifyJce((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().w()), new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getE().w()))), SigUtil.c(rsaSsaPkcs1PrivateKey.getPublicKey().getParams().getHashType()));
            try {
                byte[] bArr = RsaSsaPkcs1SignKeyManager.d;
                rsaSsaPkcs1VerifyJce.a(rsaSsaPkcs1SignJce.a(bArr), bArr);
                return rsaSsaPkcs1SignJce;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("Security bug: signing with private key followed by verifying with public key failed" + e);
            }
        }
    }

    public RsaSsaPkcs1SignKeyManager() {
        super(RsaSsaPkcs1PrivateKey.class, new AnonymousClass1(PublicKeySign.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<RsaSsaPkcs1KeyFormat, RsaSsaPkcs1PrivateKey>(this) { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) throws InvalidAlgorithmParameterException {
                RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = (RsaSsaPkcs1KeyFormat) messageLite;
                RsaSsaPkcs1Params params = rsaSsaPkcs1KeyFormat.getParams();
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) EngineFactory.i.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(rsaSsaPkcs1KeyFormat.getModulusSizeInBits(), new BigInteger(1, rsaSsaPkcs1KeyFormat.getPublicExponent().w())));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
                RsaSsaPkcs1PublicKey.Builder builderNewBuilder = RsaSsaPkcs1PublicKey.newBuilder();
                builderNewBuilder.g();
                ((RsaSsaPkcs1PublicKey) builderNewBuilder.e).setVersion(0);
                builderNewBuilder.g();
                ((RsaSsaPkcs1PublicKey) builderNewBuilder.e).setParams(params);
                byte[] byteArray = rSAPublicKey.getPublicExponent().toByteArray();
                ByteString byteStringI = ByteString.i(0, byteArray.length, byteArray);
                builderNewBuilder.g();
                ((RsaSsaPkcs1PublicKey) builderNewBuilder.e).setE(byteStringI);
                byte[] byteArray2 = rSAPublicKey.getModulus().toByteArray();
                ByteString byteStringI2 = ByteString.i(0, byteArray2.length, byteArray2);
                builderNewBuilder.g();
                ((RsaSsaPkcs1PublicKey) builderNewBuilder.e).setN(byteStringI2);
                RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = (RsaSsaPkcs1PublicKey) builderNewBuilder.p1();
                RsaSsaPkcs1PrivateKey.Builder builderNewBuilder2 = RsaSsaPkcs1PrivateKey.newBuilder();
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setVersion(0);
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setPublicKey(rsaSsaPkcs1PublicKey);
                byte[] byteArray3 = rSAPrivateCrtKey.getPrivateExponent().toByteArray();
                ByteString byteStringI3 = ByteString.i(0, byteArray3.length, byteArray3);
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setD(byteStringI3);
                byte[] byteArray4 = rSAPrivateCrtKey.getPrimeP().toByteArray();
                ByteString byteStringI4 = ByteString.i(0, byteArray4.length, byteArray4);
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setP(byteStringI4);
                byte[] byteArray5 = rSAPrivateCrtKey.getPrimeQ().toByteArray();
                ByteString byteStringI5 = ByteString.i(0, byteArray5.length, byteArray5);
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setQ(byteStringI5);
                byte[] byteArray6 = rSAPrivateCrtKey.getPrimeExponentP().toByteArray();
                ByteString byteStringI6 = ByteString.i(0, byteArray6.length, byteArray6);
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setDp(byteStringI6);
                byte[] byteArray7 = rSAPrivateCrtKey.getPrimeExponentQ().toByteArray();
                ByteString byteStringI7 = ByteString.i(0, byteArray7.length, byteArray7);
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setDq(byteStringI7);
                byte[] byteArray8 = rSAPrivateCrtKey.getCrtCoefficient().toByteArray();
                ByteString byteStringI8 = ByteString.i(0, byteArray8.length, byteArray8);
                builderNewBuilder2.g();
                ((RsaSsaPkcs1PrivateKey) builderNewBuilder2.e).setCrt(byteStringI8);
                return (RsaSsaPkcs1PrivateKey) builderNewBuilder2.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return RsaSsaPkcs1KeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = (RsaSsaPkcs1KeyFormat) messageLite;
                SigUtil.e(rsaSsaPkcs1KeyFormat.getParams());
                Validators.c(rsaSsaPkcs1KeyFormat.getModulusSizeInBits());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return RsaSsaPkcs1PrivateKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = (RsaSsaPkcs1PrivateKey) messageLite;
        Validators.e(rsaSsaPkcs1PrivateKey.getVersion());
        Validators.c(new BigInteger(1, rsaSsaPkcs1PrivateKey.getPublicKey().getN().w()).bitLength());
        SigUtil.e(rsaSsaPkcs1PrivateKey.getPublicKey().getParams());
    }
}
