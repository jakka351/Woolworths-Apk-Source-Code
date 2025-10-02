package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.KmsClients;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKey;
import com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class KmsEnvelopeAeadKeyManager extends KeyTypeManager<KmsEnvelopeAeadKey> {

    /* renamed from: com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Aead, KmsEnvelopeAeadKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            KmsEnvelopeAeadKey kmsEnvelopeAeadKey = (KmsEnvelopeAeadKey) messageLite;
            String kekUri = kmsEnvelopeAeadKey.getParams().getKekUri();
            return new KmsEnvelopeAead(kmsEnvelopeAeadKey.getParams().getDekTemplate(), KmsClients.a(kekUri).b(kekUri));
        }
    }

    public KmsEnvelopeAeadKeyManager() {
        super(KmsEnvelopeAeadKey.class, new AnonymousClass1(Aead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<KmsEnvelopeAeadKeyFormat, KmsEnvelopeAeadKey>() { // from class: com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                KmsEnvelopeAeadKey.Builder builderNewBuilder = KmsEnvelopeAeadKey.newBuilder();
                builderNewBuilder.g();
                ((KmsEnvelopeAeadKey) builderNewBuilder.e).setParams((KmsEnvelopeAeadKeyFormat) messageLite);
                KmsEnvelopeAeadKeyManager.this.getClass();
                builderNewBuilder.g();
                ((KmsEnvelopeAeadKey) builderNewBuilder.e).setVersion(0);
                return (KmsEnvelopeAeadKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return KmsEnvelopeAeadKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
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
        return KmsEnvelopeAeadKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        Validators.e(((KmsEnvelopeAeadKey) messageLite).getVersion());
    }
}
