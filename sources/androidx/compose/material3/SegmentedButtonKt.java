package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SegmentedButtonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1489a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z, final Function0 function0, final Shape shape, Modifier modifier, boolean z2, final SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, Function2 function2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        BorderStroke borderStrokeA;
        final Function2 function2C;
        boolean z3;
        int i3;
        Modifier modifier2;
        int i4;
        long j;
        boolean z4;
        long j2;
        final boolean z5;
        final BorderStroke borderStroke2;
        final Function2 function22;
        final Modifier modifier3;
        ComposerImpl composerImplV = composer.v(-1016574361);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(singleChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(shape) ? 2048 : 1024;
        }
        int i5 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i5 |= composerImplV.n(segmentedButtonColors) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = i5 | 905969664;
        if ((306783379 & i6) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            z5 = z2;
            borderStroke2 = borderStroke;
            function22 = function2;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.f1488a;
                borderStrokeA = BorderStrokeKt.a(z ? segmentedButtonColors.c : !z ? segmentedButtonColors.f : segmentedButtonColors.l, SegmentedButtonDefaults.b);
                function2C = ComposableLambdaKt.c(1235063168, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            SegmentedButtonDefaults.f1488a.b(z, null, composer2, 3072);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV);
                z3 = true;
                i3 = i6 & (-29360129);
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                z3 = z2;
                borderStrokeA = borderStroke;
                function2C = function2;
                i3 = i6 & (-29360129);
                modifier2 = modifier;
            }
            composerImplV.W();
            composerImplV.o(1788214045);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            composerImplV.V(false);
            if (z3 && z) {
                i4 = 0;
                j = segmentedButtonColors.f1486a;
            } else {
                i4 = 0;
                j = (!z3 || z) ? (z3 || !z) ? segmentedButtonColors.j : segmentedButtonColors.g : segmentedButtonColors.d;
            }
            if (z3 && z) {
                z4 = z3;
                j2 = segmentedButtonColors.b;
            } else {
                z4 = z3;
                j2 = (!z4 || z) ? (z4 || !z) ? segmentedButtonColors.k : segmentedButtonColors.h : segmentedButtonColors.e;
            }
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = SnapshotIntStateKt.a(i4);
                composerImplV.A(objG2);
            }
            final MutableIntState mutableIntState = (MutableIntState) objG2;
            boolean zN = composerImplV.n(mutableInteractionSource);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new SegmentedButtonKt$interactionCountAsState$1$1(mutableInteractionSource, mutableIntState, null);
                composerImplV.A(objG3);
            }
            EffectsKt.e(composerImplV, mutableInteractionSource, (Function2) objG3);
            Function2 function23 = function2C;
            long j3 = j;
            long j4 = j2;
            boolean z6 = z4;
            SurfaceKt.b(z, function0, SemanticsModifierKt.b(SizeKt.a(LayoutModifierKt.a(singleChoiceSegmentedButtonRowScope.a(modifier2, 1.0f, true), new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionZIndex$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    final Placeable placeableC0 = ((Measurable) obj3).c0(((Constraints) obj4).f2197a);
                    int i7 = placeableC0.d;
                    int i8 = placeableC0.e;
                    final State state = mutableIntState;
                    final boolean z7 = z;
                    return ((MeasureScope) obj2).L0(i7, i8, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionZIndex$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ((Placeable.PlacementScope) obj5).e(placeableC0, 0, 0, ((Number) state.getD()).floatValue() + (z7 ? 5.0f : BitmapDescriptorFactory.HUE_RED));
                            return Unit.f24250a;
                        }
                    });
                }
            }), ButtonDefaults.b, ButtonDefaults.c), i4, SegmentedButtonKt$SegmentedButton$5.h), z6, shape, j3, j4, BitmapDescriptorFactory.HUE_RED, borderStrokeA, mutableInteractionSource, ComposableLambdaKt.c(383378045, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SegmentedButtonKt.c(0, composer2, composableLambdaImpl, function2C);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | ((i3 << 3) & 57344), KyberEngine.KyberPolyBytes);
            z5 = z6;
            borderStroke2 = borderStrokeA;
            function22 = function23;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButton$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    SegmentedButtonKt.a(singleChoiceSegmentedButtonRowScope, z, function0, shape, modifier3, z5, segmentedButtonColors, borderStroke2, function22, composableLambdaImpl, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final float f, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1520863498);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 = (composerImplV.n(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            f = SegmentedButtonDefaults.b;
            Modifier modifierB = IntrinsicKt.b(SizeKt.b(SelectableGroupKt.a(companion), BitmapDescriptorFactory.HUE_RED, OutlinedSegmentedButtonTokens.f1595a, 1), IntrinsicSize.d);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(-f), Alignment.Companion.k, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new SingleChoiceSegmentedButtonScopeWrapper();
                composerImplV.A(objG);
            }
            composableLambdaImpl.invoke((SingleChoiceSegmentedButtonScopeWrapper) objG, composerImplV, Integer.valueOf(((i4 >> 3) & 112) | 6));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    SegmentedButtonKt.b(f, composableLambdaImpl, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl, final Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(1464121570);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = PaddingKt.e(Modifier.Companion.d, ButtonDefaults.f1404a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = OutlinedSegmentedButtonTokens.f1595a;
            TextKt.a(TypographyKt.a(TypographyKeyTokens.h, composerImplV), ComposableLambdaKt.c(1420592651, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG == composer$Companion$Empty$1) {
                            objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composer2.y()));
                            composer2.A(objG);
                        }
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
                        Object objG2 = composer2.G();
                        if (objG2 == composer$Companion$Empty$1) {
                            objG2 = new SegmentedButtonContentMeasurePolicy(coroutineScope);
                            composer2.A(objG2);
                        }
                        SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) objG2;
                        Modifier modifierA = IntrinsicKt.a(Modifier.Companion.d, IntrinsicSize.d);
                        ComposableLambdaImpl composableLambdaImplB = LayoutKt.b(CollectionsKt.R(function2, composableLambdaImpl));
                        Object objG3 = composer2.G();
                        if (objG3 == composer$Companion$Empty$1) {
                            objG3 = new MultiContentMeasurePolicyImpl(segmentedButtonContentMeasurePolicy);
                            composer2.A(objG3);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objG3;
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicy, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        android.support.v4.media.session.a.x(0, composer2, composableLambdaImplB);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SegmentedButtonKt.c(RecomposeScopeImplKt.a(i | 1), (Composer) obj, composableLambdaImpl, function2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
