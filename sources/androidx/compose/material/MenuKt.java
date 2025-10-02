package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "scale", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MenuKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1298a;
    public static final float b;
    public static final float d;
    public static final float g;
    public static final float c = 16;
    public static final float e = 112;
    public static final float f = 280;

    static {
        float f2 = 8;
        f1298a = f2;
        float f3 = 48;
        b = f3;
        d = f2;
        g = f3;
    }

    public static final void a(final MutableTransitionState mutableTransitionState, MutableState mutableState, final ScrollState scrollState, final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        final MutableState mutableState2;
        ComposerImpl composerImplV = composer.v(435109845);
        int i2 = i | (composerImplV.n(mutableTransitionState) ? 4 : 2) | (composerImplV.n(scrollState) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024) | (composerImplV.I(composableLambdaImpl) ? 16384 : 8192);
        if (composerImplV.z(i2 & 1, (i2 & 9363) != 9362)) {
            Transition transitionE = TransitionKt.e(mutableTransitionState, "DropDownMenu", composerImplV, (i2 & 14) | 48);
            TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
            TransitionState transitionState = transitionE.f776a;
            MutableState mutableState3 = transitionE.d;
            boolean zBooleanValue = ((Boolean) transitionState.a()).booleanValue();
            composerImplV.o(1652594929);
            float f2 = zBooleanValue ? 1.0f : 0.8f;
            composerImplV.V(false);
            Float fValueOf = Float.valueOf(f2);
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState3;
            boolean zBooleanValue2 = ((Boolean) snapshotMutableStateImpl.getD()).booleanValue();
            composerImplV.o(1652594929);
            float f3 = zBooleanValue2 ? 1.0f : 0.8f;
            composerImplV.V(false);
            final Transition.TransitionAnimationState transitionAnimationStateD = TransitionKt.d(transitionE, fValueOf, Float.valueOf(f3), (FiniteAnimationSpec) MenuKt$DropdownMenuContent$scale$2.h.invoke(transitionE.f(), composerImplV, 0), twoWayConverter, composerImplV, 0);
            boolean zBooleanValue3 = ((Boolean) transitionE.f776a.a()).booleanValue();
            composerImplV.o(388050693);
            float f4 = zBooleanValue3 ? 1.0f : 0.0f;
            composerImplV.V(false);
            Float fValueOf2 = Float.valueOf(f4);
            boolean zBooleanValue4 = ((Boolean) snapshotMutableStateImpl.getD()).booleanValue();
            composerImplV.o(388050693);
            float f5 = zBooleanValue4 ? 1.0f : 0.0f;
            composerImplV.V(false);
            final Transition.TransitionAnimationState transitionAnimationStateD2 = TransitionKt.d(transitionE, fValueOf2, Float.valueOf(f5), (FiniteAnimationSpec) MenuKt$DropdownMenuContent$alpha$2.h.invoke(transitionE.f(), composerImplV, 0), twoWayConverter, composerImplV, 0);
            boolean zN = composerImplV.n(transitionAnimationStateD) | composerImplV.n(transitionAnimationStateD2);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                mutableState2 = mutableState;
                objG = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                        float f6 = MenuKt.f1298a;
                        State state = transitionAnimationStateD;
                        graphicsLayerScope.j(((Number) state.getD()).floatValue());
                        graphicsLayerScope.l(((Number) state.getD()).floatValue());
                        graphicsLayerScope.b(((Number) transitionAnimationStateD2.getD()).floatValue());
                        graphicsLayerScope.p0(((TransformOrigin) mutableState2.getD()).f1786a);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            } else {
                mutableState2 = mutableState;
            }
            CardKt.a(GraphicsLayerModifierKt.a(Modifier.Companion.d, (Function1) objG), null, 0L, 0L, null, f1298a, ComposableLambdaKt.c(895555282, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier modifierB = ScrollKt.b(IntrinsicKt.b(PaddingKt.h(modifier, BitmapDescriptorFactory.HUE_RED, MenuKt.d, 1), IntrinsicSize.e), scrollState, true);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composableLambdaImpl.invoke(ColumnScopeInstance.f948a, composer2, 6);
                        composer2.f();
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769472, 30);
            composerImplV = composerImplV;
        } else {
            mutableState2 = mutableState;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(mutableState2, scrollState, modifier, composableLambdaImpl, i) { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$3
                public final /* synthetic */ MutableState i;
                public final /* synthetic */ ScrollState j;
                public final /* synthetic */ Modifier k;
                public final /* synthetic */ ComposableLambdaImpl l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(49);
                    MenuKt.a(this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(Function0 function0, final PaddingValues paddingValues, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        final Function0 function02;
        ComposerImpl composerImplV = composer.v(87134531);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 |= composerImplV.n(companion) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 131072 : 65536;
        }
        if (composerImplV.z(i2 & 1, (74899 & i2) != 74898)) {
            function02 = function0;
            Modifier modifierE = PaddingKt.e(SizeKt.t(SizeKt.e(ClickableKt.b(companion, null, RippleKt.b(BitmapDescriptorFactory.HUE_RED, 6, 0L, true), true, null, null, function02, 24), 1.0f), e, g, f, BitmapDescriptorFactory.HUE_RED, 8), paddingValues);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(MaterialTheme.c(composerImplV).g, ComposableLambdaKt.c(1190489496, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        composer2.o(-186854702);
                        float fB = ContentAlpha.b(composer2);
                        composer2.l();
                        ProvidedValue providedValueB = ContentAlphaKt.f1260a.b(Float.valueOf(fB));
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(-1705995688, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    composableLambdaImpl2.invoke(RowScopeInstance.f974a, composer3, 0);
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
            composerImplV.V(true);
        } else {
            function02 = function0;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    MenuKt.b(function02, paddingValues, composableLambdaImpl, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long c(androidx.compose.ui.unit.IntRect r11, androidx.compose.ui.unit.IntRect r12) {
        /*
            int r0 = r12.f2201a
            int r1 = r12.d
            int r2 = r12.f2201a
            int r3 = r12.c
            int r4 = r12.b
            int r5 = r11.c
            int r6 = r11.b
            int r7 = r11.d
            int r8 = r11.f2201a
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r0 < r5) goto L19
        L17:
            r11 = r10
            goto L39
        L19:
            if (r3 > r8) goto L1d
            r11 = r9
            goto L39
        L1d:
            int r0 = r12.d()
            if (r0 != 0) goto L24
            goto L17
        L24:
            int r0 = java.lang.Math.max(r8, r2)
            int r11 = r11.c
            int r11 = java.lang.Math.min(r11, r3)
            int r11 = r11 + r0
            int r11 = r11 / 2
            int r11 = r11 - r2
            float r11 = (float) r11
            int r0 = r12.d()
            float r0 = (float) r0
            float r11 = r11 / r0
        L39:
            if (r4 < r7) goto L3d
        L3b:
            r9 = r10
            goto L5b
        L3d:
            if (r1 > r6) goto L40
            goto L5b
        L40:
            int r0 = r12.b()
            if (r0 != 0) goto L47
            goto L3b
        L47:
            int r0 = java.lang.Math.max(r6, r4)
            int r1 = java.lang.Math.min(r7, r1)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r1 = r1 - r4
            float r0 = (float) r1
            int r12 = r12.b()
            float r12 = (float) r12
            float r9 = r0 / r12
        L5b:
            long r11 = androidx.compose.ui.graphics.TransformOriginKt.a(r11, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.c(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }
}
