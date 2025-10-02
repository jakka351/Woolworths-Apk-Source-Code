package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class ChannelMixingAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        int i = this.b.b;
        throw null;
    }
}
