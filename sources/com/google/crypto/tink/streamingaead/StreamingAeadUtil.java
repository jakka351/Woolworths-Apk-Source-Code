package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
class StreamingAeadUtil {

    /* renamed from: com.google.crypto.tink.streamingaead.StreamingAeadUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15130a;

        static {
            int[] iArr = new int[HashType.values().length];
            f15130a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15130a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15130a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(HashType hashType) throws NoSuchAlgorithmException {
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hashType);
    }
}
