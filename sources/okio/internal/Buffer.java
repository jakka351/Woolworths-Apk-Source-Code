package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okio.ByteString;
import okio.Segment;
import okio.SegmentedByteString;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes.dex */
public final class Buffer {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f26785a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        f26785a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(okio.Buffer buffer, ByteString bytes, long j, long j2, int i) {
        Segment segment;
        byte[] bArr;
        long j3 = j;
        long j4 = j2;
        Intrinsics.h(bytes, "bytes");
        long j5 = i;
        SegmentedByteString.b(bytes.c(), 0, j5);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.k(j3, "fromIndex < 0: ").toString());
        }
        if (j3 > j4) {
            StringBuilder sbT = androidx.camera.core.impl.b.t(j3, "fromIndex > toIndex: ", " > ");
            sbT.append(j4);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        long j7 = buffer.e;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 == j4 || (segment = buffer.d) == null) {
            return -1L;
        }
        if (j7 - j3 >= j3) {
            while (true) {
                long j8 = (segment.c - segment.b) + j6;
                if (j8 > j3) {
                    break;
                }
                segment = segment.f;
                Intrinsics.e(segment);
                j6 = j8;
            }
            byte[] data = bytes.getData();
            byte b2 = data[0];
            long jMin = Math.min(j4, (buffer.e - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr2 = segment.f26782a;
                int iMin = (int) Math.min(segment.c, (segment.b + jMin) - j6);
                for (int i2 = (int) ((segment.b + j3) - j6); i2 < iMin; i2++) {
                    if (bArr2[i2] == b2 && b(segment, i2 + 1, data, 1, i)) {
                        return (i2 - segment.b) + j6;
                    }
                }
                j6 += segment.c - segment.b;
                segment = segment.f;
                Intrinsics.e(segment);
                j3 = j6;
            }
            return -1L;
        }
        while (j7 > j3) {
            segment = segment.g;
            Intrinsics.e(segment);
            j7 -= segment.c - segment.b;
        }
        byte[] data2 = bytes.getData();
        byte b3 = data2[0];
        byte[] bArr3 = data2;
        long jMin2 = Math.min(j4, (buffer.e - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr4 = segment.f26782a;
            int iMin2 = (int) Math.min(segment.c, (segment.b + jMin2) - j7);
            int i3 = (int) ((segment.b + j3) - j7);
            while (i3 < iMin2) {
                if (bArr4[i3] == b3) {
                    bArr = bArr3;
                    if (b(segment, i3 + 1, bArr, 1, i)) {
                        return (i3 - segment.b) + j7;
                    }
                } else {
                    bArr = bArr3;
                }
                i3++;
                bArr3 = bArr;
            }
            j7 += segment.c - segment.b;
            segment = segment.f;
            Intrinsics.e(segment);
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(Segment segment, int i, byte[] bArr, int i2, int i3) {
        int i4 = segment.c;
        byte[] bArr2 = segment.f26782a;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.f;
                Intrinsics.e(segment);
                byte[] bArr3 = segment.f26782a;
                bArr2 = bArr3;
                i = segment.b;
                i4 = segment.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(okio.Buffer buffer, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.e(j2) == 13) {
                String strR = buffer.r(j2, Charsets.f24671a);
                buffer.skip(2L);
                return strR;
            }
        }
        String strR2 = buffer.r(j, Charsets.f24671a);
        buffer.skip(1L);
        return strR2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int d(okio.Buffer r16, okio.Options r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.d(okio.Buffer, okio.Options, boolean):int");
    }
}
