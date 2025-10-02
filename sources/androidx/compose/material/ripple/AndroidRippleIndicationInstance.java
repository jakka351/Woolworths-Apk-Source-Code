package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/material/ripple/RippleHostKey;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {
    public final boolean f;
    public final float g;
    public final MutableState h;
    public final MutableState i;
    public final ViewGroup j;
    public RippleContainer k;
    public final MutableState l;
    public final MutableState m;
    public long n;
    public int o;
    public final Function0 p;

    public AndroidRippleIndicationInstance(boolean z, float f, MutableState mutableState, MutableState mutableState2, ViewGroup viewGroup) {
        super(z, mutableState2);
        this.f = z;
        this.g = f;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = viewGroup;
        this.l = SnapshotStateKt.f(null);
        this.m = SnapshotStateKt.f(Boolean.TRUE);
        this.n = 0L;
        this.o = -1;
        this.p = new Function0<Unit>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ((SnapshotMutableStateImpl) this.h.m).setValue(Boolean.valueOf(!((Boolean) ((SnapshotMutableStateImpl) r0).getD()).booleanValue()));
                return Unit.f24250a;
            }
        };
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public final void M1() {
        ((SnapshotMutableStateImpl) this.l).setValue(null);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void a(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        this.n = canvasDrawScope.h();
        float f = this.g;
        this.o = Float.isNaN(f) ? MathKt.b(RippleAnimationKt.a(layoutNodeDrawScope, this.f, canvasDrawScope.h())) : canvasDrawScope.r1(f);
        long j = ((Color) this.h.getD()).f1766a;
        float f2 = ((RippleAlpha) this.i.getD()).d;
        layoutNodeDrawScope.Q0();
        this.e.a(layoutNodeDrawScope, Float.isNaN(f) ? RippleAnimationKt.a(layoutNodeDrawScope, this.d, canvasDrawScope.h()) : layoutNodeDrawScope.T1(f), j);
        Canvas canvasA = canvasDrawScope.e.a();
        ((Boolean) ((SnapshotMutableStateImpl) this.m).getD()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) ((SnapshotMutableStateImpl) this.l).getD();
        if (rippleHostView != null) {
            rippleHostView.e(f2, this.o, canvasDrawScope.h(), j);
            rippleHostView.draw(AndroidCanvas_androidKt.a(canvasA));
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void b(PressInteraction.Press press, CoroutineScope coroutineScope) {
        RippleContainer rippleContainerA = this.k;
        if (rippleContainerA == null) {
            rippleContainerA = Ripple_androidKt.a(this.j);
            this.k = rippleContainerA;
        }
        RippleHostView rippleHostViewA = rippleContainerA.a(this);
        rippleHostViewA.b(press, this.f, this.n, this.o, ((Color) this.h.getD()).f1766a, ((RippleAlpha) this.i.getD()).d, this.p);
        ((SnapshotMutableStateImpl) this.l).setValue(rippleHostViewA);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void d(PressInteraction.Press press) {
        RippleHostView rippleHostView = (RippleHostView) ((SnapshotMutableStateImpl) this.l).getD();
        if (rippleHostView != null) {
            rippleHostView.d();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        RippleContainer rippleContainer = this.k;
        if (rippleContainer != null) {
            M1();
            RippleHostMap rippleHostMap = rippleContainer.g;
            RippleHostView rippleHostView = (RippleHostView) rippleHostMap.f1389a.get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = rippleHostMap.f1389a;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f.add(rippleHostView);
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        RippleContainer rippleContainer = this.k;
        if (rippleContainer != null) {
            M1();
            RippleHostMap rippleHostMap = rippleContainer.g;
            RippleHostView rippleHostView = (RippleHostView) rippleHostMap.f1389a.get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = rippleHostMap.f1389a;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.f.add(rippleHostView);
            }
        }
    }
}
