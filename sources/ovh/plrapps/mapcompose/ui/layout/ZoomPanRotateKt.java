package ovh.plrapps.mapcompose.ui.layout;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ZoomPanRotateKt {
    public static final void a(final Modifier modifier, final GestureListener gestureListener, final LayoutSizeChangeListener layoutSizeChangeListener, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        Intrinsics.h(gestureListener, "gestureListener");
        Intrinsics.h(layoutSizeChangeListener, "layoutSizeChangeListener");
        ComposerImpl composerImplV = composer.v(300311044);
        if ((((composerImplV.n(modifier) ? 4 : 2) | i) & 5851) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composerImplV.y()));
                composerImplV.A(objG);
            }
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
            Modifier modifierX0 = OnRemeasuredModifierKt.a(modifier.x0(new SuspendPointerInputElement(Boolean.valueOf(gestureListener.m()), null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new ZoomPanRotateKt$ZoomPanRotate$1(gestureListener, SplineBasedFloatDecayAnimationSpec_androidKt.a(composerImplV), null)), 6)).x0(new SuspendPointerInputElement(Boolean.valueOf(gestureListener.m()), null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new ZoomPanRotateKt$ZoomPanRotate$2(gestureListener, null)), 6)), new Function1<IntSize, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    layoutSizeChangeListener.b(coroutineScope, ((IntSize) obj).f2202a);
                    return Unit.f24250a;
                }
            }).x0(SizeKt.c);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, ZoomPanRotateKt$ZoomPanRotate$4.f26944a, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a.y(6, composableLambdaImpl, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(gestureListener, layoutSizeChangeListener, composableLambdaImpl, i) { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$5
                public final /* synthetic */ GestureListener i;
                public final /* synthetic */ LayoutSizeChangeListener j;
                public final /* synthetic */ ComposableLambdaImpl k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(3649);
                    ZoomPanRotateKt.a(this.h, this.i, this.j, this.k, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
