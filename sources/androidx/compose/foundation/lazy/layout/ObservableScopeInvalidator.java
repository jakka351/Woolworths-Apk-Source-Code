package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "", "state", "Landroidx/compose/runtime/MutableState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {
    public static MutableState a() {
        return SnapshotStateKt.e(Unit.f24250a, SnapshotStateKt.g());
    }

    public static final void b(MutableState mutableState) {
        mutableState.setValue(Unit.f24250a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ObservableScopeInvalidator(state=null)";
    }
}
