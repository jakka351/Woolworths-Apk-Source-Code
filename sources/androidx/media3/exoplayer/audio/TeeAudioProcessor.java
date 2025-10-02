package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class TeeAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    public interface AudioBufferSink {
    }

    public static final class WavFileAudioBufferSink implements AudioBufferSink {
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) {
        return audioFormat;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return;
        }
        int i = Util.f2928a;
        byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        throw null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void g() {
        if (isActive()) {
            int i = this.b.f2894a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void h() {
        if (isActive()) {
            int i = this.b.f2894a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final void i() {
        if (isActive()) {
            int i = this.b.f2894a;
            throw null;
        }
    }
}
