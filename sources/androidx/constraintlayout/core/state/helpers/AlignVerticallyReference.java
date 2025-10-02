package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class AlignVerticallyReference extends HelperReference {
    public float o0;

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        Iterator it = this.n0.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceC = this.l0.c(it.next());
            constraintReferenceC.h();
            Object obj = this.R;
            if (obj != null) {
                constraintReferenceC.p(obj);
            } else {
                Object obj2 = this.S;
                if (obj2 != null) {
                    constraintReferenceC.d0 = State.Constraint.m;
                    constraintReferenceC.S = obj2;
                } else {
                    constraintReferenceC.p(0);
                }
            }
            Object obj3 = this.U;
            if (obj3 != null) {
                constraintReferenceC.d0 = State.Constraint.o;
                constraintReferenceC.U = obj3;
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    constraintReferenceC.e(obj4);
                } else {
                    constraintReferenceC.e(0);
                }
            }
            float f = this.o0;
            if (f != 0.5f) {
                constraintReferenceC.i = f;
            }
        }
    }
}
