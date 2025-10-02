package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultAudioTrackProvider implements DefaultAudioSink.AudioTrackProvider {
    public static AudioAttributes b(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : audioAttributes.a().f2846a;
    }

    public final AudioTrack a(AudioSink.AudioTrackConfig audioTrackConfig, androidx.media3.common.AudioAttributes audioAttributes, int i) {
        boolean z = audioTrackConfig.d;
        int i2 = audioTrackConfig.f3049a;
        int i3 = audioTrackConfig.c;
        int i4 = audioTrackConfig.b;
        int i5 = Util.f2928a;
        if (i5 < 23) {
            return new AudioTrack(b(audioAttributes, z), Util.p(i4, i3, i2), audioTrackConfig.f, 1, i);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(audioAttributes, z)).setAudioFormat(Util.p(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(audioTrackConfig.f).setSessionId(i);
        if (i5 >= 29) {
            sessionId.setOffloadedPlayback(audioTrackConfig.e);
        }
        return sessionId.build();
    }
}
