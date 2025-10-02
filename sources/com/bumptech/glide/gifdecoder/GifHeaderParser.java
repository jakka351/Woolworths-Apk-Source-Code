package com.bumptech.glide.gifdecoder;

import YU.a;
import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class GifHeaderParser {
    public ByteBuffer b;
    public GifHeader c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13771a = new byte[256];
    public int d = 0;

    public final void a() {
        this.b = null;
        this.c = null;
    }

    public final boolean b() {
        return this.c.b != 0;
    }

    public final GifHeader c() {
        byte[] bArr;
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (sb.toString().startsWith("GIF")) {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iD = d();
            GifHeader gifHeader = this.c;
            gifHeader.h = (iD & 128) != 0;
            gifHeader.i = (int) Math.pow(2.0d, (iD & 7) + 1);
            this.c.j = d();
            GifHeader gifHeader2 = this.c;
            d();
            gifHeader2.getClass();
            if (this.c.h && !b()) {
                GifHeader gifHeader3 = this.c;
                gifHeader3.f13770a = f(gifHeader3.i);
                GifHeader gifHeader4 = this.c;
                gifHeader4.k = gifHeader4.f13770a[gifHeader4.j];
            }
        } else {
            this.c.b = 1;
        }
        if (!b()) {
            boolean z = false;
            while (!z && !b() && this.c.c <= Integer.MAX_VALUE) {
                int iD2 = d();
                if (iD2 == 33) {
                    int iD3 = d();
                    if (iD3 == 1) {
                        h();
                    } else if (iD3 == 249) {
                        this.c.d = new GifFrame();
                        d();
                        int iD4 = d();
                        GifFrame gifFrame = this.c.d;
                        int i2 = (iD4 & 28) >> 2;
                        gifFrame.g = i2;
                        if (i2 == 0) {
                            gifFrame.g = 1;
                        }
                        gifFrame.f = (iD4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        GifFrame gifFrame2 = this.c.d;
                        gifFrame2.i = s * 10;
                        gifFrame2.h = d();
                        d();
                    } else if (iD3 == 254) {
                        h();
                    } else if (iD3 != 255) {
                        h();
                    } else {
                        e();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f13771a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                e();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!b());
                        } else {
                            h();
                        }
                    }
                } else if (iD2 == 44) {
                    GifHeader gifHeader5 = this.c;
                    if (gifHeader5.d == null) {
                        gifHeader5.d = new GifFrame();
                    }
                    gifHeader5.d.f13769a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iD5 = d();
                    boolean z2 = (iD5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iD5 & 7) + 1);
                    GifFrame gifFrame3 = this.c.d;
                    gifFrame3.e = (iD5 & 64) != 0;
                    if (z2) {
                        gifFrame3.k = f(iPow);
                    } else {
                        gifFrame3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    d();
                    h();
                    if (!b()) {
                        GifHeader gifHeader6 = this.c;
                        gifHeader6.c++;
                        gifHeader6.e.add(gifHeader6.d);
                    }
                } else if (iD2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            GifHeader gifHeader7 = this.c;
            if (gifHeader7.c < 0) {
                gifHeader7.b = 1;
            }
        }
        return this.c;
    }

    public final int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void e() {
        int iD = d();
        this.d = iD;
        if (iD <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.b.get(this.f13771a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbQ = a.q(i, i2, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbQ.append(this.d);
                    Log.d("GifHeaderParser", sbQ.toString(), e);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] f(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
            return iArr;
        }
    }

    public final void g(ByteBuffer byteBuffer) {
        this.b = null;
        Arrays.fill(this.f13771a, (byte) 0);
        this.c = new GifHeader();
        this.d = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void h() {
        int iD;
        do {
            iD = d();
            this.b.position(Math.min(this.b.position() + iD, this.b.limit()));
        } while (iD > 0);
    }
}
