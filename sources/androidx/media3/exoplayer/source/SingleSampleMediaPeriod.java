package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class SingleSampleMediaPeriod implements MediaPeriod, Loader.Callback<SourceLoadable> {
    public final DataSpec d;
    public final DataSource.Factory e;
    public final TransferListener f;
    public final LoadErrorHandlingPolicy g;
    public final MediaSourceEventListener.EventDispatcher h;
    public final TrackGroupArray i;
    public final ArrayList j = new ArrayList();
    public final long k;
    public final Loader l;
    public final Format m;
    public final boolean n;
    public boolean o;
    public byte[] p;
    public int q;

    public final class SampleStreamImpl implements SampleStream {
        public int d;
        public boolean e;

        public SampleStreamImpl() {
        }

        public final void a() {
            if (this.e) {
                return;
            }
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            MediaSourceEventListener.EventDispatcher eventDispatcher = singleSampleMediaPeriod.h;
            eventDispatcher.a(new c(eventDispatcher, new MediaLoadData(1, MimeTypes.h(singleSampleMediaPeriod.m.n), singleSampleMediaPeriod.m, 0, Util.U(0L), -9223372036854775807L)));
            this.e = true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            a();
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            boolean z = singleSampleMediaPeriod.o;
            if (z && singleSampleMediaPeriod.p == null) {
                this.d = 2;
            }
            int i2 = this.d;
            if (i2 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                formatHolder.b = singleSampleMediaPeriod.m;
                this.d = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            singleSampleMediaPeriod.p.getClass();
            decoderInputBuffer.e(1);
            decoderInputBuffer.i = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.n(singleSampleMediaPeriod.q);
                decoderInputBuffer.g.put(singleSampleMediaPeriod.p, 0, singleSampleMediaPeriod.q);
            }
            if ((i & 1) == 0) {
                this.d = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return SingleSampleMediaPeriod.this.o;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void j() throws IOException {
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            if (singleSampleMediaPeriod.n) {
                return;
            }
            singleSampleMediaPeriod.l.c(Integer.MIN_VALUE);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            a();
            if (j <= 0 || this.d == 2) {
                return 0;
            }
            this.d = 2;
            return 1;
        }
    }

    public static final class SourceLoadable implements Loader.Loadable {

        /* renamed from: a, reason: collision with root package name */
        public final long f3145a = LoadEventInfo.b.getAndIncrement();
        public final DataSpec b;
        public final StatsDataSource c;
        public byte[] d;

        public SourceLoadable(DataSource dataSource, DataSpec dataSpec) {
            this.b = dataSpec;
            this.c = new StatsDataSource(dataSource);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void a() {
            StatsDataSource statsDataSource = this.c;
            statsDataSource.b = 0L;
            try {
                statsDataSource.a(this.b);
                int i = 0;
                while (i != -1) {
                    int i2 = (int) statsDataSource.b;
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (i2 == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.d;
                    i = statsDataSource.read(bArr2, i2, bArr2.length - i2);
                }
                DataSourceUtil.a(statsDataSource);
            } catch (Throwable th) {
                DataSourceUtil.a(statsDataSource);
                throw th;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void b() {
        }
    }

    public SingleSampleMediaPeriod(DataSpec dataSpec, DataSource.Factory factory, TransferListener transferListener, Format format, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z, ReleasableExecutor releasableExecutor) {
        this.d = dataSpec;
        this.e = factory;
        this.f = transferListener;
        this.m = format;
        this.k = j;
        this.g = loadErrorHandlingPolicy;
        this.h = eventDispatcher;
        this.n = z;
        this.i = new TrackGroupArray(new TrackGroup("", format));
        this.l = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader("SingleSampleMediaPeriod");
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final Loader.LoadErrorAction a(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
        Loader.LoadErrorAction loadErrorAction;
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        StatsDataSource statsDataSource = sourceLoadable.c;
        long j3 = sourceLoadable.f3145a;
        Uri uri = statsDataSource.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j3, statsDataSource.d);
        long j4 = this.k;
        Util.U(j4);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(iOException, i);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.g;
        long jA = loadErrorHandlingPolicy.a(loadErrorInfo);
        boolean z = jA == -9223372036854775807L || i >= loadErrorHandlingPolicy.b(1);
        if (this.n && z) {
            Log.h("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.o = true;
            loadErrorAction = Loader.d;
        } else {
            loadErrorAction = jA != -9223372036854775807L ? new Loader.LoadErrorAction(0, jA) : Loader.e;
        }
        Loader.LoadErrorAction loadErrorAction2 = loadErrorAction;
        int i2 = loadErrorAction2.f3183a;
        boolean z2 = i2 == 0 || i2 == 1;
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, this.m, 0, Util.U(0L), Util.U(j4));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new h(eventDispatcher, loadEventInfo, mediaLoadData, iOException, !z2));
        return loadErrorAction2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        return this.l.b();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                return j;
            }
            SampleStreamImpl sampleStreamImpl = (SampleStreamImpl) arrayList.get(i);
            if (sampleStreamImpl.d == 2) {
                sampleStreamImpl.d = 1;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long e() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void g(Loader.Loadable loadable, long j, long j2, int i) {
        LoadEventInfo loadEventInfo;
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        StatsDataSource statsDataSource = sourceLoadable.c;
        long j3 = sourceLoadable.f3145a;
        if (i == 0) {
            loadEventInfo = new LoadEventInfo(j3, sourceLoadable.b);
        } else {
            Uri uri = statsDataSource.c;
            loadEventInfo = new LoadEventInfo(j3, statsDataSource.d);
        }
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, this.m, 0, Util.U(0L), Util.U(this.k));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new androidx.media3.exoplayer.analytics.l(eventDispatcher, loadEventInfo, mediaLoadData, i));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray i() {
        return this.i;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        return this.o ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void m(Loader.Loadable loadable, long j, long j2, boolean z) {
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        StatsDataSource statsDataSource = sourceLoadable.c;
        long j3 = sourceLoadable.f3145a;
        Uri uri = statsDataSource.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j3, statsDataSource.d);
        this.g.getClass();
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, null, 0, Util.U(0L), Util.U(this.k));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new g(eventDispatcher, loadEventInfo, mediaLoadData, 1));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        if (this.o) {
            return false;
        }
        Loader loader = this.l;
        if (loader.b() || loader.c != null) {
            return false;
        }
        DataSource dataSourceA = this.e.a();
        TransferListener transferListener = this.f;
        if (transferListener != null) {
            dataSourceA.g(transferListener);
        }
        loader.e(new SourceLoadable(dataSourceA, this.d), this, this.g.b(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        return (this.o || this.l.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            SampleStream sampleStream = sampleStreamArr[i];
            ArrayList arrayList = this.j;
            if (sampleStream != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                arrayList.remove(sampleStream);
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                SampleStreamImpl sampleStreamImpl = new SampleStreamImpl();
                arrayList.add(sampleStreamImpl);
                sampleStreamArr[i] = sampleStreamImpl;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void r() {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void s(MediaPeriod.Callback callback, long j) {
        callback.f(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void t(Loader.Loadable loadable, long j, long j2) {
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        this.q = (int) sourceLoadable.c.b;
        byte[] bArr = sourceLoadable.d;
        bArr.getClass();
        this.p = bArr;
        this.o = true;
        StatsDataSource statsDataSource = sourceLoadable.c;
        long j3 = sourceLoadable.f3145a;
        Uri uri = statsDataSource.c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j3, statsDataSource.d);
        this.g.getClass();
        MediaLoadData mediaLoadData = new MediaLoadData(1, -1, this.m, 0, Util.U(0L), Util.U(this.k));
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.h;
        eventDispatcher.a(new g(eventDispatcher, loadEventInfo, mediaLoadData, 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void u(long j, boolean z) {
    }
}
