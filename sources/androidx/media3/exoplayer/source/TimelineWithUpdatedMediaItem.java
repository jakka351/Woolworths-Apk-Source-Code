package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    public final MediaItem c;

    public TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.c = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public final Timeline.Window m(int i, Timeline.Window window, long j) {
        super.m(i, window, j);
        MediaItem mediaItem = this.c;
        window.c = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.b;
        window.b = null;
        return window;
    }
}
