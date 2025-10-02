package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.AesSivKey;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesSiv;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class AesSivKeyManager extends KeyTypeManager<AesSivKey> {

    /* renamed from: com.google.crypto.tink.daead.AesSivKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<DeterministicAead, AesSivKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            return new AesSiv(((AesSivKey) messageLite).getKeyValue().w());
        }
    }

    public AesSivKeyManager() {
        super(AesSivKey.class, new AnonymousClass1(DeterministicAead.class));
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<AesSivKeyFormat, AesSivKey>() { // from class: com.google.crypto.tink.daead.AesSivKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                AesSivKey.Builder builderNewBuilder = AesSivKey.newBuilder();
                byte[] bArrA = Random.a(((AesSivKeyFormat) messageLite).getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((AesSivKey) builderNewBuilder.e).setKeyValue(byteStringI);
                AesSivKeyManager.this.getClass();
                builderNewBuilder.g();
                ((AesSivKey) builderNewBuilder.e).setVersion(0);
                return (AesSivKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return AesSivKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws InvalidAlgorithmParameterException {
                AesSivKeyFormat aesSivKeyFormat = (AesSivKeyFormat) messageLite;
                if (aesSivKeyFormat.getKeySize() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + aesSivKeyFormat.getKeySize() + ". Valid keys must have 64 bytes.");
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return AesSivKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        AesSivKey aesSivKey = (AesSivKey) messageLite;
        Validators.e(aesSivKey.getVersion());
        if (aesSivKey.getKeyValue().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + aesSivKey.getKeyValue().size() + ". Valid keys must have 64 bytes.");
    }
}
