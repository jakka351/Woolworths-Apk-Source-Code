package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "color", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1334a = 48;
    public static final float b = 16;
    public static final float c = 14;
    public static final float d = 6;
    public static final long e = TextUnitKt.c(20);

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r24, final kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, boolean r27, final kotlin.jvm.functions.Function2 r28, long r29, long r31, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.a(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r18, final kotlin.jvm.functions.Function0 r19, androidx.compose.ui.Modifier r20, boolean r21, long r22, long r24, final androidx.compose.runtime.internal.ComposableLambdaImpl r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.b(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final long j, long j2, final boolean z, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        long j3;
        TwoWayConverter twoWayConverter;
        long j4;
        ComposerImpl composerImplV = composer.v(-405571117);
        if ((i & 6) == 0) {
            i2 = (composerImplV.s(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j2;
            i2 |= composerImplV.s(j3) ? 32 : 16;
        } else {
            j3 = j2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if (composerImplV.z(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            Transition transitionF = TransitionKt.f(Boolean.valueOf(z), null, composerImplV, i3 & 14, 2);
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) transitionF.d;
            boolean zBooleanValue = ((Boolean) snapshotMutableStateImpl.getD()).booleanValue();
            composerImplV.o(1445938070);
            long j5 = zBooleanValue ? j : j3;
            composerImplV.V(false);
            ColorSpace colorSpaceF = Color.f(j5);
            boolean zN = composerImplV.n(colorSpaceF);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = (TwoWayConverter) ColorVectorConverterKt.a().invoke(colorSpaceF);
                composerImplV.A(objG);
            }
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) objG;
            boolean zBooleanValue2 = ((Boolean) transitionF.f776a.a()).booleanValue();
            composerImplV.o(1445938070);
            if (zBooleanValue2) {
                twoWayConverter = twoWayConverter2;
                j4 = j;
            } else {
                twoWayConverter = twoWayConverter2;
                j4 = j3;
            }
            composerImplV.V(false);
            TwoWayConverter twoWayConverter3 = twoWayConverter;
            Color color = new Color(j4);
            boolean zBooleanValue3 = ((Boolean) snapshotMutableStateImpl.getD()).booleanValue();
            composerImplV.o(1445938070);
            long j6 = zBooleanValue3 ? j : j3;
            composerImplV.V(false);
            Transition.TransitionAnimationState transitionAnimationStateD = TransitionKt.d(transitionF, color, new Color(j6), (FiniteAnimationSpec) TabKt$TabTransition$color$2.h.invoke(transitionF.f(), composerImplV, 0), twoWayConverter3, composerImplV, 0);
            CompositionLocalKt.b(new ProvidedValue[]{b.g(Color.b(((Color) transitionAnimationStateD.getD()).f1766a, 1.0f), ContentColorKt.f1261a), ContentAlphaKt.f1260a.b(Float.valueOf(Color.d(((Color) transitionAnimationStateD.getD()).f1766a)))}, composableLambdaImpl, composerImplV, (i3 & 112) | 8);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final long j7 = j3;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    TabKt.c(j, j7, z, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final int i, Composer composer, final Function2 function2) {
        int i2;
        ComposerImpl composerImplV = composer.v(1249848471);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(null) ? 32 : 16;
        }
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
                        Placeable placeableC0;
                        final Placeable placeable = null;
                        if (function2 != null) {
                            int size = list.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                Measurable measurable = (Measurable) list.get(i4);
                                if (Intrinsics.c(LayoutIdKt.a(measurable), TextBundle.TEXT_ENTRY)) {
                                    placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, 0, 11));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableC0 = null;
                        final int iMax = Math.max(placeableC0 != null ? placeableC0.d : 0, 0);
                        final int iR1 = measureScope.r1(TabKt.f1334a);
                        final Integer numValueOf = placeableC0 != null ? Integer.valueOf(placeableC0.d0(AlignmentLineKt.f1871a)) : null;
                        final Integer numValueOf2 = placeableC0 != null ? Integer.valueOf(placeableC0.d0(AlignmentLineKt.b)) : null;
                        final Placeable placeable2 = placeableC0;
                        return measureScope.L0(iMax, iR1, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                Placeable placeable3 = placeable;
                                int i5 = iR1;
                                Placeable placeable4 = placeable2;
                                if (placeable4 != null && placeable3 != null) {
                                    Integer num = numValueOf;
                                    Intrinsics.e(num);
                                    int iIntValue = num.intValue();
                                    Integer num2 = numValueOf2;
                                    Intrinsics.e(num2);
                                    int iIntValue2 = num2.intValue();
                                    float f = iIntValue == iIntValue2 ? TabKt.c : TabKt.d;
                                    MeasureScope measureScope2 = measureScope;
                                    int iR12 = measureScope2.r1(TabRowDefaults.c) + measureScope2.r1(f);
                                    int iW1 = (measureScope2.W1(TabKt.e) + placeable3.e) - iIntValue;
                                    int i6 = placeable4.d;
                                    int i7 = iMax;
                                    int i8 = (i5 - iIntValue2) - iR12;
                                    Placeable.PlacementScope.h(placementScope, placeable4, (i7 - i6) / 2, i8);
                                    Placeable.PlacementScope.h(placementScope, placeable3, (i7 - placeable3.d) / 2, i8 - iW1);
                                } else if (placeable4 != null) {
                                    float f2 = TabKt.f1334a;
                                    Placeable.PlacementScope.h(placementScope, placeable4, 0, (i5 - placeable4.e) / 2);
                                } else if (placeable3 != null) {
                                    float f3 = TabKt.f1334a;
                                    Placeable.PlacementScope.h(placementScope, placeable3, 0, (i5 - placeable3.e) / 2);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicy, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            if (function2 != null) {
                composerImplV.o(-238651272);
                Modifier modifierH = PaddingKt.h(LayoutIdKt.b(companion, TextBundle.TEXT_ENTRY), b, BitmapDescriptorFactory.HUE_RED, 2);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function22);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    b.B(i5, composerImplV, i5, function24);
                }
                Updater.b(composerImplV, modifierD2, function25);
                function2.invoke(composerImplV, Integer.valueOf(i3));
                composerImplV.V(true);
                composerImplV.V(false);
            } else {
                composerImplV.o(-238546523);
                composerImplV.V(false);
            }
            composerImplV.o(-238455259);
            composerImplV.V(false);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    TabKt.d(RecomposeScopeImplKt.a(i | 1), (Composer) obj, function2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
