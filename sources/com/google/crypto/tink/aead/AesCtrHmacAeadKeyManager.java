package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.aead.AesCtrKeyManager.AnonymousClass2;
import com.google.crypto.tink.mac.HmacKeyManager;
import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.EncryptThenAuthenticate;
import com.google.crypto.tink.subtle.IndCpaCipher;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class AesCtrHmacAeadKeyManager extends KeyTypeManager<AesCtrHmacAeadKey> {

    /* renamed from: com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Aead, AesCtrHmacAeadKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            AesCtrHmacAeadKey aesCtrHmacAeadKey = (AesCtrHmacAeadKey) messageLite;
            return new EncryptThenAuthenticate((IndCpaCipher) new AesCtrKeyManager().b(aesCtrHmacAeadKey.getAesCtrKey(), IndCpaCipher.class), (Mac) new HmacKeyManager().b(aesCtrHmacAeadKey.getHmacKey(), Mac.class), aesCtrHmacAeadKey.getHmacKey().getParams().getTagSize());
        }
    }

    public AesCtrHmacAeadKeyManager() {
        super(AesCtrHmacAeadKey.class, new AnonymousClass1(Aead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<AesCtrHmacAeadKeyFormat, AesCtrHmacAeadKey>(this) { // from class: com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = (AesCtrHmacAeadKeyFormat) messageLite;
                AesCtrKey aesCtrKey = (AesCtrKey) new AesCtrKeyManager().new AnonymousClass2().a(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat());
                HmacKey hmacKey = (HmacKey) new HmacKeyManager().c().a(aesCtrHmacAeadKeyFormat.getHmacKeyFormat());
                AesCtrHmacAeadKey.Builder builderNewBuilder = AesCtrHmacAeadKey.newBuilder();
                builderNewBuilder.g();
                ((AesCtrHmacAeadKey) builderNewBuilder.e).setAesCtrKey(aesCtrKey);
                builderNewBuilder.g();
                ((AesCtrHmacAeadKey) builderNewBuilder.e).setHmacKey(hmacKey);
                builderNewBuilder.g();
                ((AesCtrHmacAeadKey) builderNewBuilder.e).setVersion(0);
                return (AesCtrHmacAeadKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return AesCtrHmacAeadKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = (AesCtrHmacAeadKeyFormat) messageLite;
                new AesCtrKeyManager().new AnonymousClass2().d(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat());
                new HmacKeyManager().c().d(aesCtrHmacAeadKeyFormat.getHmacKeyFormat());
                Validators.a(aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat().getKeySize());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return AesCtrHmacAeadKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        Validators.e(((AesCtrHmacAeadKey) messageLite).getVersion());
    }
}
