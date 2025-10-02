package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher e;
    public final /* synthetic */ Exception f;

    public /* synthetic */ d(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i) {
        this.d = i;
        this.e = eventDispatcher;
        this.f = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Exception exc = this.f;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.e;
        switch (i) {
            case 0:
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.b;
                int i2 = Util.f2928a;
                audioRendererEventListener.m(exc);
                break;
            default:
                AudioRendererEventListener audioRendererEventListener2 = eventDispatcher.b;
                int i3 = Util.f2928a;
                audioRendererEventListener2.p(exc);
                break;
        }
    }
}
