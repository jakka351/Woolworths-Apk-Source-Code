package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    public int b;
    public float c;
    public float d;
    public AudioProcessor.AudioFormat e;
    public AudioProcessor.AudioFormat f;
    public AudioProcessor.AudioFormat g;
    public AudioProcessor.AudioFormat h;
    public boolean i;
    public Sonic j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public final long a(long j) {
        if (this.o < llqqqql.c00630063c0063c0063) {
            return (long) (this.c * j);
        }
        long j2 = this.n;
        this.j.getClass();
        long j3 = j2 - ((r2.k * r2.b) * 2);
        int i = this.h.f2894a;
        int i2 = this.g.f2894a;
        return i == i2 ? Util.O(j, j3, this.o, RoundingMode.DOWN) : Util.O(j, j3 * i, this.o * i2, RoundingMode.DOWN);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean b() {
        if (this.p) {
            Sonic sonic = this.j;
            if (sonic != null) {
                Assertions.f(sonic.m >= 0);
                if (sonic.m * sonic.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic sonic = this.j;
            sonic.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = sonic.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = sonic.c(sonic.j, sonic.k, i2);
            sonic.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, sonic.k * i, ((i2 * i) * 2) / 2);
            sonic.k += i2;
            sonic.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void d() {
        Sonic sonic = this.j;
        if (sonic != null) {
            int i = sonic.k;
            float f = sonic.c;
            float f2 = sonic.d;
            double d = f / f2;
            int i2 = sonic.m + ((int) (((((((i - r6) / d) + sonic.r) + sonic.w) + sonic.o) / (sonic.e * f2)) + 0.5d));
            sonic.w = 0.0d;
            short[] sArr = sonic.j;
            int i3 = sonic.h * 2;
            sonic.j = sonic.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = sonic.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                sonic.j[(i5 * i) + i4] = 0;
                i4++;
            }
            sonic.k = i3 + sonic.k;
            sonic.f();
            if (sonic.m > i2) {
                sonic.m = Math.max(i2, 0);
            }
            sonic.k = 0;
            sonic.r = 0;
            sonic.o = 0;
        }
        this.p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        Sonic sonic = this.j;
        if (sonic != null) {
            int i = sonic.b;
            Assertions.f(sonic.m >= 0);
            int i2 = sonic.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                Assertions.f(sonic.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, sonic.m);
                int i3 = iMin * i;
                shortBuffer.put(sonic.l, 0, i3);
                int i4 = sonic.m - iMin;
                sonic.m = i4;
                short[] sArr = sonic.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = AudioProcessor.f2893a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat f(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.b;
        if (i == -1) {
            i = audioFormat.f2894a;
        }
        this.e = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i, audioFormat.b, 2);
        this.f = audioFormat2;
        this.i = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.e;
            this.g = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.f;
            this.h = audioFormat2;
            if (this.i) {
                this.j = new Sonic(audioFormat.f2894a, audioFormat.b, this.c, this.d, audioFormat2.f2894a);
            } else {
                Sonic sonic = this.j;
                if (sonic != null) {
                    sonic.k = 0;
                    sonic.m = 0;
                    sonic.o = 0;
                    sonic.p = 0;
                    sonic.q = 0;
                    sonic.r = 0;
                    sonic.s = 0;
                    sonic.t = 0;
                    sonic.u = 0;
                    sonic.v = 0;
                    sonic.w = 0.0d;
                }
            }
        }
        this.m = AudioProcessor.f2893a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f.f2894a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f2894a != this.e.f2894a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.e;
        this.e = audioFormat;
        this.f = audioFormat;
        this.g = audioFormat;
        this.h = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.f2893a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
