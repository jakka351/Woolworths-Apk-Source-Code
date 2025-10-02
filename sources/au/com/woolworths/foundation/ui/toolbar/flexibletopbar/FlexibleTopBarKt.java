package au.com.woolworths.foundation.ui.toolbar.flexibletopbar;

import androidx.camera.core.impl.b;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "heightOffsetLimit", "Landroidx/compose/ui/graphics/Color;", "appBarContainerColor", "toolbar_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FlexibleTopBarKt {
    public static final void a(Modifier modifier, FlexibleTopBarColors flexibleTopBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        final Modifier modifier2;
        float fB;
        TopAppBarState f1443a;
        ComposerImpl composerImplV = composer.v(-398408789);
        int i2 = i | 6 | (composerImplV.n(flexibleTopBarColors) ? 32 : 16) | (composerImplV.n(topAppBarScrollBehavior) ? 256 : 128);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.u0();
            int i3 = i & 1;
            Modifier modifierB = Modifier.Companion.d;
            if (i3 == 0 || composerImplV.c0()) {
                modifier2 = modifierB;
            } else {
                composerImplV.j();
                modifier2 = modifier;
            }
            composerImplV.W();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) objG;
            composerImplV.V(false);
            Float fValueOf = Float.valueOf(mutableFloatState.a());
            composerImplV.o(-1633490746);
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new FlexibleTopBarKt$FlexibleTopBar$1$1(topAppBarScrollBehavior, mutableFloatState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, fValueOf, (Function2) objG2);
            if (topAppBarScrollBehavior == null || (f1443a = topAppBarScrollBehavior.getF1443a()) == null) {
                fB = 0.0f;
            } else {
                MutableFloatState mutableFloatState2 = f1443a.f1527a;
                float fA = ((SnapshotMutableFloatStateImpl) mutableFloatState2).a();
                fB = BitmapDescriptorFactory.HUE_RED;
                if (fA != BitmapDescriptorFactory.HUE_RED) {
                    fB = 1 - (RangesKt.b(((SnapshotMutableFloatStateImpl) mutableFloatState2).a() - ((SnapshotMutableFloatStateImpl) f1443a.b).a(), ((SnapshotMutableFloatStateImpl) mutableFloatState2).a(), BitmapDescriptorFactory.HUE_RED) / ((SnapshotMutableFloatStateImpl) mutableFloatState2).a());
                }
            }
            float f = fB > 0.01f ? 1.0f : 0.0f;
            composerImplV.o(1354665395);
            long jH = ColorKt.h(flexibleTopBarColors.f8933a, EasingKt.c.a(f), flexibleTopBarColors.b);
            composerImplV.V(false);
            State stateB = SingleValueAnimationKt.b(jH, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), null, composerImplV, 48, 12);
            composerImplV.o(-618707713);
            if (topAppBarScrollBehavior != null) {
                Orientation orientation = Orientation.d;
                composerImplV.o(5004770);
                boolean z2 = i4 == 256;
                Object objG3 = composerImplV.G();
                if (z2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new c(topAppBarScrollBehavior, 1);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                DraggableState draggableStateC = DraggableKt.c(composerImplV, (Function1) objG3);
                composerImplV.o(5004770);
                boolean z3 = i4 == 256;
                Object objG4 = composerImplV.G();
                if (z3 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new FlexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                modifierB = DraggableKt.b(modifierB, draggableStateC, orientation, false, null, false, (Function3) objG4, false, 188);
            }
            composerImplV.V(false);
            Modifier modifierX0 = modifier2.x0(modifierB);
            long j = ((Color) stateB.getD()).f1766a;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(2020849926, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt$FlexibleTopBar$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1633490746);
                        final TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        boolean zN = composer2.n(topAppBarScrollBehavior2);
                        Object objG5 = composer2.G();
                        if (zN || objG5 == Composer.Companion.f1624a) {
                            final MutableFloatState mutableFloatState3 = mutableFloatState;
                            objG5 = new MeasurePolicy() { // from class: au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt$FlexibleTopBar$2$1$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public final MeasureResult c(MeasureScope Layout, List measurables, long j2) {
                                    long j3;
                                    final Placeable defaultPlaceable;
                                    TopAppBarState f1443a2;
                                    Intrinsics.h(Layout, "$this$Layout");
                                    Intrinsics.h(measurables, "measurables");
                                    if (measurables.isEmpty()) {
                                        j3 = j2;
                                        defaultPlaceable = new DefaultPlaceable();
                                    } else {
                                        j3 = j2;
                                        defaultPlaceable = ((Measurable) CollectionsKt.D(measurables)).c0(Constraints.a(j3, 0, 0, 0, 0, 14));
                                    }
                                    mutableFloatState3.p(defaultPlaceable.e * (-1));
                                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                    final float fB2 = (topAppBarScrollBehavior3 == null || (f1443a2 = topAppBarScrollBehavior3.getF1443a()) == null) ? BitmapDescriptorFactory.HUE_RED : f1443a2.b();
                                    return Layout.L0(Constraints.h(j3), Math.max(MathKt.b(defaultPlaceable.e + fB2), 0), EmptyMap.d, new Function1() { // from class: au.com.woolworths.foundation.ui.toolbar.flexibletopbar.a
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            Placeable.PlacementScope layout = (Placeable.PlacementScope) obj3;
                                            Intrinsics.h(layout, "$this$layout");
                                            layout.e(defaultPlaceable, 0, (int) fB2, BitmapDescriptorFactory.HUE_RED);
                                            return Unit.f24250a;
                                        }
                                    });
                                }
                            };
                            composer2.A(objG5);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objG5;
                        composer2.l();
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifier2);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicy, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        android.support.v4.media.session.a.x(0, composer2, composableLambdaImpl);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            composerImplV = composerImplV;
            SurfaceKt.a(modifierX0, null, j, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, composableLambdaImplC, composerImplV, 12582912, 122);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(modifier2, flexibleTopBarColors, topAppBarScrollBehavior, composableLambdaImpl, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.material3.TopAppBarState r9, float r10, androidx.compose.animation.core.DecayAnimationSpec r11, androidx.compose.animation.core.AnimationSpec r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt.b(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
