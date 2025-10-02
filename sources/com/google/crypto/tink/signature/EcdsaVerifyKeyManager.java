package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EcdsaVerifyJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
class EcdsaVerifyKeyManager extends KeyTypeManager<EcdsaPublicKey> {

    /* renamed from: com.google.crypto.tink.signature.EcdsaVerifyKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<PublicKeyVerify, EcdsaPublicKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) throws GeneralSecurityException {
            EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) messageLite;
            ECPublicKey eCPublicKeyD = EllipticCurves.d(SigUtil.a(ecdsaPublicKey.getParams().getCurve()), ecdsaPublicKey.getX().w(), ecdsaPublicKey.getY().w());
            Enums.HashType hashTypeC = SigUtil.c(ecdsaPublicKey.getParams().getHashType());
            SigUtil.b(ecdsaPublicKey.getParams().getEncoding());
            return new EcdsaVerifyJce(eCPublicKeyD, hashTypeC);
        }
    }

    public EcdsaVerifyKeyManager() {
        super(EcdsaPublicKey.class, new AnonymousClass1(PublicKeyVerify.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return EcdsaPublicKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) messageLite;
        Validators.e(ecdsaPublicKey.getVersion());
        SigUtil.d(ecdsaPublicKey.getParams());
    }
}
