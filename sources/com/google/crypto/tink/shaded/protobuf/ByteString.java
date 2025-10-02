package com.google.crypto.tink.shaded.protobuf;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
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

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString e = new LiteralByteString(Internal.b);
    public static final ByteArrayCopier f;
    public int d = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$1, reason: invalid class name */
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

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i = this.d;
            if (i >= this.e) {
                throw new NoSuchElementException();
            }
            this.d = i + 1;
            return ByteString.this.m(i);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ByteString$2, reason: invalid class name */
    public class AnonymousClass2 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ByteIterator it = byteString3.iterator();
            ByteIterator it2 = byteString4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(it.nextByte() & 255, it2.nextByte() & 255);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString3.size(), byteString4.size());
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
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier
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
            ByteString.h(i, i + i2, bArr.length);
            this.h = i;
            this.i = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
        public final int D() {
            return this.h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte d(int i) {
            ByteString.g(i, this.i);
            return this.g[this.h + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final void k(int i, int i2, byte[] bArr, int i3) {
            System.arraycopy(this.g, this.h + i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte m(int i) {
            return this.g[this.h + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final int size() {
            return this.i;
        }

        public Object writeReplace() {
            return new LiteralByteString(w());
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
        public final CodedOutputStream f15083a;
        public final byte[] b;

        public CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            Logger logger = CodedOutputStream.b;
            this.f15083a = new CodedOutputStream.ArrayEncoder(bArr, i);
        }

        public final ByteString a() {
            if (this.f15083a.g0() == 0) {
                return new LiteralByteString(this.b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public final CodedOutputStream b() {
            return this.f15083a;
        }
    }

    public static abstract class LeafByteString extends ByteString {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void B(ByteOutput byteOutput) {
            z(byteOutput);
        }

        public abstract boolean C(ByteString byteString, int i, int i2);

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int l() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte m(int i) {
            return d(i);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        public final byte[] g;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.g = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString
        public final boolean C(ByteString byteString, int i, int i2) {
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
                return byteString.u(i, i3).equals(u(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = literalByteString.g;
            int iD = D() + i2;
            int iD2 = D();
            int iD3 = literalByteString.D() + i;
            while (iD2 < iD) {
                if (this.g[iD2] != bArr[iD3]) {
                    return false;
                }
                iD2++;
                iD3++;
            }
            return true;
        }

        public int D() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.g, D(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte d(int i) {
            return this.g[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
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
                return C(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void k(int i, int i2, byte[] bArr, int i3) {
            System.arraycopy(this.g, i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte m(int i) {
            return this.g[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean n() {
            int iD = D();
            return Utf8.f15122a.e(iD, size() + iD, this.g);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final CodedInputStream q() {
            return CodedInputStream.i(this.g, D(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int s(int i, int i2, int i3) {
            int iD = D() + i2;
            Charset charset = Internal.f15103a;
            for (int i4 = iD; i4 < iD + i3; i4++) {
                i = (i * 31) + this.g[i4];
            }
            return i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.g.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int t(int i, int i2, int i3) {
            int iD = D() + i2;
            return Utf8.f15122a.f(i, iD, this.g, i3 + iD);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteString u(int i, int i2) {
            int iH = ByteString.h(i, i2, size());
            if (iH == 0) {
                return ByteString.e;
            }
            return new BoundedByteString(this.g, D() + i, iH);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final String x(Charset charset) {
            return new String(this.g, D(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void z(ByteOutput byteOutput) {
            byteOutput.Q(D(), size(), this.g);
        }
    }

    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(int i, int i2, byte[] bArr) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f = Android.a() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
    }

    public static void g(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(b.i(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.d(i, "Index < 0: "));
        }
    }

    public static int h(int i, int i2, int i3) {
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

    public static ByteString i(int i, int i2, byte[] bArr) {
        h(i, i + i2, bArr.length);
        return new LiteralByteString(f.a(i, i2, bArr));
    }

    public static ByteString j(String str) {
        return new LiteralByteString(str.getBytes(Internal.f15103a));
    }

    public abstract void B(ByteOutput byteOutput);

    public abstract ByteBuffer b();

    public abstract byte d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iS = this.d;
        if (iS == 0) {
            int size = size();
            iS = s(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.d = iS;
        }
        return iS;
    }

    public abstract void k(int i, int i2, byte[] bArr, int i3);

    public abstract int l();

    public abstract byte m(int i);

    public abstract boolean n();

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AnonymousClass1();
    }

    public abstract CodedInputStream q();

    public abstract int s(int i, int i2, int i3);

    public abstract int size();

    public abstract int t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.o(b.u("<ByteString@", size(), hexString, " size=", " contents=\""), size() <= 50 ? TextFormatEscaper.a(this) : a.o(new StringBuilder(), TextFormatEscaper.a(u(0, 47)), "..."), "\">");
    }

    public abstract ByteString u(int i, int i2);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return Internal.b;
        }
        byte[] bArr = new byte[size];
        k(0, 0, bArr, size);
        return bArr;
    }

    public abstract String x(Charset charset);

    public final String y() {
        return size() == 0 ? "" : x(Internal.f15103a);
    }

    public abstract void z(ByteOutput byteOutput);

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
