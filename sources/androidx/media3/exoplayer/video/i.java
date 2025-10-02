package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ long f;

    public /* synthetic */ i(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj, long j) {
        this.d = eventDispatcher;
        this.e = obj;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener = this.d.b;
        int i = Util.f2928a;
        videoRendererEventListener.h(this.f, this.e);
    }
}
