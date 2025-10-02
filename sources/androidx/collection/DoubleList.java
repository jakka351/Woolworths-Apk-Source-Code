package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/DoubleList;", "", "Landroidx/collection/MutableDoubleList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class DoubleList {
    public final boolean equals(Object obj) {
        if (!(obj instanceof DoubleList)) {
            return false;
        }
        IntRange intRangeO = RangesKt.o(0, 0);
        if (intRangeO.d > intRangeO.e) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        sb.append((CharSequence) "]");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
