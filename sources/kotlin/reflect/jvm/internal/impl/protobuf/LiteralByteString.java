package kotlin.reflect.jvm.internal.impl.protobuf;

import YU.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* loaded from: classes.dex */
class LiteralByteString extends ByteString {
    public final byte[] e;
    public int f = 0;

    /* loaded from: classes7.dex */
    public class LiteralByteIterator implements ByteString.ByteIterator {
        public int d = 0;
        public final int e;

        public LiteralByteIterator() {
            this.e = LiteralByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < this.e;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            try {
                byte[] bArr = LiteralByteString.this.e;
                int i = this.d;
                this.d = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public LiteralByteString(byte[] bArr) {
        this.e = bArr;
    }

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
        if (obj instanceof LiteralByteString) {
            return x((LiteralByteString) obj, 0, size());
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(a.o(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iO = this.f;
        if (iO == 0) {
            int size = size();
            iO = o(size, 0, size);
            if (iO == 0) {
                iO = 1;
            }
            this.f = iO;
        }
        return iO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void i(int i, int i2, byte[] bArr, int i3) {
        System.arraycopy(this.e, i, bArr, i2, i3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int j() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean k() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean l() {
        int iY = y();
        return Utf8.c(iY, size() + iY, this.e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ByteString.ByteIterator iterator() {
        return new LiteralByteIterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int o(int i, int i2, int i3) {
        int iY = y() + i2;
        for (int i4 = iY; i4 < iY + i3; i4++) {
            i = (i * 31) + this.e[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int q(int i, int i2, int i3) {
        int iY = y() + i2;
        return Utf8.e(i, iY, this.e, i3 + iY);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int s() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.e.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String t() {
        return new String(this.e, y(), size(), "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void v(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.e, y() + i, i2);
    }

    public byte w(int i) {
        return this.e[i];
    }

    public final boolean x(LiteralByteString literalByteString, int i, int i2) {
        if (i2 > literalByteString.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > literalByteString.size()) {
            int size2 = literalByteString.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IllegalArgumentException(a.n(sb2, ", ", size2));
        }
        byte[] bArr = literalByteString.e;
        int iY = y() + i2;
        int iY2 = y();
        int iY3 = literalByteString.y() + i;
        while (iY2 < iY) {
            if (this.e[iY2] != bArr[iY3]) {
                return false;
            }
            iY2++;
            iY3++;
        }
        return true;
    }

    public int y() {
        return 0;
    }
}
