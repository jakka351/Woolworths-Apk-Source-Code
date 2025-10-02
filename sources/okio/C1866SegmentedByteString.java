package okio;

import YU.a;
import androidx.camera.core.impl.b;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1866SegmentedByteString extends ByteString {
    public final transient byte[][] h;
    public final transient int[] i;

    public C1866SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.g.data);
        this.h = bArr;
        this.i = iArr;
    }

    private final Object writeReplace() {
        return B();
    }

    public final ByteString B() {
        return new ByteString(x());
    }

    @Override // okio.ByteString
    public final ByteString b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.h;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.i;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.e(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public final int c() {
        return this.i[this.h.length - 1];
    }

    @Override // okio.ByteString
    public final String d() {
        return B().d();
    }

    @Override // okio.ByteString
    public final int e(int i, byte[] other) {
        Intrinsics.h(other, "other");
        return B().e(i, other);
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.c() == c() && q(0, byteString, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.h;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.i;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.e = i3;
        return i3;
    }

    @Override // okio.ByteString
    /* renamed from: l */
    public final byte[] getData() {
        return x();
    }

    @Override // okio.ByteString
    public final byte m(int i) {
        byte[][] bArr = this.h;
        int length = bArr.length - 1;
        int[] iArr = this.i;
        SegmentedByteString.b(iArr[length], i, 1L);
        int iA = okio.internal.SegmentedByteString.a(this, i);
        return bArr[iA][(i - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[bArr.length + iA]];
    }

    @Override // okio.ByteString
    public final int n(byte[] other) {
        Intrinsics.h(other, "other");
        return B().n(other);
    }

    @Override // okio.ByteString
    public final boolean p(int i, int i2, byte[] other, int i3) {
        Intrinsics.h(other, "other");
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iA = okio.internal.SegmentedByteString.a(this, i);
        while (i < i4) {
            int[] iArr = this.i;
            int i5 = iA == 0 ? 0 : iArr[iA - 1];
            int i6 = iArr[iA] - i5;
            byte[][] bArr = this.h;
            int i7 = iArr[bArr.length + iA];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!SegmentedByteString.a((i - i5) + i7, i2, iMin, bArr[iA], other)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iA++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean q(int i, ByteString other, int i2) {
        Intrinsics.h(other, "other");
        if (i >= 0 && i <= c() - i2) {
            int i3 = i2 + i;
            int iA = okio.internal.SegmentedByteString.a(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.i;
                int i5 = iA == 0 ? 0 : iArr[iA - 1];
                int i6 = iArr[iA] - i5;
                byte[][] bArr = this.h;
                int i7 = iArr[bArr.length + iA];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (other.p(i4, (i - i5) + i7, bArr[iA], iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iA++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final String s(Charset charset) {
        Intrinsics.h(charset, "charset");
        return B().s(charset);
    }

    @Override // okio.ByteString
    public final ByteString t(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = c();
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > c()) {
            StringBuilder sbR = a.r(i2, "endIndex=", " > length(");
            sbR.append(c());
            sbR.append(')');
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(b.i(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == c()) {
            return this;
        }
        if (i == i2) {
            return ByteString.g;
        }
        int iA = okio.internal.SegmentedByteString.a(this, i);
        int iA2 = okio.internal.SegmentedByteString.a(this, i2 - 1);
        byte[][] bArr = this.h;
        byte[][] bArr2 = (byte[][]) ArraysKt.z(iA, iA2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.i;
        if (iA <= iA2) {
            int i4 = iA;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iA2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iA != 0 ? iArr2[iA - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new C1866SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final String toString() {
        return B().toString();
    }

    @Override // okio.ByteString
    public final ByteString w() {
        return B().w();
    }

    @Override // okio.ByteString
    public final byte[] x() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.h;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.i;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt.p(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void z(Buffer buffer, int i) {
        int iA = okio.internal.SegmentedByteString.a(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.i;
            int i3 = iA == 0 ? 0 : iArr[iA - 1];
            int i4 = iArr[iA] - i3;
            byte[][] bArr = this.h;
            int i5 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            Segment segment = new Segment(bArr[iA], i6, i6 + iMin, true, false);
            Segment segment2 = buffer.d;
            if (segment2 == null) {
                segment.g = segment;
                segment.f = segment;
                buffer.d = segment;
            } else {
                Segment segment3 = segment2.g;
                Intrinsics.e(segment3);
                segment3.b(segment);
            }
            i2 += iMin;
            iA++;
        }
        buffer.e += i;
    }
}
