package com.fasterxml.jackson.core.io;

import YU.a;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes4.dex */
public class UTF32Reader extends Reader {
    public final IOContext d;
    public InputStream e;
    public byte[] f;
    public int g;
    public int h;
    public final boolean i;
    public char j = 0;
    public int k;
    public int l;
    public final boolean m;
    public char[] n;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.d = iOContext;
        this.e = inputStream;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.m = inputStream != null;
    }

    public final void a(int i) throws CharConversionException {
        throw new CharConversionException(a.m(a.q(i, this.k, "Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", ", needed 4, at char #", ", byte #"), this.l + i, ")"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            this.e = null;
            byte[] bArr = this.f;
            if (bArr != null) {
                this.f = null;
                IOContext iOContext = this.d;
                if (iOContext != null) {
                    iOContext.e(bArr);
                }
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.n == null) {
            this.n = new char[1];
        }
        if (read(this.n, 0, 1) < 1) {
            return -1;
        }
        return this.n[0];
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr;
        byte[] bArr2;
        int i5;
        int i6;
        byte[] bArr3 = this.f;
        if (bArr3 == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i >= 0 && (i3 = i + i2) <= cArr.length) {
            char c = this.j;
            if (c != 0) {
                i4 = i + 1;
                cArr[i] = c;
                this.j = (char) 0;
            } else {
                int i7 = this.h;
                int i8 = this.g;
                int i9 = i7 - i8;
                if (i9 < 4) {
                    InputStream inputStream = this.e;
                    if (inputStream != null) {
                        this.l = (i7 - i9) + this.l;
                        IOContext iOContext = this.d;
                        boolean z = this.m;
                        if (i9 > 0) {
                            if (i8 > 0) {
                                System.arraycopy(bArr3, i8, bArr3, 0, i9);
                                this.g = 0;
                            }
                            this.h = i9;
                        } else {
                            this.g = 0;
                            int i10 = inputStream.read(bArr3);
                            if (i10 < 1) {
                                this.h = 0;
                                if (i10 >= 0) {
                                    throw new IOException("Strange I/O stream, returned 0 bytes on read");
                                }
                                if (z && (bArr = this.f) != null) {
                                    this.f = null;
                                    if (iOContext != null) {
                                        iOContext.e(bArr);
                                    }
                                }
                            } else {
                                this.h = i10;
                            }
                        }
                        while (true) {
                            int i11 = this.h;
                            if (i11 >= 4) {
                                break;
                            }
                            InputStream inputStream2 = this.e;
                            byte[] bArr4 = this.f;
                            int i12 = inputStream2.read(bArr4, i11, bArr4.length - i11);
                            if (i12 < 1) {
                                if (i12 < 0) {
                                    if (z && (bArr2 = this.f) != null) {
                                        this.f = null;
                                        if (iOContext != null) {
                                            iOContext.e(bArr2);
                                        }
                                    }
                                    a(this.h);
                                    throw null;
                                }
                                throw new IOException("Strange I/O stream, returned 0 bytes on read");
                            }
                            this.h += i12;
                        }
                    }
                    if (i9 == 0) {
                        return -1;
                    }
                    a(this.h - this.g);
                    throw null;
                }
                i4 = i;
            }
            int i13 = this.h - 4;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                int i14 = this.g;
                if (i14 > i13) {
                    break;
                }
                if (this.i) {
                    byte[] bArr5 = this.f;
                    i5 = (bArr5[i14] << 8) | (bArr5[i14 + 1] & 255);
                    i6 = (bArr5[i14 + 3] & 255) | ((bArr5[i14 + 2] & 255) << 8);
                } else {
                    byte[] bArr6 = this.f;
                    int i15 = (bArr6[i14] & 255) | ((bArr6[i14 + 1] & 255) << 8);
                    i5 = (bArr6[i14 + 3] << 8) | (bArr6[i14 + 2] & 255);
                    i6 = i15;
                }
                this.g = i14 + 4;
                if (i5 != 0) {
                    int i16 = 65535 & i5;
                    int i17 = i6 | ((i16 - 1) << 16);
                    if (i16 <= 16) {
                        int i18 = i4 + 1;
                        cArr[i4] = (char) ((i17 >> 10) + 55296);
                        int i19 = (i17 & 1023) | 56320;
                        if (i18 >= i3) {
                            this.j = (char) i17;
                            i4 = i18;
                            break;
                        }
                        i6 = i19;
                        i4 = i18;
                    } else {
                        int i20 = i4 - i;
                        String str = String.format(" (above 0x%08x)", 1114111);
                        int i21 = (this.l + this.g) - 1;
                        int i22 = this.k + i20;
                        StringBuilder sb = new StringBuilder("Invalid UTF-32 character 0x");
                        sb.append(Integer.toHexString(i17));
                        sb.append(str);
                        sb.append(" at char #");
                        sb.append(i22);
                        throw new CharConversionException(androidx.constraintlayout.core.state.a.k(sb, ", byte #", i21, ")"));
                    }
                }
                cArr[i4] = (char) i6;
                i4++;
            }
            int i23 = i4 - i;
            this.k += i23;
            return i23;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)));
    }
}
