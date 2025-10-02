package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class DiskLruCacheWrapper implements DiskCache {
    public final File b;
    public final long c;
    public DiskLruCache e;
    public final DiskCacheWriteLocker d = new DiskCacheWriteLocker();

    /* renamed from: a, reason: collision with root package name */
    public final SafeKeyGenerator f13832a = new SafeKeyGenerator();

    public DiskLruCacheWrapper(File file, long j) {
        this.b = file;
        this.c = j;
    }

    public static DiskLruCacheWrapper c(File file, long j) {
        return new DiskLruCacheWrapper(file, j);
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final void a(Key key, DiskCache.Writer writer) {
        DiskCacheWriteLocker.WriteLock writeLock;
        boolean z;
        String strA = this.f13832a.a(key);
        DiskCacheWriteLocker diskCacheWriteLocker = this.d;
        synchronized (diskCacheWriteLocker) {
            writeLock = (DiskCacheWriteLocker.WriteLock) diskCacheWriteLocker.f13828a.get(strA);
            if (writeLock == null) {
                DiskCacheWriteLocker.WriteLockPool writeLockPool = diskCacheWriteLocker.b;
                synchronized (writeLockPool.f13830a) {
                    writeLock = (DiskCacheWriteLocker.WriteLock) writeLockPool.f13830a.poll();
                }
                if (writeLock == null) {
                    writeLock = new DiskCacheWriteLocker.WriteLock();
                }
                diskCacheWriteLocker.f13828a.put(strA, writeLock);
            }
            writeLock.b++;
        }
        writeLock.f13829a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + key);
            }
            try {
                DiskLruCache diskLruCacheD = d();
                if (diskLruCacheD.g(strA) == null) {
                    DiskLruCache.Editor editorE = diskLruCacheD.e(strA);
                    if (editorE == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                    }
                    try {
                        if (writer.a(editorE.b())) {
                            DiskLruCache.a(DiskLruCache.this, editorE, true);
                            editorE.c = true;
                        }
                        if (!z) {
                            try {
                                editorE.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!editorE.c) {
                            try {
                                editorE.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.a(strA);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final File b(Key key) {
        String strA = this.f13832a.a(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + key);
        }
        try {
            DiskLruCache.Value valueG = d().g(strA);
            if (valueG != null) {
                return valueG.f13767a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final synchronized void clear() {
        try {
            try {
                d().c();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
                synchronized (this) {
                    this.e = null;
                }
            }
            synchronized (this) {
                this.e = null;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.e = null;
                throw th;
            }
        }
    }

    public final synchronized DiskLruCache d() {
        try {
            if (this.e == null) {
                this.e = DiskLruCache.i(this.b, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }
}
