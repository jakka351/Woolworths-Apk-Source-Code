package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/DatePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DatePickerState;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {
    public final MutableState e;
    public final MutableState f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DatePickerStateImpl$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public DatePickerStateImpl(Long l, Long l2, IntRange intRange, int i) {
        CalendarDate calendarDateB;
        super(l2, intRange);
        if (l != null) {
            calendarDateB = this.b.b(l.longValue());
            int i2 = calendarDateB.d;
            if (!intRange.g(i2)) {
                throw new IllegalArgumentException(("The provided initial date's year (" + i2 + ") is out of the years range of " + intRange + JwtParser.SEPARATOR_CHAR).toString());
            }
        } else {
            calendarDateB = null;
        }
        this.e = SnapshotStateKt.f(calendarDateB);
        this.f = SnapshotStateKt.f(new DisplayMode(i));
    }
}
