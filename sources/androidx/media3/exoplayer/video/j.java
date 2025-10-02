package androidx.media3.exoplayer.video;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher e;
    public final /* synthetic */ DecoderCounters f;

    public /* synthetic */ j(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.d = i;
        this.e = eventDispatcher;
        this.f = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = this.e;
                DecoderCounters decoderCounters = this.f;
                VideoRendererEventListener videoRendererEventListener = eventDispatcher.b;
                int i = Util.f2928a;
                videoRendererEventListener.f(decoderCounters);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.e;
                DecoderCounters decoderCounters2 = this.f;
                synchronized (decoderCounters2) {
                }
                VideoRendererEventListener videoRendererEventListener2 = eventDispatcher2.b;
                int i2 = Util.f2928a;
                videoRendererEventListener2.w(decoderCounters2);
                break;
        }
    }
}
