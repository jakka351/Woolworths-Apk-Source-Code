package androidx.compose.material.ripple;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Deprecated
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    public final boolean f;
    public final float g;
    public final MutableState h;
    public final MutableState i;
    public final SnapshotStateMap j;
    public float k;

    public CommonRippleIndicationInstance(boolean z, float f, MutableState mutableState, MutableState mutableState2) {
        super(z, mutableState2);
        this.f = z;
        this.g = f;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = new SnapshotStateMap();
        this.k = Float.NaN;
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void a(LayoutNodeDrawScope layoutNodeDrawScope) throws Throwable {
        long j;
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1;
        long j2;
        LayoutNodeDrawScope layoutNodeDrawScope2 = layoutNodeDrawScope;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope2.d;
        float f = this.g;
        this.k = Float.isNaN(f) ? RippleAnimationKt.a(layoutNodeDrawScope2, this.f, canvasDrawScope.h()) : layoutNodeDrawScope2.T1(f);
        long j3 = ((Color) this.h.getD()).f1766a;
        layoutNodeDrawScope2.Q0();
        this.e.a(layoutNodeDrawScope2, Float.isNaN(f) ? RippleAnimationKt.a(layoutNodeDrawScope2, this.d, canvasDrawScope.h()) : layoutNodeDrawScope2.T1(f), j3);
        Iterator it = this.j.e.iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it.next()).getValue();
            float f2 = ((RippleAlpha) this.i.getD()).d;
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                j = j3;
            } else {
                long jB = Color.b(j3, f2);
                rippleAnimation.getClass();
                Animatable animatable = rippleAnimation.h;
                if (rippleAnimation.d == null) {
                    long jH = canvasDrawScope.h();
                    float f3 = RippleAnimationKt.f1388a;
                    rippleAnimation.d = Float.valueOf(Math.max(Size.d(jH), Size.b(jH)) * 0.3f);
                }
                if (rippleAnimation.f1387a == null) {
                    rippleAnimation.f1387a = new Offset(canvasDrawScope.M0());
                }
                if (rippleAnimation.e == null) {
                    rippleAnimation.e = new Offset(OffsetKt.a(Size.d(canvasDrawScope.h()) / 2.0f, Size.b(canvasDrawScope.h()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) ((SnapshotMutableStateImpl) rippleAnimation.k).getD()).booleanValue() || ((Boolean) ((SnapshotMutableStateImpl) rippleAnimation.j).getD()).booleanValue()) ? ((Number) rippleAnimation.f.f()).floatValue() : 1.0f;
                Float f4 = rippleAnimation.d;
                Intrinsics.e(f4);
                float fB = MathHelpersKt.b(f4.floatValue(), rippleAnimation.b, ((Number) rippleAnimation.g.f()).floatValue());
                Offset offset = rippleAnimation.f1387a;
                Intrinsics.e(offset);
                float fE = Offset.e(offset.f1751a);
                Offset offset2 = rippleAnimation.e;
                Intrinsics.e(offset2);
                float fB2 = MathHelpersKt.b(fE, Offset.e(offset2.f1751a), ((Number) animatable.f()).floatValue());
                Offset offset3 = rippleAnimation.f1387a;
                Intrinsics.e(offset3);
                float f5 = Offset.f(offset3.f1751a);
                Offset offset4 = rippleAnimation.e;
                Intrinsics.e(offset4);
                long jA = OffsetKt.a(fB2, MathHelpersKt.b(f5, Offset.f(offset4.f1751a), ((Number) animatable.f()).floatValue()));
                long jB2 = Color.b(jB, Color.d(jB) * fFloatValue);
                if (rippleAnimation.c) {
                    float fD = Size.d(canvasDrawScope.h());
                    float fB3 = Size.b(canvasDrawScope.h());
                    CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$12 = canvasDrawScope.e;
                    long jD = canvasDrawScope$drawContext$12.d();
                    canvasDrawScope$drawContext$12.a().save();
                    try {
                        canvasDrawScope$drawContext$12.f1798a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fD, fB3, 1);
                        canvasDrawScope$drawContext$1 = canvasDrawScope$drawContext$12;
                        j = j3;
                        j2 = jD;
                        try {
                            DrawScope.j0(layoutNodeDrawScope2, jB2, fB, jA, null, 0, 120);
                            b.C(canvasDrawScope$drawContext$1, j2);
                        } catch (Throwable th) {
                            th = th;
                            b.C(canvasDrawScope$drawContext$1, j2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        canvasDrawScope$drawContext$1 = canvasDrawScope$drawContext$12;
                        j2 = jD;
                    }
                } else {
                    j = j3;
                    DrawScope.j0(layoutNodeDrawScope, jB2, fB, jA, null, 0, 120);
                }
            }
            layoutNodeDrawScope2 = layoutNodeDrawScope;
            j3 = j;
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void b(PressInteraction.Press press, CoroutineScope coroutineScope) {
        SnapshotStateMap snapshotStateMap = this.j;
        Iterator it = snapshotStateMap.e.iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) ((Map.Entry) it.next()).getValue();
            ((SnapshotMutableStateImpl) rippleAnimation.k).setValue(Boolean.TRUE);
            rippleAnimation.i.h(Unit.f24250a);
        }
        boolean z = this.f;
        RippleAnimation rippleAnimation2 = new RippleAnimation(z ? new Offset(press.f925a) : null, this.k, z);
        snapshotStateMap.put(press, rippleAnimation2);
        BuildersKt.c(coroutineScope, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation2, this, press, null), 3);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void d(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.j.get(press);
        if (rippleAnimation != null) {
            ((SnapshotMutableStateImpl) rippleAnimation.k).setValue(Boolean.TRUE);
            rippleAnimation.i.h(Unit.f24250a);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        this.j.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        this.j.clear();
    }
}
