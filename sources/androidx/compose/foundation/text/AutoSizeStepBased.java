package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AutoSizeStepBased implements TextAutoSize {
    public final boolean equals(Object obj) {
        boolean zA = TextUnit.a(0L, 0L);
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoSizeStepBased)) {
            return false;
        }
        return zA && zA && zA;
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        return Long.hashCode(0L) + b.b(Long.hashCode(0L) * 31, 31, 0L);
    }
}
