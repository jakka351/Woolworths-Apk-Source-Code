package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher e;
    public final /* synthetic */ DecoderCounters f;

    public /* synthetic */ b(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.d = i;
        this.e = eventDispatcher;
        this.f = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = this.e;
                DecoderCounters decoderCounters = this.f;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.b;
                int i = Util.f2928a;
                audioRendererEventListener.e(decoderCounters);
                break;
            default:
                AudioRendererEventListener.EventDispatcher eventDispatcher2 = this.e;
                DecoderCounters decoderCounters2 = this.f;
                synchronized (decoderCounters2) {
                }
                AudioRendererEventListener audioRendererEventListener2 = eventDispatcher2.b;
                int i2 = Util.f2928a;
                audioRendererEventListener2.i(decoderCounters2);
                break;
        }
    }
}
