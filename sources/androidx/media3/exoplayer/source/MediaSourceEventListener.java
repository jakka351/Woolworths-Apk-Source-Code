package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public interface MediaSourceEventListener {

    public static class EventDispatcher {

        /* renamed from: a, reason: collision with root package name */
        public final int f3131a;
        public final MediaSource.MediaPeriodId b;
        public final CopyOnWriteArrayList c;

        public static final class ListenerAndHandler {

            /* renamed from: a, reason: collision with root package name */
            public Handler f3132a;
            public Object b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.c = copyOnWriteArrayList;
            this.f3131a = i;
            this.b = mediaPeriodId;
        }

        public final void a(Consumer consumer) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                Util.L(listenerAndHandler.f3132a, new j(1, consumer, listenerAndHandler.b));
            }
        }
    }

    default void H(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }

    default void J(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void M(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void a0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
    }

    default void j0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }
}
