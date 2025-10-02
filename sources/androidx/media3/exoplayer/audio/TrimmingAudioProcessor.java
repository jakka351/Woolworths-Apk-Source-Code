package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class TrimmingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? AudioProcessor.AudioFormat.e : audioFormat;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final boolean b() {
        return super.b() && this.n == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += iMin / this.b.d;
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferJ = j(length);
        int i3 = Util.i(length, 0, this.n);
        byteBufferJ.put(this.m, 0, i3);
        int i4 = Util.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        byteBufferJ.flip();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        int i;
        if (super.b() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.e();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void i() {
        this.m = Util.c;
    }
}
