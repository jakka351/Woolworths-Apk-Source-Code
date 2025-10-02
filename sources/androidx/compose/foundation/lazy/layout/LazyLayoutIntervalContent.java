package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Interval", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Interval {
        default Function1 getKey() {
            return null;
        }

        default Function1 getType() {
            return LazyLayoutIntervalContent$Interval$type$1.h;
        }
    }

    public final Object j(int i) {
        IntervalList.Interval intervalB = k().b(i);
        return intervalB.c.getType().invoke(Integer.valueOf(i - intervalB.f1033a));
    }

    public abstract MutableIntervalList k();

    public final Object l(int i) {
        Object objInvoke;
        IntervalList.Interval intervalB = k().b(i);
        int i2 = i - intervalB.f1033a;
        Function1 key = intervalB.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
