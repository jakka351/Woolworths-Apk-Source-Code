package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class SpeedChangingAudioProcessor implements AudioProcessor {
    public boolean b;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean b() {
        if (this.b) {
            throw null;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void d() {
        this.b = true;
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer e() {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat f(AudioProcessor.AudioFormat audioFormat) {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.b = false;
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.b = false;
        throw null;
    }
}
