package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                MediaPeriodQueue mediaPeriodQueue = (MediaPeriodQueue) this.e;
                ImmutableList.Builder builder = (ImmutableList.Builder) this.f;
                mediaPeriodQueue.c.A(builder.j(), (MediaSource.MediaPeriodId) this.g);
                break;
            case 1:
                MediaSourceList.ForwardingEventListener forwardingEventListener = (MediaSourceList.ForwardingEventListener) this.e;
                Pair pair = (Pair) this.f;
                forwardingEventListener.e.h.d0(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, (Exception) this.g);
                break;
            default:
                MediaSourceList.ForwardingEventListener forwardingEventListener2 = (MediaSourceList.ForwardingEventListener) this.e;
                Pair pair2 = (Pair) this.f;
                forwardingEventListener2.e.h.M(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second, (MediaLoadData) this.g);
                break;
        }
    }
}
