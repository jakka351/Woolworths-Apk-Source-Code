package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
import com.google.crypto.tink.subtle.Validators;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes.dex */
class RsaSsaPssVerifyKeyManager extends KeyTypeManager<RsaSsaPssPublicKey> {

    /* renamed from: com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<PublicKeyVerify, RsaSsaPssPublicKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) messageLite;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) EngineFactory.j.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, rsaSsaPssPublicKey.getN().w()), new BigInteger(1, rsaSsaPssPublicKey.getE().w())));
            RsaSsaPssParams params = rsaSsaPssPublicKey.getParams();
            return new RsaSsaPssVerifyJce(rSAPublicKey, SigUtil.c(params.getSigHash()), SigUtil.c(params.getMgf1Hash()), params.getSaltLength());
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return RsaSsaPssPublicKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        RsaSsaPssPublicKey rsaSsaPssPublicKey = (RsaSsaPssPublicKey) messageLite;
        Validators.e(rsaSsaPssPublicKey.getVersion());
        Validators.c(new BigInteger(1, rsaSsaPssPublicKey.getN().w()).bitLength());
        SigUtil.f(rsaSsaPssPublicKey.getParams());
    }
}
