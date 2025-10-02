package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/lazy/layout/IntervalList;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f1058a = new MutableVector(new IntervalList.Interval[16], 0);
    public int b;
    public IntervalList.Interval c;

    public final void a(int i, LazyLayoutIntervalContent.Interval interval) {
        if (i < 0) {
            InlineClassHelperKt.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        IntervalList.Interval interval2 = new IntervalList.Interval(this.b, i, interval);
        this.b += i;
        this.f1058a.c(interval2);
    }

    public final IntervalList.Interval b(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder sbR = YU.a.r(i, "Index ", ", size ");
            sbR.append(this.b);
            InlineClassHelperKt.e(sbR.toString());
        }
        IntervalList.Interval interval = this.c;
        if (interval != null) {
            int i2 = interval.f1033a;
            if (i < interval.b + i2 && i2 <= i) {
                return interval;
            }
        }
        MutableVector mutableVector = this.f1058a;
        IntervalList.Interval interval2 = (IntervalList.Interval) mutableVector.d[IntervalListKt.a(i, mutableVector)];
        this.c = interval2;
        return interval2;
    }
}
