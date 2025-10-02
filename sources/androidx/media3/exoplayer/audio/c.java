package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher e;
    public final /* synthetic */ AudioSink.AudioTrackConfig f;

    public /* synthetic */ c(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.d = i;
        this.e = eventDispatcher;
        this.f = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        AudioSink.AudioTrackConfig audioTrackConfig = this.f;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.e;
        switch (i) {
            case 0:
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.b;
                int i2 = Util.f2928a;
                audioRendererEventListener.n(audioTrackConfig);
                break;
            default:
                AudioRendererEventListener audioRendererEventListener2 = eventDispatcher.b;
                int i3 = Util.f2928a;
                audioRendererEventListener2.b(audioTrackConfig);
                break;
        }
    }
}
