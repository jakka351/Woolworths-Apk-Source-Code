package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "Companion", "packedValue", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CornerRadius {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.a(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.a(Float.intBitsToFloat(i)) + ", " + GeometryUtilsKt.a(Float.intBitsToFloat(i2)) + ')';
    }

    public final boolean equals(Object obj) {
        return obj instanceof CornerRadius;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return b(0L);
    }
}
