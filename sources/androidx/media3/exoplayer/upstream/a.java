package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    public /* synthetic */ a(BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener, int i, long j, long j2) {
        this.d = handlerAndListener;
        this.e = i;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.C(this.e, this.f, this.g);
    }
}
