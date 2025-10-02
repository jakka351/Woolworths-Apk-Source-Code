package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.LogTime;
import java.util.Collections;

/* loaded from: classes4.dex */
class SourceGenerator implements DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback {
    public final DecodeHelper d;
    public final DataFetcherGenerator.FetcherReadyCallback e;
    public volatile int f;
    public volatile DataCacheGenerator g;
    public volatile Object h;
    public volatile ModelLoader.LoadData i;
    public volatile DataCacheKey j;

    public SourceGenerator(DecodeHelper decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.d = decodeHelper;
        this.e = fetcherReadyCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.h
            r5.h = r1
            boolean r0 = r5.c(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            com.bumptech.glide.load.engine.DataCacheGenerator r0 = r5.g
            if (r0 == 0) goto L2d
            com.bumptech.glide.load.engine.DataCacheGenerator r0 = r5.g
            boolean r0 = r0.a()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r5.g = r1
            r5.i = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L90
            int r1 = r5.f
            com.bumptech.glide.load.engine.DecodeHelper r3 = r5.d
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L90
            com.bumptech.glide.load.engine.DecodeHelper r1 = r5.d
            java.util.ArrayList r1 = r1.b()
            int r3 = r5.f
            int r4 = r3 + 1
            r5.f = r4
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = (com.bumptech.glide.load.model.ModelLoader.LoadData) r1
            r5.i = r1
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r5.i
            if (r1 == 0) goto L32
            com.bumptech.glide.load.engine.DecodeHelper r1 = r5.d
            com.bumptech.glide.load.engine.DiskCacheStrategy r1 = r1.p
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = r5.i
            com.bumptech.glide.load.data.DataFetcher r3 = r3.c
            com.bumptech.glide.load.DataSource r3 = r3.c()
            boolean r1 = r1.c(r3)
            if (r1 != 0) goto L7c
            com.bumptech.glide.load.engine.DecodeHelper r1 = r5.d
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = r5.i
            com.bumptech.glide.load.data.DataFetcher r3 = r3.c
            java.lang.Class r3 = r3.a()
            com.bumptech.glide.load.engine.LoadPath r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L7c:
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r5.i
            com.bumptech.glide.load.model.ModelLoader$LoadData r1 = r5.i
            com.bumptech.glide.load.data.DataFetcher r1 = r1.c
            com.bumptech.glide.load.engine.DecodeHelper r3 = r5.d
            com.bumptech.glide.Priority r3 = r3.o
            com.bumptech.glide.load.engine.SourceGenerator$1 r4 = new com.bumptech.glide.load.engine.SourceGenerator$1
            r4.<init>()
            r1.d(r3, r4)
            r0 = r2
            goto L32
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.SourceGenerator.a():boolean");
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void b(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource) {
        ((DecodeJob) this.e).b(key, exc, dataFetcher, this.i.c.c());
    }

    public final boolean c(Object obj) throws Throwable {
        Throwable th;
        int i = LogTime.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            DataRewinder dataRewinderC = this.d.c.a().c(obj);
            Object objA = dataRewinderC.a();
            Encoder encoderB = this.d.c.a().b.b(objA.getClass());
            if (encoderB == null) {
                throw new Registry.NoSourceEncoderAvailableException("Failed to find source encoder for data class: " + objA.getClass());
            }
            DataCacheWriter dataCacheWriter = new DataCacheWriter(encoderB, objA, this.d.i);
            Key key = this.i.f13862a;
            DecodeHelper decodeHelper = this.d;
            DataCacheKey dataCacheKey = new DataCacheKey(key, decodeHelper.n);
            DiskCache diskCacheA = decodeHelper.h.a();
            diskCacheA.a(dataCacheKey, dataCacheWriter);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dataCacheKey + ", data: " + obj + ", encoder: " + encoderB + ", duration: " + LogTime.a(jElapsedRealtimeNanos));
            }
            if (diskCacheA.b(dataCacheKey) != null) {
                this.j = dataCacheKey;
                this.g = new DataCacheGenerator(Collections.singletonList(this.i.f13862a), this.d, this);
                this.i.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.j + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                ((DecodeJob) this.e).d(this.i.f13862a, dataRewinderC.a(), this.i.c, this.i.c.c(), this.i.f13862a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.i.c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData loadData = this.i;
        if (loadData != null) {
            loadData.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void d(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2) {
        this.e.d(key, obj, dataFetcher, this.i.c.c(), key);
    }
}
