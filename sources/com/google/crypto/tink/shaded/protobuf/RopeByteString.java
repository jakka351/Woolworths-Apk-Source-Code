package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class RopeByteString extends ByteString {
    public final int g;
    public final ByteString h;
    public final ByteString i;
    public final int j;
    public final int k;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.RopeByteString$1, reason: invalid class name */
    class AnonymousClass1 extends ByteString.AbstractByteIterator {
        public final PieceIterator d;
        public ByteString.ByteIterator e = a();

        public AnonymousClass1(RopeByteString ropeByteString) {
            this.d = new PieceIterator(ropeByteString);
        }

        public final ByteString.ByteIterator a() {
            PieceIterator pieceIterator = this.d;
            if (pieceIterator.hasNext()) {
                return new ByteString.AnonymousClass1();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            ByteString.ByteIterator byteIterator = this.e;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.e.hasNext()) {
                this.e = a();
            }
            return bNextByte;
        }
    }

    public static class Balancer {
    }

    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {
        public final ArrayDeque d;
        public ByteString.LeafByteString e;

        public PieceIterator(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.d = null;
                this.e = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.k);
            this.d = arrayDeque;
            arrayDeque.push(ropeByteString);
            ByteString byteString2 = ropeByteString.h;
            while (byteString2 instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                this.d.push(ropeByteString2);
                byteString2 = ropeByteString2.h;
            }
            this.e = (ByteString.LeafByteString) byteString2;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.e;
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque arrayDeque = this.d;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString = ((RopeByteString) arrayDeque.pop()).i;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    arrayDeque.push(ropeByteString);
                    byteString = ropeByteString.h;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            } while (leafByteString.size() == 0);
            this.e = leafByteString;
            return leafByteString2;
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

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.h = byteString;
        this.i = byteString2;
        int size = byteString.size();
        this.j = size;
        this.g = byteString2.size() + size;
        this.k = Math.max(byteString.l(), byteString2.l()) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void B(ByteOutput byteOutput) {
        this.i.B(byteOutput);
        this.h.B(byteOutput);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final ByteBuffer b() {
        return ByteBuffer.wrap(w()).asReadOnlyBuffer();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final byte d(int i) {
        ByteString.g(i, this.g);
        return m(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.g;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.d;
                int i3 = byteString.d;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    PieceIterator pieceIterator = new PieceIterator(this);
                    ByteString.LeafByteString next = pieceIterator.next();
                    PieceIterator pieceIterator2 = new PieceIterator(byteString);
                    ByteString.LeafByteString next2 = pieceIterator2.next();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int size2 = next.size() - i4;
                        int size3 = next2.size() - i5;
                        int iMin = Math.min(size2, size3);
                        if (!(i4 == 0 ? next.C(next2, i5, iMin) : next2.C(next, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            i4 = 0;
                            next = pieceIterator.next();
                        } else {
                            i4 += iMin;
                            next = next;
                        }
                        if (iMin == size3) {
                            next2 = pieceIterator2.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void k(int i, int i2, byte[] bArr, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.h;
        int i5 = this.j;
        if (i4 <= i5) {
            byteString.k(i, i2, bArr, i3);
            return;
        }
        ByteString byteString2 = this.i;
        if (i >= i5) {
            byteString2.k(i - i5, i2, bArr, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.k(i, i2, bArr, i6);
        byteString2.k(0, i2 + i6, bArr, i3 - i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int l() {
        return this.k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final byte m(int i) {
        int i2 = this.j;
        return i < i2 ? this.h.m(i) : this.i.m(i - i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final boolean n() {
        int iT = this.h.t(0, 0, this.j);
        ByteString byteString = this.i;
        return byteString.t(iT, 0, byteString.size()) == 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    /* renamed from: o */
    public final ByteString.ByteIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final CodedInputStream q() {
        return CodedInputStream.g(new RopeInputStream());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.h;
        int i5 = this.j;
        if (i4 <= i5) {
            return byteString.s(i, i2, i3);
        }
        ByteString byteString2 = this.i;
        if (i2 >= i5) {
            return byteString2.s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.s(byteString.s(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int size() {
        return this.g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.h;
        int i5 = this.j;
        if (i4 <= i5) {
            return byteString.t(i, i2, i3);
        }
        ByteString byteString2 = this.i;
        if (i2 >= i5) {
            return byteString2.t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.t(byteString.t(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final ByteString u(int i, int i2) {
        int i3 = this.g;
        int iH = ByteString.h(i, i2, i3);
        if (iH == 0) {
            return ByteString.e;
        }
        if (iH == i3) {
            return this;
        }
        ByteString byteString = this.h;
        int i4 = this.j;
        if (i2 <= i4) {
            return byteString.u(i, i2);
        }
        ByteString byteString2 = this.i;
        return i >= i4 ? byteString2.u(i - i4, i2 - i4) : new RopeByteString(byteString.u(i, byteString.size()), byteString2.u(0, i2 - i4));
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(w());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final String x(Charset charset) {
        return new String(w(), charset);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void z(ByteOutput byteOutput) {
        this.h.z(byteOutput);
        this.i.z(byteOutput);
    }

    public class RopeInputStream extends InputStream {
        public PieceIterator d;
        public ByteString.LeafByteString e;
        public int f;
        public int g;
        public int h;
        public int i;

        public RopeInputStream() {
            PieceIterator pieceIterator = new PieceIterator(RopeByteString.this);
            this.d = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.e = next;
            this.f = next.size();
            this.g = 0;
            this.h = 0;
        }

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
                        ByteString.LeafByteString next = this.d.next();
                        this.e = next;
                        this.f = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            return RopeByteString.this.g - (this.h + this.g);
        }

        public final int b(int i, int i2, byte[] bArr) {
            int i3 = i2;
            while (i3 > 0) {
                a();
                if (this.e == null) {
                    break;
                }
                int iMin = Math.min(this.f - this.g, i3);
                if (bArr != null) {
                    ByteString.LeafByteString leafByteString = this.e;
                    int i4 = this.g;
                    ByteString.h(i4, i4 + iMin, leafByteString.size());
                    int i5 = i + iMin;
                    ByteString.h(i, i5, bArr.length);
                    if (iMin > 0) {
                        leafByteString.k(i4, i, bArr, iMin);
                    }
                    i = i5;
                }
                this.g += iMin;
                i3 -= iMin;
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
            int iB = b(i, i2, bArr);
            if (iB == 0) {
                return -1;
            }
            return iB;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(RopeByteString.this);
            this.d = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
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
            ByteString.LeafByteString leafByteString = this.e;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.g;
            this.g = i + 1;
            return leafByteString.d(i) & 255;
        }
    }
}
