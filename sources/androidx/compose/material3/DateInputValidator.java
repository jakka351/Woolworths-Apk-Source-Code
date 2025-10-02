package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateInputValidator {

    /* renamed from: a, reason: collision with root package name */
    public final IntRange f1429a;
    public final SelectableDates b;
    public final DateInputFormat c;
    public final DatePickerFormatter d;
    public final String e;
    public final String f;
    public final String g;
    public Long h = null;
    public Long i = null;

    public DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4) {
        this.f1429a = intRange;
        this.b = selectableDates;
        this.c = dateInputFormat;
        this.d = datePickerFormatter;
        this.e = str;
        this.f = str2;
        this.g = str4;
    }
}
