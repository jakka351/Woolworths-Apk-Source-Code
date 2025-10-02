package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.io.File;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public interface Cache {

    public static class CacheException extends IOException {
    }

    public interface Listener {
        void a(SimpleCache simpleCache, CacheSpan cacheSpan, CacheSpan cacheSpan2);

        void b(SimpleCache simpleCache, CacheSpan cacheSpan);

        void c(CacheSpan cacheSpan);
    }

    DefaultContentMetadata a(String str);

    CacheSpan b(long j, long j2, String str);

    long c(long j, long j2, String str);

    long d(long j, long j2, String str);

    CacheSpan e(long j, long j2, String str);

    void f(CacheSpan cacheSpan);

    File g(long j, long j2, String str);

    void h(File file, long j);

    void i(String str, ContentMetadataMutations contentMetadataMutations);
}
