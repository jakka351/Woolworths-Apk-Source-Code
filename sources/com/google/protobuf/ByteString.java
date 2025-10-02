package com.google.protobuf;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@CheckReturnValue
/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString e = new LiteralByteString(Internal.b);
    public static final ByteArrayCopier f;
    public int d = 0;

    /* renamed from: com.google.protobuf.ByteString$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass1 extends AbstractByteIterator {
        public int d = 0;
        public final int e;

        public AnonymousClass1() {
            this.e = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < this.e;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i = this.d;
            if (i >= this.e) {
                throw new NoSuchElementException();
            }
            this.d = i + 1;
            return ByteString.this.n(i);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$2, reason: invalid class name */
    public class AnonymousClass2 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ByteIterator it = byteString3.iterator();
            ByteIterator it2 = byteString4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(it.nextByte() & 255).compareTo(Integer.valueOf(it2.nextByte() & 255));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(byteString3.size()).compareTo(Integer.valueOf(byteString4.size()));
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes6.dex */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(int i, int i2, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* loaded from: classes6.dex */
    public static final class BoundedByteString extends LiteralByteString {
        public final int h;
        public final int i;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.i(i, i + i2, bArr.length);
            this.h = i;
            this.i = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public final int E() {
            return this.h;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final byte g(int i) {
            ByteString.h(i, this.i);
            return this.g[this.h + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final void l(int i, int i2, byte[] bArr, int i3) {
            System.arraycopy(this.g, this.h + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString.LeafByteString, com.google.protobuf.ByteString
        public final byte n(int i) {
            return this.g[this.h + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final int size() {
            return this.i;
        }

        public Object writeReplace() {
            return new LiteralByteString(y());
        }
    }

    public interface ByteArrayCopier {
        byte[] a(int i, int i2, byte[] bArr);
    }

    /* loaded from: classes6.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* loaded from: classes6.dex */
    public static final class CodedBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f16021a;
        public final byte[] b;

        public CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            Logger logger = CodedOutputStream.b;
            this.f16021a = new CodedOutputStream.ArrayEncoder(bArr, 0, i);
        }

        public final ByteString a() {
            if (this.f16021a.c0() == 0) {
                return new LiteralByteString(this.b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public final CodedOutputStream b() {
            return this.f16021a;
        }
    }

    public static abstract class LeafByteString extends ByteString {
        @Override // com.google.protobuf.ByteString
        public final void C(ByteOutput byteOutput) {
            B(byteOutput);
        }

        public abstract boolean D(ByteString byteString, int i, int i2);

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new AnonymousClass1();
        }

        @Override // com.google.protobuf.ByteString
        public final int m() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte n(int i) {
            return g(i);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean o() {
            return true;
        }
    }

    public static class LiteralByteString extends LeafByteString {
        public final byte[] g;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.g = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public final void B(ByteOutput byteOutput) {
            byteOutput.Q(E(), size(), this.g);
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public final boolean D(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                StringBuilder sbQ = a.q(i, i2, "Ran off end of other: ", ", ", ", ");
                sbQ.append(byteString.size());
                throw new IllegalArgumentException(sbQ.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.x(i, i3).equals(x(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = literalByteString.g;
            int iE = E() + i2;
            int iE2 = E();
            int iE3 = literalByteString.E() + i;
            while (iE2 < iE) {
                if (this.g[iE2] != bArr[iE3]) {
                    return false;
                }
                iE2++;
                iE3++;
            }
            return true;
        }

        public int E() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.g, E(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i = this.d;
            int i2 = literalByteString.d;
            if (i == 0 || i2 == 0 || i == i2) {
                return D(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        public byte g(int i) {
            return this.g[i];
        }

        @Override // com.google.protobuf.ByteString
        public void l(int i, int i2, byte[] bArr, int i3) {
            System.arraycopy(this.g, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString.LeafByteString, com.google.protobuf.ByteString
        public byte n(int i) {
            return this.g[i];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean q() {
            int iE = E();
            return Utf8.f16094a.e(iE, size() + iE, this.g);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.g.length;
        }

        @Override // com.google.protobuf.ByteString
        public final CodedInputStream t() {
            return CodedInputStream.g(this.g, E(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final int u(int i, int i2, int i3) {
            int iE = E() + i2;
            Charset charset = Internal.f16059a;
            for (int i4 = iE; i4 < iE + i3; i4++) {
                i = (i * 31) + this.g[i4];
            }
            return i;
        }

        @Override // com.google.protobuf.ByteString
        public final int w(int i, int i2, int i3) {
            int iE = E() + i2;
            return Utf8.f16094a.f(i, iE, this.g, i3 + iE);
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString x(int i, int i2) {
            int i3 = ByteString.i(i, i2, size());
            if (i3 == 0) {
                return ByteString.e;
            }
            return new BoundedByteString(this.g, E() + i, i3);
        }

        @Override // com.google.protobuf.ByteString
        public final String z(Charset charset) {
            return new String(this.g, E(), size(), charset);
        }
    }

    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(int i, int i2, byte[] bArr) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f = Android.a() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
    }

    public static ByteString d(Iterator it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(a.e(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (ByteString) it.next();
        }
        int i2 = i >>> 1;
        ByteString byteStringD = d(it, i2);
        ByteString byteStringD2 = d(it, i - i2);
        if (Integer.MAX_VALUE - byteStringD.size() >= byteStringD2.size()) {
            return RopeByteString.D(byteStringD, byteStringD2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + byteStringD.size() + "+" + byteStringD2.size());
    }

    public static void h(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(b.i(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.d(i, "Index < 0: "));
        }
    }

    public static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.e(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(b.i(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(b.i(i2, i3, "End index: ", " >= "));
    }

    public static ByteString j(int i, int i2, byte[] bArr) {
        i(i, i + i2, bArr.length);
        return new LiteralByteString(f.a(i, i2, bArr));
    }

    public abstract void B(ByteOutput byteOutput);

    public abstract void C(ByteOutput byteOutput);

    public abstract ByteBuffer b();

    public abstract boolean equals(Object obj);

    public abstract byte g(int i);

    public final int hashCode() {
        int iU = this.d;
        if (iU == 0) {
            int size = size();
            iU = u(size, 0, size);
            if (iU == 0) {
                iU = 1;
            }
            this.d = iU;
        }
        return iU;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void k(int i, int i2, byte[] bArr, int i3) {
        i(i, i + i3, size());
        i(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            l(i, i2, bArr, i3);
        }
    }

    public abstract void l(int i, int i2, byte[] bArr, int i3);

    public abstract int m();

    public abstract byte n(int i);

    public abstract boolean o();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AnonymousClass1();
    }

    public abstract int size();

    public abstract CodedInputStream t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.o(b.u("<ByteString@", size(), hexString, " size=", " contents=\""), size() <= 50 ? TextFormatEscaper.a(this) : a.o(new StringBuilder(), TextFormatEscaper.a(x(0, 47)), "..."), "\">");
    }

    public abstract int u(int i, int i2, int i3);

    public abstract int w(int i, int i2, int i3);

    public abstract ByteString x(int i, int i2);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return Internal.b;
        }
        byte[] bArr = new byte[size];
        l(0, 0, bArr, size);
        return bArr;
    }

    public abstract String z(Charset charset);

    /* loaded from: classes6.dex */
    public static final class Output extends OutputStream {
        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, 0);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }
}
