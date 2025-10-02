package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class DataSpec {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2957a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Uri f2958a;
        public long b;
        public byte[] d;
        public long f;
        public String h;
        public int i;
        public int c = 1;
        public Map e = Collections.EMPTY_MAP;
        public long g = -1;

        public final DataSpec a() {
            if (this.f2958a != null) {
                return new DataSpec(this.f2958a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        MediaLibraryInfo.a("media3.datasource");
    }

    public DataSpec(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        Assertions.b(j + j2 >= 0);
        Assertions.b(j2 >= 0);
        Assertions.b(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f2957a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f2958a = this.f2957a;
        builder.b = this.b;
        builder.c = this.c;
        builder.d = this.d;
        builder.e = this.e;
        builder.f = this.f;
        builder.g = this.g;
        builder.h = this.h;
        builder.i = this.i;
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.f2957a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return YU.a.m(sb, this.i, "]");
    }
}
