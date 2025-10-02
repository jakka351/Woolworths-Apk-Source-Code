package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/AllCapsTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* data */ class AllCapsTransformation implements InputTransformation {
    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final KeyboardOptions a() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AllCapsTransformation);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "InputTransformation.allCaps(locale=null)";
    }
}
