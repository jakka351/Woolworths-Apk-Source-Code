package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
class EciesAeadHkdfPublicKeyManager extends KeyTypeManager<EciesAeadHkdfPublicKey> {

    /* renamed from: com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<HybridEncrypt, EciesAeadHkdfPublicKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) throws GeneralSecurityException {
            EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) messageLite;
            EciesAeadHkdfParams params = eciesAeadHkdfPublicKey.getParams();
            EciesHkdfKemParams kemParams = params.getKemParams();
            ECPublicKey eCPublicKeyD = EllipticCurves.d(HybridUtil.a(kemParams.getCurveType()), eciesAeadHkdfPublicKey.getX().w(), eciesAeadHkdfPublicKey.getY().w());
            RegistryEciesAeadHkdfDemHelper registryEciesAeadHkdfDemHelper = new RegistryEciesAeadHkdfDemHelper(params.getDemParams().getAeadDem());
            kemParams.getHkdfSalt().w();
            HybridUtil.b(kemParams.getHkdfHashType());
            HybridUtil.c(params.getEcPointFormat());
            return new EciesAeadHkdfHybridEncrypt(eCPublicKeyD, registryEciesAeadHkdfDemHelper);
        }
    }

    public EciesAeadHkdfPublicKeyManager() {
        super(EciesAeadHkdfPublicKey.class, new AnonymousClass1(HybridEncrypt.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return EciesAeadHkdfPublicKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = (EciesAeadHkdfPublicKey) messageLite;
        Validators.e(eciesAeadHkdfPublicKey.getVersion());
        HybridUtil.d(eciesAeadHkdfPublicKey.getParams());
    }
}
