package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class SeekPoint {
    public static final SeekPoint c = new SeekPoint(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f3251a;
    public final long b;

    public SeekPoint(long j, long j2) {
        this.f3251a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.f3251a == seekPoint.f3251a && this.b == seekPoint.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3251a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f3251a);
        sb.append(", position=");
        return android.support.v4.media.session.a.l(this.b, "]", sb);
    }
}
