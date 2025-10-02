package com.google.crypto.tink.mac;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.proto.AesCmacKey;
import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesCmac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class AesCmacKeyManager extends KeyTypeManager<AesCmacKey> {

    /* renamed from: com.google.crypto.tink.mac.AesCmacKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Mac, AesCmacKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            AesCmacKey aesCmacKey = (AesCmacKey) messageLite;
            return new AesCmac(aesCmacKey.getKeyValue().w(), aesCmacKey.getParams().getTagSize());
        }
    }

    public AesCmacKeyManager() {
        super(AesCmacKey.class, new AnonymousClass1(Mac.class));
    }

    public static void g(AesCmacParams aesCmacParams) throws GeneralSecurityException {
        if (aesCmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (aesCmacParams.getTagSize() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<AesCmacKeyFormat, AesCmacKey>() { // from class: com.google.crypto.tink.mac.AesCmacKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                AesCmacKeyFormat aesCmacKeyFormat = (AesCmacKeyFormat) messageLite;
                AesCmacKey.Builder builderNewBuilder = AesCmacKey.newBuilder();
                builderNewBuilder.g();
                ((AesCmacKey) builderNewBuilder.e).setVersion(0);
                byte[] bArrA = Random.a(aesCmacKeyFormat.getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((AesCmacKey) builderNewBuilder.e).setKeyValue(byteStringI);
                AesCmacParams params = aesCmacKeyFormat.getParams();
                builderNewBuilder.g();
                ((AesCmacKey) builderNewBuilder.e).setParams(params);
                return (AesCmacKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return AesCmacKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                AesCmacKeyFormat aesCmacKeyFormat = (AesCmacKeyFormat) messageLite;
                AesCmacKeyManager.g(aesCmacKeyFormat.getParams());
                if (aesCmacKeyFormat.getKeySize() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
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
        return AesCmacKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        AesCmacKey aesCmacKey = (AesCmacKey) messageLite;
        Validators.e(aesCmacKey.getVersion());
        if (aesCmacKey.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
        g(aesCmacKey.getParams());
    }
}
