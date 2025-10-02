package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.runtime.Immutable;
import java.util.Locale;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DatePickerFormatterImpl;", "Landroidx/compose/material3/DatePickerFormatter;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerFormatterImpl implements DatePickerFormatter {
    @Override // androidx.compose.material3.DatePickerFormatter
    public final String a(Long l, Locale locale) {
        return CalendarModel_androidKt.a(l.longValue(), "yMMMM", locale, null);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public final String b(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return CalendarModel_androidKt.a(l.longValue(), z ? "yMMMMEEEEd" : "yMMMd", locale, null);
    }

    public final boolean equals(Object obj) {
        return obj instanceof DatePickerFormatterImpl;
    }

    public final int hashCode() {
        return 436998964;
    }
}
