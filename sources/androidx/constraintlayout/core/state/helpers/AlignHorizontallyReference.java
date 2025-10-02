package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class AlignHorizontallyReference extends HelperReference {
    public float o0;

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        Iterator it = this.n0.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceC = this.l0.c(it.next());
            constraintReferenceC.g();
            Object obj = this.N;
            if (obj != null) {
                constraintReferenceC.o(obj);
            } else {
                Object obj2 = this.O;
                if (obj2 != null) {
                    constraintReferenceC.d0 = State.Constraint.i;
                    constraintReferenceC.O = obj2;
                } else {
                    constraintReferenceC.o(0);
                }
            }
            Object obj3 = this.P;
            if (obj3 != null) {
                constraintReferenceC.d0 = State.Constraint.j;
                constraintReferenceC.P = obj3;
            } else {
                Object obj4 = this.Q;
                if (obj4 != null) {
                    constraintReferenceC.i(obj4);
                } else {
                    constraintReferenceC.i(0);
                }
            }
            float f = this.o0;
            if (f != 0.5f) {
                constraintReferenceC.h = f;
            }
        }
    }
}
