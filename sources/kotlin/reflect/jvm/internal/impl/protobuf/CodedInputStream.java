package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CodedInputStream {
    public int c;
    public final InputStream e;
    public int f;
    public int i;
    public int h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24505a = new byte[4096];
    public int b = 0;
    public int d = 0;
    public int g = 0;

    public interface RefillCallback {
    }

    public CodedInputStream(InputStream inputStream) {
        this.e = inputStream;
    }

    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.f != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i = this.h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.g + this.d);
    }

    public final void c(int i) {
        this.h = i;
        o();
    }

    public final int d(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.g + this.d + i;
        int i3 = this.h;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.a();
        }
        this.h = i2;
        o();
        return i3;
    }

    public final ByteString e() {
        int iK = k();
        int i = this.b;
        int i2 = this.d;
        if (iK > i - i2 || iK <= 0) {
            return iK == 0 ? ByteString.d : new LiteralByteString(h(iK));
        }
        byte[] bArr = new byte[iK];
        System.arraycopy(this.f24505a, i2, bArr, 0, iK);
        LiteralByteString literalByteString = new LiteralByteString(bArr);
        this.d += iK;
        return literalByteString;
    }

    public final int f() {
        return k();
    }

    public final MessageLite g(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int iK = k();
        if (this.i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iK);
        this.i++;
        MessageLite messageLite = (MessageLite) parser.b(this, extensionRegistryLite);
        a(0);
        this.i--;
        c(iD);
        return messageLite;
    }

    public final byte[] h(int i) throws InvalidProtocolBufferException {
        if (i <= 0) {
            if (i == 0) {
                return Internal.f24514a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.g;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        int i5 = this.h;
        if (i4 > i5) {
            r((i5 - i2) - i3);
            throw InvalidProtocolBufferException.a();
        }
        byte[] bArr = this.f24505a;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.b - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.d = this.b;
            int i7 = i - i6;
            if (i7 > 0) {
                p(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.d = i7;
            return bArr2;
        }
        int i8 = this.b;
        this.g = i2 + i8;
        this.d = 0;
        this.b = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.e;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.a();
                }
                this.g += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws InvalidProtocolBufferException {
        int i = this.d;
        if (this.b - i < 4) {
            p(4);
            i = this.d;
        }
        this.d = i + 4;
        byte[] bArr = this.f24505a;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long j() throws InvalidProtocolBufferException {
        int i = this.d;
        if (this.b - i < 8) {
            p(8);
            i = this.d;
        }
        this.d = i + 8;
        byte[] bArr = this.f24505a;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int k() {
        int i;
        int i2 = this.d;
        int i3 = this.b;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f24505a;
            byte b = bArr[i2];
            if (b >= 0) {
                this.d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        long j3 = i8 ^ (bArr[i7] << 21);
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            int i10 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i9] < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i11;
                                                    i = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.d = i5;
                return i;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.l():long");
    }

    public final long m() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.d == this.b) {
                p(1);
            }
            int i2 = this.d;
            this.d = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f24505a[i2] & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws InvalidProtocolBufferException {
        if (this.d == this.b && !s(1)) {
            this.f = 0;
            return 0;
        }
        int iK = k();
        this.f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i = this.b + this.c;
        this.b = i;
        int i2 = this.g + i;
        int i3 = this.h;
        if (i2 <= i3) {
            this.c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.c = i4;
        this.b = i - i4;
    }

    public final void p(int i) throws InvalidProtocolBufferException {
        if (!s(i)) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final boolean q(int i, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iN;
        int i2 = i & 7;
        if (i2 == 0) {
            long jL = l();
            codedOutputStream.v(i);
            codedOutputStream.w(jL);
            return true;
        }
        if (i2 == 1) {
            long j = j();
            codedOutputStream.v(i);
            codedOutputStream.u(j);
            return true;
        }
        if (i2 == 2) {
            ByteString byteStringE = e();
            codedOutputStream.v(i);
            codedOutputStream.v(byteStringE.size());
            codedOutputStream.r(byteStringE);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int i3 = i();
            codedOutputStream.v(i);
            codedOutputStream.t(i3);
            return true;
        }
        codedOutputStream.v(i);
        do {
            iN = n();
            if (iN == 0) {
                break;
            }
        } while (q(iN, codedOutputStream));
        int i4 = ((i >>> 3) << 3) | 4;
        a(i4);
        codedOutputStream.v(i4);
        return true;
    }

    public final void r(int i) throws InvalidProtocolBufferException {
        int i2 = this.b;
        int i3 = this.d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.g;
        int i6 = i5 + i3 + i;
        int i7 = this.h;
        if (i6 > i7) {
            r((i7 - i5) - i3);
            throw InvalidProtocolBufferException.a();
        }
        this.d = i2;
        p(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.b;
            if (i8 <= i9) {
                this.d = i8;
                return;
            } else {
                i4 += i9;
                this.d = i9;
                p(1);
            }
        }
    }

    public final boolean s(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.d;
        int i3 = i2 + i;
        int i4 = this.b;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.g + i2 + i <= this.h && (inputStream = this.e) != null) {
            byte[] bArr = this.f24505a;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.g += i2;
                this.b -= i2;
                this.d = 0;
            }
            int i5 = this.b;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.b += i6;
                if ((this.g + i) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.b >= i) {
                    return true;
                }
                return s(i);
            }
        }
        return false;
    }
}
