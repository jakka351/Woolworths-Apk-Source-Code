package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/BaseDatePickerStateImpl;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class BaseDatePickerStateImpl {

    /* renamed from: a, reason: collision with root package name */
    public final IntRange f1399a;
    public final CalendarModelImpl b;
    public final MutableState c;
    public final MutableState d;

    public BaseDatePickerStateImpl(Long l, IntRange intRange) {
        CalendarMonth calendarMonthG;
        this.f1399a = intRange;
        CalendarModelImpl calendarModelImpl = new CalendarModelImpl(null);
        this.b = calendarModelImpl;
        this.c = SnapshotStateKt.f(null);
        if (l != null) {
            calendarMonthG = calendarModelImpl.f(l.longValue());
            int i = calendarMonthG.f1552a;
            if (!intRange.g(i)) {
                throw new IllegalArgumentException(("The initial display month's year (" + i + ") is out of the years range of " + intRange + JwtParser.SEPARATOR_CHAR).toString());
            }
        } else {
            calendarMonthG = calendarModelImpl.g(calendarModelImpl.h());
        }
        this.d = SnapshotStateKt.f(calendarMonthG);
    }

    public final long a() {
        return ((CalendarMonth) ((SnapshotMutableStateImpl) this.d).getD()).e;
    }
}
