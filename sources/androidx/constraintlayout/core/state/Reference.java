package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public interface Reference {
    ConstraintWidget a();

    void apply();

    void b(ConstraintWidget constraintWidget);

    Facade c();

    Object getKey();
}
