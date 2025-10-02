package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.subtle.Enums;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@Immutable
/* loaded from: classes6.dex */
public class HkdfStreamingPrf implements StreamingPrf {

    /* renamed from: com.google.crypto.tink.subtle.prf.HkdfStreamingPrf$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15167a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f15167a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15167a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15167a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15167a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public HkdfStreamingPrf(Enums.HashType hashType, byte[] bArr, byte[] bArr2) {
        Arrays.copyOf(bArr, bArr.length);
        Arrays.copyOf(bArr2, bArr2.length);
    }

    public class HkdfInputStream extends InputStream {
        @Override // java.io.InputStream
        public final int read() throws IOException {
            read(new byte[1], 0, 1);
            throw new IOException("Reading failed");
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) {
            read(bArr, 0, bArr.length);
            return 0;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            if (i2 <= 0) {
                return 0;
            }
            throw null;
        }
    }
}
