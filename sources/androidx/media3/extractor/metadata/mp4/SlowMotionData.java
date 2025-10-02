package androidx.media3.extractor.metadata.mp4;

import androidx.camera.core.impl.b;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3294a;

    public static final class Segment {

        /* renamed from: a, reason: collision with root package name */
        public final long f3295a;
        public final long b;
        public final int c;

        public Segment(long j, long j2, int i) {
            Assertions.b(j < j2);
            this.f3295a = j;
            this.b = j2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.f3295a == segment.f3295a && this.b == segment.b && this.c == segment.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f3295a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            int i = Util.f2928a;
            Locale locale = Locale.US;
            StringBuilder sbT = b.t(this.f3295a, "Segment: startTimeMs=", ", endTimeMs=");
            sbT.append(this.b);
            sbT.append(", speedDivisor=");
            sbT.append(this.c);
            return sbT.toString();
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f3294a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i)).f3295a < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        Assertions.b(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f3294a.equals(((SlowMotionData) obj).f3294a);
    }

    public final int hashCode() {
        return this.f3294a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f3294a;
    }
}
