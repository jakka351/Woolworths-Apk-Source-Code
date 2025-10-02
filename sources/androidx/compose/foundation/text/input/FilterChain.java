package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/FilterChain;", "Landroidx/compose/foundation/text/input/InputTransformation;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FilterChain implements InputTransformation {
    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final KeyboardOptions a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FilterChain.class == obj.getClass()) {
            return Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(a(), ((FilterChain) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return ((Object) null) + ".then(" + ((Object) null) + ')';
    }
}
