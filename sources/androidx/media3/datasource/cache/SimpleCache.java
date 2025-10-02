package androidx.media3.datasource.cache;

import YU.a;
import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CachedContent;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

@UnstableApi
/* loaded from: classes2.dex */
public final class SimpleCache implements Cache {
    public static final HashSet l = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final File f2986a;
    public final LeastRecentlyUsedCacheEvictor b;
    public final CachedContentIndex c;
    public final CacheFileMetadataIndex d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public boolean j;
    public Cache.CacheException k;

    public SimpleCache(File file, LeastRecentlyUsedCacheEvictor leastRecentlyUsedCacheEvictor, StandaloneDatabaseProvider standaloneDatabaseProvider) {
        boolean zAdd;
        CachedContentIndex cachedContentIndex = new CachedContentIndex(standaloneDatabaseProvider, file);
        CacheFileMetadataIndex cacheFileMetadataIndex = new CacheFileMetadataIndex(standaloneDatabaseProvider);
        synchronized (SimpleCache.class) {
            zAdd = l.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f2986a = file;
        this.b = leastRecentlyUsedCacheEvictor;
        this.c = cachedContentIndex;
        this.d = cacheFileMetadataIndex;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread() { // from class: androidx.media3.datasource.cache.SimpleCache.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("ExoPlayer:SimpleCacheInit");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                synchronized (SimpleCache.this) {
                    conditionVariable.open();
                    SimpleCache.j(SimpleCache.this);
                    SimpleCache.this.b.getClass();
                }
            }
        }.start();
        conditionVariable.block();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(SimpleCache simpleCache) throws NumberFormatException {
        long j;
        CacheFileMetadataIndex cacheFileMetadataIndex = simpleCache.d;
        CachedContentIndex cachedContentIndex = simpleCache.c;
        File file = simpleCache.f2986a;
        if (!file.exists()) {
            try {
                m(file);
            } catch (Cache.CacheException e) {
                simpleCache.k = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            Log.c("SimpleCache", str);
            simpleCache.k = new Cache.CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    Log.c("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        simpleCache.h = j;
        if (j == -1) {
            try {
                simpleCache.h = n(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                Log.d("SimpleCache", str2, e2);
                simpleCache.k = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            cachedContentIndex.e(simpleCache.h);
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.b(simpleCache.h);
                HashMap mapA = cacheFileMetadataIndex.a();
                simpleCache.o(file, true, fileArrListFiles, mapA);
                cacheFileMetadataIndex.c(mapA.keySet());
            } else {
                simpleCache.o(file, true, fileArrListFiles, null);
            }
            UnmodifiableIterator it = ImmutableSet.q(cachedContentIndex.f2980a.keySet()).iterator();
            while (it.hasNext()) {
                cachedContentIndex.f((String) it.next());
            }
            try {
                cachedContentIndex.g();
            } catch (IOException e3) {
                Log.d("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            Log.d("SimpleCache", str3, e4);
            simpleCache.k = new Cache.CacheException(str3, e4);
        }
    }

    public static void m(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        Log.c("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    public static long n(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, a.g(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized void t(File file) {
        l.remove(file.getAbsoluteFile());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized DefaultContentMetadata a(String str) {
        CachedContent cachedContentC;
        Assertions.f(!this.j);
        cachedContentC = this.c.c(str);
        return cachedContentC != null ? cachedContentC.e : DefaultContentMetadata.c;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please report as a decompilation issue!!! */
    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized CacheSpan b(long j, long j2, String str) throws Throwable {
        try {
            Assertions.f(!this.j);
            l();
            while (true) {
                CacheSpan cacheSpanE = e(j, j2, str);
                String str2 = str;
                long j3 = j2;
                long j4 = j;
                if (cacheSpanE != null) {
                    return cacheSpanE;
                }
                try {
                    wait();
                    j = j4;
                    j2 = j3;
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized long c(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long jD = d(j6, j5 - j6, str);
            if (jD > 0) {
                j3 += jD;
            } else {
                jD = -jD;
            }
            j6 += jD;
        }
        return j3;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized long d(long j, long j2, String str) {
        CachedContent cachedContentC;
        Assertions.f(!this.j);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContentC = this.c.c(str);
        return cachedContentC != null ? cachedContentC.a(j, j2) : -j2;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized CacheSpan e(long j, long j2, String str) {
        long j3;
        SimpleCacheSpan simpleCacheSpanB;
        Assertions.f(!this.j);
        l();
        CachedContent cachedContentC = this.c.c(str);
        if (cachedContentC != null) {
            j3 = j;
            while (true) {
                simpleCacheSpanB = cachedContentC.b(j3, j2);
                if (!simpleCacheSpanB.g) {
                    break;
                }
                File file = simpleCacheSpanB.h;
                file.getClass();
                if (file.length() == simpleCacheSpanB.f) {
                    break;
                }
                r();
            }
        } else {
            j3 = j;
            simpleCacheSpanB = new SimpleCacheSpan(str, j3, j2, -9223372036854775807L, null);
        }
        if (simpleCacheSpanB.g) {
            return s(str, simpleCacheSpanB);
        }
        CachedContent cachedContentD = this.c.d(str);
        long j4 = simpleCacheSpanB.f;
        ArrayList arrayList = cachedContentD.d;
        for (int i = 0; i < arrayList.size(); i++) {
            CachedContent.Range range = (CachedContent.Range) arrayList.get(i);
            long j5 = range.f2979a;
            if (j5 <= j3) {
                long j6 = range.b;
                if (j6 == -1 || j5 + j6 > j3) {
                    return null;
                }
            } else {
                if (j4 == -1 || j3 + j4 > j5) {
                    return null;
                }
            }
        }
        arrayList.add(new CachedContent.Range(j3, j4));
        return simpleCacheSpanB;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void f(CacheSpan cacheSpan) {
        Assertions.f(!this.j);
        CachedContent cachedContentC = this.c.c(cacheSpan.d);
        cachedContentC.getClass();
        long j = cacheSpan.e;
        ArrayList arrayList = cachedContentC.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((CachedContent.Range) arrayList.get(i)).f2979a == j) {
                arrayList.remove(i);
                this.c.f(cachedContentC.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized File g(long j, long j2, String str) {
        try {
            Assertions.f(!this.j);
            l();
            CachedContent cachedContentC = this.c.c(str);
            cachedContentC.getClass();
            Assertions.f(cachedContentC.c(j, j2));
            if (!this.f2986a.exists()) {
                m(this.f2986a);
                r();
            }
            LeastRecentlyUsedCacheEvictor leastRecentlyUsedCacheEvictor = this.b;
            if (j2 != -1) {
                TreeSet treeSet = leastRecentlyUsedCacheEvictor.f2985a;
                while (leastRecentlyUsedCacheEvictor.b + j2 > 10485760 && !treeSet.isEmpty()) {
                    CacheSpan cacheSpan = (CacheSpan) treeSet.first();
                    synchronized (this) {
                        Assertions.f(!this.j);
                        q(cacheSpan);
                    }
                }
            } else {
                leastRecentlyUsedCacheEvictor.getClass();
            }
            File file = new File(this.f2986a, Integer.toString(this.f.nextInt(10)));
            if (!file.exists()) {
                m(file);
            }
            return SimpleCacheSpan.c(file, cachedContentC.f2978a, j, System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void h(File file, long j) {
        boolean z = true;
        Assertions.f(!this.j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            SimpleCacheSpan simpleCacheSpanB = SimpleCacheSpan.b(file, j, -9223372036854775807L, this.c);
            simpleCacheSpanB.getClass();
            CachedContent cachedContentC = this.c.c(simpleCacheSpanB.d);
            cachedContentC.getClass();
            Assertions.f(cachedContentC.c(simpleCacheSpanB.e, simpleCacheSpanB.f));
            long jB = cachedContentC.e.b();
            if (jB != -1) {
                if (simpleCacheSpanB.e + simpleCacheSpanB.f > jB) {
                    z = false;
                }
                Assertions.f(z);
            }
            if (this.d == null) {
                k(simpleCacheSpanB);
                this.c.g();
                notifyAll();
                return;
            }
            try {
                this.d.d(simpleCacheSpanB.f, simpleCacheSpanB.i, file.getName());
                k(simpleCacheSpanB);
                try {
                    this.c.g();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new Cache.CacheException(e);
                }
            } catch (IOException e2) {
                throw new Cache.CacheException(e2);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void i(String str, ContentMetadataMutations contentMetadataMutations) {
        Assertions.f(!this.j);
        l();
        CachedContentIndex cachedContentIndex = this.c;
        CachedContent cachedContentD = cachedContentIndex.d(str);
        DefaultContentMetadata defaultContentMetadata = cachedContentD.e;
        DefaultContentMetadata defaultContentMetadataA = defaultContentMetadata.a(contentMetadataMutations);
        cachedContentD.e = defaultContentMetadataA;
        if (!defaultContentMetadataA.equals(defaultContentMetadata)) {
            cachedContentIndex.e.b(cachedContentD);
        }
        try {
            this.c.g();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    public final void k(SimpleCacheSpan simpleCacheSpan) {
        String str = simpleCacheSpan.d;
        this.c.d(str).c.add(simpleCacheSpan);
        this.i += simpleCacheSpan.f;
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).b(this, simpleCacheSpan);
            }
        }
        this.b.b(this, simpleCacheSpan);
    }

    public final synchronized void l() {
        Cache.CacheException cacheException = this.k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final void o(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                o(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                CacheFileMetadata cacheFileMetadata = map != null ? (CacheFileMetadata) map.remove(name) : null;
                if (cacheFileMetadata != null) {
                    j = cacheFileMetadata.f2975a;
                    j2 = cacheFileMetadata.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                SimpleCacheSpan simpleCacheSpanB = SimpleCacheSpan.b(file2, j, j2, this.c);
                if (simpleCacheSpanB != null) {
                    k(simpleCacheSpanB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void p() {
        File file;
        if (this.j) {
            return;
        }
        this.e.clear();
        r();
        try {
            try {
                this.c.g();
                file = this.f2986a;
            } catch (Throwable th) {
                t(this.f2986a);
                this.j = true;
                throw th;
            }
        } catch (IOException e) {
            Log.d("SimpleCache", "Storing index file failed", e);
            file = this.f2986a;
        }
        t(file);
        this.j = true;
    }

    public final void q(CacheSpan cacheSpan) throws DatabaseIOException {
        String str = cacheSpan.d;
        File file = cacheSpan.h;
        CachedContentIndex cachedContentIndex = this.c;
        CachedContent cachedContentC = cachedContentIndex.c(str);
        if (cachedContentC == null || !cachedContentC.c.remove(cacheSpan)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        this.i -= cacheSpan.f;
        CacheFileMetadataIndex cacheFileMetadataIndex = this.d;
        if (cacheFileMetadataIndex != null) {
            file.getClass();
            String name = file.getName();
            try {
                cacheFileMetadataIndex.b.getClass();
                try {
                    cacheFileMetadataIndex.f2976a.getWritableDatabase().delete(cacheFileMetadataIndex.b, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                androidx.compose.ui.input.pointer.a.A("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        cachedContentIndex.f(cachedContentC.b);
        ArrayList arrayList = (ArrayList) this.e.get(cacheSpan.d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).c(cacheSpan);
            }
        }
        this.b.c(cacheSpan);
    }

    public final void r() throws DatabaseIOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.c.f2980a.values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((CachedContent) it.next()).c.iterator();
            while (it2.hasNext()) {
                CacheSpan cacheSpan = (CacheSpan) it2.next();
                File file = cacheSpan.h;
                file.getClass();
                if (file.length() != cacheSpan.f) {
                    arrayList.add(cacheSpan);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            q((CacheSpan) arrayList.get(i));
        }
    }

    public final SimpleCacheSpan s(String str, SimpleCacheSpan simpleCacheSpan) {
        boolean z;
        File file;
        File file2 = simpleCacheSpan.h;
        if (!this.g) {
            return simpleCacheSpan;
        }
        file2.getClass();
        String name = file2.getName();
        long j = simpleCacheSpan.f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        CacheFileMetadataIndex cacheFileMetadataIndex = this.d;
        if (cacheFileMetadataIndex != null) {
            try {
                cacheFileMetadataIndex.d(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                Log.g("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        CachedContent cachedContentC = this.c.c(str);
        cachedContentC.getClass();
        TreeSet treeSet = cachedContentC.c;
        Assertions.f(treeSet.remove(simpleCacheSpan));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = SimpleCacheSpan.c(parentFile, cachedContentC.f2978a, simpleCacheSpan.e, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                Log.g("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        Assertions.f(simpleCacheSpan.g);
        SimpleCacheSpan simpleCacheSpan2 = new SimpleCacheSpan(simpleCacheSpan.d, simpleCacheSpan.e, simpleCacheSpan.f, jCurrentTimeMillis, file);
        treeSet.add(simpleCacheSpan2);
        ArrayList arrayList = (ArrayList) this.e.get(simpleCacheSpan.d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.Listener) arrayList.get(size)).a(this, simpleCacheSpan, simpleCacheSpan2);
            }
        }
        this.b.a(this, simpleCacheSpan, simpleCacheSpan2);
        return simpleCacheSpan2;
    }
}
