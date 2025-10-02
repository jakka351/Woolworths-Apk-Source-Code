package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@UnstableApi
/* loaded from: classes2.dex */
public final class CacheDataSink implements DataSink {

    /* renamed from: a, reason: collision with root package name */
    public final Cache f2972a;
    public final long b;
    public final int c;
    public DataSpec d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public ReusableBufferedOutputStream j;

    public static final class CacheDataSinkException extends Cache.CacheException {
    }

    public static final class Factory implements DataSink.Factory {
    }

    public CacheDataSink(SimpleCache simpleCache) {
        simpleCache.getClass();
        this.f2972a = simpleCache;
        this.b = 5242880L;
        this.c = 20480;
    }

    @Override // androidx.media3.datasource.DataSink
    public final void a(DataSpec dataSpec) throws CacheDataSinkException {
        int i = dataSpec.i;
        dataSpec.h.getClass();
        if (dataSpec.g == -1 && (i & 2) == 2) {
            this.d = null;
            return;
        }
        this.d = dataSpec;
        this.e = (i & 4) == 4 ? this.b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            c(dataSpec);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    public final void b() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Util.f(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.f2972a.h(file, this.h);
        } catch (Throwable th) {
            Util.f(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void c(DataSpec dataSpec) {
        long j = dataSpec.g;
        long jMin = j != -1 ? Math.min(j - this.i, this.e) : -1L;
        String str = dataSpec.h;
        int i = Util.f2928a;
        this.f = this.f2972a.g(dataSpec.f + this.i, jMin, str);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        int i2 = this.c;
        if (i2 > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.j;
            if (reusableBufferedOutputStream == null) {
                this.j = new ReusableBufferedOutputStream(fileOutputStream, i2);
            } else {
                reusableBufferedOutputStream.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // androidx.media3.datasource.DataSink
    public final void close() throws CacheDataSinkException {
        if (this.d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        DataSpec dataSpec = this.d;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    b();
                    c(dataSpec);
                }
                int iMin = (int) Math.min(i2 - i3, this.e - this.h);
                OutputStream outputStream = this.g;
                int i4 = Util.f2928a;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }
}
