package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "", "packedValue", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class GridItemSpan {

    /* renamed from: a, reason: collision with root package name */
    public final long f1007a;

    public final boolean equals(Object obj) {
        if (obj instanceof GridItemSpan) {
            return this.f1007a == ((GridItemSpan) obj).f1007a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1007a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f1007a + ')';
    }
}
