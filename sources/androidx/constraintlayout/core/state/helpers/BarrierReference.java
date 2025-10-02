package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* loaded from: classes2.dex */
public class BarrierReference extends HelperReference {
    public State.Direction o0;
    public int p0;
    public Barrier q0;

    /* renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2305a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f2305a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2305a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2305a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2305a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2305a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2305a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public BarrierReference(State state) {
        super(state, State.Helper.g);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        s();
        int iOrdinal = this.o0.ordinal();
        int i = 1;
        if (iOrdinal != 1 && iOrdinal != 3) {
            i = iOrdinal != 4 ? iOrdinal != 5 ? 0 : 3 : 2;
        }
        Barrier barrier = this.q0;
        barrier.x0 = i;
        barrier.z0 = this.p0;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public final ConstraintReference k(int i) {
        this.p0 = i;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public final ConstraintReference l(Float f) {
        this.p0 = this.l0.d(f);
        return this;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public final HelperWidget s() {
        if (this.q0 == null) {
            this.q0 = new Barrier();
        }
        return this.q0;
    }
}
