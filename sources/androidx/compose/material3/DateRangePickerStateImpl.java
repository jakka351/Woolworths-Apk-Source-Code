package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DateRangePickerState;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public DateRangePickerStateImpl(Long l, Long l2, Long l3, IntRange intRange, int i) {
        super(l3, intRange);
        MutableState mutableStateF = SnapshotStateKt.f(null);
        this.e = mutableStateF;
        MutableState mutableStateF2 = SnapshotStateKt.f(null);
        this.f = mutableStateF2;
        CalendarModelImpl calendarModelImpl = this.b;
        CalendarDate calendarDateB = l != null ? calendarModelImpl.b(l.longValue()) : null;
        CalendarDate calendarDateB2 = l2 != null ? calendarModelImpl.b(l2.longValue()) : null;
        if (calendarDateB != null) {
            int i2 = calendarDateB.d;
            if (!intRange.g(i2)) {
                throw new IllegalArgumentException(("The provided start date year (" + i2 + ") is out of the years range of " + intRange + JwtParser.SEPARATOR_CHAR).toString());
            }
        }
        if (calendarDateB2 != null) {
            int i3 = calendarDateB2.d;
            if (!intRange.g(i3)) {
                throw new IllegalArgumentException(("The provided end date year (" + i3 + ") is out of the years range of " + intRange + JwtParser.SEPARATOR_CHAR).toString());
            }
        }
        if (calendarDateB2 != null) {
            if (calendarDateB == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (calendarDateB.g > calendarDateB2.g) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        ((SnapshotMutableStateImpl) mutableStateF).setValue(calendarDateB);
        ((SnapshotMutableStateImpl) mutableStateF2).setValue(calendarDateB2);
        this.g = SnapshotStateKt.f(new DisplayMode(i));
    }
}
