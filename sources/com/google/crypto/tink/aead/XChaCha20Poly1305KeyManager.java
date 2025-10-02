package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.XChaCha20Poly1305Key;
import com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.crypto.tink.subtle.XChaCha20Poly1305;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class XChaCha20Poly1305KeyManager extends KeyTypeManager<XChaCha20Poly1305Key> {

    /* renamed from: com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Aead, XChaCha20Poly1305Key> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            return new XChaCha20Poly1305(((XChaCha20Poly1305Key) messageLite).getKeyValue().w());
        }
    }

    public XChaCha20Poly1305KeyManager() {
        super(XChaCha20Poly1305Key.class, new AnonymousClass1(Aead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<XChaCha20Poly1305KeyFormat, XChaCha20Poly1305Key>() { // from class: com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                XChaCha20Poly1305Key.Builder builderNewBuilder = XChaCha20Poly1305Key.newBuilder();
                XChaCha20Poly1305KeyManager.this.getClass();
                builderNewBuilder.g();
                ((XChaCha20Poly1305Key) builderNewBuilder.e).setVersion(0);
                byte[] bArrA = Random.a(32);
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((XChaCha20Poly1305Key) builderNewBuilder.e).setKeyValue(byteStringI);
                return (XChaCha20Poly1305Key) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return XChaCha20Poly1305KeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
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
        return XChaCha20Poly1305Key.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        XChaCha20Poly1305Key xChaCha20Poly1305Key = (XChaCha20Poly1305Key) messageLite;
        Validators.e(xChaCha20Poly1305Key.getVersion());
        if (xChaCha20Poly1305Key.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
