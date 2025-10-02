package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrivateKeyTypeManager;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.proto.EcdsaKeyFormat;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaPrivateKey;
import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EcdsaSignJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public final class EcdsaSignKeyManager extends PrivateKeyTypeManager<EcdsaPrivateKey, EcdsaPublicKey> {

    /* renamed from: com.google.crypto.tink.signature.EcdsaSignKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<PublicKeySign, EcdsaPrivateKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) throws GeneralSecurityException {
            EcdsaPrivateKey ecdsaPrivateKey = (EcdsaPrivateKey) messageLite;
            EllipticCurves.c(SigUtil.a(ecdsaPrivateKey.getPublicKey().getParams().getCurve()), ecdsaPrivateKey.getKeyValue().w());
            Enums.HashType hashTypeC = SigUtil.c(ecdsaPrivateKey.getPublicKey().getParams().getHashType());
            SigUtil.b(ecdsaPrivateKey.getPublicKey().getParams().getEncoding());
            return new EcdsaSignJce(hashTypeC);
        }
    }

    public EcdsaSignKeyManager() {
        super(EcdsaPrivateKey.class, new AnonymousClass1(PublicKeySign.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<EcdsaKeyFormat, EcdsaPrivateKey>(this) { // from class: com.google.crypto.tink.signature.EcdsaSignKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
                EcdsaParams params = ((EcdsaKeyFormat) messageLite).getParams();
                ECParameterSpec eCParameterSpecB = EllipticCurves.b(SigUtil.a(params.getCurve()));
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) EngineFactory.i.a("EC");
                keyPairGenerator.initialize(eCParameterSpecB);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                ECPoint w = eCPublicKey.getW();
                EcdsaPublicKey.Builder builderNewBuilder = EcdsaPublicKey.newBuilder();
                builderNewBuilder.g();
                ((EcdsaPublicKey) builderNewBuilder.e).setVersion(0);
                builderNewBuilder.g();
                ((EcdsaPublicKey) builderNewBuilder.e).setParams(params);
                byte[] byteArray = w.getAffineX().toByteArray();
                ByteString byteString = ByteString.e;
                ByteString byteStringI = ByteString.i(0, byteArray.length, byteArray);
                builderNewBuilder.g();
                ((EcdsaPublicKey) builderNewBuilder.e).setX(byteStringI);
                byte[] byteArray2 = w.getAffineY().toByteArray();
                ByteString byteStringI2 = ByteString.i(0, byteArray2.length, byteArray2);
                builderNewBuilder.g();
                ((EcdsaPublicKey) builderNewBuilder.e).setY(byteStringI2);
                EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) builderNewBuilder.p1();
                EcdsaPrivateKey.Builder builderNewBuilder2 = EcdsaPrivateKey.newBuilder();
                builderNewBuilder2.g();
                ((EcdsaPrivateKey) builderNewBuilder2.e).setVersion(0);
                builderNewBuilder2.g();
                ((EcdsaPrivateKey) builderNewBuilder2.e).setPublicKey(ecdsaPublicKey);
                byte[] byteArray3 = eCPrivateKey.getS().toByteArray();
                ByteString byteStringI3 = ByteString.i(0, byteArray3.length, byteArray3);
                builderNewBuilder2.g();
                ((EcdsaPrivateKey) builderNewBuilder2.e).setKeyValue(byteStringI3);
                return (EcdsaPrivateKey) builderNewBuilder2.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return EcdsaKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                SigUtil.d(((EcdsaKeyFormat) messageLite).getParams());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return EcdsaPrivateKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        EcdsaPrivateKey ecdsaPrivateKey = (EcdsaPrivateKey) messageLite;
        Validators.e(ecdsaPrivateKey.getVersion());
        SigUtil.d(ecdsaPrivateKey.getPublicKey().getParams());
    }
}
