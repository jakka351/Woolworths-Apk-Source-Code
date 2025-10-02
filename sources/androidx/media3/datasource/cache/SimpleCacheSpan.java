package androidx.media3.datasource.cache;

import android.support.v4.media.session.a;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class SimpleCacheSpan extends CacheSpan {
    public static final Pattern j = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern k = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern l = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[PHI: r2
  0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.datasource.cache.SimpleCacheSpan b(java.io.File r16, long r17, long r19, androidx.media3.datasource.cache.CachedContentIndex r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.cache.SimpleCacheSpan.b(java.io.File, long, long, androidx.media3.datasource.cache.CachedContentIndex):androidx.media3.datasource.cache.SimpleCacheSpan");
    }

    public static File c(File file, int i, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j2);
        sb.append(".");
        return new File(file, a.l(j3, ".v3.exo", sb));
    }
}
