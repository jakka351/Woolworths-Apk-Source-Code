package androidx.datastore.preferences.protobuf;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$1, reason: invalid class name */
    /* loaded from: classes2.dex */
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

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i = this.d;
            if (i >= this.e) {
                throw new NoSuchElementException();
            }
            this.d = i + 1;
            return ByteString.this.l(i);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$2, reason: invalid class name */
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

    /* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(int i, int i2, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* loaded from: classes2.dex */
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

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public final int B() {
            return this.h;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte d(int i) {
            ByteString.g(i, this.i);
            return this.g[this.h + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final void j(int i, int i2, byte[] bArr, int i3) {
            System.arraycopy(this.g, this.h + i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte l(int i) {
            return this.g[this.h + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.i;
        }

        public Object writeReplace() {
            return new LiteralByteString(u());
        }
    }

    public interface ByteArrayCopier {
        byte[] a(int i, int i2, byte[] bArr);
    }

    /* loaded from: classes2.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* loaded from: classes2.dex */
    public static final class CodedBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f2600a;
        public final byte[] b;

        public CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            Logger logger = CodedOutputStream.b;
            this.f2600a = new CodedOutputStream.ArrayEncoder(bArr, i);
        }

        public final ByteString a() {
            CodedOutputStream.ArrayEncoder arrayEncoder = (CodedOutputStream.ArrayEncoder) this.f2600a;
            if (arrayEncoder.e - arrayEncoder.f == 0) {
                return new LiteralByteString(this.b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public final CodedOutputStream b() {
            return this.f2600a;
        }
    }

    public static abstract class LeafByteString extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new AnonymousClass1();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int k() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte l(int i) {
            return d(i);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void y(ByteOutput byteOutput) {
            x(byteOutput);
        }

        public abstract boolean z(ByteString byteString, int i, int i2);
    }

    public static class LiteralByteString extends LeafByteString {
        public final byte[] g;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.g = bArr;
        }

        public int B() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.g, B(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte d(int i) {
            return this.g[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
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
                return z(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void j(int i, int i2, byte[] bArr, int i3) {
            System.arraycopy(this.g, i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte l(int i) {
            return this.g[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean m() {
            int iB = B();
            return Utf8.f2683a.e(iB, size() + iB, this.g);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream o() {
            return CodedInputStream.g(this.g, B(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int q(int i, int i2, int i3) {
            int iB = B() + i2;
            Charset charset = Internal.f2648a;
            for (int i4 = iB; i4 < iB + i3; i4++) {
                i = (i * 31) + this.g[i4];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int s(int i, int i2, int i3) {
            int iB = B() + i2;
            return Utf8.f2683a.f(i, iB, this.g, i3 + iB);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.g.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString t(int i, int i2) {
            int iH = ByteString.h(i, i2, size());
            if (iH == 0) {
                return ByteString.e;
            }
            return new BoundedByteString(this.g, B() + i, iH);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String w(Charset charset) {
            return new String(this.g, B(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void x(ByteOutput byteOutput) {
            byteOutput.Q(B(), size(), this.g);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean z(ByteString byteString, int i, int i2) {
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
                return byteString.t(i, i3).equals(t(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = literalByteString.g;
            int iB = B() + i2;
            int iB2 = B();
            int iB3 = literalByteString.B() + i;
            while (iB2 < iB) {
                if (this.g[iB2] != bArr[iB3]) {
                    return false;
                }
                iB2++;
                iB3++;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class NioByteString extends LeafByteString {
        public final ByteBuffer g;

        /* renamed from: androidx.datastore.preferences.protobuf.ByteString$NioByteString$1, reason: invalid class name */
        class AnonymousClass1 extends InputStream {
            @Override // java.io.InputStream
            public final int available() {
                throw null;
            }

            @Override // java.io.InputStream
            public final void mark(int i) {
                throw null;
            }

            @Override // java.io.InputStream
            public final boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public final int read() {
                throw null;
            }

            @Override // java.io.InputStream
            public final void reset() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                throw null;
            }
        }

        public NioByteString(ByteBuffer byteBuffer) {
            Charset charset = Internal.f2648a;
            this.g = byteBuffer.slice().order(ByteOrder.nativeOrder());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object writeReplace() {
            ByteBuffer byteBufferSlice = this.g.slice();
            int iRemaining = byteBufferSlice.remaining();
            ByteString.h(0, iRemaining, byteBufferSlice.remaining());
            byte[] bArr = new byte[iRemaining];
            byteBufferSlice.get(bArr);
            return new LiteralByteString(bArr);
        }

        public final ByteBuffer B(int i, int i2) {
            ByteBuffer byteBuffer = this.g;
            if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.position(i - byteBuffer.position());
            byteBufferSlice.limit(i2 - byteBuffer.position());
            return byteBufferSlice;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer b() {
            return this.g.asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final byte d(int i) {
            try {
                return this.g.get(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            ByteBuffer byteBuffer = this.g;
            if (byteBuffer.remaining() != byteString.size()) {
                return false;
            }
            if (byteBuffer.remaining() == 0) {
                return true;
            }
            return obj instanceof NioByteString ? byteBuffer.equals(((NioByteString) obj).g) : obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.b());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void j(int i, int i2, byte[] bArr, int i3) {
            ByteBuffer byteBufferSlice = this.g.slice();
            byteBufferSlice.position(i);
            byteBufferSlice.get(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean m() {
            Utf8.Processor processor = Utf8.f2683a;
            ByteBuffer byteBuffer = this.g;
            return processor.g(byteBuffer, 0, byteBuffer.position(), byteBuffer.remaining()) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream o() {
            ByteBuffer byteBuffer = this.g;
            if (byteBuffer.hasArray()) {
                return CodedInputStream.g(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), true);
            }
            if (byteBuffer.isDirect() && UnsafeUtil.d) {
                return new CodedInputStream.UnsafeDirectNioDecoder(byteBuffer);
            }
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            return CodedInputStream.g(bArr, 0, iRemaining, true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int q(int i, int i2, int i3) {
            for (int i4 = i2; i4 < i2 + i3; i4++) {
                i = (i * 31) + this.g.get(i4);
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int s(int i, int i2, int i3) {
            return Utf8.f2683a.g(this.g, i, i2, i3 + i2);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.g.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString t(int i, int i2) {
            try {
                return new NioByteString(B(i, i2));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String w(Charset charset) {
            byte[] bArrU;
            int length;
            int iPosition;
            ByteBuffer byteBuffer = this.g;
            if (byteBuffer.hasArray()) {
                bArrU = byteBuffer.array();
                iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                length = byteBuffer.remaining();
            } else {
                bArrU = u();
                length = bArrU.length;
                iPosition = 0;
            }
            return new String(bArrU, iPosition, length, charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void x(ByteOutput byteOutput) {
            byteOutput.R(this.g.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean z(ByteString byteString, int i, int i2) {
            return t(0, i2).equals(byteString.t(i, i2 + i));
        }
    }

    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
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

    public abstract ByteBuffer b();

    public abstract byte d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iQ = this.d;
        if (iQ == 0) {
            int size = size();
            iQ = q(size, 0, size);
            if (iQ == 0) {
                iQ = 1;
            }
            this.d = iQ;
        }
        return iQ;
    }

    public abstract void j(int i, int i2, byte[] bArr, int i3);

    public abstract int k();

    public abstract byte l(int i);

    public abstract boolean m();

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AnonymousClass1();
    }

    public abstract CodedInputStream o();

    public abstract int q(int i, int i2, int i3);

    public abstract int s(int i, int i2, int i3);

    public abstract int size();

    public abstract ByteString t(int i, int i2);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.o(b.u("<ByteString@", size(), hexString, " size=", " contents=\""), size() <= 50 ? TextFormatEscaper.a(this) : a.o(new StringBuilder(), TextFormatEscaper.a(t(0, 47)), "..."), "\">");
    }

    public final byte[] u() {
        int size = size();
        if (size == 0) {
            return Internal.b;
        }
        byte[] bArr = new byte[size];
        j(0, 0, bArr, size);
        return bArr;
    }

    public abstract String w(Charset charset);

    public abstract void x(ByteOutput byteOutput);

    public abstract void y(ByteOutput byteOutput);

    /* loaded from: classes2.dex */
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
