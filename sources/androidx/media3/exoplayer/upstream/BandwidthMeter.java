package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f3176a = new CopyOnWriteArrayList();

            public static final class HandlerAndListener {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f3177a;
                public final EventListener b;
                public boolean c;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.f3177a = handler;
                    this.b = eventListener;
                }
            }

            public final void a(EventListener eventListener) {
                CopyOnWriteArrayList copyOnWriteArrayList = this.f3176a;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    HandlerAndListener handlerAndListener = (HandlerAndListener) it.next();
                    if (handlerAndListener.b == eventListener) {
                        handlerAndListener.c = true;
                        copyOnWriteArrayList.remove(handlerAndListener);
                    }
                }
            }
        }

        void C(int i, long j, long j2);
    }

    void a(EventListener eventListener);

    void e(Handler handler, EventListener eventListener);

    TransferListener f();
}
