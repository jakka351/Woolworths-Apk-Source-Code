package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MeasurerKt {
    public static final String a(Measurable measurable) {
        String string;
        Object objA = LayoutIdKt.a(measurable);
        if (objA == null) {
            objA = ConstraintLayoutTagKt.a(measurable);
        }
        return (objA == null || (string = objA.toString()) == null) ? "null" : string;
    }
}
