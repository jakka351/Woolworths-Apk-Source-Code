package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0007²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/constraintlayout/core/state/Dimension;", "SolverDimension", "Landroidx/constraintlayout/core/state/State;", "SolverState", "Landroidx/constraintlayout/compose/ConstraintSet;", "startConstraint", "endConstraint", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt {
    public static final void a(State state, List list) {
        ArrayList arrayList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            Object objA = LayoutIdKt.a(measurable);
            if (objA == null && (objA = ConstraintLayoutTagKt.a(measurable)) == null) {
                objA = new ConstraintLayoutKt$createId$1();
            }
            ConstraintReference constraintReferenceC = state.c(objA.toString());
            if (constraintReferenceC != null) {
                constraintReferenceC.g0 = measurable;
                ConstraintWidget constraintWidget = constraintReferenceC.h0;
                if (constraintWidget != null) {
                    constraintWidget.i0 = measurable;
                }
            }
            Object a2 = measurable.getA();
            ConstraintLayoutTagParentData constraintLayoutTagParentData = a2 instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) a2 : null;
            String strA = constraintLayoutTagParentData != null ? constraintLayoutTagParentData.a() : null;
            if (strA != null && (objA instanceof String)) {
                String str = (String) objA;
                HashMap map = state.e;
                if (state.c(str) != null) {
                    if (map.containsKey(strA)) {
                        arrayList = (ArrayList) map.get(strA);
                    } else {
                        arrayList = new ArrayList();
                        map.put(strA, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }
}
