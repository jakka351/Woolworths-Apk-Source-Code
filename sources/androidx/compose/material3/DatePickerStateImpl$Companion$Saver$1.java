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

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material3/DatePickerStateImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerStateImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DatePickerStateImpl, List<? extends Object>> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj2;
        CalendarDate calendarDate = (CalendarDate) ((SnapshotMutableStateImpl) datePickerStateImpl.e).getD();
        Long lValueOf = calendarDate != null ? Long.valueOf(calendarDate.g) : null;
        Long lValueOf2 = Long.valueOf(datePickerStateImpl.a());
        IntRange intRange = datePickerStateImpl.f1399a;
        return CollectionsKt.R(lValueOf, lValueOf2, Integer.valueOf(intRange.d), Integer.valueOf(intRange.e), Integer.valueOf(((DisplayMode) ((SnapshotMutableStateImpl) datePickerStateImpl.f).getD()).f1438a));
    }
}
