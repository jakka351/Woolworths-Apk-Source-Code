package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/TimePickerSelectionMode;", "", "Companion", "value", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class TimePickerSelectionMode {

    /* renamed from: a, reason: collision with root package name */
    public final int f1523a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerSelectionMode$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TimePickerSelectionMode) {
            return this.f1523a == ((TimePickerSelectionMode) obj).f1523a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1523a);
    }

    public final String toString() {
        int i = this.f1523a;
        return i == 0 ? "Hour" : i == 1 ? "Minute" : "";
    }
}
