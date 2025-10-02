package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "Companion", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DpOffset {

    /* renamed from: a, reason: collision with root package name */
    public final long f2198a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) Dp.b(a(j))) + ", " + ((Object) Dp.b(b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpOffset) {
            return this.f2198a == ((DpOffset) obj).f2198a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2198a);
    }

    public final String toString() {
        return c(this.f2198a);
    }
}
