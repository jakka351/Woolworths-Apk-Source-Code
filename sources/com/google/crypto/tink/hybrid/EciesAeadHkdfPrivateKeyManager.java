package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.EngineFactory;
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
public final class EciesAeadHkdfPrivateKeyManager extends PrivateKeyTypeManager<EciesAeadHkdfPrivateKey, EciesAeadHkdfPublicKey> {

    /* renamed from: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<HybridDecrypt, EciesAeadHkdfPrivateKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) throws GeneralSecurityException {
            EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey = (EciesAeadHkdfPrivateKey) messageLite;
            EciesAeadHkdfParams params = eciesAeadHkdfPrivateKey.getPublicKey().getParams();
            EciesHkdfKemParams kemParams = params.getKemParams();
            EllipticCurves.c(HybridUtil.a(kemParams.getCurveType()), eciesAeadHkdfPrivateKey.getKeyValue().w());
            RegistryEciesAeadHkdfDemHelper registryEciesAeadHkdfDemHelper = new RegistryEciesAeadHkdfDemHelper(params.getDemParams().getAeadDem());
            kemParams.getHkdfSalt().w();
            HybridUtil.b(kemParams.getHkdfHashType());
            HybridUtil.c(params.getEcPointFormat());
            return new EciesAeadHkdfHybridDecrypt(registryEciesAeadHkdfDemHelper);
        }
    }

    /* renamed from: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$3, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14996a;

        static {
            int[] iArr = new int[KeyTemplate.OutputPrefixType.values().length];
            f14996a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14996a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14996a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14996a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public EciesAeadHkdfPrivateKeyManager() {
        super(EciesAeadHkdfPrivateKey.class, new AnonymousClass1(HybridDecrypt.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<EciesAeadHkdfKeyFormat, EciesAeadHkdfPrivateKey>(this) { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
                EciesAeadHkdfKeyFormat eciesAeadHkdfKeyFormat = (EciesAeadHkdfKeyFormat) messageLite;
                ECParameterSpec eCParameterSpecB = EllipticCurves.b(HybridUtil.a(eciesAeadHkdfKeyFormat.getParams().getKemParams().getCurveType()));
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) EngineFactory.i.a("EC");
                keyPairGenerator.initialize(eCParameterSpecB);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                ECPoint w = eCPublicKey.getW();
                EciesAeadHkdfPublicKey.Builder builderNewBuilder = EciesAeadHkdfPublicKey.newBuilder();
                builderNewBuilder.g();
                ((EciesAeadHkdfPublicKey) builderNewBuilder.e).setVersion(0);
                EciesAeadHkdfParams params = eciesAeadHkdfKeyFormat.getParams();
                builderNewBuilder.g();
                ((EciesAeadHkdfPublicKey) builderNewBuilder.e).setParams(params);
                byte[] byteArray = w.getAffineX().toByteArray();
                ByteString byteString = ByteString.e;
                ByteString byteStringI = ByteString.i(0, byteArray.length, byteArray);
                builderNewBuilder.g();
                ((EciesAeadHkdfPublicKey) builderNewBuilder.e).setX(byteStringI);
                byte[] byteArray2 = w.getAffineY().toByteArray();
                ByteString byteStringI2 = ByteString.i(0, byteArray2.length, byteArray2);
                builderNewBuilder.g();
                ((EciesAeadHkdfPublicKey) builderNewBuilder.e).setY(byteStringI2);
                EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) builderNewBuilder.p1();
                EciesAeadHkdfPrivateKey.Builder builderNewBuilder2 = EciesAeadHkdfPrivateKey.newBuilder();
                builderNewBuilder2.g();
                ((EciesAeadHkdfPrivateKey) builderNewBuilder2.e).setVersion(0);
                builderNewBuilder2.g();
                ((EciesAeadHkdfPrivateKey) builderNewBuilder2.e).setPublicKey(eciesAeadHkdfPublicKey);
                byte[] byteArray3 = eCPrivateKey.getS().toByteArray();
                ByteString byteStringI3 = ByteString.i(0, byteArray3.length, byteArray3);
                builderNewBuilder2.g();
                ((EciesAeadHkdfPrivateKey) builderNewBuilder2.e).setKeyValue(byteStringI3);
                return (EciesAeadHkdfPrivateKey) builderNewBuilder2.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return EciesAeadHkdfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                HybridUtil.d(((EciesAeadHkdfKeyFormat) messageLite).getParams());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return EciesAeadHkdfPrivateKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey = (EciesAeadHkdfPrivateKey) messageLite;
        if (eciesAeadHkdfPrivateKey.getKeyValue().size() == 0) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        Validators.e(eciesAeadHkdfPrivateKey.getVersion());
        HybridUtil.d(eciesAeadHkdfPrivateKey.getPublicKey().getParams());
    }
}
