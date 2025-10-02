package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(Object obj, String str, long j, long j2, int i) {
        this.d = i;
        this.h = obj;
        this.e = str;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.h;
        switch (i) {
            case 0:
                AudioRendererEventListener audioRendererEventListener = ((AudioRendererEventListener.EventDispatcher) obj).b;
                int i2 = Util.f2928a;
                audioRendererEventListener.j(this.f, this.g, this.e);
                break;
            default:
                VideoRendererEventListener videoRendererEventListener = ((VideoRendererEventListener.EventDispatcher) obj).b;
                int i3 = Util.f2928a;
                videoRendererEventListener.x(this.f, this.g, this.e);
                break;
        }
    }
}
