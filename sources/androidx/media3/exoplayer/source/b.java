package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Handler.Callback {
    public final /* synthetic */ int d;
    public final /* synthetic */ CompositeMediaSource e;

    public /* synthetic */ b(CompositeMediaSource compositeMediaSource, int i) {
        this.d = i;
        this.e = compositeMediaSource;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.d) {
            case 0:
                ConcatenatingMediaSource concatenatingMediaSource = (ConcatenatingMediaSource) this.e;
                MediaItem mediaItem = ConcatenatingMediaSource.q;
                switch (message.what) {
                    case 1:
                        Object obj = message.obj;
                        int i = Util.f2928a;
                        ((ConcatenatingMediaSource.MessageData) obj).getClass();
                        throw null;
                    case 2:
                        Object obj2 = message.obj;
                        int i2 = Util.f2928a;
                        ((ConcatenatingMediaSource.MessageData) obj2).getClass();
                        throw null;
                    case 3:
                        Object obj3 = message.obj;
                        int i3 = Util.f2928a;
                        ShuffleOrder shuffleOrder = concatenatingMediaSource.p;
                        ((ConcatenatingMediaSource.MessageData) obj3).getClass();
                        concatenatingMediaSource.p = shuffleOrder.f(1);
                        throw null;
                    case 4:
                        Object obj4 = message.obj;
                        int i4 = Util.f2928a;
                        ((ConcatenatingMediaSource.MessageData) obj4).getClass();
                        concatenatingMediaSource.p = null;
                        if (!concatenatingMediaSource.o) {
                            concatenatingMediaSource.n.obtainMessage(5).sendToTarget();
                            concatenatingMediaSource.o = true;
                        }
                        return true;
                    case 5:
                        concatenatingMediaSource.o = false;
                        new HashSet();
                        new ConcatenatingMediaSource.ConcatenatedTimeline(concatenatingMediaSource.p);
                        throw null;
                    case 6:
                        Object obj5 = message.obj;
                        int i5 = Util.f2928a;
                        Set set = (Set) obj5;
                        synchronized (concatenatingMediaSource) {
                            try {
                                Iterator it = set.iterator();
                                if (!it.hasNext()) {
                                    throw null;
                                }
                                ((ConcatenatingMediaSource.HandlerAndRunnable) it.next()).getClass();
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    default:
                        throw new IllegalStateException();
                }
            default:
                ConcatenatingMediaSource2 concatenatingMediaSource2 = (ConcatenatingMediaSource2) this.e;
                if (message.what != 1) {
                    return true;
                }
                concatenatingMediaSource2.o = false;
                ConcatenatingMediaSource2.i0();
                throw null;
        }
    }
}
