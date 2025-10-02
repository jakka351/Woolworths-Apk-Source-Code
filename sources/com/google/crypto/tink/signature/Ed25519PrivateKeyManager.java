package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrivateKeyTypeManager;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.proto.Ed25519KeyFormat;
import com.google.crypto.tink.proto.Ed25519PrivateKey;
import com.google.crypto.tink.proto.Ed25519PublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Ed25519Sign;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Ed25519PrivateKeyManager extends PrivateKeyTypeManager<Ed25519PrivateKey, Ed25519PublicKey> {

    /* renamed from: com.google.crypto.tink.signature.Ed25519PrivateKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<PublicKeySign, Ed25519PrivateKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            return new Ed25519Sign(((Ed25519PrivateKey) messageLite).getKeyValue().w());
        }
    }

    public Ed25519PrivateKeyManager() {
        super(Ed25519PrivateKey.class, new AnonymousClass1(PublicKeySign.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<Ed25519KeyFormat, Ed25519PrivateKey>(this) { // from class: com.google.crypto.tink.signature.Ed25519PrivateKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                Ed25519Sign.KeyPair keyPairA = Ed25519Sign.KeyPair.a();
                Ed25519PublicKey.Builder builderNewBuilder = Ed25519PublicKey.newBuilder();
                builderNewBuilder.g();
                ((Ed25519PublicKey) builderNewBuilder.e).setVersion(0);
                byte[] bArr = keyPairA.f15153a;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                ByteString byteString = ByteString.e;
                ByteString byteStringI = ByteString.i(0, bArrCopyOf.length, bArrCopyOf);
                builderNewBuilder.g();
                ((Ed25519PublicKey) builderNewBuilder.e).setKeyValue(byteStringI);
                Ed25519PublicKey ed25519PublicKey = (Ed25519PublicKey) builderNewBuilder.p1();
                Ed25519PrivateKey.Builder builderNewBuilder2 = Ed25519PrivateKey.newBuilder();
                builderNewBuilder2.g();
                ((Ed25519PrivateKey) builderNewBuilder2.e).setVersion(0);
                byte[] bArr2 = keyPairA.b;
                byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                ByteString byteStringI2 = ByteString.i(0, bArrCopyOf2.length, bArrCopyOf2);
                builderNewBuilder2.g();
                ((Ed25519PrivateKey) builderNewBuilder2.e).setKeyValue(byteStringI2);
                builderNewBuilder2.g();
                ((Ed25519PrivateKey) builderNewBuilder2.e).setPublicKey(ed25519PublicKey);
                return (Ed25519PrivateKey) builderNewBuilder2.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return Ed25519KeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final /* bridge */ /* synthetic */ void d(MessageLite messageLite) {
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return Ed25519PrivateKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        Ed25519PrivateKey ed25519PrivateKey = (Ed25519PrivateKey) messageLite;
        Validators.e(ed25519PrivateKey.getVersion());
        new Ed25519PublicKeyManager();
        Ed25519PublicKey publicKey = ed25519PrivateKey.getPublicKey();
        Validators.e(publicKey.getVersion());
        if (publicKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
        if (ed25519PrivateKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}
