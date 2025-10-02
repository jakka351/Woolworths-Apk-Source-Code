package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SwipeToDismissKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1330a = 56;

    public static final void a(final DismissState dismissState, final Modifier modifier, final Set set, final Function1 function1, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, Composer composer, final int i) {
        int i2;
        final Set set2;
        final Function1 function12;
        ComposerImpl composerImplV = composer.v(634380143);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(dismissState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            set2 = set;
            i2 |= composerImplV.I(set2) ? 256 : 128;
        } else {
            set2 = set;
        }
        if ((i & 3072) == 0) {
            function12 = function1;
            i2 |= composerImplV.I(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl2) ? 131072 : 65536;
        }
        if (composerImplV.z(i2 & 1, (74899 & i2) != 74898)) {
            BoxWithConstraintsKt.a(modifier, null, false, ComposableLambdaKt.c(338007641, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(boxWithConstraintsScope) ? 4 : 2;
                    }
                    if (composer2.z(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fH = Constraints.h(boxWithConstraintsScope.e());
                        final boolean z = composer2.x(CompositionLocalsKt.n) == LayoutDirection.e;
                        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                        DismissValue dismissValue = DismissValue.d;
                        final LinkedHashMap linkedHashMapL = MapsKt.l(new Pair(fValueOf, dismissValue));
                        DismissDirection dismissDirection = DismissDirection.d;
                        Set set3 = set2;
                        if (set3.contains(dismissDirection)) {
                            linkedHashMapL.put(Float.valueOf(fH), DismissValue.e);
                        }
                        DismissDirection dismissDirection2 = DismissDirection.e;
                        if (set3.contains(dismissDirection2)) {
                            linkedHashMapL.put(Float.valueOf(-fH), DismissValue.f);
                        }
                        final Function1 function13 = function12;
                        boolean zN = composer2.n(function13);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN || objG == composer$Companion$Empty$1) {
                            objG = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                {
                                    super(2);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
                                @Override // kotlin.jvm.functions.Function2
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
                                    /*
                                        r2 = this;
                                        androidx.compose.material.DismissValue r3 = (androidx.compose.material.DismissValue) r3
                                        androidx.compose.material.DismissValue r4 = (androidx.compose.material.DismissValue) r4
                                        float r0 = androidx.compose.material.SwipeToDismissKt.f1330a
                                        if (r3 != r4) goto Ld
                                        androidx.compose.material.DismissValue r0 = androidx.compose.material.DismissValue.d
                                        if (r3 != r0) goto Ld
                                        goto L45
                                    Ld:
                                        if (r3 != r4) goto L16
                                        androidx.compose.material.DismissValue r0 = androidx.compose.material.DismissValue.e
                                        if (r3 != r0) goto L16
                                        androidx.compose.material.DismissDirection r3 = androidx.compose.material.DismissDirection.d
                                        goto L46
                                    L16:
                                        if (r3 != r4) goto L1f
                                        androidx.compose.material.DismissValue r0 = androidx.compose.material.DismissValue.f
                                        if (r3 != r0) goto L1f
                                        androidx.compose.material.DismissDirection r3 = androidx.compose.material.DismissDirection.e
                                        goto L46
                                    L1f:
                                        androidx.compose.material.DismissValue r0 = androidx.compose.material.DismissValue.d
                                        if (r3 != r0) goto L2a
                                        androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.e
                                        if (r4 != r1) goto L2a
                                        androidx.compose.material.DismissDirection r3 = androidx.compose.material.DismissDirection.d
                                        goto L46
                                    L2a:
                                        if (r3 != r0) goto L33
                                        androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.f
                                        if (r4 != r1) goto L33
                                        androidx.compose.material.DismissDirection r3 = androidx.compose.material.DismissDirection.e
                                        goto L46
                                    L33:
                                        androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.e
                                        if (r3 != r1) goto L3c
                                        if (r4 != r0) goto L3c
                                        androidx.compose.material.DismissDirection r3 = androidx.compose.material.DismissDirection.d
                                        goto L46
                                    L3c:
                                        androidx.compose.material.DismissValue r1 = androidx.compose.material.DismissValue.f
                                        if (r3 != r1) goto L45
                                        if (r4 != r0) goto L45
                                        androidx.compose.material.DismissDirection r3 = androidx.compose.material.DismissDirection.e
                                        goto L46
                                    L45:
                                        r3 = 0
                                    L46:
                                        kotlin.jvm.internal.Intrinsics.e(r3)
                                        kotlin.jvm.functions.Function1 r4 = r1
                                        java.lang.Object r3 = r4.invoke(r3)
                                        androidx.compose.material.ThresholdConfig r3 = (androidx.compose.material.ThresholdConfig) r3
                                        return r3
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                }
                            };
                            composer2.A(objG);
                        }
                        final Function2 function2 = (Function2) objG;
                        float f = set3.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set3.contains(dismissDirection) ? 10.0f : 20.0f;
                        Orientation orientation = Orientation.d;
                        final DismissState dismissState2 = dismissState;
                        final boolean z2 = ((SnapshotMutableStateImpl) dismissState2.c).getD() == dismissValue;
                        final ResistanceConfig resistanceConfig = new ResistanceConfig(fH, f, f2);
                        final float f3 = SwipeableDefaults.b;
                        Function1 function1A = InspectableValueKt.a();
                        final DismissState dismissState3 = dismissState;
                        Function3<Modifier, Composer, Integer, Modifier> function3 = new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                                Orientation orientation2 = Orientation.d;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                ((Number) obj6).intValue();
                                composer3.o(43594985);
                                LinkedHashMap linkedHashMap = linkedHashMapL;
                                if (linkedHashMap.isEmpty()) {
                                    throw new IllegalArgumentException("You must have at least one anchor.");
                                }
                                if (CollectionsKt.w(linkedHashMap.values()).size() != linkedHashMap.size()) {
                                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                                }
                                Density density = (Density) composer3.x(CompositionLocalsKt.h);
                                SwipeableState swipeableState = dismissState3;
                                if (swipeableState.b().isEmpty()) {
                                    Float fB = SwipeableKt.b(((SnapshotMutableStateImpl) swipeableState.c).getD(), linkedHashMap);
                                    if (fB == null) {
                                        throw new IllegalArgumentException("The initial value must have an associated anchor.");
                                    }
                                    ((SnapshotMutableFloatStateImpl) swipeableState.e).p(fB.floatValue());
                                    ((SnapshotMutableFloatStateImpl) swipeableState.g).p(fB.floatValue());
                                }
                                boolean zN2 = composer3.n(swipeableState) | composer3.I(linkedHashMap);
                                ResistanceConfig resistanceConfig2 = resistanceConfig;
                                boolean zN3 = zN2 | composer3.n(resistanceConfig2) | composer3.n(function2) | composer3.n(density) | composer3.q(f3);
                                Object objG2 = composer3.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                if (zN3 || objG2 == composer$Companion$Empty$12) {
                                    SwipeableKt$swipeable$3$3$1 swipeableKt$swipeable$3$3$1 = new SwipeableKt$swipeable$3$3$1(dismissState3, linkedHashMap, resistanceConfig2, density, function2, f3, null);
                                    composer3.A(swipeableKt$swipeable$3$3$1);
                                    objG2 = swipeableKt$swipeable$3$3$1;
                                }
                                EffectsKt.f(linkedHashMap, swipeableState, (Function2) objG2, composer3);
                                boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) swipeableState.d).getD()).booleanValue();
                                DraggableState draggableState = swipeableState.p;
                                Orientation orientation2 = Orientation.e;
                                boolean zN4 = composer3.n(swipeableState);
                                Object objG3 = composer3.G();
                                if (zN4 || objG3 == composer$Companion$Empty$12) {
                                    objG3 = new SwipeableKt$swipeable$3$4$1(swipeableState, null);
                                    composer3.A(objG3);
                                }
                                boolean z3 = z;
                                Modifier modifierB = DraggableKt.b(Modifier.Companion.d, draggableState, orientation2, z2, null, zBooleanValue, (Function3) objG3, z3, 32);
                                composer3.l();
                                return modifierB;
                            }
                        };
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierA = ComposedModifierKt.a(companion, function1A, function3);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
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
                        Function2 function22 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, measurePolicyD, function22);
                        Function2 function23 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function23);
                        Function2 function24 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function24);
                        }
                        Function2 function25 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function25);
                        Modifier modifierI = BoxScopeInstance.f944a.i();
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        BiasAlignment.Vertical vertical = Alignment.Companion.j;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierI);
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
                        Updater.b(composer2, rowMeasurePolicyA, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function24);
                        }
                        Updater.b(composer2, modifierD2, function25);
                        ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl;
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        composableLambdaImpl3.invoke(rowScopeInstance, composer2, 6);
                        composer2.f();
                        boolean zN2 = composer2.n(dismissState2);
                        Object objG2 = composer2.G();
                        if (zN2 || objG2 == composer$Companion$Empty$1) {
                            objG2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    return new IntOffset(IntOffsetKt.a(MathKt.b(dismissState2.e.getD().floatValue()), 0));
                                }
                            };
                            composer2.A(objG2);
                        }
                        Modifier modifierA2 = OffsetKt.a(companion, (Function1) objG2);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composer2, 0);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierA2);
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
                        Updater.b(composer2, rowMeasurePolicyA2, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            b.z(p3, composer2, p3, function24);
                        }
                        Updater.b(composer2, modifierD3, function25);
                        composableLambdaImpl2.invoke(rowScopeInstance, composer2, 6);
                        composer2.f();
                        composer2.f();
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 3072, 6);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SwipeToDismissKt.a(dismissState, modifier, set, function1, composableLambdaImpl, composableLambdaImpl2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final DismissState b(int i, int i2, Composer composer) {
        final DismissValue dismissValue = DismissValue.f;
        boolean z = true;
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.d;
        }
        Object[] objArr = new Object[0];
        Function1<DismissValue, DismissState> function1 = new Function1<DismissValue, DismissState>() { // from class: androidx.compose.material.DismissState$Companion$Saver$2
            public final /* synthetic */ Function1 h = SwipeToDismissKt$rememberDismissState$1.h;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new DismissState((DismissValue) obj);
            }
        };
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(function1, DismissState$Companion$Saver$1.h);
        if ((((i & 14) ^ 6) <= 4 || !composer.n(dismissValue)) && (i & 6) != 4) {
            z = false;
        }
        boolean zN = composer.n(SwipeToDismissKt$rememberDismissState$1.h) | z;
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Function0<DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$2$1
                public final /* synthetic */ Function1 i = SwipeToDismissKt$rememberDismissState$1.h;

                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new DismissState(dismissValue);
                }
            };
            composer.A(objG);
        }
        return (DismissState) RememberSaveableKt.c(objArr, saverKt$Saver$12, (Function0) objG, composer, 0, 4);
    }
}
