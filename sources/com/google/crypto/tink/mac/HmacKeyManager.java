package com.google.crypto.tink.mac;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.MacJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class HmacKeyManager extends KeyTypeManager<HmacKey> {

    /* renamed from: com.google.crypto.tink.mac.HmacKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<Mac, HmacKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) throws GeneralSecurityException {
            HmacKey hmacKey = (HmacKey) messageLite;
            HashType hash = hmacKey.getParams().getHash();
            SecretKeySpec secretKeySpec = new SecretKeySpec(hmacKey.getKeyValue().w(), "HMAC");
            int tagSize = hmacKey.getParams().getTagSize();
            int iOrdinal = hash.ordinal();
            if (iOrdinal == 1) {
                return new MacJce("HMACSHA1", secretKeySpec, tagSize);
            }
            if (iOrdinal == 3) {
                return new MacJce("HMACSHA256", secretKeySpec, tagSize);
            }
            if (iOrdinal == 4) {
                return new MacJce("HMACSHA512", secretKeySpec, tagSize);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: com.google.crypto.tink.mac.HmacKeyManager$3, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15005a;

        static {
            int[] iArr = new int[HashType.values().length];
            f15005a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15005a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15005a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HmacKeyManager() {
        super(HmacKey.class, new AnonymousClass1(Mac.class));
    }

    public static void g(HmacParams hmacParams) throws GeneralSecurityException {
        if (hmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = hmacParams.getHash().ordinal();
        if (iOrdinal == 1) {
            if (hmacParams.getTagSize() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 3) {
            if (hmacParams.getTagSize() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (hmacParams.getTagSize() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<HmacKeyFormat, HmacKey>() { // from class: com.google.crypto.tink.mac.HmacKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) messageLite;
                HmacKey.Builder builderNewBuilder = HmacKey.newBuilder();
                HmacKeyManager.this.getClass();
                builderNewBuilder.g();
                ((HmacKey) builderNewBuilder.e).setVersion(0);
                HmacParams params = hmacKeyFormat.getParams();
                builderNewBuilder.g();
                ((HmacKey) builderNewBuilder.e).setParams(params);
                byte[] bArrA = Random.a(hmacKeyFormat.getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((HmacKey) builderNewBuilder.e).setKeyValue(byteStringI);
                return (HmacKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return HmacKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                HmacKeyFormat hmacKeyFormat = (HmacKeyFormat) messageLite;
                if (hmacKeyFormat.getKeySize() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                HmacKeyManager.g(hmacKeyFormat.getParams());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final MessageLite e(ByteString byteString) {
        return HmacKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        HmacKey hmacKey = (HmacKey) messageLite;
        Validators.e(hmacKey.getVersion());
        if (hmacKey.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        g(hmacKey.getParams());
    }
}
