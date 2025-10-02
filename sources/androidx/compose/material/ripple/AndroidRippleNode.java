package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/material/ripple/RippleHostKey;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public RippleContainer B;
    public RippleHostView C;

    @Override // androidx.compose.material.ripple.RippleHostKey
    public final void M1() {
        this.C = null;
        DrawModifierNodeKt.a(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        RippleContainer rippleContainer = this.B;
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

    @Override // androidx.compose.material.ripple.RippleNode
    public final void s2(PressInteraction.Press press, long j, float f) {
        RippleContainer rippleContainerA = this.B;
        if (rippleContainerA == null) {
            rippleContainerA = Ripple_androidKt.a(Ripple_androidKt.b((View) CompositionLocalConsumerModifierNodeKt.a(this, AndroidCompositionLocals_androidKt.f)));
            this.B = rippleContainerA;
        }
        RippleHostView rippleHostViewA = rippleContainerA.a(this);
        rippleHostViewA.b(press, this.s, j, MathKt.b(f), this.u.a(), ((RippleAlpha) this.v.invoke()).d, new Function0<Unit>() { // from class: androidx.compose.material.ripple.AndroidRippleNode$addRipple$1$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DrawModifierNodeKt.a(this.h);
                return Unit.f24250a;
            }
        });
        this.C = rippleHostViewA;
        DrawModifierNodeKt.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void t2(LayoutNodeDrawScope layoutNodeDrawScope) {
        Canvas canvasA = layoutNodeDrawScope.d.e.a();
        RippleHostView rippleHostView = this.C;
        if (rippleHostView != null) {
            long j = this.y;
            rippleHostView.e(((RippleAlpha) this.v.invoke()).d, MathKt.b(this.x), j, this.u.a());
            rippleHostView.draw(AndroidCanvas_androidKt.a(canvasA));
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void v2(PressInteraction.Press press) {
        RippleHostView rippleHostView = this.C;
        if (rippleHostView != null) {
            rippleHostView.d();
        }
    }
}
