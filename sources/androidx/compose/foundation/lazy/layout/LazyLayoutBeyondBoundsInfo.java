package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "Interval", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f1034a = new MutableVector(new Interval[16], 0);

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Interval {

        /* renamed from: a, reason: collision with root package name */
        public final int f1035a;
        public final int b;

        public Interval(int i, int i2) {
            this.f1035a = i;
            this.b = i2;
            if (!(i >= 0)) {
                InlineClassHelperKt.a("negative start index");
            }
            if (i2 >= i) {
                return;
            }
            InlineClassHelperKt.a("end index greater than start");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.f1035a == interval.f1035a && this.b == interval.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f1035a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Interval(start=");
            sb.append(this.f1035a);
            sb.append(", end=");
            return YU.a.l(sb, this.b, ')');
        }
    }
}
