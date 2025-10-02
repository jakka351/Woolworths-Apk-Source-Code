package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0083@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/ListItemType;", "", "Companion", "lines", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
final class ListItemType implements Comparable<ListItemType> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ListItemType$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static int a(boolean z, boolean z2, boolean z3) {
            if ((z && z2) || z3) {
                return 3;
            }
            return (z || z2) ? 2 : 1;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ListItemType listItemType) {
        listItemType.getClass();
        return Intrinsics.j(0, 0);
    }

    public final boolean equals(Object obj) {
        return obj instanceof ListItemType;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "ListItemType(lines=0)";
    }
}
