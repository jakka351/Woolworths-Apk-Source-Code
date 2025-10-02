package androidx.compose.material3.internal;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/CalendarMonth;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CalendarMonth {

    /* renamed from: a, reason: collision with root package name */
    public final int f1552a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    public CalendarMonth(int i, int i2, int i3, int i4, long j) {
        this.f1552a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
        this.f = ((i3 * 86400000) + j) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.f1552a == calendarMonth.f1552a && this.b == calendarMonth.b && this.c == calendarMonth.c && this.d == calendarMonth.d && this.e == calendarMonth.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f1552a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.f1552a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", numberOfDays=");
        sb.append(this.c);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.d);
        sb.append(", startUtcTimeMillis=");
        return b.q(sb, this.e, ')');
    }
}
