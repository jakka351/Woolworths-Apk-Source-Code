package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HkdfPrfKey;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.HkdfPrfParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.crypto.tink.subtle.prf.HkdfStreamingPrf;
import com.google.crypto.tink.subtle.prf.PrfImpl;
import com.google.crypto.tink.subtle.prf.StreamingPrf;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class HkdfPrfKeyManager extends KeyTypeManager<HkdfPrfKey> {

    /* renamed from: com.google.crypto.tink.prf.HkdfPrfKeyManager$1, reason: invalid class name */
    class AnonymousClass1 extends KeyTypeManager.PrimitiveFactory<StreamingPrf, HkdfPrfKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) messageLite;
            return new HkdfStreamingPrf(HkdfPrfKeyManager.g(hkdfPrfKey.getParams().getHash()), hkdfPrfKey.getKeyValue().w(), hkdfPrfKey.getParams().getSalt().w());
        }
    }

    /* renamed from: com.google.crypto.tink.prf.HkdfPrfKeyManager$2, reason: invalid class name */
    class AnonymousClass2 extends KeyTypeManager.PrimitiveFactory<PrfSet, HkdfPrfKey> {
        @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
        public final Object a(MessageLite messageLite) {
            HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) messageLite;
            final PrfImpl prfImplA = PrfImpl.a(new HkdfStreamingPrf(HkdfPrfKeyManager.g(hkdfPrfKey.getParams().getHash()), hkdfPrfKey.getKeyValue().w(), hkdfPrfKey.getParams().getSalt().w()));
            return new PrfSet() { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager.2.1
                @Override // com.google.crypto.tink.prf.PrfSet
                public final Map a() {
                    return Collections.singletonMap(0, prfImplA);
                }

                @Override // com.google.crypto.tink.prf.PrfSet
                public final int b() {
                    return 0;
                }
            };
        }
    }

    /* renamed from: com.google.crypto.tink.prf.HkdfPrfKeyManager$4, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15009a;

        static {
            int[] iArr = new int[HashType.values().length];
            f15009a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15009a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15009a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15009a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public HkdfPrfKeyManager() {
        super(HkdfPrfKey.class, new AnonymousClass1(StreamingPrf.class), new AnonymousClass2(PrfSet.class));
    }

    public static Enums.HashType g(HashType hashType) throws GeneralSecurityException {
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 1) {
            return Enums.HashType.d;
        }
        if (iOrdinal == 2) {
            return Enums.HashType.f;
        }
        if (iOrdinal == 3) {
            return Enums.HashType.e;
        }
        if (iOrdinal == 4) {
            return Enums.HashType.g;
        }
        throw new GeneralSecurityException("HashType " + hashType.name() + " not known in");
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final KeyTypeManager.KeyFactory c() {
        return new KeyTypeManager.KeyFactory<HkdfPrfKeyFormat, HkdfPrfKey>() { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager.3
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final Object a(MessageLite messageLite) {
                HkdfPrfKeyFormat hkdfPrfKeyFormat = (HkdfPrfKeyFormat) messageLite;
                HkdfPrfKey.Builder builderNewBuilder = HkdfPrfKey.newBuilder();
                byte[] bArrA = Random.a(hkdfPrfKeyFormat.getKeySize());
                ByteString byteStringI = ByteString.i(0, bArrA.length, bArrA);
                builderNewBuilder.g();
                ((HkdfPrfKey) builderNewBuilder.e).setKeyValue(byteStringI);
                HkdfPrfKeyManager.this.getClass();
                builderNewBuilder.g();
                ((HkdfPrfKey) builderNewBuilder.e).setVersion(0);
                HkdfPrfParams params = hkdfPrfKeyFormat.getParams();
                builderNewBuilder.g();
                ((HkdfPrfKey) builderNewBuilder.e).setParams(params);
                return (HkdfPrfKey) builderNewBuilder.p1();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final MessageLite c(ByteString byteString) {
                return HkdfPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.b());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public final void d(MessageLite messageLite) throws GeneralSecurityException {
                HkdfPrfKeyFormat hkdfPrfKeyFormat = (HkdfPrfKeyFormat) messageLite;
                if (hkdfPrfKeyFormat.getKeySize() < 32) {
                    throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
                }
                HkdfPrfParams params = hkdfPrfKeyFormat.getParams();
                if (params.getHash() != HashType.SHA256 && params.getHash() != HashType.SHA512) {
                    throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
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
        return HkdfPrfKey.parseFrom(byteString, ExtensionRegistryLite.b());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public final void f(MessageLite messageLite) throws GeneralSecurityException {
        HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) messageLite;
        Validators.e(hkdfPrfKey.getVersion());
        if (hkdfPrfKey.getKeyValue().size() < 32) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
        }
        HkdfPrfParams params = hkdfPrfKey.getParams();
        if (params.getHash() != HashType.SHA256 && params.getHash() != HashType.SHA512) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
        }
    }
}
