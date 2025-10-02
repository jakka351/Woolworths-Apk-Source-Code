package androidx.compose.material3.internal;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/CalendarDate;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CalendarDate implements Comparable<CalendarDate> {
    public final int d;
    public final int e;
    public final int f;
    public final long g;

    public CalendarDate(int i, int i2, int i3, long j) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(CalendarDate calendarDate) {
        long j = this.g;
        long j2 = calendarDate.g;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.d == calendarDate.d && this.e == calendarDate.e && this.f == calendarDate.f && this.g == calendarDate.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + b.a(this.f, b.a(this.e, Integer.hashCode(this.d) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.d);
        sb.append(", month=");
        sb.append(this.e);
        sb.append(", dayOfMonth=");
        sb.append(this.f);
        sb.append(", utcTimeMillis=");
        return b.q(sb, this.g, ')');
    }
}
