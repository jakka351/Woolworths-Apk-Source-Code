package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.viewinterop.a;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/runtime/RememberObserver;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {
    public final ConstraintLayoutScope d;
    public Handler e;
    public final SnapshotStateObserver f = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$observer$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Function0 function0 = (Function0) obj;
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                function0.invoke();
            } else {
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this.h;
                Handler handler = constraintSetForInlineDsl.e;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    constraintSetForInlineDsl.e = handler;
                }
                handler.post(new a(3, function0));
            }
            return Unit.f24250a;
        }
    });
    public boolean g = true;
    public final Function1 h = new Function1<Unit, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.h.g = true;
            return Unit.f24250a;
        }
    };
    public final ArrayList i = new ArrayList();

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        this.d = constraintLayoutScope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final void a(final State state, final List list) {
        this.i.clear();
        this.f.e(Unit.f24250a, this.h, new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws CLParsingException {
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this;
                ConstraintLayoutScope constraintLayoutScope = constraintSetForInlineDsl.d;
                List list2 = list;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object a2 = ((Measurable) list2.get(i)).getA();
                    ConstraintLayoutParentData constraintLayoutParentData = a2 instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) a2 : null;
                    if (constraintLayoutParentData != null) {
                        ConstrainedLayoutReference constrainedLayoutReference = constraintLayoutParentData.d;
                        constraintLayoutScope.getClass();
                        String string = constrainedLayoutReference.b.toString();
                        CLObject cLObject = constraintLayoutScope.f2236a;
                        if (cLObject.y(string) == null) {
                            cLObject.I(string, new CLObject(new char[0]));
                        }
                        CLElement cLElementQ = cLObject.q(string);
                        if (!(cLElementQ instanceof CLObject)) {
                            StringBuilder sbU = YU.a.u("no object found for key <", string, ">, found [");
                            sbU.append(cLElementQ.i());
                            sbU.append("] : ");
                            sbU.append(cLElementQ);
                            throw new CLParsingException(sbU.toString(), cLObject);
                        }
                        constraintLayoutParentData.e.invoke(new ConstrainScope(constrainedLayoutReference.b, (CLObject) cLElementQ));
                    }
                    constraintSetForInlineDsl.i.add(constraintLayoutParentData);
                }
                ConstraintSetParser.i(constraintLayoutScope.f2236a, state, new ConstraintSetParser.LayoutVariables());
                return Unit.f24250a;
            }
        });
        this.g = false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        this.f.f();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final boolean d(List list) {
        if (this.g) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.i;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Object a2 = ((Measurable) list.get(i)).getA();
            if (!Intrinsics.c(a2 instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) a2 : null, arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        SnapshotStateObserver snapshotStateObserver = this.f;
        androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.h;
        if (aVar != null) {
            aVar.dispose();
        }
        snapshotStateObserver.b();
    }
}
