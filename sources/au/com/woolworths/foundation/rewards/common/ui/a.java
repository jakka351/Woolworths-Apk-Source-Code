package au.com.woolworths.foundation.rewards.common.ui;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ State e;
    public final /* synthetic */ State f;

    public /* synthetic */ a(InfiniteTransition.TransitionAnimationState transitionAnimationState, InfiniteTransition.TransitionAnimationState transitionAnimationState2, int i) {
        this.d = i;
        this.e = transitionAnimationState;
        this.f = transitionAnimationState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                State state = this.e;
                graphicsLayer.j(((Number) state.getD()).floatValue());
                graphicsLayer.l(((Number) state.getD()).floatValue());
                graphicsLayer.b(((Number) this.f.getD()).floatValue());
                break;
            default:
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                State state2 = this.e;
                graphicsLayer.j(((Number) state2.getD()).floatValue());
                graphicsLayer.l(((Number) state2.getD()).floatValue());
                graphicsLayer.b(((Number) this.f.getD()).floatValue());
                break;
        }
        return Unit.f24250a;
    }
}
