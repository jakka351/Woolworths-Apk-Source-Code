package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class ChannelMappingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    public int[] i;
    public int[] j;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.e;
        }
        int i2 = audioFormat.b;
        if (i != 2 && i != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", audioFormat);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new AudioProcessor.AudioFormat(audioFormat.f2894a, iArr.length, i) : AudioProcessor.AudioFormat.e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                int iR = (Util.r(this.b.c) * i) + iPosition;
                int i2 = this.b.c;
                if (i2 == 2) {
                    byteBufferJ.putShort(byteBuffer.getShort(iR));
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.b.c);
                    }
                    byteBufferJ.putFloat(byteBuffer.getFloat(iR));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void g() {
        this.j = this.i;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
