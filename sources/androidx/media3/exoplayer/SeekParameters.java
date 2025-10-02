package androidx.media3.exoplayer;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class SeekParameters {
    public static final SeekParameters c;

    /* renamed from: a, reason: collision with root package name */
    public final long f3025a;
    public final long b;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        new SeekParameters(Long.MAX_VALUE, 0L);
        new SeekParameters(0L, Long.MAX_VALUE);
        c = seekParameters;
    }

    public SeekParameters(long j, long j2) {
        Assertions.b(j >= 0);
        Assertions.b(j2 >= 0);
        this.f3025a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekParameters.class == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.f3025a == seekParameters.f3025a && this.b == seekParameters.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3025a) * 31) + ((int) this.b);
    }
}
