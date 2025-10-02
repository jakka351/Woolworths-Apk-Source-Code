package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.HttpMediaDrmCallback;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.SeekMap;

@UnstableApi
/* loaded from: classes2.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public final DataSource.Factory k;
    public final ProgressiveMediaExtractor.Factory l;
    public final DrmSessionManager m;
    public final LoadErrorHandlingPolicy n;
    public final int o;
    public final Format p;
    public boolean q = true;
    public long r = -9223372036854775807L;
    public boolean s;
    public boolean t;
    public TransferListener u;
    public MediaItem v;

    /* renamed from: androidx.media3.exoplayer.source.ProgressiveMediaSource$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            super.f(i, period, z);
            period.f = true;
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            super.m(i, window, j);
            window.j = true;
            return window;
        }
    }

    public static final class Factory implements MediaSourceFactory {
        public static final /* synthetic */ int i = 0;
        public final DataSource.Factory c;
        public final k d;
        public final DefaultDrmSessionManagerProvider e;
        public final DefaultLoadErrorHandlingPolicy f;
        public final int g;
        public Format h;

        public Factory(DataSource.Factory factory) {
            this(factory, new DefaultExtractorsFactory());
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final ProgressiveMediaSource b(MediaItem mediaItem) {
            mediaItem.b.getClass();
            DataSource.Factory factory = this.c;
            k kVar = this.d;
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = this.e;
            defaultDrmSessionManagerProvider.getClass();
            mediaItem.b.getClass();
            MediaItem.DrmConfiguration drmConfiguration = mediaItem.b.c;
            if (drmConfiguration == null) {
                return new ProgressiveMediaSource(mediaItem, factory, kVar, DrmSessionManager.f3081a, this.f, this.g, this.h);
            }
            synchronized (defaultDrmSessionManagerProvider.f3078a) {
                try {
                    if (drmConfiguration.equals(defaultDrmSessionManagerProvider.b)) {
                        throw null;
                    }
                    defaultDrmSessionManagerProvider.b = drmConfiguration;
                    DefaultHttpDataSource.Factory factory2 = new DefaultHttpDataSource.Factory();
                    drmConfiguration.getClass();
                    new HttpMediaDrmCallback(null, factory2);
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.k] */
        public Factory(DataSource.Factory factory, final ExtractorsFactory extractorsFactory) {
            ?? r0 = new ProgressiveMediaExtractor.Factory() { // from class: androidx.media3.exoplayer.source.k
                @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
                public final ProgressiveMediaExtractor a(PlayerId playerId) {
                    int i2 = ProgressiveMediaSource.Factory.i;
                    return new BundledExtractorsAdapter(extractorsFactory);
                }
            };
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.c = factory;
            this.d = r0;
            this.e = defaultDrmSessionManagerProvider;
            this.f = defaultLoadErrorHandlingPolicy;
            this.g = 1048576;
        }
    }

    public interface Listener {
    }

    public ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory factory, k kVar, DrmSessionManager drmSessionManager, DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy, int i, Format format) {
        this.v = mediaItem;
        this.k = factory;
        this.l = kVar;
        this.m = drmSessionManager;
        this.n = defaultLoadErrorHandlingPolicy;
        this.o = i;
        this.p = format;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSource dataSourceA = this.k.a();
        TransferListener transferListener = this.u;
        if (transferListener != null) {
            dataSourceA.g(transferListener);
        }
        MediaItem.LocalConfiguration localConfiguration = o().b;
        localConfiguration.getClass();
        Uri uri = localConfiguration.f2863a;
        PlayerId playerId = this.j;
        Assertions.g(playerId);
        return new ProgressiveMediaPeriod(uri, dataSourceA, this.l.a(playerId), this.m, new DrmSessionEventListener.EventDispatcher(this.g.c, 0, mediaPeriodId), this.n, new MediaSourceEventListener.EventDispatcher(this.f.c, 0, mediaPeriodId), this, allocator, localConfiguration.e, this.o, this.p, Util.I(localConfiguration.g), null);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void L(MediaItem mediaItem) {
        this.v = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        this.u = transferListener;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        PlayerId playerId = this.j;
        Assertions.g(playerId);
        DrmSessionManager drmSessionManager = this.m;
        drmSessionManager.b(looperMyLooper, playerId);
        drmSessionManager.p();
        Y();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        this.m.release();
    }

    public final void Y() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.r, this.s, this.t, o());
        if (this.q) {
            singlePeriodTimeline = new AnonymousClass1(singlePeriodTimeline);
        }
        W(singlePeriodTimeline);
    }

    public final void Z(long j, SeekMap seekMap, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.r;
        }
        boolean zD = seekMap.d();
        if (!this.q && this.r == j && this.s == zD && this.t == z) {
            return;
        }
        this.r = j;
        this.s = zD;
        this.t = z;
        this.q = false;
        Y();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem o() {
        return this.v;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) mediaPeriod;
        if (progressiveMediaPeriod.A) {
            for (SampleQueue sampleQueue : progressiveMediaPeriod.x) {
                sampleQueue.i();
                DrmSession drmSession = sampleQueue.h;
                if (drmSession != null) {
                    drmSession.e(sampleQueue.e);
                    sampleQueue.h = null;
                    sampleQueue.g = null;
                }
            }
        }
        progressiveMediaPeriod.p.d(progressiveMediaPeriod);
        progressiveMediaPeriod.u.removeCallbacksAndMessages(null);
        progressiveMediaPeriod.v = null;
        progressiveMediaPeriod.S = true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void z() {
    }
}
