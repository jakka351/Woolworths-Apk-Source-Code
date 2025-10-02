package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.AesEaxKey;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.proto.AesEaxParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesEaxJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class AesEaxKeyManager extends KeyTypeManager<AesEaxKey> {

    /* renamed from: com.google.crypto.tink.aead.AesEaxKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Aead, AesEaxKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            AesEaxKey aesEaxKey = (AesEaxKey) messageLite;
            return new AesEaxJce(aesEaxKey.getKeyValue().w(), aesEaxKey.getParams().getIvSize());
        }
    }

    public AesEaxKeyManager() {
        super(AesEaxKey.class, new AnonymousClass1(Aead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<AesEaxKeyFormat, AesEaxKey>() { // from class: com.google.crypto.tink.aead.AesEaxKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                AesEaxKeyFormat aesEaxKeyFormat = (AesEaxKeyFormat) messageLite;
                AesEaxKey.Builder builderNewBuilder = AesEaxKey.newBuilder();
                byte[] bArrA = Random.a(aesEaxKeyFormat.getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((AesEaxKey) builderNewBuilder.e).setKeyValue(byteStringI);
                AesEaxParams params = aesEaxKeyFormat.getParams();
                builderNewBuilder.g();
                ((AesEaxKey) builderNewBuilder.e).setParams(params);
                AesEaxKeyManager.this.getClass();
                builderNewBuilder.g();
                ((AesEaxKey) builderNewBuilder.e).setVersion(0);
                return (AesEaxKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return AesEaxKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                AesEaxKeyFormat aesEaxKeyFormat = (AesEaxKeyFormat) messageLite;
                Validators.a(aesEaxKeyFormat.getKeySize());
                if (aesEaxKeyFormat.getParams().getIvSize() != 12 && aesEaxKeyFormat.getParams().getIvSize() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return AesEaxKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        AesEaxKey aesEaxKey = (AesEaxKey) messageLite;
        Validators.e(aesEaxKey.getVersion());
        Validators.a(aesEaxKey.getKeyValue().size());
        if (aesEaxKey.getParams().getIvSize() != 12 && aesEaxKey.getParams().getIvSize() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
