package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class SilenceSkippingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    public int n;
    public boolean o;
    public int p;
    public long q;
    public byte[] s;
    public byte[] v;
    public int r = 0;
    public int t = 0;
    public int u = 0;
    public final long l = 100000;
    public final float i = 0.2f;
    public final long m = 2000000;
    public final int k = 10;
    public final short j = 1024;

    public SilenceSkippingAudioProcessor() {
        byte[] bArr = Util.c;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.c == 2) {
            return audioFormat.f2894a == -1 ? AudioProcessor.AudioFormat.e : audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            short s = this.j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.n;
                        iPosition = androidx.constraintlayout.core.state.a.D(iLimit3, i2, i2, i2);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                Assertions.f(this.t < this.s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.n;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.t;
                int i4 = this.u;
                int length2 = length + i4;
                byte[] bArr = this.s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.s, length2, iMin);
                int i6 = this.u + iMin;
                this.u = i6;
                Assertions.f(i6 <= this.s.length);
                boolean z2 = z && iPosition3 < i5;
                l(z2);
                if (z2) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void g() {
        if (isActive()) {
            int i = this.b.b * 2;
            this.n = i;
            int i2 = ((((int) ((this.l * r0.f2894a) / 1000000)) / 2) / i) * i * 2;
            if (this.s.length != i2) {
                this.s = new byte[i2];
                this.v = new byte[i2];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void h() {
        if (this.u > 0) {
            l(true);
            this.r = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void i() {
        this.o = false;
        byte[] bArr = Util.c;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return super.isActive() && this.o;
    }

    public final int k(int i) {
        int length = ((((int) ((this.m * this.b.f2894a) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        Assertions.f(length >= 0);
        int iMin = (int) Math.min((i * this.i) + 0.5f, length);
        int i2 = this.n;
        return (iMin / i2) * i2;
    }

    public final void l(boolean z) {
        int length;
        int iK;
        int i = this.u;
        byte[] bArr = this.s;
        if (i == bArr.length || z) {
            if (this.r == 0) {
                if (z) {
                    m(i, 3);
                    length = i;
                } else {
                    Assertions.f(i >= bArr.length / 2);
                    length = this.s.length / 2;
                    m(length, 0);
                }
                iK = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iK2 = k(length2) + (this.s.length / 2);
                m(iK2, 2);
                iK = iK2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iK = k(length);
                m(iK, 1);
            }
            Assertions.e("bytesConsumed is not aligned to frame size: %s" + length, length % this.n == 0);
            Assertions.f(i >= iK);
            this.u -= length;
            int i2 = this.t + length;
            this.t = i2;
            this.t = i2 % this.s.length;
            this.r = (iK / this.n) + this.r;
            this.q += (length - iK) / r2;
        }
    }

    public final void m(int i, int i2) {
        if (i == 0) {
            return;
        }
        Assertions.b(this.u >= i);
        if (i2 == 2) {
            int i3 = this.t;
            int i4 = this.u;
            int i5 = i3 + i4;
            byte[] bArr = this.s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.v, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.v, 0, i6);
                    System.arraycopy(this.s, 0, this.v, i6, length);
                }
            }
        } else {
            int i7 = this.t;
            int i8 = i7 + i;
            byte[] bArr2 = this.s;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.v, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.v, 0, length2);
                System.arraycopy(this.s, 0, this.v, length2, i - length2);
            }
        }
        Assertions.a("sizeToOutput is not aligned to frame size: " + i, i % this.n == 0);
        Assertions.f(this.t < this.s.length);
        byte[] bArr3 = this.v;
        Assertions.a("byteOutput size is not aligned to frame size " + i, i % this.n == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.k;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = 127;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = -128;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        j(i).put(bArr3, 0, i).flip();
    }
}
