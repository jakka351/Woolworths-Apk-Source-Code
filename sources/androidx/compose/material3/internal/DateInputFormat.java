package androidx.compose.material3.internal;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/DateInputFormat;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DateInputFormat {

    /* renamed from: a, reason: collision with root package name */
    public final String f1553a;
    public final char b;
    public final String c;

    public DateInputFormat(String str, char c) {
        this.f1553a = str;
        this.b = c;
        this.c = StringsKt.Q(str, String.valueOf(c), "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return Intrinsics.c(this.f1553a, dateInputFormat.f1553a) && this.b == dateInputFormat.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.f1553a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f1553a + ", delimiter=" + this.b + ')';
    }
}
