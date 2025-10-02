package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class LoadingInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f3011a;
    public final float b;
    public final long c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public long f3012a = -9223372036854775807L;
        public float b = -3.4028235E38f;
        public long c = -9223372036854775807L;
    }

    public LoadingInfo(Builder builder) {
        this.f3011a = builder.f3012a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.f3011a == loadingInfo.f3011a && this.b == loadingInfo.b && this.c == loadingInfo.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f3011a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
