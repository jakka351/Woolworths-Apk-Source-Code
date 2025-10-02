package androidx.media3.exoplayer.video;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DefaultVideoSink.this.h.b();
                break;
            case 1:
                DefaultVideoSink.this.h.c();
                break;
            default:
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = (PlaybackVideoGraphWrapper) this.e;
                playbackVideoGraphWrapper.m--;
                break;
        }
    }
}
