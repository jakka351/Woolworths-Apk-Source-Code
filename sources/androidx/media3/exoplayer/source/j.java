package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.SeekMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Map map = ProgressiveMediaPeriod.T;
                ((ProgressiveMediaPeriod) obj2).D((SeekMap) obj);
                break;
            default:
                ((Consumer) obj2).accept((MediaSourceEventListener) obj);
                break;
        }
    }
}
