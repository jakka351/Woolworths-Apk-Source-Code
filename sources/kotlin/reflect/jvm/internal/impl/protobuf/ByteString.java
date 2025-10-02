package kotlin.reflect.jvm.internal.impl.protobuf;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString d = new LiteralByteString(new byte[0]);

    /* loaded from: classes7.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static ByteString b(Iterator it, int i) {
        if (i == 1) {
            return (ByteString) it.next();
        }
        int i2 = i >>> 1;
        return b(it, i2).d(b(it, i - i2));
    }

    public static ByteString g(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static Output n() {
        return new Output();
    }

    public final ByteString d(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 >= 2147483647L) {
            throw new IllegalArgumentException(c.j(53, size, size2, "ByteString would be too long: ", "+"));
        }
        int[] iArr = RopeByteString.k;
        RopeByteString ropeByteString = this instanceof RopeByteString ? (RopeByteString) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = byteString.size();
            byte[] bArr = new byte[size4 + size5];
            h(0, 0, bArr, size4);
            byteString.h(0, size4, bArr, size5);
            return new LiteralByteString(bArr);
        }
        if (ropeByteString != null) {
            ByteString byteString2 = ropeByteString.g;
            if (byteString.size() + byteString2.size() < 128) {
                int size6 = byteString2.size();
                int size7 = byteString.size();
                byte[] bArr2 = new byte[size6 + size7];
                byteString2.h(0, 0, bArr2, size6);
                byteString.h(0, size6, bArr2, size7);
                return new RopeByteString(ropeByteString.f, new LiteralByteString(bArr2));
            }
        }
        if (ropeByteString != null) {
            ByteString byteString3 = ropeByteString.g;
            ByteString byteString4 = ropeByteString.f;
            if (byteString4.j() > byteString3.j() && ropeByteString.i > byteString.j()) {
                return new RopeByteString(byteString4, new RopeByteString(byteString3, byteString));
            }
        }
        return size3 >= RopeByteString.k[Math.max(j(), byteString.j()) + 1] ? new RopeByteString(this, byteString) : RopeByteString.Balancer.a(new RopeByteString.Balancer(), this, byteString);
    }

    public final void h(int i, int i2, byte[] bArr, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(c.k(30, i, "Source offset < 0: "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(c.k(30, i2, "Target offset < 0: "));
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(c.k(23, i3, "Length < 0: "));
        }
        int i4 = i + i3;
        if (i4 > size()) {
            throw new IndexOutOfBoundsException(c.k(34, i4, "Source end offset < 0: "));
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            throw new IndexOutOfBoundsException(c.k(34, i5, "Target end offset < 0: "));
        }
        if (i3 > 0) {
            i(i, i2, bArr, i3);
        }
    }

    public abstract void i(int i, int i2, byte[] bArr, int i3);

    public abstract int j();

    public abstract boolean k();

    public abstract boolean l();

    @Override // java.lang.Iterable
    /* renamed from: m */
    public abstract ByteIterator iterator();

    public abstract int o(int i, int i2, int i3);

    public abstract int q(int i, int i2, int i3);

    public abstract int s();

    public abstract int size();

    public abstract String t();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public final String u() {
        try {
            return t();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract void v(OutputStream outputStream, int i, int i2);

    public static final class Output extends OutputStream {
        public static final byte[] i = new byte[0];
        public int f;
        public int h;
        public final int d = 128;
        public final ArrayList e = new ArrayList();
        public byte[] g = new byte[128];

        public final void a(int i2) {
            this.e.add(new LiteralByteString(this.g));
            int length = this.f + this.g.length;
            this.f = length;
            this.g = new byte[Math.max(this.d, Math.max(i2, length >>> 1))];
            this.h = 0;
        }

        public final void b() {
            int i2 = this.h;
            byte[] bArr = this.g;
            int length = bArr.length;
            ArrayList arrayList = this.e;
            if (i2 >= length) {
                arrayList.add(new LiteralByteString(this.g));
                this.g = i;
            } else if (i2 > 0) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
                arrayList.add(new LiteralByteString(bArr2));
            }
            this.f += this.h;
            this.h = 0;
        }

        public final synchronized ByteString c() {
            ArrayList arrayList;
            b();
            arrayList = this.e;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((ByteString) it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? ByteString.d : ByteString.b(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i2;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i2 = this.f + this.h;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i2));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i2) {
            try {
                if (this.h == this.g.length) {
                    a(1);
                }
                byte[] bArr = this.g;
                int i3 = this.h;
                this.h = i3 + 1;
                bArr[i3] = (byte) i2;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i2, int i3) {
            try {
                byte[] bArr2 = this.g;
                int length = bArr2.length;
                int i4 = this.h;
                if (i3 <= length - i4) {
                    System.arraycopy(bArr, i2, bArr2, i4, i3);
                    this.h += i3;
                } else {
                    int length2 = bArr2.length - i4;
                    System.arraycopy(bArr, i2, bArr2, i4, length2);
                    int i5 = i3 - length2;
                    a(i5);
                    System.arraycopy(bArr, i2 + length2, this.g, 0, i5);
                    this.h = i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
