package coil3.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil3/compose/AsyncImageModelEqualityDelegate$Companion$AllProperties$1", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncImageModelEqualityDelegate$Companion$AllProperties$1 implements AsyncImageModelEqualityDelegate {
    @Override // coil3.compose.AsyncImageModelEqualityDelegate
    public final boolean equals(Object obj, Object obj2) {
        return Intrinsics.c(obj, obj2);
    }

    @Override // coil3.compose.AsyncImageModelEqualityDelegate
    public final int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.AllProperties";
    }
}
