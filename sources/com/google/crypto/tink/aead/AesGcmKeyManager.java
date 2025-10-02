package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class AesGcmKeyManager extends KeyTypeManager<AesGcmKey> {

    /* renamed from: com.google.crypto.tink.aead.AesGcmKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Aead, AesGcmKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            return new AesGcmJce(((AesGcmKey) messageLite).getKeyValue().w());
        }
    }

    public AesGcmKeyManager() {
        super(AesGcmKey.class, new AnonymousClass1(Aead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<AesGcmKeyFormat, AesGcmKey>() { // from class: com.google.crypto.tink.aead.AesGcmKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                AesGcmKey.Builder builderNewBuilder = AesGcmKey.newBuilder();
                byte[] bArrA = Random.a(((AesGcmKeyFormat) messageLite).getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((AesGcmKey) builderNewBuilder.e).setKeyValue(byteStringI);
                AesGcmKeyManager.this.getClass();
                builderNewBuilder.g();
                ((AesGcmKey) builderNewBuilder.e).setVersion(0);
                return (AesGcmKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return AesGcmKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws InvalidAlgorithmParameterException {
                Validators.a(((AesGcmKeyFormat) messageLite).getKeySize());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return AesGcmKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        AesGcmKey aesGcmKey = (AesGcmKey) messageLite;
        Validators.e(aesGcmKey.getVersion());
        Validators.a(aesGcmKey.getKeyValue().size());
    }
}
