package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;

    public /* synthetic */ h(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.e = eventDispatcher;
        this.g = i;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        int i2 = this.g;
        long j = this.f;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.e;
        switch (i) {
            case 0:
                VideoRendererEventListener videoRendererEventListener = eventDispatcher.b;
                int i3 = Util.f2928a;
                videoRendererEventListener.l(i2, j);
                break;
            default:
                VideoRendererEventListener videoRendererEventListener2 = eventDispatcher.b;
                int i4 = Util.f2928a;
                videoRendererEventListener2.k(i2, j);
                break;
        }
    }

    public /* synthetic */ h(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.e = eventDispatcher;
        this.f = j;
        this.g = i;
    }
}
