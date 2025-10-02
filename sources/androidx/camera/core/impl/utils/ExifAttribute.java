package androidx.camera.core.impl.utils;

import YU.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
final class ExifAttribute {
    public static final Charset d = StandardCharsets.US_ASCII;
    public static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a, reason: collision with root package name */
    public final int f511a;
    public final int b;
    public final byte[] c;

    public ExifAttribute(int i, int i2, byte[] bArr) {
        this.f511a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static ExifAttribute a(long j, ByteOrder byteOrder) {
        return b(new long[]{j}, byteOrder);
    }

    public static ExifAttribute b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new ExifAttribute(4, jArr.length, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(e[this.f511a]);
        sb.append(", data length:");
        return a.m(sb, this.c.length, ")");
    }
}
