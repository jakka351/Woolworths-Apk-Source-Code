package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoSink;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ VideoSink.Listener e;

    public /* synthetic */ f(PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink, VideoSink.Listener listener, int i) {
        this.d = i;
        this.e = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.b();
                break;
            default:
                this.e.c();
                break;
        }
    }
}
