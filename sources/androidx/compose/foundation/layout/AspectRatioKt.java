package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AspectRatioKt {
    public static Modifier a(Modifier modifier, float f) {
        return modifier.x0(new AspectRatioElement(f, InspectableValueKt.a()));
    }

    public static final boolean b(int i, int i2, long j) {
        int iJ = Constraints.j(j);
        if (i > Constraints.h(j) || iJ > i) {
            return false;
        }
        return i2 <= Constraints.g(j) && Constraints.i(j) <= i2;
    }
}
