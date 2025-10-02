package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "Companion", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IntSize {

    /* renamed from: a, reason: collision with root package name */
    public final long f2202a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ IntSize(long j) {
        this.f2202a = j;
    }

    public static boolean a(long j, Object obj) {
        return (obj instanceof IntSize) && j == ((IntSize) obj).f2202a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(this.f2202a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2202a);
    }

    public final String toString() {
        return c(this.f2202a);
    }
}
