package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AlertDialogKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Modifier f1230a;
    public static final Modifier b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        float f = 24;
        Modifier.Companion companion = Modifier.Companion.d;
        f1230a = PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 10);
        b = PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, f, 28, 2);
        c = TextUnitKt.c(40);
        d = TextUnitKt.c(36);
        e = TextUnitKt.c(38);
    }

    public static final void a(final Function2 function2, Function2 function22, Composer composer, final int i) {
        final Function2 function23;
        boolean z;
        boolean z2;
        Function2 function24;
        Function2 function25 = function22;
        ComposerImpl composerImplV = composer.v(-555573207);
        int i2 = i | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.I(function25) ? 256 : 128);
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.d;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            Modifier modifierA = columnScopeInstance.a(companion, 1.0f, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function26 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, AlertDialogKt$AlertDialogBaselineLayout$2.f1231a, function26);
            Function2 function27 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function27);
            Function2 function28 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function28);
            }
            Function2 function29 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function29);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            if (function2 == null) {
                composerImplV.o(1317321954);
                composerImplV.V(false);
                z = false;
            } else {
                composerImplV.o(1317321955);
                Modifier modifierB = columnScopeInstance.b(LayoutIdKt.b(f1230a, "title"), horizontal);
                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                int i4 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function26);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function27);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                    b.B(i4, composerImplV, i4, function28);
                }
                Updater.b(composerImplV, modifierD2, function29);
                function2.invoke(composerImplV, 0);
                composerImplV.V(true);
                z = false;
                composerImplV.V(false);
            }
            if (function22 == null) {
                composerImplV.o(1317454758);
                composerImplV.V(z);
                function24 = function22;
                z2 = true;
            } else {
                composerImplV.o(1317454759);
                Modifier modifierB2 = columnScopeInstance.b(LayoutIdKt.b(b, TextBundle.TEXT_ENTRY), horizontal);
                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, z);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD2, function26);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function27);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    b.B(i5, composerImplV, i5, function28);
                }
                Updater.b(composerImplV, modifierD3, function29);
                Function2 function210 = function22;
                function210.invoke(composerImplV, 0);
                z2 = true;
                composerImplV.V(true);
                composerImplV.V(false);
                function24 = function210;
            }
            composerImplV.V(z2);
            function23 = function24;
        } else {
            composerImplV.j();
            function23 = function25;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(function23, i) { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
                public final /* synthetic */ Function2 i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(7);
                    AlertDialogKt.a(this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier, final Function2 function2, final Function2 function22, final Shape shape, final long j, final long j2, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-453679601);
        int i2 = i | (composerImplV.I(composableLambdaImpl) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.I(function22) ? 2048 : 1024) | (composerImplV.n(shape) ? 16384 : 8192) | (composerImplV.s(j) ? 131072 : 65536) | (composerImplV.s(j2) ? 1048576 : 524288);
        if (composerImplV.z(i2 & 1, (599187 & i2) != 599186)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            int i3 = ((i2 >> 3) & 14) | 1572864;
            int i4 = i2 >> 9;
            SurfaceKt.a(modifier, shape, j, j2, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(629950291, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ComposableLambdaImpl composableLambdaImplC;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        ComposableLambdaImpl composableLambdaImplC2 = null;
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
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        final Function2 function24 = function2;
                        if (function24 == null) {
                            composer2.o(-366997612);
                            composer2.l();
                            composableLambdaImplC = null;
                        } else {
                            composer2.o(-366997611);
                            composableLambdaImplC = ComposableLambdaKt.c(620104160, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue2 = ((Number) obj4).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ProvidedValue providedValueB = ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.b(composer3)));
                                        final Function2 function25 = function24;
                                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(770166432, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                Composer composer4 = (Composer) obj5;
                                                int iIntValue3 = ((Number) obj6).intValue();
                                                if (composer4.z(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    TextKt.a(MaterialTheme.c(composer4).g, function25, composer4, 0);
                                                } else {
                                                    composer4.j();
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer3), composer3, 56);
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2);
                            composer2.l();
                        }
                        final Function2 function25 = function22;
                        if (function25 == null) {
                            composer2.o(-366576167);
                        } else {
                            composer2.o(-366576166);
                            composableLambdaImplC2 = ComposableLambdaKt.c(1965858367, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue2 = ((Number) obj4).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ProvidedValue providedValueB = ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.c(composer3, 6)));
                                        final Function2 function26 = function25;
                                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(2115920639, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                Composer composer4 = (Composer) obj5;
                                                int iIntValue3 = ((Number) obj6).intValue();
                                                if (composer4.z(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    TextKt.a(MaterialTheme.c(composer4).j, function26, composer4, 0);
                                                } else {
                                                    composer4.j();
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer3), composer3, 56);
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2);
                        }
                        composer2.l();
                        AlertDialogKt.a(composableLambdaImplC, composableLambdaImplC2, composer2, 6);
                        a.x(0, composer2, composableLambdaImpl);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 48);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier, function2, function22, shape, j, j2, i) { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ Function2 j;
                public final /* synthetic */ Function2 k;
                public final /* synthetic */ Shape l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    AlertDialogKt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final float f, final float f2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(73434452);
        if (composerImplV.z(i & 1, (i & 147) != 146)) {
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1
                    public static final void a(ArrayList arrayList, Ref.IntRef intRef, MeasureScope measureScope, float f3, ArrayList arrayList2, ArrayList arrayList3, Ref.IntRef intRef2, ArrayList arrayList4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!arrayList.isEmpty()) {
                            intRef.d = measureScope.r1(f3) + intRef.d;
                        }
                        arrayList.add(0, CollectionsKt.G0(arrayList2));
                        arrayList3.add(Integer.valueOf(intRef2.d));
                        arrayList4.add(Integer.valueOf(intRef.d));
                        intRef.d += intRef2.d;
                        intRef3.d = Math.max(intRef3.d, intRef4.d);
                        arrayList2.clear();
                        intRef4.d = 0;
                        intRef2.d = 0;
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(final MeasureScope measureScope, List list, long j) {
                        int i2;
                        Placeable placeable;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref.IntRef intRef3 = new Ref.IntRef();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        int i3 = 0;
                        long jB = ConstraintsKt.b(Constraints.h(j), 0, 13);
                        int size = list.size();
                        while (i3 < size) {
                            Placeable placeableC0 = ((Measurable) list.get(i3)).c0(jB);
                            boolean zIsEmpty = arrayList4.isEmpty();
                            int i4 = size;
                            float f3 = f;
                            if (zIsEmpty) {
                                i2 = i3;
                                placeable = placeableC0;
                            } else {
                                ArrayList arrayList5 = arrayList;
                                Ref.IntRef intRef5 = intRef2;
                                if (measureScope.r1(f3) + intRef3.d + placeableC0.d <= Constraints.h(j)) {
                                    arrayList = arrayList5;
                                    intRef2 = intRef5;
                                    i2 = i3;
                                    placeable = placeableC0;
                                } else {
                                    i2 = i3;
                                    intRef2 = intRef5;
                                    placeable = placeableC0;
                                    arrayList = arrayList5;
                                    a(arrayList, intRef2, measureScope, f2, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                intRef3.d = measureScope.r1(f3) + intRef3.d;
                            }
                            arrayList4.add(placeable);
                            intRef3.d += placeable.d;
                            intRef4.d = Math.max(intRef4.d, placeable.e);
                            i3 = i2 + 1;
                            size = i4;
                        }
                        if (!arrayList4.isEmpty()) {
                            a(arrayList, intRef2, measureScope, f2, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                        }
                        final int iH = Constraints.h(j) != Integer.MAX_VALUE ? Constraints.h(j) : Math.max(intRef.d, Constraints.j(j));
                        int iMax = Math.max(intRef2.d, Constraints.i(j));
                        final ArrayList arrayList6 = arrayList;
                        final float f4 = f;
                        return measureScope.L0(iH, iMax, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                MeasureScope measureScope2;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                ArrayList arrayList7 = arrayList6;
                                int size2 = arrayList7.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    List list2 = (List) arrayList7.get(i5);
                                    int size3 = list2.size();
                                    int[] iArr = new int[size3];
                                    int i6 = 0;
                                    while (true) {
                                        measureScope2 = measureScope;
                                        if (i6 >= size3) {
                                            break;
                                        }
                                        iArr[i6] = ((Placeable) list2.get(i6)).d + (i6 < CollectionsKt.I(list2) ? measureScope2.r1(f4) : 0);
                                        i6++;
                                    }
                                    int[] iArr2 = new int[size3];
                                    Arrangement.d.c(measureScope2, iH, iArr, iArr2);
                                    int size4 = list2.size();
                                    for (int i7 = 0; i7 < size4; i7++) {
                                        placementScope.e((Placeable) list2.get(i7), iArr2[i7], ((Number) arrayList3.get(i5)).intValue(), BitmapDescriptorFactory.HUE_RED);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a.y(6, composableLambdaImpl, composerImplV, true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(f, f2, composableLambdaImpl, i) { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;
                public final /* synthetic */ ComposableLambdaImpl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(439);
                    AlertDialogKt.c(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
