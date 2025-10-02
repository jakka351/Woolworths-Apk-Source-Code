package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/CalendarModel;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CalendarModel {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1551a = new LinkedHashMap();

    public abstract String a(long j, String str, Locale locale);

    public abstract CalendarDate b(long j);

    public abstract DateInputFormat c(Locale locale);

    /* renamed from: d */
    public abstract int getB();

    public abstract CalendarMonth e(int i, int i2);

    public abstract CalendarMonth f(long j);

    public abstract CalendarMonth g(CalendarDate calendarDate);

    public abstract CalendarDate h();

    public abstract List i();

    public abstract CalendarDate j(String str, String str2);

    public abstract CalendarMonth k(CalendarMonth calendarMonth, int i);
}
