package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.f = obj;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                DefaultVideoSink.this.h.a((VideoSize) obj);
                break;
            case 1:
                ((VideoSink.Listener) obj2).a((VideoSize) obj);
                break;
            case 2:
                VideoRendererEventListener videoRendererEventListener = ((VideoRendererEventListener.EventDispatcher) obj2).b;
                int i2 = Util.f2928a;
                videoRendererEventListener.a((VideoSize) obj);
                break;
            case 3:
                VideoRendererEventListener videoRendererEventListener2 = ((VideoRendererEventListener.EventDispatcher) obj2).b;
                int i3 = Util.f2928a;
                videoRendererEventListener2.s((Exception) obj);
                break;
            default:
                VideoRendererEventListener videoRendererEventListener3 = ((VideoRendererEventListener.EventDispatcher) obj2).b;
                int i4 = Util.f2928a;
                videoRendererEventListener3.c((String) obj);
                break;
        }
    }

    public /* synthetic */ d(PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink, VideoSink.Listener listener, VideoSize videoSize) {
        this.d = 1;
        this.f = listener;
        this.e = videoSize;
    }
}
