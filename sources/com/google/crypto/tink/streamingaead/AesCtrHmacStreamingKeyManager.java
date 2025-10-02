package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKey;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat;
import com.google.crypto.tink.proto.AesCtrHmacStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.AesCtrHmacStreaming;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class AesCtrHmacStreamingKeyManager extends KeyTypeManager<AesCtrHmacStreamingKey> {

    /* renamed from: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<StreamingAead, AesCtrHmacStreamingKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            AesCtrHmacStreamingKey aesCtrHmacStreamingKey = (AesCtrHmacStreamingKey) messageLite;
            return new AesCtrHmacStreaming(aesCtrHmacStreamingKey.getKeyValue().w(), StreamingAeadUtil.a(aesCtrHmacStreamingKey.getParams().getHkdfHashType()), aesCtrHmacStreamingKey.getParams().getDerivedKeySize(), StreamingAeadUtil.a(aesCtrHmacStreamingKey.getParams().getHmacParams().getHash()), aesCtrHmacStreamingKey.getParams().getHmacParams().getTagSize(), aesCtrHmacStreamingKey.getParams().getCiphertextSegmentSize());
        }
    }

    /* renamed from: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$3, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15127a;

        static {
            int[] iArr = new int[HashType.values().length];
            f15127a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15127a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15127a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AesCtrHmacStreamingKeyManager() {
        super(AesCtrHmacStreamingKey.class, new AnonymousClass1(StreamingAead.class));
    }

    public static void g(AesCtrHmacStreamingParams aesCtrHmacStreamingParams) throws GeneralSecurityException {
        Validators.a(aesCtrHmacStreamingParams.getDerivedKeySize());
        HashType hkdfHashType = aesCtrHmacStreamingParams.getHkdfHashType();
        HashType hashType = HashType.UNKNOWN_HASH;
        if (hkdfHashType == hashType) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (aesCtrHmacStreamingParams.getHmacParams().getHash() == hashType) {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
        HmacParams hmacParams = aesCtrHmacStreamingParams.getHmacParams();
        if (hmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = hmacParams.getHash().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown hash type");
                }
                if (hmacParams.getTagSize() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (hmacParams.getTagSize() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (hmacParams.getTagSize() > 20) {
            throw new GeneralSecurityException("tag size too big");
        }
        if (aesCtrHmacStreamingParams.getCiphertextSegmentSize() < aesCtrHmacStreamingParams.getHmacParams().getTagSize() + aesCtrHmacStreamingParams.getDerivedKeySize() + 9) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<AesCtrHmacStreamingKeyFormat, AesCtrHmacStreamingKey>() { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = (AesCtrHmacStreamingKeyFormat) messageLite;
                AesCtrHmacStreamingKey.Builder builderNewBuilder = AesCtrHmacStreamingKey.newBuilder();
                byte[] bArrA = Random.a(aesCtrHmacStreamingKeyFormat.getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((AesCtrHmacStreamingKey) builderNewBuilder.e).setKeyValue(byteStringI);
                AesCtrHmacStreamingParams params = aesCtrHmacStreamingKeyFormat.getParams();
                builderNewBuilder.g();
                ((AesCtrHmacStreamingKey) builderNewBuilder.e).setParams(params);
                AesCtrHmacStreamingKeyManager.this.getClass();
                builderNewBuilder.g();
                ((AesCtrHmacStreamingKey) builderNewBuilder.e).setVersion(0);
                return (AesCtrHmacStreamingKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return AesCtrHmacStreamingKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                AesCtrHmacStreamingKeyFormat aesCtrHmacStreamingKeyFormat = (AesCtrHmacStreamingKeyFormat) messageLite;
                if (aesCtrHmacStreamingKeyFormat.getKeySize() < 16) {
                    throw new GeneralSecurityException("key_size must be at least 16 bytes");
                }
                AesCtrHmacStreamingKeyManager.g(aesCtrHmacStreamingKeyFormat.getParams());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return AesCtrHmacStreamingKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        AesCtrHmacStreamingKey aesCtrHmacStreamingKey = (AesCtrHmacStreamingKey) messageLite;
        Validators.e(aesCtrHmacStreamingKey.getVersion());
        if (aesCtrHmacStreamingKey.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        }
        if (aesCtrHmacStreamingKey.getKeyValue().size() < aesCtrHmacStreamingKey.getParams().getDerivedKeySize()) {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
        g(aesCtrHmacStreamingKey.getParams());
    }
}
