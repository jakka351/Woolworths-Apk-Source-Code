package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class VerticalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2308a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f2308a = iArr;
            try {
                State.Chain chain = State.Chain.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f2308a;
                State.Chain chain2 = State.Chain.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f2308a;
                State.Chain chain3 = State.Chain.d;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        State state;
        State.Constraint constraint;
        ArrayList arrayList = this.n0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            state = this.l0;
            if (!zHasNext) {
                break;
            } else {
                state.c(it.next()).h();
            }
        }
        Iterator it2 = arrayList.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            constraint = State.Constraint.o;
            if (!zHasNext2) {
                break;
            }
            Object next = it2.next();
            ConstraintReference constraintReferenceC = state.c(next);
            State.Constraint constraint2 = State.Constraint.m;
            if (constraintReference2 == null) {
                Object obj = this.R;
                if (obj != null) {
                    constraintReferenceC.p(obj);
                    constraintReferenceC.k(this.n).m(this.t);
                } else {
                    Object obj2 = this.S;
                    if (obj2 != null) {
                        constraintReferenceC.d0 = constraint2;
                        constraintReferenceC.S = obj2;
                        constraintReferenceC.k(this.n).m(this.t);
                    } else {
                        String string = constraintReferenceC.f2294a.toString();
                        constraintReferenceC.p(0);
                        constraintReferenceC.l(Float.valueOf(w(string))).n(Float.valueOf(v(string)));
                    }
                }
                constraintReference2 = constraintReferenceC;
            }
            if (constraintReference != null) {
                String string2 = constraintReference.f2294a.toString();
                String string3 = constraintReferenceC.f2294a.toString();
                Object obj3 = constraintReferenceC.f2294a;
                constraintReference.d0 = constraint;
                constraintReference.U = obj3;
                constraintReference.l(Float.valueOf(u(string2))).n(Float.valueOf(t(string2)));
                Object obj4 = constraintReference.f2294a;
                constraintReferenceC.d0 = constraint2;
                constraintReferenceC.S = obj4;
                constraintReferenceC.l(Float.valueOf(w(string3))).n(Float.valueOf(v(string3)));
            }
            String string4 = next.toString();
            HashMap map = this.p0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                constraintReferenceC.g = fFloatValue;
            }
            constraintReference = constraintReferenceC;
        }
        if (constraintReference != null) {
            Object obj5 = this.U;
            if (obj5 != null) {
                constraintReference.d0 = constraint;
                constraintReference.U = obj5;
                constraintReference.k(this.o).m(this.u);
            } else {
                Object obj6 = this.V;
                if (obj6 != null) {
                    constraintReference.e(obj6);
                    constraintReference.k(this.o).m(this.u);
                } else {
                    String string5 = constraintReference.f2294a.toString();
                    constraintReference.e(0);
                    constraintReference.l(Float.valueOf(u(string5))).n(Float.valueOf(t(string5)));
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f = this.o0;
        if (f != 0.5f) {
            constraintReference2.i = f;
        }
        int iOrdinal = this.u0.ordinal();
        if (iOrdinal == 0) {
            constraintReference2.e = 0;
        } else if (iOrdinal == 1) {
            constraintReference2.e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            constraintReference2.e = 2;
        }
    }
}
