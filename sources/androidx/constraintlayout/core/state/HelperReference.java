package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class HelperReference extends ConstraintReference implements Facade {
    public final State l0;
    public final State.Helper m0;
    public final ArrayList n0;

    public HelperReference(State state, State.Helper helper) {
        super(state);
        this.n0 = new ArrayList();
        this.l0 = state;
        this.m0 = helper;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final ConstraintWidget a() {
        return s();
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.n0, objArr);
    }

    public final void r() throws NumberFormatException {
        super.apply();
    }

    public HelperWidget s() {
        return null;
    }
}
