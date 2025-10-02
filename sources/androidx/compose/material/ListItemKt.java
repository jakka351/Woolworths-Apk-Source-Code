package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ListItemKt {
    public static final void a(final List list, final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1631148337);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = composerImplV.I(list);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, List list2, long j) {
                        int iD0;
                        long jA = Constraints.a(j, 0, 0, 0, Integer.MAX_VALUE, 3);
                        final ArrayList arrayList = new ArrayList(list2.size());
                        int size = list2.size();
                        int iF = 0;
                        while (iF < size) {
                            iF = b.f((Measurable) list2.get(iF), jA, arrayList, iF, 1);
                        }
                        Integer numValueOf = 0;
                        int size2 = arrayList.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Placeable) arrayList.get(i3)).d));
                        }
                        int iIntValue = numValueOf.intValue();
                        final int[] iArr = new int[arrayList.size()];
                        int size3 = arrayList.size();
                        int i4 = 0;
                        for (int i5 = 0; i5 < size3; i5++) {
                            Placeable placeable = (Placeable) arrayList.get(i5);
                            if (i5 > 0) {
                                int i6 = i5 - 1;
                                iD0 = ((Placeable) arrayList.get(i6)).e - ((Placeable) arrayList.get(i6)).d0(AlignmentLineKt.b);
                            } else {
                                iD0 = 0;
                            }
                            int iMax = Math.max(0, (measureScope.r1(((Dp) list.get(i5)).d) - placeable.d0(AlignmentLineKt.f1871a)) - iD0);
                            iArr[i5] = iMax + i4;
                            i4 += iMax + placeable.e;
                        }
                        return measureScope.L0(iIntValue, i4, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                ArrayList arrayList2 = arrayList;
                                int size4 = arrayList2.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    Placeable.PlacementScope.h(placementScope, (Placeable) arrayList2.get(i7), 0, iArr[i7]);
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            int i4 = ((((i2 & 112) | ((i2 >> 6) & 14)) << 6) & 896) | 6;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a.y((i4 >> 6) & 14, composableLambdaImpl, composerImplV, true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ListItemKt.a(list, modifier, composableLambdaImpl, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final float f, Modifier modifier, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1062692685);
        if ((i & 6) == 0) {
            i3 = (composerImplV.q(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function2) ? 256 : 128;
        }
        if (composerImplV.z(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            boolean z = (i3 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
                        int iMax;
                        final int iA;
                        final Placeable placeableC0 = ((Measurable) list.get(0)).c0(Constraints.a(j, 0, 0, 0, 0, 11));
                        int iD0 = placeableC0.d0(AlignmentLineKt.f1871a);
                        if (iD0 != Integer.MIN_VALUE) {
                            iA = measureScope.r1(f) - iD0;
                            iMax = Math.max(Constraints.i(j), placeableC0.e + iA);
                        } else {
                            iMax = Math.max(Constraints.i(j), placeableC0.e);
                            iA = (int) (Alignment.Companion.e.a(0L, IntSizeKt.a(0, iMax - placeableC0.e), measureScope.getD()) & 4294967295L);
                        }
                        return measureScope.L0(placeableC0.d, iMax, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope.h((Placeable.PlacementScope) obj, placeableC0, 0, iA);
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            int i6 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 6) & 896) | 6;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a.z((i6 >> 6) & 14, function2, composerImplV, true);
        } else {
            composerImplV.j();
        }
        final Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ListItemKt.b(f, modifier2, function2, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
