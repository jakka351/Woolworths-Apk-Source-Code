package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material3/DateRangePickerStateImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DateRangePickerStateImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DateRangePickerStateImpl, List<? extends Object>> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) obj2;
        CalendarDate calendarDate = (CalendarDate) ((SnapshotMutableStateImpl) dateRangePickerStateImpl.e).getD();
        Long lValueOf = calendarDate != null ? Long.valueOf(calendarDate.g) : null;
        CalendarDate calendarDate2 = (CalendarDate) ((SnapshotMutableStateImpl) dateRangePickerStateImpl.f).getD();
        Long lValueOf2 = calendarDate2 != null ? Long.valueOf(calendarDate2.g) : null;
        Long lValueOf3 = Long.valueOf(dateRangePickerStateImpl.a());
        IntRange intRange = dateRangePickerStateImpl.f1399a;
        return CollectionsKt.R(lValueOf, lValueOf2, lValueOf3, Integer.valueOf(intRange.d), Integer.valueOf(intRange.e), Integer.valueOf(((DisplayMode) ((SnapshotMutableStateImpl) dateRangePickerStateImpl.g).getD()).f1438a));
    }
}
