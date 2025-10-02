package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class SinglePeriodTimeline extends Timeline {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final MediaItem e;
    public final MediaItem.LiveConfiguration f;

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f2858a = "SinglePeriodTimeline";
        builder.b = Uri.EMPTY;
        builder.a();
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, MediaItem mediaItem) {
        MediaItem.LiveConfiguration liveConfiguration = z2 ? mediaItem.c : null;
        this.b = j;
        this.c = j;
        this.d = z;
        mediaItem.getClass();
        this.e = mediaItem;
        this.f = liveConfiguration;
    }

    @Override // androidx.media3.common.Timeline
    public final int b(Object obj) {
        return g.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
        Assertions.c(i, 1);
        Object obj = z ? g : null;
        period.getClass();
        period.h(null, obj, 0, this.b, 0L, AdPlaybackState.c, false);
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final int h() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    public final Object l(int i) {
        Assertions.c(i, 1);
        return g;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Window m(int i, Timeline.Window window, long j) {
        Assertions.c(i, 1);
        window.b(Timeline.Window.p, this.e, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.d, false, this.f, 0L, this.c, 0, 0, 0L);
        return window;
    }

    @Override // androidx.media3.common.Timeline
    public final int o() {
        return 1;
    }
}
