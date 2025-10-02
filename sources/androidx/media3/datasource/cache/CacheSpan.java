package androidx.media3.datasource.cache;

import android.support.v4.media.session.a;
import androidx.media3.common.util.UnstableApi;
import java.io.File;

@UnstableApi
/* loaded from: classes2.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final String d;
    public final long e;
    public final long f;
    public final boolean g;
    public final File h;
    public final long i;

    public CacheSpan(String str, long j, long j2, long j3, File file) {
        this.d = str;
        this.e = j;
        this.f = j2;
        this.g = file != null;
        this.h = file;
        this.i = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(CacheSpan cacheSpan) {
        String str = cacheSpan.d;
        String str2 = this.d;
        if (!str2.equals(str)) {
            return str2.compareTo(cacheSpan.d);
        }
        long j = this.e - cacheSpan.e;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.e);
        sb.append(", ");
        return a.l(this.f, "]", sb);
    }
}
