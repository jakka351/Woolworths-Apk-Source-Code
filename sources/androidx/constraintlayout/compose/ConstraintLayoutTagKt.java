package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ConstraintLayoutTagKt {
    public static final String a(Measurable measurable) {
        Object objI = measurable.i();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = objI instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) objI : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.b();
        }
        return null;
    }
}
