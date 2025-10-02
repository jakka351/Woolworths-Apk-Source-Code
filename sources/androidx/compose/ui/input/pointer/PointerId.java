package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerId;", "", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class PointerId {
    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return obj instanceof PointerId;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return b(0L);
    }
}
