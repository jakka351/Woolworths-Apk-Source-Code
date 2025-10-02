package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrivateKeyTypeManager;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPssKeyFormat;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPrivateKey;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPssSignJce;
import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes.dex */
public final class RsaSsaPssSignKeyManager extends PrivateKeyTypeManager<RsaSsaPssPrivateKey, RsaSsaPssPublicKey> {
    public static final byte[] d = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    /* renamed from: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<PublicKeySign, RsaSsaPssPrivateKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            RsaSsaPssPrivateKey rsaSsaPssPrivateKey = (RsaSsaPssPrivateKey) messageLite;
            KeyFactory keyFactory = (KeyFactory) EngineFactory.j.a("RSA");
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getN().w()), new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getE().w()), new BigInteger(1, rsaSsaPssPrivateKey.getD().w()), new BigInteger(1, rsaSsaPssPrivateKey.getP().w()), new BigInteger(1, rsaSsaPssPrivateKey.getQ().w()), new BigInteger(1, rsaSsaPssPrivateKey.getDp().w()), new BigInteger(1, rsaSsaPssPrivateKey.getDq().w()), new BigInteger(1, rsaSsaPssPrivateKey.getCrt().w())));
            RsaSsaPssParams params = rsaSsaPssPrivateKey.getPublicKey().getParams();
            RsaSsaPssSignJce rsaSsaPssSignJce = new RsaSsaPssSignJce(rSAPrivateCrtKey, SigUtil.c(params.getSigHash()), SigUtil.c(params.getMgf1Hash()), params.getSaltLength());
            RsaSsaPssVerifyJce rsaSsaPssVerifyJce = new RsaSsaPssVerifyJce((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getN().w()), new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getE().w()))), SigUtil.c(params.getSigHash()), SigUtil.c(params.getMgf1Hash()), params.getSaltLength());
            try {
                byte[] bArr = RsaSsaPssSignKeyManager.d;
                rsaSsaPssVerifyJce.a(rsaSsaPssSignJce.a(bArr), bArr);
                return rsaSsaPssSignJce;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("Security bug: signing with private key followed by verifying with public key failed" + e);
            }
        }
    }

    public RsaSsaPssSignKeyManager() {
        super(RsaSsaPssPrivateKey.class, new AnonymousClass1(PublicKeySign.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey>(this) { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) throws GeneralSecurityException {
                RsaSsaPssKeyFormat rsaSsaPssKeyFormat = (RsaSsaPssKeyFormat) messageLite;
                RsaSsaPssParams params = rsaSsaPssKeyFormat.getParams();
                Validators.c(rsaSsaPssKeyFormat.getModulusSizeInBits());
                Validators.d(SigUtil.c(params.getSigHash()));
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) EngineFactory.i.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(rsaSsaPssKeyFormat.getModulusSizeInBits(), new BigInteger(1, rsaSsaPssKeyFormat.getPublicExponent().w())));
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
                RsaSsaPssPublicKey.Builder builderNewBuilder = RsaSsaPssPublicKey.newBuilder();
                builderNewBuilder.g();
                ((RsaSsaPssPublicKey) builderNewBuilder.e).setVersion(0);
                builderNewBuilder.g();
                ((RsaSsaPssPublicKey) builderNewBuilder.e).setParams(params);
                byte[] byteArray = rSAPublicKey.getPublicExponent().toByteArray();
                ByteString byteStringI = ByteString.i(0, byteArray.length, byteArray);
                builderNewBuilder.g();
                ((RsaSsaPssPublicKey) builderNewBuilder.e).setE(byteStringI);
                byte[] byteArray2 = rSAPublicKey.getModulus().toByteArray();
                ByteString byteStringI2 = ByteString.i(0, byteArray2.length, byteArray2);
                builderNewBuilder.g();
                ((RsaSsaPssPublicKey) builderNewBuilder.e).setN(byteStringI2);
                RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) builderNewBuilder.p1();
                RsaSsaPssPrivateKey.Builder builderNewBuilder2 = RsaSsaPssPrivateKey.newBuilder();
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setVersion(0);
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setPublicKey(rsaSsaPssPublicKey);
                byte[] byteArray3 = rSAPrivateCrtKey.getPrivateExponent().toByteArray();
                ByteString byteStringI3 = ByteString.i(0, byteArray3.length, byteArray3);
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setD(byteStringI3);
                byte[] byteArray4 = rSAPrivateCrtKey.getPrimeP().toByteArray();
                ByteString byteStringI4 = ByteString.i(0, byteArray4.length, byteArray4);
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setP(byteStringI4);
                byte[] byteArray5 = rSAPrivateCrtKey.getPrimeQ().toByteArray();
                ByteString byteStringI5 = ByteString.i(0, byteArray5.length, byteArray5);
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setQ(byteStringI5);
                byte[] byteArray6 = rSAPrivateCrtKey.getPrimeExponentP().toByteArray();
                ByteString byteStringI6 = ByteString.i(0, byteArray6.length, byteArray6);
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setDp(byteStringI6);
                byte[] byteArray7 = rSAPrivateCrtKey.getPrimeExponentQ().toByteArray();
                ByteString byteStringI7 = ByteString.i(0, byteArray7.length, byteArray7);
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setDq(byteStringI7);
                byte[] byteArray8 = rSAPrivateCrtKey.getCrtCoefficient().toByteArray();
                ByteString byteStringI8 = ByteString.i(0, byteArray8.length, byteArray8);
                builderNewBuilder2.g();
                ((RsaSsaPssPrivateKey) builderNewBuilder2.e).setCrt(byteStringI8);
                return (RsaSsaPssPrivateKey) builderNewBuilder2.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return RsaSsaPssKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                RsaSsaPssKeyFormat rsaSsaPssKeyFormat = (RsaSsaPssKeyFormat) messageLite;
                SigUtil.f(rsaSsaPssKeyFormat.getParams());
                Validators.c(rsaSsaPssKeyFormat.getModulusSizeInBits());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return RsaSsaPssPrivateKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        RsaSsaPssPrivateKey rsaSsaPssPrivateKey = (RsaSsaPssPrivateKey) messageLite;
        Validators.e(rsaSsaPssPrivateKey.getVersion());
        Validators.c(new BigInteger(1, rsaSsaPssPrivateKey.getPublicKey().getN().w()).bitLength());
        SigUtil.f(rsaSsaPssPrivateKey.getPublicKey().getParams());
    }
}
