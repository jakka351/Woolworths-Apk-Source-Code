package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Longs;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4TimestampData implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f2933a;
    public final long b;
    public final long c;

    public Mp4TimestampData(long j, long j2, long j3) {
        this.f2933a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.f2933a == mp4TimestampData.f2933a && this.b == mp4TimestampData.b && this.c == mp4TimestampData.c;
    }

    public final int hashCode() {
        return Longs.a(this.c) + ((Longs.a(this.b) + ((Longs.a(this.f2933a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f2933a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
