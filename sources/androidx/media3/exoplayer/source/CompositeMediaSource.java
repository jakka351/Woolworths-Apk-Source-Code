package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    public final HashMap k = new HashMap();
    public Handler l;
    public TransferListener m;

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public final Object d;
        public MediaSourceEventListener.EventDispatcher e;
        public DrmSessionEventListener.EventDispatcher f;

        public ForwardingEventListener(Object obj) {
            this.e = new MediaSourceEventListener.EventDispatcher(CompositeMediaSource.this.f.c, 0, null);
            this.f = new DrmSessionEventListener.EventDispatcher(CompositeMediaSource.this.g.c, 0, null);
            this.d = obj;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void F(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (a(i, mediaPeriodId)) {
                this.f.b();
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void H(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.e;
                MediaLoadData mediaLoadDataO = o(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.a(new h(eventDispatcher, loadEventInfo, mediaLoadDataO, iOException, z));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void J(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.e;
                MediaLoadData mediaLoadDataO = o(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.a(new g(eventDispatcher, loadEventInfo, mediaLoadDataO, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void M(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.e;
                MediaLoadData mediaLoadDataO = o(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.a(new c(eventDispatcher, mediaLoadDataO));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void Q(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (a(i, mediaPeriodId)) {
                this.f.f();
            }
        }

        public final boolean a(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdY;
            Object obj = this.d;
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            if (mediaPeriodId != null) {
                mediaPeriodIdY = compositeMediaSource.Y(obj, mediaPeriodId);
                if (mediaPeriodIdY == null) {
                    return false;
                }
            } else {
                mediaPeriodIdY = null;
            }
            int iC0 = compositeMediaSource.c0(i, obj);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.e;
            if (eventDispatcher.f3131a != iC0 || !Objects.equals(eventDispatcher.b, mediaPeriodIdY)) {
                this.e = new MediaSourceEventListener.EventDispatcher(compositeMediaSource.f.c, iC0, mediaPeriodIdY);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.f;
            if (eventDispatcher2.f3079a == iC0 && Objects.equals(eventDispatcher2.b, mediaPeriodIdY)) {
                return true;
            }
            this.f = new DrmSessionEventListener.EventDispatcher(compositeMediaSource.g.c, iC0, mediaPeriodIdY);
            return true;
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void a0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
            if (a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.e;
                MediaLoadData mediaLoadDataO = o(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.a(new androidx.media3.exoplayer.analytics.l(eventDispatcher, loadEventInfo, mediaLoadDataO, i2));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void b0(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
            if (a(i, mediaPeriodId)) {
                this.f.d(i2);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void d0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (a(i, mediaPeriodId)) {
                this.f.e(exc);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void j0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.e;
                MediaLoadData mediaLoadDataO = o(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.a(new g(eventDispatcher, loadEventInfo, mediaLoadDataO, 0));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void k0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (a(i, mediaPeriodId)) {
                this.f.c();
            }
        }

        public final MediaLoadData o(MediaLoadData mediaLoadData, MediaSource.MediaPeriodId mediaPeriodId) {
            long j = mediaLoadData.e;
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            Object obj = this.d;
            long jZ = compositeMediaSource.Z(obj, j, mediaPeriodId);
            long j2 = mediaLoadData.f;
            long jZ2 = compositeMediaSource.Z(obj, j2, mediaPeriodId);
            return (jZ == j && jZ2 == j2) ? mediaLoadData : new MediaLoadData(mediaLoadData.f3126a, mediaLoadData.b, mediaLoadData.c, mediaLoadData.d, jZ, jZ2);
        }
    }

    public static final class MediaSourceAndListener<T> {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSource f3121a;
        public final a b;
        public final ForwardingEventListener c;

        public MediaSourceAndListener(MediaSource mediaSource, a aVar, ForwardingEventListener forwardingEventListener) {
            this.f3121a = mediaSource;
            this.b = aVar;
            this.c = forwardingEventListener;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void P() {
        for (MediaSourceAndListener mediaSourceAndListener : this.k.values()) {
            mediaSourceAndListener.f3121a.N(mediaSourceAndListener.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void S() {
        for (MediaSourceAndListener mediaSourceAndListener : this.k.values()) {
            mediaSourceAndListener.f3121a.K(mediaSourceAndListener.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void U(TransferListener transferListener) {
        this.m = transferListener;
        this.l = Util.m(null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void X() {
        HashMap map = this.k;
        for (MediaSourceAndListener mediaSourceAndListener : map.values()) {
            MediaSource mediaSource = mediaSourceAndListener.f3121a;
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.c;
            mediaSource.u(mediaSourceAndListener.b);
            mediaSource.D(forwardingEventListener);
            mediaSource.G(forwardingEventListener);
        }
        map.clear();
    }

    public MediaSource.MediaPeriodId Y(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long Z(Object obj, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }

    public int c0(int i, Object obj) {
        return i;
    }

    public abstract void f0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller, androidx.media3.exoplayer.source.a] */
    public final void g0(final Object obj, MediaSource mediaSource) {
        HashMap map = this.k;
        Assertions.b(!map.containsKey(obj));
        ?? r1 = new MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.source.a
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void C(BaseMediaSource baseMediaSource, Timeline timeline) {
                this.d.f0(obj, baseMediaSource, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(obj);
        map.put(obj, new MediaSourceAndListener(mediaSource, r1, forwardingEventListener));
        Handler handler = this.l;
        handler.getClass();
        mediaSource.a(handler, forwardingEventListener);
        Handler handler2 = this.l;
        handler2.getClass();
        mediaSource.q(handler2, forwardingEventListener);
        TransferListener transferListener = this.m;
        PlayerId playerId = this.j;
        Assertions.g(playerId);
        mediaSource.I(r1, transferListener, playerId);
        if (this.e.isEmpty()) {
            mediaSource.N(r1);
        }
    }

    public final void h0(MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.k.remove(mediaPeriodId);
        mediaSourceAndListener.getClass();
        MediaSource mediaSource = mediaSourceAndListener.f3121a;
        mediaSource.u(mediaSourceAndListener.b);
        ForwardingEventListener forwardingEventListener = mediaSourceAndListener.c;
        mediaSource.D(forwardingEventListener);
        mediaSource.G(forwardingEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void z() {
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            ((MediaSourceAndListener) it.next()).f3121a.z();
        }
    }
}
