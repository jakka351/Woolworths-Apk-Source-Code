package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class MediaSourceList {

    /* renamed from: a, reason: collision with root package name */
    public final PlayerId f3016a;
    public final MediaSourceListInfoRefreshListener e;
    public final AnalyticsCollector h;
    public final HandlerWrapper i;
    public boolean k;
    public TransferListener l;
    public ShuffleOrder j = new ShuffleOrder.DefaultShuffleOrder();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public final MediaSourceHolder d;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.d = mediaSourceHolder;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void F(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new v(2, this, pairA));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void H(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
            final Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new Runnable() { // from class: androidx.media3.exoplayer.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsCollector analyticsCollector = MediaSourceList.this.h;
                        Pair pair = pairA;
                        analyticsCollector.H(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void J(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new u(this, pairA, loadEventInfo, mediaLoadData, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void M(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new s(2, this, pairA, mediaLoadData));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void Q(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new v(0, this, pairA));
            }
        }

        public final Pair a(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdA;
            MediaSourceHolder mediaSourceHolder = this.d;
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= mediaSourceHolder.c.size()) {
                        mediaPeriodIdA = null;
                        break;
                    }
                    if (((MediaSource.MediaPeriodId) mediaSourceHolder.c.get(i2)).d == mediaPeriodId.d) {
                        Object obj = mediaPeriodId.f3130a;
                        Object obj2 = mediaSourceHolder.b;
                        int i3 = AbstractConcatenatedTimeline.d;
                        mediaPeriodIdA = mediaPeriodId.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                }
                if (mediaPeriodIdA == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdA;
            }
            return Pair.create(Integer.valueOf(i + mediaSourceHolder.d), mediaPeriodId2);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void a0(int i, MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final int i2) {
            final Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new Runnable() { // from class: androidx.media3.exoplayer.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsCollector analyticsCollector = MediaSourceList.this.h;
                        Pair pair = pairA;
                        analyticsCollector.a0(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, i2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void b0(int i, MediaSource.MediaPeriodId mediaPeriodId, final int i2) {
            final Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new Runnable() { // from class: androidx.media3.exoplayer.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsCollector analyticsCollector = MediaSourceList.this.h;
                        Pair pair = pairA;
                        analyticsCollector.b0(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second, i2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void d0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new s(1, this, pairA, exc));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void j0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new u(this, pairA, loadEventInfo, mediaLoadData, 1));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public final void k0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            Pair pairA = a(i, mediaPeriodId);
            if (pairA != null) {
                MediaSourceList.this.i.post(new v(1, this, pairA));
            }
        }
    }

    public static final class MediaSourceAndListener {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSource f3017a;
        public final t b;
        public final ForwardingEventListener c;

        public MediaSourceAndListener(MediaSource mediaSource, t tVar, ForwardingEventListener forwardingEventListener) {
            this.f3017a = mediaSource;
            this.b = tVar;
            this.c = forwardingEventListener;
        }
    }

    public static final class MediaSourceHolder implements MediaSourceInfoHolder {

        /* renamed from: a, reason: collision with root package name */
        public final MaskingMediaSource f3018a;
        public int d;
        public boolean e;
        public final ArrayList c = new ArrayList();
        public final Object b = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z) {
            this.f3018a = new MaskingMediaSource(mediaSource, z);
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Object a() {
            return this.b;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Timeline b() {
            return this.f3018a.r;
        }
    }

    public interface MediaSourceListInfoRefreshListener {
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
        this.f3016a = playerId;
        this.e = mediaSourceListInfoRefreshListener;
        this.h = analyticsCollector;
        this.i = handlerWrapper;
    }

    public final Timeline a(int i, ArrayList arrayList, ShuffleOrder shuffleOrder) {
        if (!arrayList.isEmpty()) {
            this.j = shuffleOrder;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.b;
                if (i2 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = (MediaSourceHolder) arrayList2.get(i2 - 1);
                    mediaSourceHolder.d = mediaSourceHolder2.f3018a.r.b.o() + mediaSourceHolder2.d;
                    mediaSourceHolder.e = false;
                    mediaSourceHolder.c.clear();
                } else {
                    mediaSourceHolder.d = 0;
                    mediaSourceHolder.e = false;
                    mediaSourceHolder.c.clear();
                }
                int iO = mediaSourceHolder.f3018a.r.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((MediaSourceHolder) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, mediaSourceHolder);
                this.d.put(mediaSourceHolder.b, mediaSourceHolder);
                if (this.k) {
                    e(mediaSourceHolder);
                    if (this.c.isEmpty()) {
                        this.g.add(mediaSourceHolder);
                    } else {
                        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.get(mediaSourceHolder);
                        if (mediaSourceAndListener != null) {
                            mediaSourceAndListener.f3017a.N(mediaSourceAndListener.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final Timeline b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Timeline.f2876a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i);
            mediaSourceHolder.d = iO;
            iO += mediaSourceHolder.f3018a.r.b.o();
        }
        return new PlaylistTimeline(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) it.next();
            if (mediaSourceHolder.c.isEmpty()) {
                MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.get(mediaSourceHolder);
                if (mediaSourceAndListener != null) {
                    mediaSourceAndListener.f3017a.N(mediaSourceAndListener.b);
                }
                it.remove();
            }
        }
    }

    public final void d(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.e && mediaSourceHolder.c.isEmpty()) {
            MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f.remove(mediaSourceHolder);
            mediaSourceAndListener.getClass();
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.c;
            MediaSource mediaSource = mediaSourceAndListener.f3017a;
            mediaSource.u(mediaSourceAndListener.b);
            mediaSource.D(forwardingEventListener);
            mediaSource.G(forwardingEventListener);
            this.g.remove(mediaSourceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller, androidx.media3.exoplayer.t] */
    public final void e(MediaSourceHolder mediaSourceHolder) {
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.f3018a;
        ?? r1 = new MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.t
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void C(BaseMediaSource baseMediaSource, Timeline timeline) {
                HandlerWrapper handlerWrapper = ((ExoPlayerImplInternal) this.d.e).k;
                handlerWrapper.k(2);
                handlerWrapper.j(22);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        this.f.put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, r1, forwardingEventListener));
        int i = Util.f2928a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        maskingMediaSource.a(new Handler(looperMyLooper, null), forwardingEventListener);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        maskingMediaSource.g.a(new Handler(looperMyLooper2, null), forwardingEventListener);
        maskingMediaSource.I(r1, this.l, this.f3016a);
    }

    public final void f(MediaPeriod mediaPeriod) {
        IdentityHashMap identityHashMap = this.c;
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) identityHashMap.remove(mediaPeriod);
        mediaSourceHolder.getClass();
        mediaSourceHolder.f3018a.t(mediaPeriod);
        mediaSourceHolder.c.remove(((MaskingMediaPeriod) mediaPeriod).d);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(mediaSourceHolder);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.remove(i3);
            this.d.remove(mediaSourceHolder.b);
            int i4 = -mediaSourceHolder.f3018a.r.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((MediaSourceHolder) arrayList.get(i5)).d += i4;
            }
            mediaSourceHolder.e = true;
            if (this.k) {
                d(mediaSourceHolder);
            }
        }
    }
}
