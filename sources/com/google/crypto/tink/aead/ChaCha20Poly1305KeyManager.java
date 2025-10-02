package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.ChaCha20Poly1305Key;
import com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.ChaCha20Poly1305;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class ChaCha20Poly1305KeyManager extends KeyTypeManager<ChaCha20Poly1305Key> {

    /* renamed from: com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Aead, ChaCha20Poly1305Key> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            return new ChaCha20Poly1305(((ChaCha20Poly1305Key) messageLite).getKeyValue().w());
        }
    }

    public ChaCha20Poly1305KeyManager() {
        super(ChaCha20Poly1305Key.class, new AnonymousClass1(Aead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<ChaCha20Poly1305KeyFormat, ChaCha20Poly1305Key>() { // from class: com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                ChaCha20Poly1305Key.Builder builderNewBuilder = ChaCha20Poly1305Key.newBuilder();
                ChaCha20Poly1305KeyManager.this.getClass();
                builderNewBuilder.g();
                ((ChaCha20Poly1305Key) builderNewBuilder.e).setVersion(0);
                byte[] bArrA = Random.a(32);
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((ChaCha20Poly1305Key) builderNewBuilder.e).setKeyValue(byteStringI);
                return (ChaCha20Poly1305Key) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return ChaCha20Poly1305KeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final /* bridge */ /* synthetic */ void d(MessageLite messageLite) {
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return ChaCha20Poly1305Key.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        ChaCha20Poly1305Key chaCha20Poly1305Key = (ChaCha20Poly1305Key) messageLite;
        Validators.e(chaCha20Poly1305Key.getVersion());
        if (chaCha20Poly1305Key.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
