package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.PlaceholderDataSource;
import androidx.media3.datasource.TeeDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.datasource.cache.Cache;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class CacheDataSource implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final Cache f2973a;
    public final DataSource b;
    public final TeeDataSource c;
    public final DataSource d;
    public final CacheKeyFactory e = CacheKeyFactory.h3;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public DataSpec j;
    public DataSpec k;
    public DataSource l;
    public long m;
    public long n;
    public long o;
    public CacheSpan p;
    public boolean q;
    public boolean r;
    public long s;
    public long t;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
    }

    public static final class Factory implements DataSource.Factory {

        /* renamed from: a, reason: collision with root package name */
        public SimpleCache f2974a;
        public FileDataSource.Factory b;
        public DefaultDataSource.Factory c;
        public int d;

        @Override // androidx.media3.datasource.DataSource.Factory
        public final DataSource a() {
            DefaultDataSource.Factory factory = this.c;
            DataSource dataSourceA = factory != null ? factory.a() : null;
            int i = this.d;
            SimpleCache simpleCache = this.f2974a;
            simpleCache.getClass();
            return new CacheDataSource(simpleCache, dataSourceA, this.b.a(), dataSourceA == null ? null : new CacheDataSink(simpleCache), i, 0);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public CacheDataSource(SimpleCache simpleCache, DataSource dataSource, DataSource dataSource2, CacheDataSink cacheDataSink, int i, int i2) {
        this.f2973a = simpleCache;
        this.b = dataSource2;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        if (dataSource != null) {
            this.d = dataSource;
            this.c = cacheDataSink != null ? new TeeDataSource(dataSource, cacheDataSink) : null;
        } else {
            this.d = PlaceholderDataSource.f2968a;
            this.c = null;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        Cache cache = this.f2973a;
        try {
            String strC = this.e.c(dataSpec);
            DataSpec.Builder builderA = dataSpec.a();
            long j = dataSpec.f;
            long j2 = dataSpec.g;
            builderA.h = strC;
            DataSpec dataSpecA = builderA.a();
            this.j = dataSpecA;
            Uri uri = dataSpecA.f2957a;
            byte[] bArr = (byte[]) cache.a(strC).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.i = uri;
            this.n = j;
            boolean z = (this.g && this.q) || (this.h && j2 == -1);
            this.r = z;
            if (z) {
                this.o = -1L;
            } else {
                long jB = cache.a(strC).b();
                this.o = jB;
                if (jB != -1) {
                    long j3 = jB - j;
                    this.o = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.o;
                this.o = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.o;
            if (j5 > 0 || j5 == -1) {
                n(dataSpecA, false);
            }
            return j2 != -1 ? j2 : this.o;
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            m();
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        return !(this.l == this.b) ? this.d.d() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void g(TransferListener transferListener) {
        transferListener.getClass();
        this.b.g(transferListener);
        this.d.g(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.i;
    }

    public final void m() {
        Cache cache = this.f2973a;
        DataSource dataSource = this.l;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.k = null;
            this.l = null;
            CacheSpan cacheSpan = this.p;
            if (cacheSpan != null) {
                cache.f(cacheSpan);
                this.p = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.media3.datasource.DataSource] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.media3.datasource.DataSource] */
    public final void n(DataSpec dataSpec, boolean z) throws InterruptedIOException {
        CacheSpan cacheSpanB;
        TeeDataSource teeDataSource;
        TeeDataSource teeDataSource2;
        long j;
        DataSpec dataSpecA;
        TeeDataSource teeDataSource3;
        String str = dataSpec.h;
        int i = Util.f2928a;
        boolean z2 = this.r;
        Cache cache = this.f2973a;
        if (z2) {
            cacheSpanB = null;
        } else if (this.f) {
            try {
                cacheSpanB = cache.b(this.n, this.o, str);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cacheSpanB = cache.e(this.n, this.o, str);
        }
        TeeDataSource teeDataSource4 = this.c;
        ?? r5 = this.b;
        ?? r6 = this.d;
        if (cacheSpanB == null) {
            DataSpec.Builder builderA = dataSpec.a();
            builderA.f = this.n;
            builderA.g = this.o;
            dataSpecA = builderA.a();
            teeDataSource = teeDataSource4;
            teeDataSource2 = r5;
            teeDataSource3 = r6;
            j = -1;
        } else {
            long jMin = cacheSpanB.f;
            if (cacheSpanB.g) {
                Uri uriFromFile = Uri.fromFile(cacheSpanB.h);
                long j2 = cacheSpanB.e;
                j = -1;
                long j3 = this.n - j2;
                long jMin2 = jMin - j3;
                teeDataSource = teeDataSource4;
                teeDataSource2 = r5;
                long j4 = this.o;
                if (j4 != -1) {
                    jMin2 = Math.min(jMin2, j4);
                }
                DataSpec.Builder builderA2 = dataSpec.a();
                builderA2.f2958a = uriFromFile;
                builderA2.b = j2;
                builderA2.f = j3;
                builderA2.g = jMin2;
                dataSpecA = builderA2.a();
                teeDataSource3 = teeDataSource2;
            } else {
                teeDataSource = teeDataSource4;
                teeDataSource2 = r5;
                j = -1;
                if (jMin == -1) {
                    jMin = this.o;
                } else {
                    long j5 = this.o;
                    if (j5 != -1) {
                        jMin = Math.min(jMin, j5);
                    }
                }
                DataSpec.Builder builderA3 = dataSpec.a();
                builderA3.f = this.n;
                builderA3.g = jMin;
                dataSpecA = builderA3.a();
                if (teeDataSource != null) {
                    teeDataSource3 = teeDataSource;
                } else {
                    cache.f(cacheSpanB);
                    teeDataSource3 = r6;
                    cacheSpanB = null;
                }
            }
        }
        this.t = (this.r || teeDataSource3 != r6) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            Assertions.f(this.l == r6);
            if (teeDataSource3 == r6) {
                return;
            }
            try {
                m();
            } catch (Throwable th) {
                if (!cacheSpanB.g) {
                    cache.f(cacheSpanB);
                }
                throw th;
            }
        }
        if (cacheSpanB != null && !cacheSpanB.g) {
            this.p = cacheSpanB;
        }
        this.l = teeDataSource3;
        this.k = dataSpecA;
        this.m = 0L;
        long jA = teeDataSource3.a(dataSpecA);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (dataSpecA.g == j && jA != j) {
            this.o = jA;
            contentMetadataMutations.a(Long.valueOf(this.n + jA), "exo_len");
        }
        if (!(this.l == teeDataSource2)) {
            Uri uri = teeDataSource3.getUri();
            this.i = uri;
            Uri uri2 = !dataSpec.f2957a.equals(uri) ? this.i : null;
            if (uri2 == null) {
                contentMetadataMutations.b.add("exo_redir");
                contentMetadataMutations.f2983a.remove("exo_redir");
            } else {
                contentMetadataMutations.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.l == teeDataSource) {
            cache.i(str, contentMetadataMutations);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        DataSource dataSource = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        DataSpec dataSpec = this.j;
        dataSpec.getClass();
        DataSpec dataSpec2 = this.k;
        dataSpec2.getClass();
        try {
            if (this.n >= this.t) {
                n(dataSpec, true);
            }
            DataSource dataSource2 = this.l;
            dataSource2.getClass();
            int i4 = dataSource2.read(bArr, i, i2);
            if (i4 != -1) {
                if (this.l == dataSource) {
                    this.s += i4;
                }
                long j2 = i4;
                this.n += j2;
                this.m += j2;
                long j3 = this.o;
                if (j3 == -1) {
                    return i4;
                }
                this.o = j3 - j2;
                return i4;
            }
            DataSource dataSource3 = this.l;
            if (!(dataSource3 == dataSource)) {
                j = -1;
                long j4 = dataSpec2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.m < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = dataSpec.h;
                int i5 = Util.f2928a;
                this.o = 0L;
                if (!(dataSource3 == this.c)) {
                    return i3;
                }
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                contentMetadataMutations.a(Long.valueOf(this.n), "exo_len");
                this.f2973a.i(str, contentMetadataMutations);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.o;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            m();
            n(dataSpec, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.l == dataSource || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }
}
