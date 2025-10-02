package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.camera.core.processing.g;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public interface DrmSessionEventListener {

    public static class EventDispatcher {

        /* renamed from: a, reason: collision with root package name */
        public final int f3079a;
        public final MediaSource.MediaPeriodId b;
        public final CopyOnWriteArrayList c;

        public static final class ListenerAndHandler {

            /* renamed from: a, reason: collision with root package name */
            public Handler f3080a;
            public Object b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.c = copyOnWriteArrayList;
            this.f3079a = i;
            this.b = mediaPeriodId;
        }

        public final void a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            handler.getClass();
            ListenerAndHandler listenerAndHandler = new ListenerAndHandler();
            listenerAndHandler.f3080a = handler;
            listenerAndHandler.b = drmSessionEventListener;
            this.c.add(listenerAndHandler);
        }

        public final void b() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                Util.L(listenerAndHandler.f3080a, new c(2, this, listenerAndHandler.b));
            }
        }

        public final void c() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                Util.L(listenerAndHandler.f3080a, new c(1, this, listenerAndHandler.b));
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, java.lang.Object] */
        public final void d(int i) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                Util.L(listenerAndHandler.f3080a, new b(this, (DrmSessionEventListener) listenerAndHandler.b, i));
            }
        }

        public final void e(Exception exc) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                Util.L(listenerAndHandler.f3080a, new g(4, this, listenerAndHandler.b, exc));
            }
        }

        public final void f() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                Util.L(listenerAndHandler.f3080a, new c(0, this, listenerAndHandler.b));
            }
        }

        public final void g(DrmSessionEventListener drmSessionEventListener) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                if (listenerAndHandler.b == drmSessionEventListener) {
                    copyOnWriteArrayList.remove(listenerAndHandler);
                }
            }
        }
    }

    default void F(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void Q(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void b0(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
    }

    default void d0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    default void k0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
