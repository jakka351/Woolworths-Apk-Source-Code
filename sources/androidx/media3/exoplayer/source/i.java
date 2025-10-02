package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.MediaPeriod;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProgressiveMediaPeriod e;

    public /* synthetic */ i(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.d = i;
        this.e = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        ProgressiveMediaPeriod progressiveMediaPeriod = this.e;
        switch (i) {
            case 0:
                progressiveMediaPeriod.M = true;
                break;
            case 1:
                Map map = ProgressiveMediaPeriod.T;
                progressiveMediaPeriod.z();
                break;
            default:
                if (!progressiveMediaPeriod.S) {
                    MediaPeriod.Callback callback = progressiveMediaPeriod.v;
                    callback.getClass();
                    callback.g(progressiveMediaPeriod);
                    break;
                }
                break;
        }
    }
}
