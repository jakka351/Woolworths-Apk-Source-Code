package kotlin.reflect.jvm.internal.impl.protobuf;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24506a;
    public final int b;
    public int c = 0;
    public final OutputStream d;

    /* loaded from: classes7.dex */
    public static class OutOfSpaceException extends IOException {
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.f24506a = bArr;
        this.b = bArr.length;
    }

    public static int a(int i, int i2) {
        return c(i2) + h(i);
    }

    public static int b(int i, int i2) {
        return c(i2) + h(i);
    }

    public static int c(int i) {
        if (i >= 0) {
            return f(i);
        }
        return 10;
    }

    public static int d(int i, MessageLite messageLite) {
        return e(messageLite) + h(i);
    }

    public static int e(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return f(serializedSize) + serializedSize;
    }

    public static int f(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i) {
        return f(i << 3);
    }

    public static CodedOutputStream j(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public final void i() throws IOException {
        if (this.d != null) {
            k();
        }
    }

    public final void k() throws IOException {
        this.d.write(this.f24506a, 0, this.c);
        this.c = 0;
    }

    public final void l(int i, int i2) {
        x(i, 0);
        n(i2);
    }

    public final void m(int i, int i2) {
        x(i, 0);
        n(i2);
    }

    public final void n(int i) {
        if (i >= 0) {
            v(i);
        } else {
            w(i);
        }
    }

    public final void o(int i, MessageLite messageLite) {
        x(i, 2);
        p(messageLite);
    }

    public final void p(MessageLite messageLite) {
        v(messageLite.getSerializedSize());
        messageLite.a(this);
    }

    public final void q(int i) {
        byte b = (byte) i;
        if (this.c == this.b) {
            k();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        this.f24506a[i2] = b;
    }

    public final void r(ByteString byteString) {
        int size = byteString.size();
        int i = this.c;
        int i2 = this.b;
        int i3 = i2 - i;
        byte[] bArr = this.f24506a;
        if (i3 >= size) {
            byteString.h(0, i, bArr, size);
            this.c += size;
            return;
        }
        byteString.h(0, i, bArr, i3);
        int i4 = size - i3;
        this.c = i2;
        k();
        if (i4 <= i2) {
            byteString.h(i3, 0, bArr, i4);
            this.c = i4;
        } else {
            if (i3 < 0) {
                throw new IndexOutOfBoundsException(c.k(30, i3, "Source offset < 0: "));
            }
            if (i4 < 0) {
                throw new IndexOutOfBoundsException(c.k(23, i4, "Length < 0: "));
            }
            int i5 = i3 + i4;
            if (i5 > byteString.size()) {
                throw new IndexOutOfBoundsException(c.k(39, i5, "Source end offset exceeded: "));
            }
            if (i4 > 0) {
                byteString.v(this.d, i3, i4);
            }
        }
    }

    public final void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.c;
        int i2 = this.b;
        int i3 = i2 - i;
        byte[] bArr2 = this.f24506a;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.c = i2;
        k();
        if (i4 > i2) {
            this.d.write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
        }
    }

    public final void t(int i) {
        q(i & 255);
        q((i >> 8) & 255);
        q((i >> 16) & 255);
        q((i >> 24) & 255);
    }

    public final void u(long j) {
        q(((int) j) & 255);
        q(((int) (j >> 8)) & 255);
        q(((int) (j >> 16)) & 255);
        q(((int) (j >> 24)) & 255);
        q(((int) (j >> 32)) & 255);
        q(((int) (j >> 40)) & 255);
        q(((int) (j >> 48)) & 255);
        q(((int) (j >> 56)) & 255);
    }

    public final void v(int i) {
        while ((i & (-128)) != 0) {
            q((i & 127) | 128);
            i >>>= 7;
        }
        q(i);
    }

    public final void w(long j) {
        while (((-128) & j) != 0) {
            q((((int) j) & 127) | 128);
            j >>>= 7;
        }
        q((int) j);
    }

    public final void x(int i, int i2) {
        v((i << 3) | i2);
    }
}
