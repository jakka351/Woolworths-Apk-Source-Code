package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.IcyDataSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    public static final Map T;
    public static final Format U;
    public boolean A;
    public boolean B;
    public boolean C;
    public TrackState D;
    public SeekMap E;
    public long F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public long N;
    public long O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public final Uri d;
    public final DataSource e;
    public final DrmSessionManager f;
    public final LoadErrorHandlingPolicy g;
    public final MediaSourceEventListener.EventDispatcher h;
    public final DrmSessionEventListener.EventDispatcher i;
    public final ProgressiveMediaSource j;
    public final Allocator k;
    public final String l;
    public final long m;
    public final Format n;
    public final long o;
    public final Loader p;
    public final ProgressiveMediaExtractor q;
    public final ConditionVariable r;
    public final i s;
    public final i t;
    public final Handler u;
    public MediaPeriod.Callback v;
    public IcyHeaders w;
    public SampleQueue[] x;
    public TrackId[] y;
    public boolean z;

    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        public final Uri b;
        public final StatsDataSource c;
        public final ProgressiveMediaExtractor d;
        public final ExtractorOutput e;
        public final ConditionVariable f;
        public volatile boolean h;
        public long j;
        public TrackOutput l;
        public boolean m;
        public final PositionHolder g = new PositionHolder();
        public boolean i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f3135a = LoadEventInfo.b.getAndIncrement();
        public DataSpec k = c(0);

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.b = uri;
            this.c = new StatsDataSource(dataSource);
            this.d = progressiveMediaExtractor;
            this.e = extractorOutput;
            this.f = conditionVariable;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void a() {
            DataSource icyDataSource;
            int i;
            int iE = 0;
            while (iE == 0 && !this.h) {
                try {
                    long j = this.g.f3248a;
                    DataSpec dataSpecC = c(j);
                    this.k = dataSpecC;
                    long jA = this.c.a(dataSpecC);
                    if (this.h) {
                        if (iE != 1 && this.d.b() != -1) {
                            this.g.f3248a = this.d.b();
                        }
                        DataSourceUtil.a(this.c);
                        return;
                    }
                    if (jA != -1) {
                        jA += j;
                        ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                        progressiveMediaPeriod.u.post(new i(progressiveMediaPeriod, 0));
                    }
                    long j2 = jA;
                    ProgressiveMediaPeriod.this.w = IcyHeaders.d(this.c.f2970a.d());
                    StatsDataSource statsDataSource = this.c;
                    IcyHeaders icyHeaders = ProgressiveMediaPeriod.this.w;
                    if (icyHeaders == null || (i = icyHeaders.f) == -1) {
                        icyDataSource = statsDataSource;
                    } else {
                        icyDataSource = new IcyDataSource(statsDataSource, i, this);
                        TrackOutput trackOutputC = ProgressiveMediaPeriod.this.C(new TrackId(0, true));
                        this.l = trackOutputC;
                        trackOutputC.e(ProgressiveMediaPeriod.U);
                    }
                    this.d.c(icyDataSource, this.b, this.c.f2970a.d(), j, j2, this.e);
                    if (ProgressiveMediaPeriod.this.w != null) {
                        this.d.d();
                    }
                    if (this.i) {
                        this.d.a(j, this.j);
                        this.i = false;
                    }
                    while (iE == 0 && !this.h) {
                        try {
                            this.f.a();
                            iE = this.d.e(this.g);
                            long jB = this.d.b();
                            if (jB > ProgressiveMediaPeriod.this.m + j) {
                                this.f.d();
                                ProgressiveMediaPeriod progressiveMediaPeriod2 = ProgressiveMediaPeriod.this;
                                progressiveMediaPeriod2.u.post(progressiveMediaPeriod2.t);
                                j = jB;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iE == 1) {
                        iE = 0;
                    } else if (this.d.b() != -1) {
                        this.g.f3248a = this.d.b();
                    }
                    DataSourceUtil.a(this.c);
                } catch (Throwable th) {
                    if (iE != 1 && this.d.b() != -1) {
                        this.g.f3248a = this.d.b();
                    }
                    DataSourceUtil.a(this.c);
                    throw th;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void b() {
            this.h = true;
        }

        public final DataSpec c(long j) {
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.f2958a = this.b;
            builder.f = j;
            builder.h = ProgressiveMediaPeriod.this.l;
            builder.i = 6;
            builder.e = ProgressiveMediaPeriod.T;
            return builder.a();
        }
    }

    public interface Listener {
    }

    public final class SampleStreamImpl implements SampleStream {
        public final int d;

        public SampleStreamImpl(int i) {
            this.d = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            int i2;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i3 = this.d;
            if (progressiveMediaPeriod.F()) {
                return -3;
            }
            progressiveMediaPeriod.A(i3);
            SampleQueue sampleQueue = progressiveMediaPeriod.x[i3];
            boolean z = progressiveMediaPeriod.R;
            sampleQueue.getClass();
            boolean z2 = (i & 2) != 0;
            SampleQueue.SampleExtrasHolder sampleExtrasHolder = sampleQueue.b;
            synchronized (sampleQueue) {
                decoderInputBuffer.h = false;
                int i4 = sampleQueue.s;
                if (i4 != sampleQueue.p) {
                    Format format = ((SampleQueue.SharedSampleMetadata) sampleQueue.c.a(sampleQueue.q + i4)).f3142a;
                    if (!z2 && format == sampleQueue.g) {
                        int iL = sampleQueue.l(sampleQueue.s);
                        if (sampleQueue.o(iL)) {
                            decoderInputBuffer.d = sampleQueue.m[iL];
                            if (sampleQueue.s == sampleQueue.p - 1 && (z || sampleQueue.w)) {
                                decoderInputBuffer.e(536870912);
                            }
                            decoderInputBuffer.i = sampleQueue.n[iL];
                            sampleExtrasHolder.f3141a = sampleQueue.l[iL];
                            sampleExtrasHolder.b = sampleQueue.k[iL];
                            sampleExtrasHolder.c = sampleQueue.o[iL];
                            i2 = -4;
                        } else {
                            decoderInputBuffer.h = true;
                            i2 = -3;
                        }
                    }
                    sampleQueue.p(format, formatHolder);
                    i2 = -5;
                } else {
                    if (!z && !sampleQueue.w) {
                        Format format2 = sampleQueue.B;
                        if (format2 == null || (!z2 && format2 == sampleQueue.g)) {
                            i2 = -3;
                        } else {
                            sampleQueue.p(format2, formatHolder);
                            i2 = -5;
                        }
                    }
                    decoderInputBuffer.d = 4;
                    decoderInputBuffer.i = Long.MIN_VALUE;
                    i2 = -4;
                }
            }
            if (i2 == -4 && !decoderInputBuffer.f(4)) {
                boolean z3 = (i & 1) != 0;
                if ((i & 4) == 0) {
                    if (z3) {
                        SampleDataQueue sampleDataQueue = sampleQueue.f3140a;
                        SampleDataQueue.e(sampleDataQueue.e, decoderInputBuffer, sampleQueue.b, sampleDataQueue.c);
                    } else {
                        SampleDataQueue sampleDataQueue2 = sampleQueue.f3140a;
                        sampleDataQueue2.e = SampleDataQueue.e(sampleDataQueue2.e, decoderInputBuffer, sampleQueue.b, sampleDataQueue2.c);
                    }
                }
                if (!z3) {
                    sampleQueue.s++;
                }
            }
            if (i2 == -3) {
                progressiveMediaPeriod.B(i3);
            }
            return i2;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            return !progressiveMediaPeriod.F() && progressiveMediaPeriod.x[this.d].n(progressiveMediaPeriod.R);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void j() throws IOException {
            int i = this.d;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            SampleQueue sampleQueue = progressiveMediaPeriod.x[i];
            DrmSession drmSession = sampleQueue.h;
            if (drmSession == null || drmSession.getState() != 1) {
                progressiveMediaPeriod.p.c(progressiveMediaPeriod.g.b(progressiveMediaPeriod.H));
            } else {
                DrmSession.DrmSessionException drmSessionExceptionC = sampleQueue.h.c();
                drmSessionExceptionC.getClass();
                throw drmSessionExceptionC;
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            int iJ;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i = this.d;
            boolean z = false;
            if (progressiveMediaPeriod.F()) {
                return 0;
            }
            progressiveMediaPeriod.A(i);
            SampleQueue sampleQueue = progressiveMediaPeriod.x[i];
            boolean z2 = progressiveMediaPeriod.R;
            synchronized (sampleQueue) {
                int iL = sampleQueue.l(sampleQueue.s);
                int i2 = sampleQueue.s;
                int i3 = sampleQueue.p;
                if (i2 != i3 && j >= sampleQueue.n[iL]) {
                    if (j <= sampleQueue.v || !z2) {
                        iJ = sampleQueue.j(iL, i3 - i2, j, true);
                        if (iJ == -1) {
                        }
                    } else {
                        iJ = i3 - i2;
                    }
                }
                iJ = 0;
            }
            synchronized (sampleQueue) {
                if (iJ >= 0) {
                    try {
                        if (sampleQueue.s + iJ <= sampleQueue.p) {
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Assertions.b(z);
                sampleQueue.s += iJ;
            }
            if (iJ == 0) {
                progressiveMediaPeriod.B(i);
            }
            return iJ;
        }
    }

    public static final class TrackId {

        /* renamed from: a, reason: collision with root package name */
        public final int f3136a;
        public final boolean b;

        public TrackId(int i, boolean z) {
            this.f3136a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackId.class != obj.getClass()) {
                return false;
            }
            TrackId trackId = (TrackId) obj;
            return this.f3136a == trackId.f3136a && this.b == trackId.b;
        }

        public final int hashCode() {
            return (this.f3136a * 31) + (this.b ? 1 : 0);
        }
    }

    public static final class TrackState {

        /* renamed from: a, reason: collision with root package name */
        public final TrackGroupArray f3137a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f3137a = trackGroupArray;
            this.b = zArr;
            int i = trackGroupArray.f3148a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        T = Collections.unmodifiableMap(map);
        Format.Builder builder = new Format.Builder();
        builder.f2855a = "icy";
        builder.m = MimeTypes.m("application/x-icy");
        U = new Format(builder);
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, ProgressiveMediaSource progressiveMediaSource, Allocator allocator, String str, int i, Format format, long j, ReleasableExecutor releasableExecutor) {
        this.d = uri;
        this.e = dataSource;
        this.f = drmSessionManager;
        this.i = eventDispatcher;
        this.g = loadErrorHandlingPolicy;
        this.h = eventDispatcher2;
        this.j = progressiveMediaSource;
        this.k = allocator;
        this.l = str;
        this.m = i;
        this.n = format;
        this.p = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader("ProgressiveMediaPeriod");
        this.q = progressiveMediaExtractor;
        this.o = j;
        this.r = new ConditionVariable();
        this.s = new i(this, 1);
        this.t = new i(this, 2);
        this.u = Util.m(null);
        this.y = new TrackId[0];
        this.x = new SampleQueue[0];
        this.O = -9223372036854775807L;
        this.H = 1;
    }

    public final void A(int i) {
        v();
        TrackState trackState = this.D;
        boolean[] zArr = trackState.d;
        if (zArr[i]) {
            return;
        }
        Format format = trackState.f3137a.a(i).d[0];
        MediaLoadData mediaLoadData = new MediaLoadData(1, MimeTypes.h(format.n), format, 0, Util.U(this.N), -9223372036854775807L);
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new c(eventDispatcher, mediaLoadData));
        zArr[i] = true;
    }

    public final void B(int i) {
        v();
        if (this.P) {
            if ((!this.B || this.D.b[i]) && !this.x[i].n(false)) {
                this.O = 0L;
                this.P = false;
                this.J = true;
                this.N = 0L;
                this.Q = 0;
                for (SampleQueue sampleQueue : this.x) {
                    sampleQueue.q(false);
                }
                MediaPeriod.Callback callback = this.v;
                callback.getClass();
                callback.g(this);
            }
        }
    }

    public final TrackOutput C(TrackId trackId) {
        int length = this.x.length;
        for (int i = 0; i < length; i++) {
            if (trackId.equals(this.y[i])) {
                return this.x[i];
            }
        }
        if (this.z) {
            Log.g("ProgressiveMediaPeriod", "Extractor added new track (id=" + trackId.f3136a + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        DrmSessionManager drmSessionManager = this.f;
        drmSessionManager.getClass();
        SampleQueue sampleQueue = new SampleQueue(this.k, drmSessionManager, this.i);
        sampleQueue.f = this;
        int i2 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.y, i2);
        trackIdArr[length] = trackId;
        int i3 = Util.f2928a;
        this.y = trackIdArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.x, i2);
        sampleQueueArr[length] = sampleQueue;
        this.x = sampleQueueArr;
        return sampleQueue;
    }

    public final void D(SeekMap seekMap) {
        this.E = this.w == null ? seekMap : new SeekMap.Unseekable(-9223372036854775807L);
        this.F = seekMap.l();
        boolean z = !this.M && seekMap.l() == -9223372036854775807L;
        this.G = z;
        this.H = z ? 7 : 1;
        if (this.A) {
            this.j.Z(this.F, seekMap, z);
        } else {
            z();
        }
    }

    public final void E() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.d, this.e, this.q, this, this.r);
        if (this.A) {
            Assertions.f(y());
            long j = this.F;
            if (j != -9223372036854775807L && this.O > j) {
                this.R = true;
                this.O = -9223372036854775807L;
                return;
            }
            SeekMap seekMap = this.E;
            seekMap.getClass();
            long j2 = seekMap.b(this.O).f3249a.b;
            long j3 = this.O;
            extractingLoadable.g.f3248a = j2;
            extractingLoadable.j = j3;
            extractingLoadable.i = true;
            extractingLoadable.m = false;
            for (SampleQueue sampleQueue : this.x) {
                sampleQueue.t = this.O;
            }
            this.O = -9223372036854775807L;
        }
        this.Q = w();
        this.p.e(extractingLoadable, this, this.g.b(this.H));
    }

    public final boolean F() {
        return this.J || y();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final Loader.LoadErrorAction a(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
        Loader.LoadErrorAction loadErrorAction;
        SeekMap seekMap;
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        StatsDataSource statsDataSource = extractingLoadable.c;
        long j3 = extractingLoadable.f3135a;
        Uri uri = statsDataSource.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j3, statsDataSource.d);
        Util.U(extractingLoadable.j);
        Util.U(this.F);
        long jA = this.g.a(new LoadErrorHandlingPolicy.LoadErrorInfo(iOException, i));
        if (jA == -9223372036854775807L) {
            loadErrorAction = Loader.e;
        } else {
            int iW = w();
            int i2 = iW > this.Q ? 1 : 0;
            if (this.M || !((seekMap = this.E) == null || seekMap.l() == -9223372036854775807L)) {
                this.Q = iW;
            } else if (!this.A || F()) {
                this.J = this.A;
                this.N = 0L;
                this.Q = 0;
                for (SampleQueue sampleQueue : this.x) {
                    sampleQueue.q(false);
                }
                extractingLoadable.g.f3248a = 0L;
                extractingLoadable.j = 0L;
                extractingLoadable.i = true;
                extractingLoadable.m = false;
            } else {
                this.P = true;
                loadErrorAction = Loader.d;
            }
            loadErrorAction = new Loader.LoadErrorAction(i2, jA);
        }
        int i3 = loadErrorAction.f3183a;
        boolean z = i3 == 0 || i3 == 1;
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, null, 0, Util.U(extractingLoadable.j), Util.U(this.F));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new h(eventDispatcher, loadEventInfo, mediaLoadData, iOException, !z));
        return loadErrorAction;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        boolean z;
        if (!this.p.b()) {
            return false;
        }
        ConditionVariable conditionVariable = this.r;
        synchronized (conditionVariable) {
            z = conditionVariable.f2909a;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[RETURN] */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r18, androidx.media3.exoplayer.SeekParameters r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r0.v()
            androidx.media3.extractor.SeekMap r4 = r0.E
            boolean r4 = r4.d()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            androidx.media3.extractor.SeekMap r4 = r0.E
            androidx.media3.extractor.SeekMap$SeekPoints r4 = r4.b(r1)
            androidx.media3.extractor.SeekPoint r7 = r4.f3249a
            long r7 = r7.f3251a
            androidx.media3.extractor.SeekPoint r4 = r4.b
            long r9 = r4.f3251a
            long r11 = r3.b
            long r3 = r3.f3025a
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L2f
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 != 0) goto L2f
            return r1
        L2f:
            int r13 = androidx.media3.common.util.Util.f2928a
            long r13 = r1 - r3
            long r3 = r3 ^ r1
            long r15 = r1 ^ r13
            long r3 = r3 & r15
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L3d
            r13 = -9223372036854775808
        L3d:
            long r3 = r1 + r11
            long r15 = r1 ^ r3
            long r11 = r11 ^ r3
            long r11 = r11 & r15
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4c:
            int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            r6 = 0
            r11 = 1
            if (r5 > 0) goto L58
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 > 0) goto L58
            r5 = r11
            goto L59
        L58:
            r5 = r6
        L59:
            int r12 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r12 > 0) goto L62
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 > 0) goto L62
            r6 = r11
        L62:
            if (r5 == 0) goto L77
            if (r6 == 0) goto L77
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            goto L79
        L77:
            if (r5 == 0) goto L7a
        L79:
            return r7
        L7a:
            if (r6 == 0) goto L7d
        L7c:
            return r9
        L7d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.c(long, androidx.media3.exoplayer.SeekParameters):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0092  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(long r12) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.d(long):long");
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        if (this.K) {
            this.K = false;
            return this.N;
        }
        if (!this.J) {
            return -9223372036854775807L;
        }
        if (!this.R && w() <= this.Q) {
            return -9223372036854775807L;
        }
        this.J = false;
        return this.N;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public final void f() {
        for (SampleQueue sampleQueue : this.x) {
            sampleQueue.q(true);
            DrmSession drmSession = sampleQueue.h;
            if (drmSession != null) {
                drmSession.e(sampleQueue.e);
                sampleQueue.h = null;
                sampleQueue.g = null;
            }
        }
        this.q.release();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void g(Loader.Loadable loadable, long j, long j2, int i) {
        LoadEventInfo loadEventInfo;
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        StatsDataSource statsDataSource = extractingLoadable.c;
        long j3 = extractingLoadable.f3135a;
        if (i == 0) {
            loadEventInfo = new LoadEventInfo(j3, extractingLoadable.k);
        } else {
            Uri uri = statsDataSource.c;
            loadEventInfo = new LoadEventInfo(j3, statsDataSource.d);
        }
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, null, 0, Util.U(extractingLoadable.j), Util.U(this.F));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new androidx.media3.exoplayer.analytics.l(eventDispatcher, loadEventInfo, mediaLoadData, i));
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void h() {
        this.z = true;
        this.u.post(this.s);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray i() {
        v();
        return this.D.f3137a;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput j(int i, int i2) {
        return C(new TrackId(i, false));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        long jX;
        boolean z;
        long j;
        v();
        if (this.R || this.L == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.O;
        }
        if (this.B) {
            int length = this.x.length;
            jX = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                TrackState trackState = this.D;
                if (trackState.b[i] && trackState.c[i]) {
                    SampleQueue sampleQueue = this.x[i];
                    synchronized (sampleQueue) {
                        z = sampleQueue.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        SampleQueue sampleQueue2 = this.x[i];
                        synchronized (sampleQueue2) {
                            j = sampleQueue2.v;
                        }
                        jX = Math.min(jX, j);
                    }
                }
            }
        } else {
            jX = Long.MAX_VALUE;
        }
        if (jX == Long.MAX_VALUE) {
            jX = x(false);
        }
        return jX == Long.MIN_VALUE ? this.N : jX;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void m(Loader.Loadable loadable, long j, long j2, boolean z) {
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        StatsDataSource statsDataSource = extractingLoadable.c;
        long j3 = extractingLoadable.f3135a;
        Uri uri = statsDataSource.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j3, statsDataSource.d);
        this.g.getClass();
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, null, 0, Util.U(extractingLoadable.j), Util.U(this.F));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new g(eventDispatcher, loadEventInfo, mediaLoadData, 1));
        if (z) {
            return;
        }
        for (SampleQueue sampleQueue : this.x) {
            sampleQueue.q(false);
        }
        if (this.L > 0) {
            MediaPeriod.Callback callback = this.v;
            callback.getClass();
            callback.g(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        if (this.R) {
            return false;
        }
        Loader loader = this.p;
        if (loader.c != null || this.P) {
            return false;
        }
        if ((this.A || this.n != null) && this.L == 0) {
            return false;
        }
        boolean zE = this.r.e();
        if (loader.b()) {
            return zE;
        }
        E();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        return k();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        ExoTrackSelection exoTrackSelection;
        v();
        TrackState trackState = this.D;
        TrackGroupArray trackGroupArray = trackState.f3137a;
        boolean[] zArr3 = trackState.c;
        int i = this.L;
        int i2 = 0;
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            SampleStream sampleStream = sampleStreamArr[i3];
            if (sampleStream != null && (exoTrackSelectionArr[i3] == null || !zArr[i3])) {
                int i4 = ((SampleStreamImpl) sampleStream).d;
                Assertions.f(zArr3[i4]);
                this.L--;
                zArr3[i4] = false;
                sampleStreamArr[i3] = null;
            }
        }
        boolean z = !this.I ? j == 0 || this.C : i != 0;
        for (int i5 = 0; i5 < exoTrackSelectionArr.length; i5++) {
            if (sampleStreamArr[i5] == null && (exoTrackSelection = exoTrackSelectionArr[i5]) != null) {
                Assertions.f(exoTrackSelection.length() == 1);
                Assertions.f(exoTrackSelection.b(0) == 0);
                int iIndexOf = trackGroupArray.b.indexOf(exoTrackSelection.e());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                Assertions.f(!zArr3[iIndexOf]);
                this.L++;
                zArr3[iIndexOf] = true;
                this.K = exoTrackSelection.g().t | this.K;
                sampleStreamArr[i5] = new SampleStreamImpl(iIndexOf);
                zArr2[i5] = true;
                if (!z) {
                    SampleQueue sampleQueue = this.x[iIndexOf];
                    z = (sampleQueue.q + sampleQueue.s == 0 || sampleQueue.r(j, true)) ? false : true;
                }
            }
        }
        if (this.L == 0) {
            this.P = false;
            this.J = false;
            this.K = false;
            Loader loader = this.p;
            if (loader.b()) {
                SampleQueue[] sampleQueueArr = this.x;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].i();
                    i2++;
                }
                loader.a();
            } else {
                this.R = false;
                for (SampleQueue sampleQueue2 : this.x) {
                    sampleQueue2.q(false);
                }
            }
        } else if (z) {
            j = d(j);
            while (i2 < sampleStreamArr.length) {
                if (sampleStreamArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.I = true;
        return j;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void q(SeekMap seekMap) {
        this.u.post(new j(0, this, seekMap));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() throws IOException {
        this.p.c(this.g.b(this.H));
        if (this.R && !this.A) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        this.v = callback;
        Format format = this.n;
        if (format == null) {
            this.r.e();
            E();
        } else {
            j(0, 3).e(format);
            D(new IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
            h();
            this.O = j;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void t(Loader.Loadable loadable, long j, long j2) {
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        if (this.F == -9223372036854775807L && this.E != null) {
            long jX = x(true);
            long j3 = jX == Long.MIN_VALUE ? 0L : jX + 10000;
            this.F = j3;
            this.j.Z(j3, this.E, this.G);
        }
        StatsDataSource statsDataSource = extractingLoadable.c;
        long j4 = extractingLoadable.f3135a;
        Uri uri = statsDataSource.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, statsDataSource.d);
        this.g.getClass();
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, null, 0, Util.U(extractingLoadable.j), Util.U(this.F));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new g(eventDispatcher, loadEventInfo, mediaLoadData, 0));
        this.R = true;
        MediaPeriod.Callback callback = this.v;
        callback.getClass();
        callback.g(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
        long jH;
        int i;
        if (this.C) {
            return;
        }
        v();
        if (y()) {
            return;
        }
        boolean[] zArr = this.D.c;
        int length = this.x.length;
        for (int i2 = 0; i2 < length; i2++) {
            SampleQueue sampleQueue = this.x[i2];
            boolean z2 = zArr[i2];
            SampleDataQueue sampleDataQueue = sampleQueue.f3140a;
            synchronized (sampleQueue) {
                try {
                    int i3 = sampleQueue.p;
                    jH = -1;
                    if (i3 != 0) {
                        long[] jArr = sampleQueue.n;
                        int i4 = sampleQueue.r;
                        if (j >= jArr[i4]) {
                            if (z2 && (i = sampleQueue.s) != i3) {
                                i3 = i + 1;
                            }
                            int iJ = sampleQueue.j(i4, i3, j, z);
                            if (iJ != -1) {
                                jH = sampleQueue.h(iJ);
                            }
                        }
                    }
                } finally {
                }
            }
            sampleDataQueue.a(jH);
        }
    }

    public final void v() {
        Assertions.f(this.A);
        this.D.getClass();
        this.E.getClass();
    }

    public final int w() {
        int i = 0;
        for (SampleQueue sampleQueue : this.x) {
            i += sampleQueue.q + sampleQueue.p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long x(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            androidx.media3.exoplayer.source.SampleQueue[] r3 = r6.x
            int r3 = r3.length
            if (r2 >= r3) goto L27
            if (r7 != 0) goto L15
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod$TrackState r3 = r6.D
            r3.getClass()
            boolean[] r3 = r3.c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            androidx.media3.exoplayer.source.SampleQueue[] r3 = r6.x
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.v     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r7
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.x(boolean):long");
    }

    public final boolean y() {
        return this.O != -9223372036854775807L;
    }

    public final void z() {
        long j;
        if (this.S || this.A || !this.z || this.E == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.x) {
            if (sampleQueue.m() == null) {
                return;
            }
        }
        this.r.d();
        int length = this.x.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        int i = 0;
        while (true) {
            j = this.o;
            if (i >= length) {
                break;
            }
            Format formatM = this.x[i].m();
            formatM.getClass();
            String str = formatM.n;
            boolean zI = MimeTypes.i(str);
            boolean z = zI || MimeTypes.l(str);
            zArr[i] = z;
            this.B = z | this.B;
            this.C = j != -9223372036854775807L && length == 1 && MimeTypes.j(str);
            IcyHeaders icyHeaders = this.w;
            if (icyHeaders != null) {
                int i2 = icyHeaders.f3287a;
                if (zI || this.y[i].b) {
                    Metadata metadata = formatM.l;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders);
                    Format.Builder builderA = formatM.a();
                    builderA.k = metadata2;
                    formatM = new Format(builderA);
                }
                if (zI && formatM.h == -1 && formatM.i == -1 && i2 != -1) {
                    Format.Builder builderA2 = formatM.a();
                    builderA2.h = i2;
                    formatM = new Format(builderA2);
                }
            }
            int iA = this.f.a(formatM);
            Format.Builder builderA3 = formatM.a();
            builderA3.L = iA;
            Format format = new Format(builderA3);
            trackGroupArr[i] = new TrackGroup(Integer.toString(i), format);
            this.K = format.t | this.K;
            i++;
        }
        this.D = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
        if (this.C && this.F == -9223372036854775807L) {
            this.F = j;
            this.E = new ForwardingSeekMap(this.E) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public final long l() {
                    return ProgressiveMediaPeriod.this.F;
                }
            };
        }
        this.j.Z(this.F, this.E, this.G);
        this.A = true;
        MediaPeriod.Callback callback = this.v;
        callback.getClass();
        callback.f(this);
    }
}
