package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {
    public AudioProcessor.AudioFormat b;
    public AudioProcessor.AudioFormat c;
    public AudioProcessor.AudioFormat d;
    public AudioProcessor.AudioFormat e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.f2893a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.e;
        this.d = audioFormat;
        this.e = audioFormat;
        this.b = audioFormat;
        this.c = audioFormat;
    }

    public AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) {
        return AudioProcessor.AudioFormat.e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean b() {
        return this.h && this.g == AudioProcessor.f2893a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void d() {
        this.h = true;
        h();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.f2893a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat f(AudioProcessor.AudioFormat audioFormat) {
        this.d = audioFormat;
        this.e = a(audioFormat);
        return isActive() ? this.e : AudioProcessor.AudioFormat.e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.g = AudioProcessor.f2893a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.e != AudioProcessor.AudioFormat.e;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f = AudioProcessor.f2893a;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.e;
        this.d = audioFormat;
        this.e = audioFormat;
        this.b = audioFormat;
        this.c = audioFormat;
        i();
    }
}
