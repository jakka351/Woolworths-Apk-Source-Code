package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class RopeByteString extends ByteString {
    public static final int[] l = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int g;
    public final ByteString h;
    public final ByteString i;
    public final int j;
    public final int k;

    /* renamed from: com.google.protobuf.RopeByteString$1, reason: invalid class name */
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

        @Override // com.google.protobuf.ByteString.ByteIterator
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

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f16079a = new ArrayDeque();

        public final void a(ByteString byteString) {
            if (!byteString.o()) {
                if (!(byteString instanceof RopeByteString)) {
                    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                a(ropeByteString.h);
                a(ropeByteString.i);
                return;
            }
            int iBinarySearch = Arrays.binarySearch(RopeByteString.l, byteString.size());
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int iE = RopeByteString.E(iBinarySearch + 1);
            ArrayDeque arrayDeque = this.f16079a;
            if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iE) {
                arrayDeque.push(byteString);
                return;
            }
            int iE2 = RopeByteString.E(iBinarySearch);
            ByteString ropeByteString2 = (ByteString) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iE2) {
                ropeByteString2 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString2);
            }
            RopeByteString ropeByteString3 = new RopeByteString(ropeByteString2, byteString);
            while (!arrayDeque.isEmpty()) {
                int iBinarySearch2 = Arrays.binarySearch(RopeByteString.l, ropeByteString3.g);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (((ByteString) arrayDeque.peek()).size() >= RopeByteString.E(iBinarySearch2 + 1)) {
                    break;
                } else {
                    ropeByteString3 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString3);
                }
            }
            arrayDeque.push(ropeByteString3);
        }
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
            } while (leafByteString.isEmpty());
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
        this.k = Math.max(byteString.m(), byteString2.m()) + 1;
    }

    public static ByteString D(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString2.size() + byteString.size();
        if (size < 128) {
            int size2 = byteString.size();
            int size3 = byteString2.size();
            byte[] bArr = new byte[size2 + size3];
            byteString.k(0, 0, bArr, size2);
            byteString2.k(0, size2, bArr, size3);
            return new ByteString.LiteralByteString(bArr);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ByteString byteString3 = ropeByteString.h;
            ByteString byteString4 = ropeByteString.i;
            if (byteString2.size() + byteString4.size() < 128) {
                int size4 = byteString4.size();
                int size5 = byteString2.size();
                byte[] bArr2 = new byte[size4 + size5];
                byteString4.k(0, 0, bArr2, size4);
                byteString2.k(0, size4, bArr2, size5);
                return new RopeByteString(byteString3, new ByteString.LiteralByteString(bArr2));
            }
            if (byteString3.m() > byteString4.m() && ropeByteString.k > byteString2.m()) {
                return new RopeByteString(byteString3, new RopeByteString(byteString4, byteString2));
            }
        }
        if (size >= E(Math.max(byteString.m(), byteString2.m()) + 1)) {
            return new RopeByteString(byteString, byteString2);
        }
        Balancer balancer = new Balancer();
        balancer.a(byteString);
        balancer.a(byteString2);
        ArrayDeque arrayDeque = balancer.f16079a;
        ByteString ropeByteString2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            ropeByteString2 = new RopeByteString((ByteString) arrayDeque.pop(), ropeByteString2);
        }
        return ropeByteString2;
    }

    public static int E(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return l[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public final void B(ByteOutput byteOutput) {
        this.h.B(byteOutput);
        this.i.B(byteOutput);
    }

    @Override // com.google.protobuf.ByteString
    public final void C(ByteOutput byteOutput) {
        this.i.C(byteOutput);
        this.h.C(byteOutput);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer b() {
        return ByteBuffer.wrap(y()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
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
                        if (!(i4 == 0 ? next.D(next2, i5, iMin) : next2.D(next, i4, iMin))) {
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

    @Override // com.google.protobuf.ByteString
    public final byte g(int i) {
        ByteString.h(i, this.g);
        return n(i);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void l(int i, int i2, byte[] bArr, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.h;
        int i5 = this.j;
        if (i4 <= i5) {
            byteString.l(i, i2, bArr, i3);
            return;
        }
        ByteString byteString2 = this.i;
        if (i >= i5) {
            byteString2.l(i - i5, i2, bArr, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.l(i, i2, bArr, i6);
        byteString2.l(0, i2 + i6, bArr, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int m() {
        return this.k;
    }

    @Override // com.google.protobuf.ByteString
    public final byte n(int i) {
        int i2 = this.j;
        return i < i2 ? this.h.n(i) : this.i.n(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean o() {
        return this.g >= E(this.k);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean q() {
        int iW = this.h.w(0, 0, this.j);
        ByteString byteString = this.i;
        return byteString.w(iW, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: s */
    public final ByteString.ByteIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.g;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream t() {
        ArrayList arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().b());
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        if (i == 2) {
            return new CodedInputStream.IterableDirectByteBufferDecoder(iRemaining, arrayList);
        }
        IterableByteBufferInputStream iterableByteBufferInputStream = new IterableByteBufferInputStream();
        iterableByteBufferInputStream.d = arrayList.iterator();
        iterableByteBufferInputStream.f = 0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iterableByteBufferInputStream.f++;
        }
        iterableByteBufferInputStream.g = -1;
        if (!iterableByteBufferInputStream.a()) {
            iterableByteBufferInputStream.e = Internal.c;
            iterableByteBufferInputStream.g = 0;
            iterableByteBufferInputStream.h = 0;
            iterableByteBufferInputStream.l = 0L;
        }
        return new CodedInputStream.StreamDecoder(iterableByteBufferInputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final int u(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.h;
        int i5 = this.j;
        if (i4 <= i5) {
            return byteString.u(i, i2, i3);
        }
        ByteString byteString2 = this.i;
        if (i2 >= i5) {
            return byteString2.u(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.u(byteString.u(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int w(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.h;
        int i5 = this.j;
        if (i4 <= i5) {
            return byteString.w(i, i2, i3);
        }
        ByteString byteString2 = this.i;
        if (i2 >= i5) {
            return byteString2.w(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.w(byteString.w(i, i2, i6), 0, i3 - i6);
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(y());
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString x(int i, int i2) {
        int i3 = this.g;
        int i4 = ByteString.i(i, i2, i3);
        if (i4 == 0) {
            return ByteString.e;
        }
        if (i4 == i3) {
            return this;
        }
        ByteString byteString = this.h;
        int i5 = this.j;
        if (i2 <= i5) {
            return byteString.x(i, i2);
        }
        ByteString byteString2 = this.i;
        return i >= i5 ? byteString2.x(i - i5, i2 - i5) : new RopeByteString(byteString.x(i, byteString.size()), byteString2.x(0, i2 - i5));
    }

    @Override // com.google.protobuf.ByteString
    public final String z(Charset charset) {
        return new String(y(), charset);
    }

    public class RopeInputStream extends InputStream {
        public PieceIterator d;
        public ByteString.LeafByteString e;
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
                        ByteString.LeafByteString next = this.d.next();
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
            while (i3 > 0) {
                a();
                if (this.e == null) {
                    break;
                }
                int iMin = Math.min(this.f - this.g, i3);
                if (bArr != null) {
                    this.e.k(this.g, i, bArr, iMin);
                    i += iMin;
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
            if (iB != 0) {
                return iB;
            }
            if (i2 > 0) {
                return -1;
            }
            throw null;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
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
            return leafByteString.g(i) & 255;
        }
    }
}
