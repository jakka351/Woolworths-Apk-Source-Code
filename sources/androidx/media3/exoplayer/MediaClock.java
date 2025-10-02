package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface MediaClock {
    long A();

    void c(PlaybackParameters playbackParameters);

    PlaybackParameters d();

    default boolean h() {
        return false;
    }
}
