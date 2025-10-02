package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface SeekMap {

    public static final class SeekPoints {

        /* renamed from: a, reason: collision with root package name */
        public final SeekPoint f3249a;
        public final SeekPoint b;

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.f3249a = seekPoint;
            this.b = seekPoint2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SeekPoints.class == obj.getClass()) {
                SeekPoints seekPoints = (SeekPoints) obj;
                if (this.f3249a.equals(seekPoints.f3249a) && this.b.equals(seekPoints.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3249a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            SeekPoint seekPoint = this.f3249a;
            sb.append(seekPoint);
            SeekPoint seekPoint2 = this.b;
            if (seekPoint.equals(seekPoint2)) {
                str = "";
            } else {
                str = ", " + seekPoint2;
            }
            return YU.a.o(sb, str, "]");
        }
    }

    public static class Unseekable implements SeekMap {

        /* renamed from: a, reason: collision with root package name */
        public final long f3250a;
        public final SeekPoints b;

        public Unseekable(long j) {
            this(j, 0L);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekPoints b(long j) {
            return this.b;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean d() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long l() {
            return this.f3250a;
        }

        public Unseekable(long j, long j2) {
            this.f3250a = j;
            SeekPoint seekPoint = j2 == 0 ? SeekPoint.c : new SeekPoint(0L, j2);
            this.b = new SeekPoints(seekPoint, seekPoint);
        }
    }

    SeekPoints b(long j);

    boolean d();

    long l();
}
