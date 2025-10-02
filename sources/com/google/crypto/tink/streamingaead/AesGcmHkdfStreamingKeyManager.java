package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKey;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesGcmHkdfStreaming;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class AesGcmHkdfStreamingKeyManager extends KeyTypeManager<AesGcmHkdfStreamingKey> {

    /* renamed from: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<StreamingAead, AesGcmHkdfStreamingKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) throws NoSuchAlgorithmException {
            AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = (AesGcmHkdfStreamingKey) messageLite;
            byte[] bArrW = aesGcmHkdfStreamingKey.getKeyValue().w();
            return new AesGcmHkdfStreaming(aesGcmHkdfStreamingKey.getParams().getDerivedKeySize(), aesGcmHkdfStreamingKey.getParams().getCiphertextSegmentSize(), StreamingAeadUtil.a(aesGcmHkdfStreamingKey.getParams().getHkdfHashType()), bArrW);
        }
    }

    public AesGcmHkdfStreamingKeyManager() {
        super(AesGcmHkdfStreamingKey.class, new AnonymousClass1(StreamingAead.class));
    }

    public static void g(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) throws GeneralSecurityException {
        Validators.a(aesGcmHkdfStreamingParams.getDerivedKeySize());
        if (aesGcmHkdfStreamingParams.getHkdfHashType() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (aesGcmHkdfStreamingParams.getCiphertextSegmentSize() < aesGcmHkdfStreamingParams.getDerivedKeySize() + 25) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<AesGcmHkdfStreamingKeyFormat, AesGcmHkdfStreamingKey>() { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) messageLite;
                AesGcmHkdfStreamingKey.Builder builderNewBuilder = AesGcmHkdfStreamingKey.newBuilder();
                byte[] bArrA = Random.a(aesGcmHkdfStreamingKeyFormat.getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((AesGcmHkdfStreamingKey) builderNewBuilder.e).setKeyValue(byteStringI);
                AesGcmHkdfStreamingParams params = aesGcmHkdfStreamingKeyFormat.getParams();
                builderNewBuilder.g();
                ((AesGcmHkdfStreamingKey) builderNewBuilder.e).setParams(params);
                AesGcmHkdfStreamingKeyManager.this.getClass();
                builderNewBuilder.g();
                ((AesGcmHkdfStreamingKey) builderNewBuilder.e).setVersion(0);
                return (AesGcmHkdfStreamingKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return AesGcmHkdfStreamingKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) messageLite;
                if (aesGcmHkdfStreamingKeyFormat.getKeySize() < 16) {
                    throw new GeneralSecurityException("key_size must be at least 16 bytes");
                }
                AesGcmHkdfStreamingKeyManager.g(aesGcmHkdfStreamingKeyFormat.getParams());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return AesGcmHkdfStreamingKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey = (AesGcmHkdfStreamingKey) messageLite;
        Validators.e(aesGcmHkdfStreamingKey.getVersion());
        g(aesGcmHkdfStreamingKey.getParams());
    }
}
