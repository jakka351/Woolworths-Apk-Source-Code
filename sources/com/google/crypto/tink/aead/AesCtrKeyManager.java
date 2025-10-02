package com.google.crypto.tink.aead;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.AesCtrParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesCtrJceCipher;
import com.google.crypto.tink.subtle.IndCpaCipher;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public class AesCtrKeyManager extends KeyTypeManager<AesCtrKey> {

    /* renamed from: com.google.crypto.tink.aead.AesCtrKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<IndCpaCipher, AesCtrKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            AesCtrKey aesCtrKey = (AesCtrKey) messageLite;
            return new AesCtrJceCipher(aesCtrKey.getKeyValue().w(), aesCtrKey.getParams().getIvSize());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.AesCtrKeyManager$2, reason: invalid class name */
    class AnonymousClass2 extends KeyTypeManager.KeyFactory<AesCtrKeyFormat, AesCtrKey> {
        public AnonymousClass2() {
            super(AesCtrKeyFormat.class);
        }

        @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
        public final Object a(MessageLite messageLite) {
            AesCtrKeyFormat aesCtrKeyFormat = (AesCtrKeyFormat) messageLite;
            AesCtrKey.Builder builderNewBuilder = AesCtrKey.newBuilder();
            AesCtrParams params = aesCtrKeyFormat.getParams();
            builderNewBuilder.g();
            ((AesCtrKey) builderNewBuilder.e).setParams(params);
            byte[] bArrA = Random.a(aesCtrKeyFormat.getKeySize());
            ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
            builderNewBuilder.g();
            ((AesCtrKey) builderNewBuilder.e).setKeyValue(byteStringI);
            AesCtrKeyManager.this.getClass();
            builderNewBuilder.g();
            ((AesCtrKey) builderNewBuilder.e).setVersion(0);
            return (AesCtrKey) builderNewBuilder.p1();
        }

        @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
        public final MessageLite c(ByteString byteString) {
            return AesCtrKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
        }

        @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
        public final void d(MessageLite messageLite) throws GeneralSecurityException {
            AesCtrKeyFormat aesCtrKeyFormat = (AesCtrKeyFormat) messageLite;
            Validators.a(aesCtrKeyFormat.getKeySize());
            AesCtrParams params = aesCtrKeyFormat.getParams();
            if (params.getIvSize() < 12 || params.getIvSize() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
        }
    }

    public AesCtrKeyManager() {
        super(AesCtrKey.class, new AnonymousClass1(IndCpaCipher.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new AnonymousClass2();
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return AesCtrKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        AesCtrKey aesCtrKey = (AesCtrKey) messageLite;
        Validators.e(aesCtrKey.getVersion());
        Validators.a(aesCtrKey.getKeyValue().size());
        AesCtrParams params = aesCtrKey.getParams();
        if (params.getIvSize() < 12 || params.getIvSize() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
