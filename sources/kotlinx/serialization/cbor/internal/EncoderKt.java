package kotlinx.serialization.cbor.internal;

import kotlin.Metadata;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0018\b\u0002\u0010\u0002\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0003"}, d2 = {"", "Lkotlinx/serialization/cbor/internal/CborWriter$Data;", "Stack", "kotlinx-serialization-cbor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EncoderKt {
    public static final byte[] a(long j) {
        return (UnsignedKt.a(j, 0L) < 0 || UnsignedKt.a(j, ((long) 23) & 4294967295L) > 0) ? (UnsignedKt.a(j, ((long) 24) & 4294967295L) < 0 || UnsignedKt.a(j, ((long) 255) & 4294967295L) > 0) ? (UnsignedKt.a(j, ((long) Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) & 4294967295L) > 0 || UnsignedKt.a(j, ((long) 256) & 4294967295L) < 0) ? (UnsignedKt.a(j, ((long) 65536) & 4294967295L) < 0 || UnsignedKt.a(j, ((long) (-1)) & 4294967295L) > 0) ? c(j, 8, (byte) 27) : c(j, 4, (byte) 26) : c(j, 2, (byte) 25) : new byte[]{24, (byte) j} : new byte[]{(byte) j};
    }

    public static final void b(ByteArrayOutput byteArrayOutput, long j) {
        byte[] bArrA;
        Intrinsics.h(byteArrayOutput, "<this>");
        if (j >= 0) {
            bArrA = a(j);
        } else {
            bArrA = a(j == Long.MIN_VALUE ? Long.MAX_VALUE : (-1) - j);
            bArrA[0] = (byte) (bArrA[0] | 32);
        }
        ByteArrayOutput.c(byteArrayOutput, bArrA, 0, 6);
    }

    public static final byte[] c(long j, int i, byte b) {
        byte[] bArr = new byte[i + 1];
        int i2 = (i * 8) - 8;
        int i3 = 0;
        bArr[0] = b;
        while (i3 < i) {
            int i4 = i3 + 1;
            bArr[i4] = (byte) ((j >>> (i2 - (i3 * 8))) & 255);
            i3 = i4;
        }
        return bArr;
    }

    public static final void d(ByteArrayOutput byteArrayOutput, long j, int i, int i2) {
        int i3 = (i * 8) - 8;
        Intrinsics.h(byteArrayOutput, "<this>");
        byteArrayOutput.b(i2);
        for (int i4 = 0; i4 < i; i4++) {
            byteArrayOutput.b((int) ((j >>> (i3 - (i4 * 8))) & 255));
        }
    }
}
