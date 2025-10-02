package kotlin.reflect.jvm.internal.impl.protobuf;

import YU.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* loaded from: classes.dex */
class RopeByteString extends ByteString {
    public static final int[] k;
    public final int e;
    public final ByteString f;
    public final ByteString g;
    public final int h;
    public final int i;
    public int j = 0;

    /* loaded from: classes7.dex */
    public static class Balancer {

        /* renamed from: a, reason: collision with root package name */
        public final Stack f24516a = new Stack();

        public static ByteString a(Balancer balancer, ByteString byteString, ByteString byteString2) {
            balancer.b(byteString);
            balancer.b(byteString2);
            Stack stack = balancer.f24516a;
            ByteString ropeByteString = (ByteString) stack.pop();
            while (!stack.isEmpty()) {
                ropeByteString = new RopeByteString((ByteString) stack.pop(), ropeByteString);
            }
            return ropeByteString;
        }

        public final void b(ByteString byteString) {
            if (!byteString.k()) {
                if (!(byteString instanceof RopeByteString)) {
                    String strValueOf = String.valueOf(byteString.getClass());
                    throw new IllegalArgumentException(a.o(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                b(ropeByteString.f);
                b(ropeByteString.g);
                return;
            }
            int size = byteString.size();
            int[] iArr = RopeByteString.k;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i = iArr[iBinarySearch + 1];
            Stack stack = this.f24516a;
            if (stack.isEmpty() || ((ByteString) stack.peek()).size() >= i) {
                stack.push(byteString);
                return;
            }
            int i2 = iArr[iBinarySearch];
            ByteString ropeByteString2 = (ByteString) stack.pop();
            while (!stack.isEmpty() && ((ByteString) stack.peek()).size() < i2) {
                ropeByteString2 = new RopeByteString((ByteString) stack.pop(), ropeByteString2);
            }
            RopeByteString ropeByteString3 = new RopeByteString(ropeByteString2, byteString);
            while (!stack.isEmpty()) {
                int[] iArr2 = RopeByteString.k;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, ropeByteString3.e);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (((ByteString) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    ropeByteString3 = new RopeByteString((ByteString) stack.pop(), ropeByteString3);
                }
            }
            stack.push(ropeByteString3);
        }
    }

    /* loaded from: classes7.dex */
    public static class PieceIterator implements Iterator<LiteralByteString> {
        public final Stack d = new Stack();
        public LiteralByteString e;

        public PieceIterator(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.d.push(ropeByteString);
                byteString = ropeByteString.f;
            }
            this.e = (LiteralByteString) byteString;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiteralByteString next() {
            LiteralByteString literalByteString;
            LiteralByteString literalByteString2 = this.e;
            if (literalByteString2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                Stack stack = this.d;
                if (!stack.isEmpty()) {
                    Object obj = ((RopeByteString) stack.pop()).g;
                    while (obj instanceof RopeByteString) {
                        RopeByteString ropeByteString = (RopeByteString) obj;
                        stack.push(ropeByteString);
                        obj = ropeByteString.f;
                    }
                    literalByteString = (LiteralByteString) obj;
                    if (literalByteString.size() != 0) {
                        break;
                    }
                } else {
                    literalByteString = null;
                    break;
                }
            }
            this.e = literalByteString;
            return literalByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes7.dex */
    public class RopeByteIterator implements ByteString.ByteIterator {
        public final PieceIterator d;
        public ByteString.ByteIterator e;
        public int f;

        public RopeByteIterator(RopeByteString ropeByteString) {
            PieceIterator pieceIterator = new PieceIterator(ropeByteString);
            this.d = pieceIterator;
            this.e = pieceIterator.next().iterator();
            this.f = ropeByteString.e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            if (!this.e.hasNext()) {
                this.e = this.d.next().iterator();
            }
            this.f--;
            return this.e.nextByte();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        k = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = k;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f = byteString;
        this.g = byteString2;
        int size = byteString.size();
        this.h = size;
        this.e = byteString2.size() + size;
        this.i = Math.max(byteString.j(), byteString2.j()) + 1;
    }

    public final boolean equals(Object obj) {
        int iS;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.e;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.j == 0 || (iS = byteString.s()) == 0 || this.j == iS) {
                    PieceIterator pieceIterator = new PieceIterator(this);
                    LiteralByteString literalByteString = (LiteralByteString) pieceIterator.next();
                    PieceIterator pieceIterator2 = new PieceIterator(byteString);
                    LiteralByteString literalByteString2 = (LiteralByteString) pieceIterator2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int size2 = literalByteString.size() - i2;
                        int size3 = literalByteString2.size() - i3;
                        int iMin = Math.min(size2, size3);
                        if (!(i2 == 0 ? literalByteString.x(literalByteString2, i3, iMin) : literalByteString2.x(literalByteString, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            literalByteString = (LiteralByteString) pieceIterator.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == size3) {
                            literalByteString2 = (LiteralByteString) pieceIterator2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO = this.j;
        if (iO == 0) {
            int i = this.e;
            iO = o(i, 0, i);
            if (iO == 0) {
                iO = 1;
            }
            this.j = iO;
        }
        return iO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void i(int i, int i2, byte[] bArr, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.f;
        int i5 = this.h;
        if (i4 <= i5) {
            byteString.i(i, i2, bArr, i3);
            return;
        }
        ByteString byteString2 = this.g;
        if (i >= i5) {
            byteString2.i(i - i5, i2, bArr, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.i(i, i2, bArr, i6);
        byteString2.i(0, i2 + i6, bArr, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new RopeByteIterator(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int j() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean k() {
        return this.e >= k[this.i];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean l() {
        int iQ = this.f.q(0, 0, this.h);
        ByteString byteString = this.g;
        return byteString.q(iQ, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: m */
    public final ByteString.ByteIterator iterator() {
        return new RopeByteIterator(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int o(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f;
        int i5 = this.h;
        if (i4 <= i5) {
            return byteString.o(i, i2, i3);
        }
        ByteString byteString2 = this.g;
        if (i2 >= i5) {
            return byteString2.o(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.o(byteString.o(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int q(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f;
        int i5 = this.h;
        if (i4 <= i5) {
            return byteString.q(i, i2, i3);
        }
        ByteString byteString2 = this.g;
        if (i2 >= i5) {
            return byteString2.q(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.q(byteString.q(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int s() {
        return this.j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String t() {
        byte[] bArr;
        int i = this.e;
        if (i == 0) {
            bArr = Internal.f24514a;
        } else {
            byte[] bArr2 = new byte[i];
            i(0, 0, bArr2, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void v(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ByteString byteString = this.f;
        int i4 = this.h;
        if (i3 <= i4) {
            byteString.v(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.g;
        if (i >= i4) {
            byteString2.v(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.v(outputStream, i, i5);
        byteString2.v(outputStream, 0, i2 - i5);
    }

    /* loaded from: classes7.dex */
    public class RopeInputStream extends InputStream {
        public PieceIterator d;
        public LiteralByteString e;
        public int f;
        public int g;
        public int h;
        public int i;

        public final void a() {
            if (this.e != null) {
                int i = this.g;
                int i2 = this.f;
                if (i == i2) {
                    this.h += i2;
                    this.g = 0;
                    if (!this.d.hasNext()) {
                        this.e = null;
                        this.f = 0;
                    } else {
                        LiteralByteString next = this.d.next();
                        this.e = next;
                        this.f = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        public final int b(int i, int i2, byte[] bArr) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                a();
                if (this.e != null) {
                    int iMin = Math.min(this.f - this.g, i3);
                    if (bArr != null) {
                        this.e.h(this.g, i, bArr, iMin);
                        i += iMin;
                    }
                    this.g += iMin;
                    i3 -= iMin;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.i = this.h + this.g;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            return b(i, i2, bArr);
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
            this.d = pieceIterator;
            LiteralByteString next = pieceIterator.next();
            this.e = next;
            this.f = next.size();
            this.g = 0;
            this.h = 0;
            b(0, this.i, null);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return b(0, (int) j, null);
        }

        @Override // java.io.InputStream
        public final int read() {
            a();
            LiteralByteString literalByteString = this.e;
            if (literalByteString == null) {
                return -1;
            }
            int i = this.g;
            this.g = i + 1;
            return literalByteString.w(i) & 255;
        }
    }
}
