package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.KmsClients;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KmsAeadKey;
import com.google.crypto.tink.proto.KmsAeadKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class KmsAeadKeyManager extends KeyTypeManager<KmsAeadKey> {

    /* renamed from: com.google.crypto.tink.aead.KmsAeadKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Aead, KmsAeadKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            String keyUri = ((KmsAeadKey) messageLite).getParams().getKeyUri();
            return KmsClients.a(keyUri).b(keyUri);
        }
    }

    public KmsAeadKeyManager() {
        super(KmsAeadKey.class, new AnonymousClass1(Aead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<KmsAeadKeyFormat, KmsAeadKey>() { // from class: com.google.crypto.tink.aead.KmsAeadKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                KmsAeadKey.Builder builderNewBuilder = KmsAeadKey.newBuilder();
                builderNewBuilder.g();
                ((KmsAeadKey) builderNewBuilder.e).setParams((KmsAeadKeyFormat) messageLite);
                KmsAeadKeyManager.this.getClass();
                builderNewBuilder.g();
                ((KmsAeadKey) builderNewBuilder.e).setVersion(0);
                return (KmsAeadKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return KmsAeadKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final /* bridge */ /* synthetic */ void d(MessageLite messageLite) {
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return KmsAeadKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        Validators.e(((KmsAeadKey) messageLite).getVersion());
    }
}
